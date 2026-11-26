// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateHttpEventConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;switchFlag&quot;: true,
     *     &quot;callbackUrl&quot;: &quot;<a href="http://123213.com">http://123213.com</a>&quot;,
     *     &quot;httpMethod&quot;: &quot;GET&quot;,
     *     &quot;eventConfig&quot;: {
     *         &quot;taskCompleteEvent&quot;: true,
     *         &quot;fileReviewedEvent&quot;: true,
     *         &quot;complaintHandledEvent&quot;: true
     *     }
     * }</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UpdateHttpEventConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpEventConfigRequest self = new UpdateHttpEventConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHttpEventConfigRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public UpdateHttpEventConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
