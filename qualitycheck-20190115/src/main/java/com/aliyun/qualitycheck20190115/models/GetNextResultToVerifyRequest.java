// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetNextResultToVerifyRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{&quot;pageNumber&quot;:1,&quot;pageSize&quot;:1,&quot;taskId&quot;:&quot;593A04C0-E6E9-4CDC-8C9*****&quot;,&quot;original&quot;:1}&quot;</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetNextResultToVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNextResultToVerifyRequest self = new GetNextResultToVerifyRequest();
        return TeaModel.build(map, self);
    }

    public GetNextResultToVerifyRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public GetNextResultToVerifyRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
