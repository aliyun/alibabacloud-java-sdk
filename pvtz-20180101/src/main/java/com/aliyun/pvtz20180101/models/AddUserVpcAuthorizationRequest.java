// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddUserVpcAuthorizationRequest extends TeaModel {
    /**
     * <p>The authorization channel. Valid values:</p>
     * <ul>
     * <li>AUTH_CODE: A verification code is used for authorization.</li>
     * <li>RESOURCE_DIRECTORY: A resource directory is used for authorization.</li>
     * </ul>
     * <p>Default value: AUTH_CODE.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTH_CODE</p>
     */
    @NameInMap("AuthChannel")
    public String authChannel;

    /**
     * <p>The verification code.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The specified authentication code is used if the value of AuthChannel is left empty or is set to AUTH_CODE.</p>
     * </li>
     * <li><p>In other cases, a random 6-digit number is used. Example: 123456.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The authorization scope. Valid values:</p>
     * <ul>
     * <li>NORMAL: general authorization</li>
     * <li>CLOUD_PRODUCT: cloud service-related authorization</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>The ID of the Alibaba Cloud account to which the permissions on the resources are granted.</p>
     * <blockquote>
     * <p> You can set an effective scope across accounts only by using an Alibaba Cloud account instead of a RAM user. You can set an effective scope across accounts registered on the same site. For example, you can perform the operation across accounts that are both registered on the Alibaba Cloud China site or Alibaba Cloud international site. You cannot set an effective scope across accounts registered on different sites. For example, you cannot perform the operation across accounts that are separately registered on the Alibaba Cloud China site and Alibaba Cloud international site.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>141339776561****</p>
     */
    @NameInMap("AuthorizedUserId")
    public Long authorizedUserId;

    public static AddUserVpcAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserVpcAuthorizationRequest self = new AddUserVpcAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public AddUserVpcAuthorizationRequest setAuthChannel(String authChannel) {
        this.authChannel = authChannel;
        return this;
    }
    public String getAuthChannel() {
        return this.authChannel;
    }

    public AddUserVpcAuthorizationRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public AddUserVpcAuthorizationRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public AddUserVpcAuthorizationRequest setAuthorizedUserId(Long authorizedUserId) {
        this.authorizedUserId = authorizedUserId;
        return this;
    }
    public Long getAuthorizedUserId() {
        return this.authorizedUserId;
    }

}
