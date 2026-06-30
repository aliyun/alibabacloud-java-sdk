// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListAsrVocabRequest extends TeaModel {
    /**
     * <p>The workspace ID.</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>The complete JSON string. For more information, see the details below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;pageSize&quot;:1}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static ListAsrVocabRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAsrVocabRequest self = new ListAsrVocabRequest();
        return TeaModel.build(map, self);
    }

    public ListAsrVocabRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public ListAsrVocabRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
