// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetCustomAgentRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to <strong>GetCustomAgent</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ebe44453-3b41-4c74-94d1-01d088d7xxxx</p>
     */
    @NameInMap("CustomAgentId")
    public String customAgentId;

    public static GetCustomAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomAgentRequest self = new GetCustomAgentRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomAgentRequest setCustomAgentId(String customAgentId) {
        this.customAgentId = customAgentId;
        return this;
    }
    public String getCustomAgentId() {
        return this.customAgentId;
    }

}
