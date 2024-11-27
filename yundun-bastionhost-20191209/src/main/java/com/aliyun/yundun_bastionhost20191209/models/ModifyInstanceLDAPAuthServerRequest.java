// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceLDAPAuthServerRequest extends TeaModel {
    /**
     * <p>The username of the account that is used for the LDAP server.</p>
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
     * <p>The field that is used to indicate the email address of a user on the LDAP server.</p>
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
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to support SSL. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSSL")
    public String isSSL;

    /**
     * <p>The field that is used to indicate the logon name of a user on the LDAP server.</p>
     * 
     * <strong>example:</strong>
     * <p>userNameAttr</p>
     */
    @NameInMap("LoginNameMapping")
    public String loginNameMapping;

    /**
     * <p>The field that is used to indicate the mobile phone number of a user on the LDAP server.</p>
     * 
     * <strong>example:</strong>
     * <p>mobileAttr</p>
     */
    @NameInMap("MobileMapping")
    public String mobileMapping;

    /**
     * <p>The field that is used to indicate the name of a user on the LDAP server.</p>
     * 
     * <strong>example:</strong>
     * <p>nameAttr</p>
     */
    @NameInMap("NameMapping")
    public String nameMapping;

    /**
     * <p>The password of the account that is used for the LDAP server. You must configure a password when you configure LDAP authentication. If you leave this parameter empty when you modify the settings of LDAP authentication, the current password is used.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The port that is used to access the LDAP server.</p>
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
     * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The address of the LDAP server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("Server")
    public String server;

    /**
     * <p>The address of the secondary LDAP server.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("StandbyServer")
    public String standbyServer;

    public static ModifyInstanceLDAPAuthServerRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceLDAPAuthServerRequest self = new ModifyInstanceLDAPAuthServerRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceLDAPAuthServerRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ModifyInstanceLDAPAuthServerRequest setBaseDN(String baseDN) {
        this.baseDN = baseDN;
        return this;
    }
    public String getBaseDN() {
        return this.baseDN;
    }

    public ModifyInstanceLDAPAuthServerRequest setEmailMapping(String emailMapping) {
        this.emailMapping = emailMapping;
        return this;
    }
    public String getEmailMapping() {
        return this.emailMapping;
    }

    public ModifyInstanceLDAPAuthServerRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ModifyInstanceLDAPAuthServerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceLDAPAuthServerRequest setIsSSL(String isSSL) {
        this.isSSL = isSSL;
        return this;
    }
    public String getIsSSL() {
        return this.isSSL;
    }

    public ModifyInstanceLDAPAuthServerRequest setLoginNameMapping(String loginNameMapping) {
        this.loginNameMapping = loginNameMapping;
        return this;
    }
    public String getLoginNameMapping() {
        return this.loginNameMapping;
    }

    public ModifyInstanceLDAPAuthServerRequest setMobileMapping(String mobileMapping) {
        this.mobileMapping = mobileMapping;
        return this;
    }
    public String getMobileMapping() {
        return this.mobileMapping;
    }

    public ModifyInstanceLDAPAuthServerRequest setNameMapping(String nameMapping) {
        this.nameMapping = nameMapping;
        return this;
    }
    public String getNameMapping() {
        return this.nameMapping;
    }

    public ModifyInstanceLDAPAuthServerRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyInstanceLDAPAuthServerRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public ModifyInstanceLDAPAuthServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceLDAPAuthServerRequest setServer(String server) {
        this.server = server;
        return this;
    }
    public String getServer() {
        return this.server;
    }

    public ModifyInstanceLDAPAuthServerRequest setStandbyServer(String standbyServer) {
        this.standbyServer = standbyServer;
        return this;
    }
    public String getStandbyServer() {
        return this.standbyServer;
    }

}
