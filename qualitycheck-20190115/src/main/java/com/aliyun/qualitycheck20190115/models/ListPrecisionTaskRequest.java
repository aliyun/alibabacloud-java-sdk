// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListPrecisionTaskRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{&quot;pageSize&quot;:10,&quot;pageNumber&quot;:1}&quot;</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static ListPrecisionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrecisionTaskRequest self = new ListPrecisionTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListPrecisionTaskRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public ListPrecisionTaskRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
