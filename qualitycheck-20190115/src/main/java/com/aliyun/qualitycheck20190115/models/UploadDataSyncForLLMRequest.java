// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadDataSyncForLLMRequest extends TeaModel {
    /**
     * <p>The business space ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>The complete JSON string. For more information about the content, see the following details.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;tickets\&quot;:[{\&quot;dialogue\&quot;:[{\&quot;role\&quot;:\&quot;Agent\&quot;,\&quot;words\&quot;:\&quot;Yes\&quot;,\&quot;end\&quot;:0,\&quot;beginTime\&quot;:1783909236618,\&quot;begin\&quot;:0}],\&quot;tid\&quot;:\&quot;20260713-20240612032225161783909236618\&quot;}],\&quot;commonRuleIds\&quot;:[\&quot;20773\&quot;]}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UploadDataSyncForLLMRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDataSyncForLLMRequest self = new UploadDataSyncForLLMRequest();
        return TeaModel.build(map, self);
    }

    public UploadDataSyncForLLMRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public UploadDataSyncForLLMRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
