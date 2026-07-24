// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetAgentTaskResultRequest extends TeaModel {
    /**
     * <p>The ID of the business workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public String baseMeAgentId;

    /**
     * <p>The complete JSON string. For more information, see the following details.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;vid\&quot;:\&quot;sip-11-1766561862.293393\&quot;,\&quot;taskId\&quot;:\&quot;20251224-D3B32484-2D53-5B53-A618-483A7941029E\&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetAgentTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentTaskResultRequest self = new GetAgentTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentTaskResultRequest setBaseMeAgentId(String baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public String getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public GetAgentTaskResultRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
