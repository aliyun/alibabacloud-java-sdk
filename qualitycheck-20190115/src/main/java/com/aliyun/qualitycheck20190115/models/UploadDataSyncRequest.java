// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadDataSyncRequest extends TeaModel {
    /**
     * <p>The ID of the business workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>The jsonStr parameter is a JSON string that contains all custom parameters for this API operation. For details, see the <strong>jsonStr property description</strong> below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;tickets&quot;:xxx}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UploadDataSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDataSyncRequest self = new UploadDataSyncRequest();
        return TeaModel.build(map, self);
    }

    public UploadDataSyncRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public UploadDataSyncRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
