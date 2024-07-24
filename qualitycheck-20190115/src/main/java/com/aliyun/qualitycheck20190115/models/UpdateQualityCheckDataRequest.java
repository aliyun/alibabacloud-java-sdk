// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateQualityCheckDataRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;taskId&quot;:&quot;xxx&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UpdateQualityCheckDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQualityCheckDataRequest self = new UpdateQualityCheckDataRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQualityCheckDataRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public UpdateQualityCheckDataRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
