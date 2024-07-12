// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class GetUserExecutionTemplateRequest extends TeaModel {
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

    public static GetUserExecutionTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserExecutionTemplateRequest self = new GetUserExecutionTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetUserExecutionTemplateRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public GetUserExecutionTemplateRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public GetUserExecutionTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
