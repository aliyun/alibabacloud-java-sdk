// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuyingai20260311.models;

import com.aliyun.tea.*;

public class GetAccessTokenRequest extends TeaModel {
    /**
     * <p>The unique identifier of the user in the external system.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;user-38764&quot;</p>
     */
    @NameInMap("ExternalUserId")
    public String externalUserId;

    /**
     * <p>The ID of the agent template.</p>
     * 
     * <strong>example:</strong>
     * <p>1600112233445566</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static GetAccessTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccessTokenRequest self = new GetAccessTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetAccessTokenRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public GetAccessTokenRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
