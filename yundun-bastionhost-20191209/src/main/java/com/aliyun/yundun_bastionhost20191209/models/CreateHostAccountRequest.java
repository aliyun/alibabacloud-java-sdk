// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateHostAccountRequest extends TeaModel {
    /**
     * <p>The name of the host account that you want to add. The name can be up to 128 characters in length.</p>
     */
    @NameInMap("HostAccountName")
    public String hostAccountName;

    /**
     * <p>The ID of the host to which you want to add a host account.</p>
     * <br>
     * <p>>  You can call the [ListHosts](~~200665~~) operation to query the ID of the host.</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <p>The ID of the shared key.</p>
     */
    @NameInMap("HostShareKeyId")
    public String hostShareKeyId;

    /**
     * <p>The ID of the bastion host in which you want to add a host account to the host.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The passphrase of the private key for the host account.</p>
     * <br>
     * <p>>  You can specify this parameter when the ProtocolName parameter is set to SSH. If the ProtocolName parameter is set to RDP, you do not need to specify this parameter.</p>
     */
    @NameInMap("PassPhrase")
    public String passPhrase;

    /**
     * <p>The password of the host account.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The private key of the host account. The value is a Base64-encoded string.</p>
     * <br>
     * <p>>  This parameter takes effect only when the ProtocolName parameter is set to SSH. If the ProtocolName parameter is set to RDP, you do not need to specify this parameter. You can configure a password and a private key for the host account at the same time. If both a password and a private key are configured for the host account, Bastionhost preferentially uses the private key to log on to the host.</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>The protocol of the host to which you want to add a host account.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   SSH</p>
     * <p>*   RDP</p>
     */
    @NameInMap("ProtocolName")
    public String protocolName;

    /**
     * <p>The region ID of the bastion host in which you want to add a host account to the host.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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

}
