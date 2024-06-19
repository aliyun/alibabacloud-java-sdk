// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CheckCloudResourceAuthorizedRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/60933.html">DescribeInstances</a> operation to query the ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the Resource Access Management (RAM) role that you want to attach to your ApsaraDB for Redis instance. The ARN must be in the format of <code>acs:ram::$accountID:role/$roleName</code>. After the role is attached, your ApsaraDB for Redis instance can use KMS.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p><code>$accountID</code>: the ID of the Alibaba Cloud account. To view the account ID, log on to the Alibaba Cloud console, move the pointer over your profile picture in the upper-right corner of the page, and then click <strong>Security Settings</strong>.</p>
     * </li>
     * <li><p><code>$roleName</code>: the name of the RAM role. Replace $roleName with <strong>AliyunRdsInstanceEncryptionDefaultRole</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/AliyunRdsInstanceEncryptionDefaultRole</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CheckCloudResourceAuthorizedRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCloudResourceAuthorizedRequest self = new CheckCloudResourceAuthorizedRequest();
        return TeaModel.build(map, self);
    }

    public CheckCloudResourceAuthorizedRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CheckCloudResourceAuthorizedRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CheckCloudResourceAuthorizedRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CheckCloudResourceAuthorizedRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CheckCloudResourceAuthorizedRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CheckCloudResourceAuthorizedRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CheckCloudResourceAuthorizedRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
