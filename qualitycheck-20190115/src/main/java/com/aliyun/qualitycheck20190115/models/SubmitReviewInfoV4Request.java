// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitReviewInfoV4Request extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;comments&quot;:&quot;tidComment&quot;,&quot;jsonReviewResult&quot;:&quot;{\&quot;reviewInfoList\&quot;:[{\&quot;changed\&quot;:true,\&quot;comment\&quot;:\&quot;ridComment\&quot;,\&quot;matched\&quot;:true,\&quot;reviewHitResult\&quot;:0,\&quot;reviewResult\&quot;:1,\&quot;rid\&quot;:31459,\&quot;sentenceReviewResults\&quot;:[{\&quot;changed\&quot;:true,\&quot;cid\&quot;:95302,\&quot;comment\&quot;:\&quot;pidComment\&quot;,\&quot;hitStatus\&quot;:0,\&quot;pid\&quot;:\&quot;0\&quot;,\&quot;reviewDimensionType\&quot;:\&quot;2\&quot;,\&quot;rid\&quot;:31459,\&quot;sid\&quot;:54104}]}]}&quot;,&quot;taskId&quot;:&quot;20251224-62931498-881B-1436-A93D-1FFBC5D7D4A0&quot;,&quot;vid&quot;:&quot;8cbe2bccf3be4b42bada45136f77d4e9&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static SubmitReviewInfoV4Request build(java.util.Map<String, ?> map) throws Exception {
        SubmitReviewInfoV4Request self = new SubmitReviewInfoV4Request();
        return TeaModel.build(map, self);
    }

    public SubmitReviewInfoV4Request setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public SubmitReviewInfoV4Request setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
