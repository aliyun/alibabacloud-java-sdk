// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetUserTmpIdentityForPartnerRequest extends TeaModel {
    /**
     * <p>The purpose of the authorization.</p>
     * 
     * <strong>example:</strong>
     * <p>BindDomain</p>
     */
    @NameInMap("AuthPurpose")
    public String authPurpose;

    /**
     * <p>The business ID of the customer.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Specifies whether fuzzy match is supported for port numbers. Set this parameter to <strong>1</strong> to enable fuzzy match. Other values or an empty value indicate that fuzzy match is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;deliveryNodeName\&quot;:\&quot;视觉设计确认\&quot;,\&quot;deliveryNodeStatus\&quot;:\&quot;Reject\&quot;,\&quot;deliveryOperatorRole\&quot;:\&quot;Customer\&quot;}</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>The service-linked role.</p>
     * <blockquote>
     * <p>For information about the service-linked roles supported by ApsaraDB RDS, see <a href="https://help.aliyun.com/document_detail/342840.html">Service-linked roles</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AliyunServiceRoleForSasCspm</p>
     */
    @NameInMap("ServiceLinkedRole")
    public String serviceLinkedRole;

    /**
     * <p>The user ID.</p>
     * 
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
