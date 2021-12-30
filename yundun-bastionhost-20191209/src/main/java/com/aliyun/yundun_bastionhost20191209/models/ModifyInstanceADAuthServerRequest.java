// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceADAuthServerRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("BaseDN")
    public String baseDN;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("EmailMapping")
    public String emailMapping;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsSSL")
    public String isSSL;

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
