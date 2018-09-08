package amal.springframework.sfgpetclinic.services.map;

import amal.springframework.sfgpetclinic.model.Speciality;
import amal.springframework.sfgpetclinic.model.Vet;
import amal.springframework.sfgpetclinic.services.SpecialtyService;
import amal.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findId(id);
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(specility -> {
                if(specility.getId() == null){
                    Speciality savedSpecialty = specialtyService.save(specility);
                    specility.setId(savedSpecialty.getId());
                }
            });
        }

        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
