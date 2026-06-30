// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteCustomizationConfigRequest extends TeaModel {
    /**
     * <p>Workspace ID.</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>A complete JSON string. For details, see the table that follows.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;modelId&quot;:&quot;2412&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeleteCustomizationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizationConfigRequest self = new DeleteCustomizationConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizationConfigRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public DeleteCustomizationConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
