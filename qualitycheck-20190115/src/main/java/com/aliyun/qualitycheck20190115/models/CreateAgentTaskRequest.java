// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateAgentTaskRequest extends TeaModel {
    /**
     * <p>The ID of the business space.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>The complete <strong>JSON string</strong> information. For details, see the following sections.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;\&quot;:\&quot;\&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static CreateAgentTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentTaskRequest self = new CreateAgentTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentTaskRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public CreateAgentTaskRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
