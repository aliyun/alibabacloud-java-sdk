// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceADAuthServerRequest extends TeaModel {
    /**
     * <p>The server account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn=Manager,dc=test,dc=com</p>
     */
    @NameInMap("Account")
    public String account;

    /**
     * <p>The base distinguished name (Base DN).</p>
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
     * <p>The server attribute name that maps to the user email address.</p>
     * 
     * <strong>example:</strong>
     * <p>emailAttr</p>
     */
    @NameInMap("EmailMapping")
    public String emailMapping;

    /**
     * <p>The filter condition for users.</p>
     * 
     * <strong>example:</strong>
     * <p>(objectClass=top)</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The instance ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether the AD authentication server is the default server. A value of true indicates that the server is the default AD authentication server. A value of false indicates that the server is not the default AD authentication server.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDefault")
    public String isDefault;

    /**
     * <p>Specifies whether SSL is supported. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Supported.</li>
     * <li><strong>false</strong>: Not supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSSL")
    public String isSSL;

    /**
     * <p>Specifies whether to synchronize the email address. A value of true indicates that the email address is synchronized. A value of false indicates that the email address is not synchronized.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSyncEmailAttr")
    public String isSyncEmailAttr;

    /**
     * <p>Specifies whether to synchronize the mobile phone number. A value of true indicates that the mobile phone number is synchronized. A value of false indicates that the mobile phone number is not synchronized.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSyncMobileAttr")
    public String isSyncMobileAttr;

    /**
     * <p>Specifies whether to synchronize the display name. A value of true indicates that the display name is synchronized. A value of false indicates that the display name is not synchronized.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSyncNameAttr")
    public String isSyncNameAttr;

    /**
     * <p>Specifies whether to synchronize the organization to which the user belongs as a user group. A value of true indicates that the organization is synchronized as a user group. A value of false indicates that the organization is not synchronized as a user group.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSyncOuAsUserGroup")
    public String isSyncOuAsUserGroup;

    /**
     * <p>The server attribute name that maps to the user mobile phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>mobileAttr</p>
     */
    @NameInMap("MobileMapping")
    public String mobileMapping;

    /**
     * <p>The server attribute name that maps to the username.</p>
     * 
     * <strong>example:</strong>
     * <p>nameAttr</p>
     */
    @NameInMap("NameMapping")
    public String nameMapping;

    /**
     * <p>The password of the server account.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The port used to access the server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>389</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The region ID of the Bastionhost instance.</p>
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
     * <p>The address of the server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("Server")
    public String server;

    /**
     * <p>The name of the AD authentication server.</p>
     * 
     * <strong>example:</strong>
     * <p>AD Server</p>
     */
    @NameInMap("ServerName")
    public String serverName;

    /**
     * <p>The address of the standby server.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("StandbyServer")
    public String standbyServer;

    /**
     * <p>The interval at which user snapshots are automatically synchronized, in hours. Valid values: 0, and 4 to 168. A value of 0 indicates that automatic synchronization is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
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
