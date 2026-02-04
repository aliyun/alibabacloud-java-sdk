// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class IntrospectAppInstanceTicketForPreviewRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WS12345678</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>ogxMqT04nnZOqdIqJZldbm-ZNsAVDz5mcqdCSudfX0SL61jjyWfV-ZnAO-OVpCt_aDl8xaaIO1OVkuvEcMn-HR_QddvaxMqIdsMY1cHdD4SDiRfOBGNdnpSdX9gG_Hi_.ab9c10816d913b51d87520ce0a72b2970668144c552689e9d9e211eb4529f0ea</p>
     */
    @NameInMap("Token")
    public String token;

    public static IntrospectAppInstanceTicketForPreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        IntrospectAppInstanceTicketForPreviewRequest self = new IntrospectAppInstanceTicketForPreviewRequest();
        return TeaModel.build(map, self);
    }

    public IntrospectAppInstanceTicketForPreviewRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public IntrospectAppInstanceTicketForPreviewRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
