// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetResultRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;pageNumber&quot;:1,&quot;pageSize&quot;:10,&quot;excludeFields&quot;:&quot;hitResult.hits, recording.url&quot;,&quot;requiredFields&quot;:&quot;agent,status,errorMessage,reviewStatus,reviewResult,score,taskId,reviewer,resolver,recording.name,recording.duration,hitResult,business&quot;,&quot;dataType&quot;:1,&quot;sourceType&quot;:0,&quot;startTime&quot;:&quot;2020-06-25 00:00:00&quot;,&quot;endTime&quot;:&quot;2020-07-01 23:59:59&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResultRequest self = new GetResultRequest();
        return TeaModel.build(map, self);
    }

    public GetResultRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public GetResultRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
