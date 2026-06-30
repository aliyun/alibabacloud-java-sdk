// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListTagRequest extends TeaModel {
    /**
     * <p>The ID of the business space.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>The complete JSON string. For more information, see the following detailed information.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static ListTagRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagRequest self = new ListTagRequest();
        return TeaModel.build(map, self);
    }

    public ListTagRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public ListTagRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
