// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class UpdateMemoryRequest extends TeaModel {
    @NameInMap("memory")
    public String memory;

    public static UpdateMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryRequest self = new UpdateMemoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryRequest setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

}
