// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GPUInfo extends TeaModel {
    @NameInMap("count")
    public Long count;

    @NameInMap("type")
    public String type;

    public static GPUInfo build(java.util.Map<String, ?> map) throws Exception {
        GPUInfo self = new GPUInfo();
        return TeaModel.build(map, self);
    }

    public GPUInfo setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public GPUInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
