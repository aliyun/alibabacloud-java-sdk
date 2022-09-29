// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class EnterpriseInfoUpdateCmd extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    public static EnterpriseInfoUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseInfoUpdateCmd self = new EnterpriseInfoUpdateCmd();
        return TeaModel.build(map, self);
    }

    public EnterpriseInfoUpdateCmd setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public EnterpriseInfoUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public EnterpriseInfoUpdateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
