// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddUserVpcAuthorizationRequest extends TeaModel {
    /**
     * <p>The authorization method. Valid values:</p>
     * <ul>
     * <li>AUTH_CODE: An authorization code is used to associate VPCs across accounts. The system checks whether the value of AuthCode is valid.</li>
     * <li>RESOURCE_DIRECTORY: A resource directory is used to associate VPCs across accounts. The system checks whether the value of AuthorizedUserId and the current account are in the same resource directory.</li>
     * <li>If this parameter is empty, an authorization code is used to associate VPCs across accounts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AUTH_CODE</p>
     */
    @NameInMap("AuthChannel")
    public String authChannel;

    /**
     * <p>The verification code.</p>
     * <p>This parameter is required when AuthType is set to NORMAL or is left empty and AuthChannel is set to AUTH_CODE or is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The authorization scope. Valid values:</p>
     * <ul>
     * <li>NORMAL: general authorization.</li>
     * <li>CLOUD_PRODUCT: cloud service-related authorization</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111222333</p>
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
