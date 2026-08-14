// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostAccountRequest extends TeaModel {
    /**
     * <p>The ID of the host account to modify.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/204372.html">ListHostAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HostAccountId")
    public String hostAccountId;

    /**
     * <p>The new name of the host account. The name can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("HostAccountName")
    public String hostAccountName;

    /**
     * <p>The ID of the shared key for the host.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/462973.html">ListHostShareKeys</a> operation to obtain this ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HostShareKeyId")
    public String hostShareKeyId;

    /**
     * <p>The ID of the bastion host instance where the host account to modify resides.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain the bastion host instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new passphrase of the private key for the host account.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the protocol of the host account is SSH. If the protocol is RDP, you do not need to configure this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("PassPhrase")
    public String passPhrase;

    /**
     * <p>The new password of the host account.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The new private key of the host account. The private key is a Base64-encoded string.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the protocol of the host account is SSH. If the protocol is RDP, you do not need to configure this parameter. You can call the <a href="https://help.aliyun.com/document_detail/204391.html">GetHostAccount</a> operation to query the protocol used by the host account. You can configure both a password and a private key for the host account. When connecting to an asset, the bastion host preferentially uses the private key.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN RSA PRIVATE KEY-----
     * ......
     * -----END RSA PRIVATE KEY-----</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>The privilege type of the account. Valid values:</p>
     * <ul>
     * <li><strong>Privileged</strong>: privileged account.</li>
     * <li><strong>Normal</strong>: standard account.<blockquote>
     * <p>Only supported in V3.2.47 and later.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("PrivilegeType")
    public String privilegeType;

    /**
     * <p>The ID of the project to which the host of the host account belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The region ID of the bastion host instance where the host account to query resides.</p>
     * <blockquote>
     * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The password rotation mode of the account. Valid values:</p>
     * <ul>
     * <li><strong>Privileged</strong>: uses a privileged account to rotate the password.</li>
     * <li><strong>Self</strong>: does not use a privileged account to rotate the password.<blockquote>
     * <p>Only supported in V3.2.47 and later.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Self</p>
     */
    @NameInMap("RotationMode")
    public String rotationMode;

    public static ModifyHostAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostAccountRequest self = new ModifyHostAccountRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHostAccountRequest setHostAccountId(String hostAccountId) {
        this.hostAccountId = hostAccountId;
        return this;
    }
    public String getHostAccountId() {
        return this.hostAccountId;
    }

    public ModifyHostAccountRequest setHostAccountName(String hostAccountName) {
        this.hostAccountName = hostAccountName;
        return this;
    }
    public String getHostAccountName() {
        return this.hostAccountName;
    }

    public ModifyHostAccountRequest setHostShareKeyId(String hostShareKeyId) {
        this.hostShareKeyId = hostShareKeyId;
        return this;
    }
    public String getHostShareKeyId() {
        return this.hostShareKeyId;
    }

    public ModifyHostAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyHostAccountRequest setPassPhrase(String passPhrase) {
        this.passPhrase = passPhrase;
        return this;
    }
    public String getPassPhrase() {
        return this.passPhrase;
    }

    public ModifyHostAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyHostAccountRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public ModifyHostAccountRequest setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
        return this;
    }
    public String getPrivilegeType() {
        return this.privilegeType;
    }

    public ModifyHostAccountRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ModifyHostAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyHostAccountRequest setRotationMode(String rotationMode) {
        this.rotationMode = rotationMode;
        return this;
    }
    public String getRotationMode() {
        return this.rotationMode;
    }

}
