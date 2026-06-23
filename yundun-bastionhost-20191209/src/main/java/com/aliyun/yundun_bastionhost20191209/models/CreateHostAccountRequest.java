// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateHostAccountRequest extends TeaModel {
    /**
     * <p>The name of the new host account. The name can be up to 128 characters long.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>accountname</p>
     */
    @NameInMap("HostAccountName")
    public String hostAccountName;

    /**
     * <p>The ID of the host for which you want to create a host account.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/200665.html">ListHosts</a> operation to obtain the host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <p>The ID of the shared key for the host.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HostShareKeyId")
    public String hostShareKeyId;

    /**
     * <p>The ID of the Bastionhost instance where you want to create the host account.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain the instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The passphrase for the private key of the new host account.</p>
     * <blockquote>
     * <p>You can set this parameter only when ProtocolName is set to SSH. You do not need to set this parameter if ProtocolName is set to RDP.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("PassPhrase")
    public String passPhrase;

    /**
     * <p>The password of the new host account.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The private key of the new host account. The value is a Base64-encoded string.</p>
     * <blockquote>
     * <p>This parameter is used only when ProtocolName is set to SSH. You do not need to set this parameter if ProtocolName is set to RDP. You can set both a password and a private key for the host account. When connecting to the asset, Bastionhost prioritizes the private key for the connection.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>LS0tLS1******RCBSU0tLQ==</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>The permission type of the account. If you do not set this parameter, the default value is Normal.</p>
     * <ul>
     * <li><p><strong>Privileged</strong>: privileged account</p>
     * </li>
     * <li><p><strong>Normal</strong>: normal account</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only in Bastionhost V3.2.47 and later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("PrivilegeType")
    public String privilegeType;

    /**
     * <p>The protocol of the new host account. <br>Valid values:<br></p>
     * <ul>
     * <li><p>SSH</p>
     * </li>
     * <li><p>RDP</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SSH</p>
     */
    @NameInMap("ProtocolName")
    public String protocolName;

    /**
     * <p>The region ID of the Bastionhost instance where you want to create the host account.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The password change mode for the account. If you do not set this parameter, the default value is Self.</p>
     * <ul>
     * <li><p><strong>Privileged</strong>: Use a privileged account to change the password.</p>
     * </li>
     * <li><p><strong>Self</strong>: Do not use a privileged account to change the password.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only in Bastionhost V3.2.47 and later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Self</p>
     */
    @NameInMap("RotationMode")
    public String rotationMode;

    public static CreateHostAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHostAccountRequest self = new CreateHostAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateHostAccountRequest setHostAccountName(String hostAccountName) {
        this.hostAccountName = hostAccountName;
        return this;
    }
    public String getHostAccountName() {
        return this.hostAccountName;
    }

    public CreateHostAccountRequest setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public CreateHostAccountRequest setHostShareKeyId(String hostShareKeyId) {
        this.hostShareKeyId = hostShareKeyId;
        return this;
    }
    public String getHostShareKeyId() {
        return this.hostShareKeyId;
    }

    public CreateHostAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateHostAccountRequest setPassPhrase(String passPhrase) {
        this.passPhrase = passPhrase;
        return this;
    }
    public String getPassPhrase() {
        return this.passPhrase;
    }

    public CreateHostAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateHostAccountRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public CreateHostAccountRequest setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
        return this;
    }
    public String getPrivilegeType() {
        return this.privilegeType;
    }

    public CreateHostAccountRequest setProtocolName(String protocolName) {
        this.protocolName = protocolName;
        return this;
    }
    public String getProtocolName() {
        return this.protocolName;
    }

    public CreateHostAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateHostAccountRequest setRotationMode(String rotationMode) {
        this.rotationMode = rotationMode;
        return this;
    }
    public String getRotationMode() {
        return this.rotationMode;
    }

}
