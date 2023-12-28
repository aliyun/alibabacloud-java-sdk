// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class TerminateUserExecutionRequest extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("RegionId")
    public String regionId;

    public static TerminateUserExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateUserExecutionRequest self = new TerminateUserExecutionRequest();
        return TeaModel.build(map, self);
    }

    public TerminateUserExecutionRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public TerminateUserExecutionRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public TerminateUserExecutionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
