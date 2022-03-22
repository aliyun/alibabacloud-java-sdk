// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class XspaceAddIdpXspaceAccountRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ShowName")
    public String showName;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserName")
    public String userName;

    public static XspaceAddIdpXspaceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        XspaceAddIdpXspaceAccountRequest self = new XspaceAddIdpXspaceAccountRequest();
        return TeaModel.build(map, self);
    }

    public XspaceAddIdpXspaceAccountRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public XspaceAddIdpXspaceAccountRequest setShowName(String showName) {
        this.showName = showName;
        return this;
    }
    public String getShowName() {
        return this.showName;
    }

    public XspaceAddIdpXspaceAccountRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public XspaceAddIdpXspaceAccountRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public XspaceAddIdpXspaceAccountRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
