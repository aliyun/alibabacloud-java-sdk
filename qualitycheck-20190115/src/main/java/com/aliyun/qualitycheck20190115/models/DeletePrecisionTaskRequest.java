// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeletePrecisionTaskRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{&quot;taskId&quot;: &quot;7C1DEF5F-2C18-4D36-99C6*******&quot;}&quot;</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeletePrecisionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePrecisionTaskRequest self = new DeletePrecisionTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeletePrecisionTaskRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public DeletePrecisionTaskRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
