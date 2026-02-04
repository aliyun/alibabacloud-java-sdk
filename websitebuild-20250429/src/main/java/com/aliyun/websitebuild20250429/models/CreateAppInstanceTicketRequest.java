// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppInstanceTicketRequest extends TeaModel {
    /**
     * <p>Customer business ID</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250801154628000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Client ID of the device that needs to revoke the access token.</p>
     * 
     * <strong>example:</strong>
     * <p>d566aaf2-7c88-40a4-982f-6abef0be13c9</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    public static CreateAppInstanceTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppInstanceTicketRequest self = new CreateAppInstanceTicketRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppInstanceTicketRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateAppInstanceTicketRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

}
