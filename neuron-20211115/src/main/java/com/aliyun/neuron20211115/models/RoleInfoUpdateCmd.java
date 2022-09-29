// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RoleInfoUpdateCmd extends TeaModel {
    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    public static RoleInfoUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        RoleInfoUpdateCmd self = new RoleInfoUpdateCmd();
        return TeaModel.build(map, self);
    }

    public RoleInfoUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RoleInfoUpdateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
