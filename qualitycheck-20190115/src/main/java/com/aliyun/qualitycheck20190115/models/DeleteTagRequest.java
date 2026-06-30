// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteTagRequest extends TeaModel {
    /**
     * <p>The ID of the business space.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>A complete JSON string. For more information, see the following detailed information.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeleteTagRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagRequest self = new DeleteTagRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTagRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public DeleteTagRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
