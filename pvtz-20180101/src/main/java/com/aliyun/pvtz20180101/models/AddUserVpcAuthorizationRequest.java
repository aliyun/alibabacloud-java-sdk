// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddUserVpcAuthorizationRequest extends TeaModel {
    /**
     * <p>The authorization channel. Valid values:</p>
     * <ul>
     * <li>AUTH_CODE: verification code authorization.</li>
     * <li>RESOURCE_DIRECTORY: resource directory authorization.</li>
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
     * <ul>
     * <li>If AuthChannel is empty or set to AUTH_CODE, specify the verification code.  </li>
     * <li>In other cases, specify a random 6-digit number, such as 123456.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The authorization type. Valid values:</p>
     * <ul>
     * <li>NORMAL: normal authorization.</li>
     * <li>CLOUD_PRODUCT: cloud product authorization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>The ID of the Alibaba Cloud account that owns the authorized resource.</p>
     * <blockquote>
     * <p>Cross-account authorization only supports Alibaba Cloud accounts (primary accounts) and does not support RAM users. Only accounts within the same site can be associated, such as between Alibaba Cloud China Website (<a href="http://www.aliyun.com">www.aliyun.com</a>) accounts or between Alibaba Cloud International Website (<a href="http://www.alibabacloud.com">www.alibabacloud.com</a>) accounts. Cross-site association is not supported, such as between a China Website account and an International Website account.</p>
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
