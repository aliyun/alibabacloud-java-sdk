// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ScaleConfig extends TeaModel {
    @NameInMap("alwaysAllocateCPU")
    public Boolean alwaysAllocateCPU;

    @NameInMap("maximumInstanceCount")
    public Long maximumInstanceCount;

    @NameInMap("minimumInstanceCount")
    public Long minimumInstanceCount;

    @NameInMap("requestId")
    public String requestId;

    public static ScaleConfig build(java.util.Map<String, ?> map) throws Exception {
        ScaleConfig self = new ScaleConfig();
        return TeaModel.build(map, self);
    }

    public ScaleConfig setAlwaysAllocateCPU(Boolean alwaysAllocateCPU) {
        this.alwaysAllocateCPU = alwaysAllocateCPU;
        return this;
    }
    public Boolean getAlwaysAllocateCPU() {
        return this.alwaysAllocateCPU;
    }

    public ScaleConfig setMaximumInstanceCount(Long maximumInstanceCount) {
        this.maximumInstanceCount = maximumInstanceCount;
        return this;
    }
    public Long getMaximumInstanceCount() {
        return this.maximumInstanceCount;
    }

    public ScaleConfig setMinimumInstanceCount(Long minimumInstanceCount) {
        this.minimumInstanceCount = minimumInstanceCount;
        return this;
    }
    public Long getMinimumInstanceCount() {
        return this.minimumInstanceCount;
    }

    public ScaleConfig setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
