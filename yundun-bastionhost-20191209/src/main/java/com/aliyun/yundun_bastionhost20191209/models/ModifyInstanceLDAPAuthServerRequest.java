// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceLDAPAuthServerRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("BaseDN")
    public String baseDN;

    @NameInMap("EmailMapping")
    public String emailMapping;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsSSL")
    public String isSSL;

    @NameInMap("LoginNameMapping")
    public String loginNameMapping;

    @NameInMap("MobileMapping")
    public String mobileMapping;

    @NameInMap("NameMapping")
    public String nameMapping;

    @NameInMap("Password")
    public String password;

    @NameInMap("Port")
    public String port;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Server")
    public String server;

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
