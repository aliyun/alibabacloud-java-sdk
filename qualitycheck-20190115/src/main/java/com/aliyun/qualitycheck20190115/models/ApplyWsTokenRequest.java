// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ApplyWsTokenRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;business&quot;: &quot;test&quot;,
     *     &quot;callType&quot;: 1,
     *     &quot;callee&quot;: &quot;13111111111&quot;,
     *     &quot;caller&quot;: &quot;13800000000&quot;,
     *     &quot;skillGroupId&quot;: 1,
     *     &quot;skillGroupName&quot;: &quot;test&quot;,
     *     &quot;taskConfigId&quot;: 399,
     *     &quot;tid&quot;: &quot;2025012412cb129e-1579-46b5-9326-1b2ececf8f30&quot;
     * }</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static ApplyWsTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyWsTokenRequest self = new ApplyWsTokenRequest();
        return TeaModel.build(map, self);
    }

    public ApplyWsTokenRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public ApplyWsTokenRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
