// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class VerifyFileRequest extends TeaModel {
    /**
     * <p>Workspace ID.</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>Complete JSON string information. For details, see the following information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{&quot;taskId&quot;:&quot;EA701F66-8CA2-4A79-8E3C-A6F2****&quot;,&quot;fileName&quot;:&quot;人工校验测试-订购茶叶.wav&quot;}&quot;</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static VerifyFileRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyFileRequest self = new VerifyFileRequest();
        return TeaModel.build(map, self);
    }

    public VerifyFileRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public VerifyFileRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
