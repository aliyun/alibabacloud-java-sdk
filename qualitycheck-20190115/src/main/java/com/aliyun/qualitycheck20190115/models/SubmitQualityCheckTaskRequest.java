// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitQualityCheckTaskRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static SubmitQualityCheckTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitQualityCheckTaskRequest self = new SubmitQualityCheckTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitQualityCheckTaskRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public SubmitQualityCheckTaskRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
