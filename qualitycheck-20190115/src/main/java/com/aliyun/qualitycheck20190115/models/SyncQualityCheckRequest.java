// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SyncQualityCheckRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;tid&quot;:&quot;20200823-234234&quot;,&quot;dialogue&quot;:&quot;{}&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static SyncQualityCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncQualityCheckRequest self = new SyncQualityCheckRequest();
        return TeaModel.build(map, self);
    }

    public SyncQualityCheckRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public SyncQualityCheckRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
