// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpServiceGroupUpdateCmd extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>管理</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <strong>example:</strong>
     * <p>管理</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    public static PdpServiceGroupUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        PdpServiceGroupUpdateCmd self = new PdpServiceGroupUpdateCmd();
        return TeaModel.build(map, self);
    }

    public PdpServiceGroupUpdateCmd setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public PdpServiceGroupUpdateCmd setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PdpServiceGroupUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
