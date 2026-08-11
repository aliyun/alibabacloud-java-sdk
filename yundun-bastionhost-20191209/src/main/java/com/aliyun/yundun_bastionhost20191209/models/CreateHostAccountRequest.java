// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateHostAccountRequest extends TeaModel {
    /**
     * <p>The name of the host account to create. The name can be up to 128 characters in length.</p>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/200665.html">ListHosts</a> operation to query this parameter.</p>
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
     * <p>The ID of the Bastionhost instance where the host for which you want to create a host account resides.</p>
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
     * <p>The passphrase of the private key for the host account to create.</p>
     * <blockquote>
     * <p>You can configure this parameter when ProtocolName is set to SSH. You do not need to configure this parameter when ProtocolName is set to RDP.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("PassPhrase")
    public String passPhrase;

    /**
     * <p>The password of the host account to create.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The private key of the host account to create. The value is a Base64-encoded string.</p>
     * <blockquote>
     * <p>This parameter takes effect only when ProtocolName is set to SSH. You do not need to configure this parameter when ProtocolName is set to RDP. You can configure both a password and a private key for the host account. When connecting to an asset, Bastionhost preferentially uses the private key.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>LS0tLS1******RCBSU0tLQ==</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>The privilege type of the account. Default value: Normal.</p>
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
     * <p>The project ID.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The protocol name of the host account to create.
     * <br>Valid values:</p>
     * <ul>
     * <li>SSH</li>
     * <li>RDP</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SSH</p>
     */
    @NameInMap("ProtocolName")
    public String protocolName;

    /**
     * <p>The region ID of the Bastionhost instance where the host for which you want to create a host account resides.</p>
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
     * <p>The password rotation mode of the account. Default value: Self.</p>
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

    public CreateHostAccountRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
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
