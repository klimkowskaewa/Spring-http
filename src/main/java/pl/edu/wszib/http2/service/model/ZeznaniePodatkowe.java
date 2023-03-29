package pl.edu.wszib.http2.service.model;

import pl.edu.wszib.http2.service.common.CrudResource;

public class ZeznaniePodatkowe implements CrudResource<Long> {

    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long aLong) {
    this.id = aLong;
    }
}
