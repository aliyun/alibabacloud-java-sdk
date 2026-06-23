// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostAccountRequest extends TeaModel {
    /**
     * <p>Specifies the ID of the host account to be modified.</p>
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
     * <p>Specifies the modified host account name, which can contain up to 128 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("HostAccountName")
    public String hostAccountName;

    /**
     * <p>The host shared key ID.</p>
     * <blockquote>
     * <p>You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/462973.html">ListHostShareKeys</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HostShareKeyId")
    public String hostShareKeyId;

    /**
     * <p>Specifies the ID of the Bastionhost instance where the host account to be modified resides.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the Bastionhost instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies the modified security token of the host account\&quot;s private key.</p>
     * <blockquote>
     * <p>This parameter takes effect when the host account protocol is SSH. This parameter is not required when the host account protocol is RDP.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("PassPhrase")
    public String passPhrase;

    /**
     * <p>Specifies the modified password of the host account.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies the modified private key of the host account, which is a Base64-encoded string.</p>
     * <blockquote>
     * <p>This parameter takes effect when the host account protocol is SSH. This parameter is not required when the host account protocol is RDP. You can call the <a href="https://help.aliyun.com/document_detail/204391.html">GetHostAccount</a> operation to query the protocol used by the host account. You can configure both a password and a private key for a host account. When connecting to an asset, Bastionhost preferentially uses the private key for connection.</p>
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
     * <p>Account permission type. Valid values:</p>
     * <ul>
     * <li><p><strong>Privileged</strong>: privileged account</p>
     * </li>
     * <li><p><strong>Normal</strong>: regular account</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only in V3.2.47 and later versions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("PrivilegeType")
    public String privilegeType;

    /**
     * <p>Specifies the region ID of the Bastionhost instance where the host account to be queried resides.</p>
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
     * <p>Account password rotation mode. Valid values:</p>
     * <ul>
     * <li><p><strong>Privileged</strong>: Use a privileged account to change the password</p>
     * </li>
     * <li><p><strong>Self</strong>: Do not use a privileged account to change the password</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only in V3.2.47 and later versions.</p>
     * </blockquote>
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
