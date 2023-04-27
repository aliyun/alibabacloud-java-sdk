// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteScoreForApiRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeleteScoreForApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScoreForApiRequest self = new DeleteScoreForApiRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScoreForApiRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public DeleteScoreForApiRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
