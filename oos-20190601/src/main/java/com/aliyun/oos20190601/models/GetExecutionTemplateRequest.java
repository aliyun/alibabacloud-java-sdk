// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetExecutionTemplateRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ExecutionId")
    public String executionId;

    public static GetExecutionTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExecutionTemplateRequest self = new GetExecutionTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetExecutionTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetExecutionTemplateRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
