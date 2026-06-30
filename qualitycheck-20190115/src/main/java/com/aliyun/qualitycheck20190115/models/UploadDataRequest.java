// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadDataRequest extends TeaModel {
    /**
     * <p>Workspace ID. Use this to select a specific workspace in multi-workspace scenarios. Defaults to the default workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>JsonStr is a JSON string that contains all custom parameters for this API. See the JsonStr property description below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UploadDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDataRequest self = new UploadDataRequest();
        return TeaModel.build(map, self);
    }

    public UploadDataRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public UploadDataRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
