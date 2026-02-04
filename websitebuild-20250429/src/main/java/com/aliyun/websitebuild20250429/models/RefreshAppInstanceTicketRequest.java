// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RefreshAppInstanceTicketRequest extends TeaModel {
    /**
     * <p>Business ID of the application instance</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Updated token information</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The UUID of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>c5c354d7-5e68-443a-b7fc-767e6ede9deb</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static RefreshAppInstanceTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshAppInstanceTicketRequest self = new RefreshAppInstanceTicketRequest();
        return TeaModel.build(map, self);
    }

    public RefreshAppInstanceTicketRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RefreshAppInstanceTicketRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public RefreshAppInstanceTicketRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
