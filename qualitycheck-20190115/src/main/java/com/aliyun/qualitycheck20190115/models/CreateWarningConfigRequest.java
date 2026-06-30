// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateWarningConfigRequest extends TeaModel {
    /**
     * <p>Workspace ID</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>Complete JSON string information. See the following details for specific content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ridList&quot;:[15670],&quot;configName&quot;:&quot;投诉预警&quot;,&quot;channels&quot;:[{&quot;type&quot;:1,&quot;url&quot;:&quot;<a href="https://xxx%22%7D%5D%7D">https://xxx&quot;}]}</a></p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static CreateWarningConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWarningConfigRequest self = new CreateWarningConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateWarningConfigRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public CreateWarningConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
