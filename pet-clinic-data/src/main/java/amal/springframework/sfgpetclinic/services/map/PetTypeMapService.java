package amal.springframework.sfgpetclinic.services.map;

import amal.springframework.sfgpetclinic.model.PetType;
import amal.springframework.sfgpetclinic.services.PetTypeService;

import java.util.Set;

public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return save(object);
    }

    @Override
    public PetType findById(Long aLong) {
        return super.findId(aLong);
    }
}
