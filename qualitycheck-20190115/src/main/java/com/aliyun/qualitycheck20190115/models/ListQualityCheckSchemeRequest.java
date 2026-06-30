// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListQualityCheckSchemeRequest extends TeaModel {
    /**
     * <p>The ID of the baseMe agent.</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>The complete JSON string. For more information, see the details that follow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;name&quot;: &quot;质检方案A&quot;
     * }</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static ListQualityCheckSchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQualityCheckSchemeRequest self = new ListQualityCheckSchemeRequest();
        return TeaModel.build(map, self);
    }

    public ListQualityCheckSchemeRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public ListQualityCheckSchemeRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
