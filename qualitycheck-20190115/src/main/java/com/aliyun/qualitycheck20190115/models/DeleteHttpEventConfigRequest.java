// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteHttpEventConfigRequest extends TeaModel {
    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>The input JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;id&quot;:&quot;7211&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeleteHttpEventConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHttpEventConfigRequest self = new DeleteHttpEventConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHttpEventConfigRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public DeleteHttpEventConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
