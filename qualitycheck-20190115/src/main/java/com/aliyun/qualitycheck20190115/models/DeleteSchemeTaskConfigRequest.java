// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteSchemeTaskConfigRequest extends TeaModel {
    /**
     * <p>The workspace ID.</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>A JSON object that contains the request parameters. For more information, see the parameter details.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;schemeId&quot;:&quot;329&quot;}</p>
     */
    @NameInMap("jsonStr")
    public String jsonStr;

    public static DeleteSchemeTaskConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchemeTaskConfigRequest self = new DeleteSchemeTaskConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSchemeTaskConfigRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public DeleteSchemeTaskConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
