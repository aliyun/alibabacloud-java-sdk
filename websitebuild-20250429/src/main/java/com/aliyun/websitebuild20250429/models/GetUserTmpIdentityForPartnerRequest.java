// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetUserTmpIdentityForPartnerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BindDomain</p>
     */
    @NameInMap("AuthPurpose")
    public String authPurpose;

    /**
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Extend")
    public String extend;

    /**
     * <strong>example:</strong>
     * <p>AliyunServiceRoleForSasCspm</p>
     */
    @NameInMap("ServiceLinkedRole")
    public String serviceLinkedRole;

    /**
     * <strong>example:</strong>
     * <p>1231331311</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GetUserTmpIdentityForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserTmpIdentityForPartnerRequest self = new GetUserTmpIdentityForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public GetUserTmpIdentityForPartnerRequest setAuthPurpose(String authPurpose) {
        this.authPurpose = authPurpose;
        return this;
    }
    public String getAuthPurpose() {
        return this.authPurpose;
    }

    public GetUserTmpIdentityForPartnerRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetUserTmpIdentityForPartnerRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public GetUserTmpIdentityForPartnerRequest setServiceLinkedRole(String serviceLinkedRole) {
        this.serviceLinkedRole = serviceLinkedRole;
        return this;
    }
    public String getServiceLinkedRole() {
        return this.serviceLinkedRole;
    }

    public GetUserTmpIdentityForPartnerRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
