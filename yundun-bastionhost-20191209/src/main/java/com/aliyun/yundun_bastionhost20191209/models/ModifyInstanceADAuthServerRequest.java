// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceADAuthServerRequest extends TeaModel {
    /**
     * <p>The username of the account that is used for the AD server.</p>
     */
    @NameInMap("Account")
    public String account;

    /**
     * <p>The Base distinguished name (DN).</p>
     */
    @NameInMap("BaseDN")
    public String baseDN;

    /**
     * <p>The domain on the AD server.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The field that is used to indicate the email address of a user on the AD server.</p>
     */
    @NameInMap("EmailMapping")
    public String emailMapping;

    /**
     * <p>The condition that is used to filter users.</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The ID of the bastion host. You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to support SSL. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("IsSSL")
    public String isSSL;

    /**
     * <p>The field that is used to indicate the mobile phone number of a user on the AD server.</p>
     */
    @NameInMap("MobileMapping")
    public String mobileMapping;

    /**
     * <p>The field that is used to indicate the name of a user on the AD server.</p>
     */
    @NameInMap("NameMapping")
    public String nameMapping;

    /**
     * <p>The password of the account that is used for the AD server.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The port that is used to access the AD server.</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The region ID of the bastion host. For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The address of the AD server.</p>
     */
    @NameInMap("Server")
    public String server;

    /**
     * <p>The address of the secondary AD server.</p>
     */
    @NameInMap("StandbyServer")
    public String standbyServer;

    public static ModifyInstanceADAuthServerRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceADAuthServerRequest self = new ModifyInstanceADAuthServerRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceADAuthServerRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ModifyInstanceADAuthServerRequest setBaseDN(String baseDN) {
        this.baseDN = baseDN;
        return this;
    }
    public String getBaseDN() {
        return this.baseDN;
    }

    public ModifyInstanceADAuthServerRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyInstanceADAuthServerRequest setEmailMapping(String emailMapping) {
        this.emailMapping = emailMapping;
        return this;
    }
    public String getEmailMapping() {
        return this.emailMapping;
    }

    public ModifyInstanceADAuthServerRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ModifyInstanceADAuthServerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceADAuthServerRequest setIsSSL(String isSSL) {
        this.isSSL = isSSL;
        return this;
    }
    public String getIsSSL() {
        return this.isSSL;
    }

    public ModifyInstanceADAuthServerRequest setMobileMapping(String mobileMapping) {
        this.mobileMapping = mobileMapping;
        return this;
    }
    public String getMobileMapping() {
        return this.mobileMapping;
    }

    public ModifyInstanceADAuthServerRequest setNameMapping(String nameMapping) {
        this.nameMapping = nameMapping;
        return this;
    }
    public String getNameMapping() {
        return this.nameMapping;
    }

    public ModifyInstanceADAuthServerRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyInstanceADAuthServerRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public ModifyInstanceADAuthServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceADAuthServerRequest setServer(String server) {
        this.server = server;
        return this;
    }
    public String getServer() {
        return this.server;
    }

    public ModifyInstanceADAuthServerRequest setStandbyServer(String standbyServer) {
        this.standbyServer = standbyServer;
        return this;
    }
    public String getStandbyServer() {
        return this.standbyServer;
    }

}
