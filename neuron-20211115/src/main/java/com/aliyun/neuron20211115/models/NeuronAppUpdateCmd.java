// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronAppUpdateCmd extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>升级订单功能</p>
     */
    @NameInMap("desc")
    public String desc;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>NEW</p>
     */
    @NameInMap("status")
    public String status;

    public static NeuronAppUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        NeuronAppUpdateCmd self = new NeuronAppUpdateCmd();
        return TeaModel.build(map, self);
    }

    public NeuronAppUpdateCmd setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public NeuronAppUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public NeuronAppUpdateCmd setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
