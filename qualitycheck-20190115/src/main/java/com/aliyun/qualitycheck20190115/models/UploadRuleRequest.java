// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadRuleRequest extends TeaModel {
    /**
     * <p>Workspace ID.</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>Complete JSON string. For details, see the following sections.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{“conditions”:“xxxxx”,&quot;rules&quot;:&quot;xxxx&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UploadRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadRuleRequest self = new UploadRuleRequest();
        return TeaModel.build(map, self);
    }

    public UploadRuleRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public UploadRuleRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
