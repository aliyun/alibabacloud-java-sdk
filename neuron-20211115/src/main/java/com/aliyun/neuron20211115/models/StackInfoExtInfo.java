// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class StackInfoExtInfo extends TeaModel {
    @NameInMap("info")
    public String info;

    @NameInMap("type")
    public String type;

    public static StackInfoExtInfo build(java.util.Map<String, ?> map) throws Exception {
        StackInfoExtInfo self = new StackInfoExtInfo();
        return TeaModel.build(map, self);
    }

    public StackInfoExtInfo setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public StackInfoExtInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
