// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitComplaintRequest extends TeaModel {
    /**
     * <p>The business space ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>A JSON string that contains the complaint details. For more information, see the following table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;taskId&quot;:&quot;ADCA1DE6-8117-472A-B3A1-352A248F90D0&quot;,&quot;fileId&quot;:&quot;653e563d-774f-4f01-a809-cb8bb920c3e6&quot;,&quot;rid&quot;:1346,&quot;comments&quot;:&quot;请重新判定&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static SubmitComplaintRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitComplaintRequest self = new SubmitComplaintRequest();
        return TeaModel.build(map, self);
    }

    public SubmitComplaintRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public SubmitComplaintRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
