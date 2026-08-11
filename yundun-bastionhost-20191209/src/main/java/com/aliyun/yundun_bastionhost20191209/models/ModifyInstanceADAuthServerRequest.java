// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceADAuthServerRequest extends TeaModel {
    /**
     * <p>The username of the account that is used for the AD server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn=Manager,dc=test,dc=com</p>
     */
    @NameInMap("Account")
    public String account;

    /**
     * <p>The Base distinguished name (DN).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dc=test,dc=com</p>
     */
    @NameInMap("BaseDN")
    public String baseDN;

    /**
     * <p>The domain on the AD server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>domain</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The field that is used to indicate the email address of a user on the AD server.</p>
     * 
     * <strong>example:</strong>
     * <p>emailAttr</p>
     */
    @NameInMap("EmailMapping")
    public String emailMapping;

    /**
     * <p>The condition that is used to filter users.</p>
     * 
     * <strong>example:</strong>
     * <p>(objectClass=top)</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The bastion host ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsDefault")
    public String isDefault;

    /**
     * <p>Specifies whether SSL is supported. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong></p>
     * </li>
     * <li><p><strong>false</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSSL")
    public String isSSL;

    @NameInMap("IsSyncEmailAttr")
    public String isSyncEmailAttr;

    @NameInMap("IsSyncMobileAttr")
    public String isSyncMobileAttr;

    @NameInMap("IsSyncNameAttr")
    public String isSyncNameAttr;

    @NameInMap("IsSyncOuAsUserGroup")
    public String isSyncOuAsUserGroup;

    /**
     * <p>The field that is used to indicate the mobile phone number of a user on the AD server.</p>
     * 
     * <strong>example:</strong>
     * <p>mobileAttr</p>
     */
    @NameInMap("MobileMapping")
    public String mobileMapping;

    /**
     * <p>The field that is used to indicate the name of a user on the AD server.</p>
     * 
     * <strong>example:</strong>
     * <p>nameAttr</p>
     */
    @NameInMap("NameMapping")
    public String nameMapping;

    /**
     * <p>The password of the account that is used for the AD server.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The port that is used to access the server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>389</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The region ID of the bastion host.</p>
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
     * <p>The address of the AD server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("Server")
    public String server;

    @NameInMap("ServerName")
    public String serverName;

    /**
     * <p>The address of the secondary AD server.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("StandbyServer")
    public String standbyServer;

    @NameInMap("SyncInterval")
    public String syncInterval;

    @NameInMap("UserSourceId")
    public String userSourceId;

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

    public ModifyInstanceADAuthServerRequest setIsDefault(String isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public String getIsDefault() {
        return this.isDefault;
    }

    public ModifyInstanceADAuthServerRequest setIsSSL(String isSSL) {
        this.isSSL = isSSL;
        return this;
    }
    public String getIsSSL() {
        return this.isSSL;
    }

    public ModifyInstanceADAuthServerRequest setIsSyncEmailAttr(String isSyncEmailAttr) {
        this.isSyncEmailAttr = isSyncEmailAttr;
        return this;
    }
    public String getIsSyncEmailAttr() {
        return this.isSyncEmailAttr;
    }

    public ModifyInstanceADAuthServerRequest setIsSyncMobileAttr(String isSyncMobileAttr) {
        this.isSyncMobileAttr = isSyncMobileAttr;
        return this;
    }
    public String getIsSyncMobileAttr() {
        return this.isSyncMobileAttr;
    }

    public ModifyInstanceADAuthServerRequest setIsSyncNameAttr(String isSyncNameAttr) {
        this.isSyncNameAttr = isSyncNameAttr;
        return this;
    }
    public String getIsSyncNameAttr() {
        return this.isSyncNameAttr;
    }

    public ModifyInstanceADAuthServerRequest setIsSyncOuAsUserGroup(String isSyncOuAsUserGroup) {
        this.isSyncOuAsUserGroup = isSyncOuAsUserGroup;
        return this;
    }
    public String getIsSyncOuAsUserGroup() {
        return this.isSyncOuAsUserGroup;
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

    public ModifyInstanceADAuthServerRequest setServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }
    public String getServerName() {
        return this.serverName;
    }

    public ModifyInstanceADAuthServerRequest setStandbyServer(String standbyServer) {
        this.standbyServer = standbyServer;
        return this;
    }
    public String getStandbyServer() {
        return this.standbyServer;
    }

    public ModifyInstanceADAuthServerRequest setSyncInterval(String syncInterval) {
        this.syncInterval = syncInterval;
        return this;
    }
    public String getSyncInterval() {
        return this.syncInterval;
    }

    public ModifyInstanceADAuthServerRequest setUserSourceId(String userSourceId) {
        this.userSourceId = userSourceId;
        return this;
    }
    public String getUserSourceId() {
        return this.userSourceId;
    }

}
