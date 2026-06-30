// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetBusinessCategoryListRequest extends TeaModel {
    /**
     * <p>Workspace ID</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>Pass an empty string as the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetBusinessCategoryListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessCategoryListRequest self = new GetBusinessCategoryListRequest();
        return TeaModel.build(map, self);
    }

    public GetBusinessCategoryListRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public GetBusinessCategoryListRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
