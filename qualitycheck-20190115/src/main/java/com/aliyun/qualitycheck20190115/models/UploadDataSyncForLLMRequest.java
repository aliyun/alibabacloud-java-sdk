// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadDataSyncForLLMRequest extends TeaModel {
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>This parameter is required.</p>
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
