// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListSessionGroupRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;isSchemeData&quot;:1,&quot;pageNumber&quot;:1,&quot;pageSize&quot;:10,&quot;callStartTime&quot;:&quot;2022-09-17 00:00:00&quot;,&quot;callEndTime&quot;:&quot;2022-09-23 23:59:59&quot;,&quot;schemeTaskConfigId&quot;:368}</p>
     */
    @NameInMap("jsonStr")
    public String jsonStr;

    public static ListSessionGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSessionGroupRequest self = new ListSessionGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListSessionGroupRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public ListSessionGroupRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
