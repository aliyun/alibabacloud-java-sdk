// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateApplicationScaleConfigInput extends TeaModel {
    @NameInMap("alwaysAllocateCPU")
    public Boolean alwaysAllocateCPU;

    @NameInMap("maximumInstanceCount")
    public Long maximumInstanceCount;

    @NameInMap("minimumInstanceCount")
    public Long minimumInstanceCount;

    public static UpdateApplicationScaleConfigInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationScaleConfigInput self = new UpdateApplicationScaleConfigInput();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationScaleConfigInput setAlwaysAllocateCPU(Boolean alwaysAllocateCPU) {
        this.alwaysAllocateCPU = alwaysAllocateCPU;
        return this;
    }
    public Boolean getAlwaysAllocateCPU() {
        return this.alwaysAllocateCPU;
    }

    public UpdateApplicationScaleConfigInput setMaximumInstanceCount(Long maximumInstanceCount) {
        this.maximumInstanceCount = maximumInstanceCount;
        return this;
    }
    public Long getMaximumInstanceCount() {
        return this.maximumInstanceCount;
    }

    public UpdateApplicationScaleConfigInput setMinimumInstanceCount(Long minimumInstanceCount) {
        this.minimumInstanceCount = minimumInstanceCount;
        return this;
    }
    public Long getMinimumInstanceCount() {
        return this.minimumInstanceCount;
    }

}
