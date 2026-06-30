// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class VerifySentenceRequest extends TeaModel {
    /**
     * <p>Workspace ID.</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>Full JSON string. For details, see the following table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{&quot;taskId&quot;:&quot;EA701F66-8CA2-4A79-8E3C-A6F2F****&quot;,&quot;fileName&quot;:&quot;人工校验测试-订购茶叶.wav&quot;,&quot;dialogueId&quot;:1,&quot;roleCorrect&quot;:false,&quot;sourceRole&quot;:0,&quot;textCorrect&quot;:false,&quot;sourceText&quot;:&quot;我要订购大量的信阳毛尖。&quot;,&quot;oldIncorrectWords&quot;:3,&quot;targetText&quot;:&quot;我要订购大大的南阳毛巾。&quot;,&quot;targetRole&quot;:1}&quot;</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static VerifySentenceRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifySentenceRequest self = new VerifySentenceRequest();
        return TeaModel.build(map, self);
    }

    public VerifySentenceRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public VerifySentenceRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
