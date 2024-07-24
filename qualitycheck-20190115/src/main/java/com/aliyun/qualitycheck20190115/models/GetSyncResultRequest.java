// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetSyncResultRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;pageNumber&quot;:1,&quot;pageSize&quot;:10,&quot;requiredFields&quot;:&quot;asrResult,agent,status,errorMessage,reviewStatus,reviewResult,score,taskId,reviewer,resolver,recording.name,recording.duration,recording.url,hitResult,business&quot;,&quot;startTime&quot;:&quot;2020-12-25 00:00:00&quot;,&quot;endTime&quot;:&quot;2020-12-31 23:59:59&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetSyncResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSyncResultRequest self = new GetSyncResultRequest();
        return TeaModel.build(map, self);
    }

    public GetSyncResultRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public GetSyncResultRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
