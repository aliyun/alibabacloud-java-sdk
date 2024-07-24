// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListTaskAssignRulesRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;pageNumber&quot;:1,&quot;pageSize&quot;:10}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static ListTaskAssignRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskAssignRulesRequest self = new ListTaskAssignRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskAssignRulesRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public ListTaskAssignRulesRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
