// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class MetadataInfo extends TeaModel {
    @NameInMap("key")
    public String key;

    @NameInMap("virtual")
    public Boolean virtual;

    public static MetadataInfo build(java.util.Map<String, ?> map) throws Exception {
        MetadataInfo self = new MetadataInfo();
        return TeaModel.build(map, self);
    }

    public MetadataInfo setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public MetadataInfo setVirtual(Boolean virtual) {
        this.virtual = virtual;
        return this;
    }
    public Boolean getVirtual() {
        return this.virtual;
    }

}
