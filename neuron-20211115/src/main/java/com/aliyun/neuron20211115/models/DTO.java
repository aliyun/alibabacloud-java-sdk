// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DTO extends TeaModel {
    @NameInMap("id")
    public Long id;

    public static DTO build(java.util.Map<String, ?> map) throws Exception {
        DTO self = new DTO();
        return TeaModel.build(map, self);
    }

    public DTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
