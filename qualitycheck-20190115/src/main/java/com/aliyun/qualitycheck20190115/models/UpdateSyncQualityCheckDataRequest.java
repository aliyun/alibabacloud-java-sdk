// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateSyncQualityCheckDataRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>jsonStr is a JSON string that contains all Custom Parameters for this API. For details, see <strong>jsonStr property description</strong> below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;tid&quot;:&quot;xxx&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UpdateSyncQualityCheckDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSyncQualityCheckDataRequest self = new UpdateSyncQualityCheckDataRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSyncQualityCheckDataRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public UpdateSyncQualityCheckDataRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
