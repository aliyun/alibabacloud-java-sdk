// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteAgentRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>A JSON-formatted string. For more information about the complete JSON string, see the following details.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;id\&quot;:486}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeleteAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentRequest self = new DeleteAgentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgentRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public DeleteAgentRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
