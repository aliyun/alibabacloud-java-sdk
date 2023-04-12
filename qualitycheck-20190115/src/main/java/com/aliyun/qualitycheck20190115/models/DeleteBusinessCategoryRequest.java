// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteBusinessCategoryRequest extends TeaModel {
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeleteBusinessCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBusinessCategoryRequest self = new DeleteBusinessCategoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBusinessCategoryRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public DeleteBusinessCategoryRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
