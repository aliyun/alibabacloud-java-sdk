// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AnalyzeLabelRequest extends TeaModel {
    /**
     * <p>The business workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>The complete JSON string. For more information, see the following details.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static AnalyzeLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeLabelRequest self = new AnalyzeLabelRequest();
        return TeaModel.build(map, self);
    }

    public AnalyzeLabelRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public AnalyzeLabelRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
