// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CallAiToolsRequest extends TeaModel {
    @NameInMap("params")
    public java.util.Map<String, String> params;

    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("toolName")
    public String toolName;

    public static CallAiToolsRequest build(java.util.Map<String, ?> map) throws Exception {
        CallAiToolsRequest self = new CallAiToolsRequest();
        return TeaModel.build(map, self);
    }

    public CallAiToolsRequest setParams(java.util.Map<String, String> params) {
        this.params = params;
        return this;
    }
    public java.util.Map<String, String> getParams() {
        return this.params;
    }

    public CallAiToolsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CallAiToolsRequest setToolName(String toolName) {
        this.toolName = toolName;
        return this;
    }
    public String getToolName() {
        return this.toolName;
    }

}
