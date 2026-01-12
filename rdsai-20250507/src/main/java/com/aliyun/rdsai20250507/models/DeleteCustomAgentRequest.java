// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DeleteCustomAgentRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to <strong>DeleteCustomAgent</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ebe44453-3b41-4c74-94d1-01d088d7****</p>
     */
    @NameInMap("CustomAgentId")
    public String customAgentId;

    public static DeleteCustomAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomAgentRequest self = new DeleteCustomAgentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomAgentRequest setCustomAgentId(String customAgentId) {
        this.customAgentId = customAgentId;
        return this;
    }
    public String getCustomAgentId() {
        return this.customAgentId;
    }

}
