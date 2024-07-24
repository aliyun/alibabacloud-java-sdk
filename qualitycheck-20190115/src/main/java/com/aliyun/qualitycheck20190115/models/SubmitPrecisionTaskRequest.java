// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitPrecisionTaskRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{&quot;name&quot;:&quot;test&quot;,&quot;dataSetId&quot;:1865}&quot;</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static SubmitPrecisionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitPrecisionTaskRequest self = new SubmitPrecisionTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitPrecisionTaskRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public SubmitPrecisionTaskRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
