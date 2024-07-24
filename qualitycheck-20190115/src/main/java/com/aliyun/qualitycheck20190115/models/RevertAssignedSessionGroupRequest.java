// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RevertAssignedSessionGroupRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;isSchemeData&quot;:1,&quot;forceRevertSessionGroup&quot;:true,&quot;sessionGroupIdList&quot;:[&quot;1&quot;]}</p>
     */
    @NameInMap("jsonStr")
    public String jsonStr;

    public static RevertAssignedSessionGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RevertAssignedSessionGroupRequest self = new RevertAssignedSessionGroupRequest();
        return TeaModel.build(map, self);
    }

    public RevertAssignedSessionGroupRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public RevertAssignedSessionGroupRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
