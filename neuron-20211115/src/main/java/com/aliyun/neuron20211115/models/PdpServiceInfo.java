// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpServiceInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>pdp-pbc-service</p>
     */
    @NameInMap("name")
    public String name;

    public static PdpServiceInfo build(java.util.Map<String, ?> map) throws Exception {
        PdpServiceInfo self = new PdpServiceInfo();
        return TeaModel.build(map, self);
    }

    public PdpServiceInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PdpServiceInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
