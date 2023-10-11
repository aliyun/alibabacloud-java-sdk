// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class ListDigitalHumanMaterialsRequest extends TeaModel {
    @NameInMap("Current")
    public Integer current;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("OnlyPersonalMaterials")
    public Boolean onlyPersonalMaterials;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Types")
    public String types;

    public static ListDigitalHumanMaterialsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDigitalHumanMaterialsRequest self = new ListDigitalHumanMaterialsRequest();
        return TeaModel.build(map, self);
    }

    public ListDigitalHumanMaterialsRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListDigitalHumanMaterialsRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public ListDigitalHumanMaterialsRequest setOnlyPersonalMaterials(Boolean onlyPersonalMaterials) {
        this.onlyPersonalMaterials = onlyPersonalMaterials;
        return this;
    }
    public Boolean getOnlyPersonalMaterials() {
        return this.onlyPersonalMaterials;
    }

    public ListDigitalHumanMaterialsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListDigitalHumanMaterialsRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

}
