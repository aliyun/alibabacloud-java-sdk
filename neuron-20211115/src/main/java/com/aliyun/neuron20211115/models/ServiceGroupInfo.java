// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ServiceGroupInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>分组1</p>
     */
    @NameInMap("name")
    public String name;

    public static ServiceGroupInfo build(java.util.Map<String, ?> map) throws Exception {
        ServiceGroupInfo self = new ServiceGroupInfo();
        return TeaModel.build(map, self);
    }

    public ServiceGroupInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ServiceGroupInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
