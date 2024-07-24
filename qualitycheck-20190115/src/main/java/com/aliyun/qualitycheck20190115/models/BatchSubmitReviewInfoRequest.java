// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class BatchSubmitReviewInfoRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;isSchemeData&quot;:1,&quot;schemeTaskConfigId&quot;:334,&quot;sourceDataType&quot;:2,&quot;startTime&quot;:&quot;2022-08-25 00:00:00&quot;,&quot;endTime&quot;:&quot;2022-09-23 23:59:59&quot;,&quot;sessionList&quot;:[{&quot;taskId&quot;:&quot;20220831-F8D7F4DF-0A16-1A1C-BA63-28F203922692&quot;,&quot;fileId&quot;:&quot;20220831-164343&quot;},{&quot;taskId&quot;:&quot;20220831-F2A50A72-82C4-1E3F-A1FD-52A662283D25&quot;,&quot;fileId&quot;:&quot;20220831-164343&quot;}]}</p>
     */
    @NameInMap("jsonStr")
    public String jsonStr;

    public static BatchSubmitReviewInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSubmitReviewInfoRequest self = new BatchSubmitReviewInfoRequest();
        return TeaModel.build(map, self);
    }

    public BatchSubmitReviewInfoRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public BatchSubmitReviewInfoRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
