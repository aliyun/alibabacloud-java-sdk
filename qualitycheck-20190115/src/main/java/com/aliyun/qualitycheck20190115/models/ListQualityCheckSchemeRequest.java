// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListQualityCheckSchemeRequest extends TeaModel {
    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>The complete JSON string. For details, see the following information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;name&quot;: &quot;Quality Check Scheme A&quot;
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
