// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MarketInfo extends TeaModel {
    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    @NameInMap("type")
    public String type;

    public static MarketInfo build(java.util.Map<String, ?> map) throws Exception {
        MarketInfo self = new MarketInfo();
        return TeaModel.build(map, self);
    }

    public MarketInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MarketInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MarketInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
