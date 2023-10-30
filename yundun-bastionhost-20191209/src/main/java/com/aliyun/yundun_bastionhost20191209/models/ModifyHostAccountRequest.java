// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostAccountRequest extends TeaModel {
    /**
     * <p>The ID of the host account whose information you want to modify.</p>
     * <br>
     * <p>> You can call the [ListHostAccounts](~~204372~~) operation to query the ID of the host account.</p>
     */
    @NameInMap("HostAccountId")
    public String hostAccountId;

    /**
     * <p>The new name of the host account. The name can be up to 128 characters in length.</p>
     */
    @NameInMap("HostAccountName")
    public String hostAccountName;

    /**
     * <p>The ID of the shared key.</p>
     */
    @NameInMap("HostShareKeyId")
    public String hostShareKeyId;

    /**
     * <p>The ID of the bastion host in which you want to modify the information about the host account.</p>
     * <br>
     * <p>> You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The passphrase of the new private key for the host account.</p>
     * <br>
     * <p>> This parameter takes effect only when the protocol of the host is set to SSH. If the protocol of the host is set to RDP, this parameter is not required.</p>
     */
    @NameInMap("PassPhrase")
    public String passPhrase;

    /**
     * <p>The new password of the host account.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The new private key of the host account. The value is a Base64-encoded string.</p>
     * <br>
     * <p>> This parameter takes effect only when the protocol of the host is set to SSH. If the protocol of the host is set to RDP, this parameter is not required. You can call the [GetHostAccount](~~204391~~) operation to query the protocol used by the host. You can configure a password and a private key for the host account at the same time. If both a password and a private key are configured for the host account, Bastionhost preferentially uses the private key for logon.</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>The region ID of the bastion host in which you want to query the details of the host account.</p>
     * <br>
     * <p>> For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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

    public ModifyHostAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
