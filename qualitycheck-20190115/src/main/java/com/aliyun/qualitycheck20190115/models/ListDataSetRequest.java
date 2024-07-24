// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListDataSetRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;pageNumber&quot;:1,&quot;pageSize&quot;:10}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static ListDataSetRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSetRequest self = new ListDataSetRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSetRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public ListDataSetRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
