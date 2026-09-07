// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetAgentMJobInfoRequest extends TeaModel {
    /**
     * <p>The ID of the business workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>The complete JSON string. For more information, see the following detailed description.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetAgentMJobInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentMJobInfoRequest self = new GetAgentMJobInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentMJobInfoRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public GetAgentMJobInfoRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
