// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ResetUserExecutionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AliUid")
    public String aliUid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Status")
    public String status;

    public static ResetUserExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetUserExecutionRequest self = new ResetUserExecutionRequest();
        return TeaModel.build(map, self);
    }

    public ResetUserExecutionRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public ResetUserExecutionRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public ResetUserExecutionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResetUserExecutionRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
