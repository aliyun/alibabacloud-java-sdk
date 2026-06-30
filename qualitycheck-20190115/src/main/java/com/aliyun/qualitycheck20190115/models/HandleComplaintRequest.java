// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class HandleComplaintRequest extends TeaModel {
    /**
     * <p>The ID of the business space.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>A JSON string that contains the request parameters. For details, see the following section.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;taskId&quot;:&quot;任务ID&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static HandleComplaintRequest build(java.util.Map<String, ?> map) throws Exception {
        HandleComplaintRequest self = new HandleComplaintRequest();
        return TeaModel.build(map, self);
    }

    public HandleComplaintRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public HandleComplaintRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
