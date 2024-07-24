// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RevertAssignedSessionRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;isSchemeData&quot;:1,&quot;searchParam&quot;:{&quot;schemeTaskConfigId&quot;:1,&quot;sourceDataType&quot;:1,&quot;startTime&quot;:&quot;2022-09-20 00:00:00&quot;,&quot;endTime&quot;:&quot;2022-09-26 23:59:59&quot;}}</p>
     */
    @NameInMap("jsonStr")
    public String jsonStr;

    public static RevertAssignedSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        RevertAssignedSessionRequest self = new RevertAssignedSessionRequest();
        return TeaModel.build(map, self);
    }

    public RevertAssignedSessionRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public RevertAssignedSessionRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
