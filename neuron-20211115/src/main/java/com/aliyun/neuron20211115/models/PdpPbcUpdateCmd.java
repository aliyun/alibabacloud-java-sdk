// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpPbcUpdateCmd extends TeaModel {
    @NameInMap("alias")
    public String alias;

    @NameInMap("description")
    public String description;

    @NameInMap("name")
    public String name;

    public static PdpPbcUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        PdpPbcUpdateCmd self = new PdpPbcUpdateCmd();
        return TeaModel.build(map, self);
    }

    public PdpPbcUpdateCmd setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public PdpPbcUpdateCmd setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PdpPbcUpdateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
