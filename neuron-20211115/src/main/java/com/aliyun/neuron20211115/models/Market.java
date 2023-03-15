// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class Market extends TeaModel {
    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    @NameInMap("type")
    public String type;

    public static Market build(java.util.Map<String, ?> map) throws Exception {
        Market self = new Market();
        return TeaModel.build(map, self);
    }

    public Market setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Market setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Market setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
