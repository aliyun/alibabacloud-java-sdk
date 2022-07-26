// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class EnvVar extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Value")
    public String value;

    public static EnvVar build(java.util.Map<String, ?> map) throws Exception {
        EnvVar self = new EnvVar();
        return TeaModel.build(map, self);
    }

    public EnvVar setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EnvVar setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
