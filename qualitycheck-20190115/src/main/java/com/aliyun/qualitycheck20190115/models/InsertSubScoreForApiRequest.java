// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class InsertSubScoreForApiRequest extends TeaModel {
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

    public static InsertSubScoreForApiRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertSubScoreForApiRequest self = new InsertSubScoreForApiRequest();
        return TeaModel.build(map, self);
    }

    public InsertSubScoreForApiRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public InsertSubScoreForApiRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
