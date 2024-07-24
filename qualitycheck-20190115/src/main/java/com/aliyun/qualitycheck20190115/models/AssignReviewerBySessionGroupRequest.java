// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AssignReviewerBySessionGroupRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;sessionGroupParam&quot;:{&quot;isSchemeData&quot;:1,&quot;callStartTime&quot;:&quot;2022-09-17 00:00:00&quot;,&quot;callEndTime&quot;:&quot;2022-09-23 23:59:59&quot;,&quot;schemeTaskConfigId&quot;:24},&quot;assignments&quot;:[{&quot;reviewer&quot;:63,&quot;count&quot;:4}],&quot;isSchemeData&quot;:1}</p>
     */
    @NameInMap("jsonStr")
    public String jsonStr;

    public static AssignReviewerBySessionGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignReviewerBySessionGroupRequest self = new AssignReviewerBySessionGroupRequest();
        return TeaModel.build(map, self);
    }

    public AssignReviewerBySessionGroupRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public AssignReviewerBySessionGroupRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
