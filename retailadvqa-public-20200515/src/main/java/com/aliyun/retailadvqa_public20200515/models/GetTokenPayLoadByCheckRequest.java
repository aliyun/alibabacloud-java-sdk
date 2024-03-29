// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class GetTokenPayLoadByCheckRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("SignDriver")
    public String signDriver;

    @NameInMap("SignNonce")
    public String signNonce;

    @NameInMap("SignPk")
    public String signPk;

    @NameInMap("SignToken")
    public String signToken;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetTokenPayLoadByCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTokenPayLoadByCheckRequest self = new GetTokenPayLoadByCheckRequest();
        return TeaModel.build(map, self);
    }

    public GetTokenPayLoadByCheckRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public GetTokenPayLoadByCheckRequest setSignDriver(String signDriver) {
        this.signDriver = signDriver;
        return this;
    }
    public String getSignDriver() {
        return this.signDriver;
    }

    public GetTokenPayLoadByCheckRequest setSignNonce(String signNonce) {
        this.signNonce = signNonce;
        return this;
    }
    public String getSignNonce() {
        return this.signNonce;
    }

    public GetTokenPayLoadByCheckRequest setSignPk(String signPk) {
        this.signPk = signPk;
        return this;
    }
    public String getSignPk() {
        return this.signPk;
    }

    public GetTokenPayLoadByCheckRequest setSignToken(String signToken) {
        this.signToken = signToken;
        return this;
    }
    public String getSignToken() {
        return this.signToken;
    }

    public GetTokenPayLoadByCheckRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
