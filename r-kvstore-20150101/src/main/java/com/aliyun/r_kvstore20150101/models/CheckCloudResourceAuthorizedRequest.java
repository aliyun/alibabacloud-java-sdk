// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CheckCloudResourceAuthorizedRequest extends TeaModel {
    /**
     * <p>Instance ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/473778.html">DescribeInstances</a> operation to query instance ID.</p>
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
     * <p>Specifies the global resource descriptor ARN (Alibaba Cloud Resource Name) of the role to be granted authorization. After the role authorization is completed, you can use the related Key Management Service (KMS). Format: <code>acs:ram::$accountID:role/$roleName</code>.</p>
     * <blockquote>
     * <ul>
     * <li><code>$accountID</code>: the Alibaba Cloud account ID. You can logon to the Alibaba Cloud Management Console, move the mouse over the profile picture in the upper-right corner, and click <strong>Security Settings</strong> to view the ID.</li>
     * <li><code>$roleName</code>: the name of the RAM role. Set the value to <strong>AliyunRdsInstanceEncryptionDefaultRole</strong>.</li>
     * </ul>
     * </blockquote>
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
