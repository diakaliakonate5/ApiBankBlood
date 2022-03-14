package com.BanqueBlood.Banque_Blood.serviceImp;
import com.BanqueBlood.Banque_Blood.exceptions.EntityNotFound;
import com.BanqueBlood.Banque_Blood.exceptions.ErrorsCode;
import com.BanqueBlood.Banque_Blood.model.Accepter;
import com.BanqueBlood.Banque_Blood.repository.AccepterRepository;
import com.BanqueBlood.Banque_Blood.services.AccepterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class AccepterServiceImp implements AccepterService {
    @Autowired
    AccepterRepository accepterRepository ;
    @Autowired
    DonServiceImp donServiceImp;

    @Override
    public Accepter ajoutAccept(Accepter accepter) {
        Accepter accepter1 = accepterRepository.findByAccepterUser(accepter.getAccepteur());

        if(accepter1 == null)
        {
            accepter.setDateQuarantaine(accepter.getDate().plusMonths(3));
            return  accepterRepository.save(accepter);
        }

        if(accepter1.getDateQuarantaine().isAfter(accepter.getDate()))
        {

            return null;
            //throw new EntityNotFound("votre dernier don ne vaut pas 3 mois", ErrorsCode.DON_INVALID);
        }

        accepter.setDateQuarantaine(accepter.getDate().plusMonths(3));
        return  accepterRepository.save(accepter);
    }

    @Override
    public List<Accepter> afficherListAccept() {
        return accepterRepository.findAll();
    }

    @Override
    public List<Accepter> AcceptByUser(Long id) {
        return accepterRepository.AcceptByUser(id);
    }

    @Override
    public void supprimerAccept(Long id) {
        accepterRepository.deleteById(id);

    }

    @Override
    public Accepter modifierAccept(Accepter accepter, Long id) {
        Accepter accepter1 = accepterRepository.findById(id).get();
        accepter1.setAccepteur(accepter.getAccepteur());
        accepter1.setDate(accepter.getDate());
        accepter1.setDemande(accepter.getDemande());

        return accepterRepository.save(accepter1);
    }

    @Override
    public Accepter afficherAcceptById(Long id) {
        return accepterRepository.findById(id).get();
    }
}
