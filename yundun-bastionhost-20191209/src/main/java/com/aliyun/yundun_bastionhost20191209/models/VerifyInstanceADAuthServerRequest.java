// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class VerifyInstanceADAuthServerRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("BaseDN")
    public String baseDN;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsSSL")
    public String isSSL;

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

    public static VerifyInstanceADAuthServerRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyInstanceADAuthServerRequest self = new VerifyInstanceADAuthServerRequest();
        return TeaModel.build(map, self);
    }

    public VerifyInstanceADAuthServerRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public VerifyInstanceADAuthServerRequest setBaseDN(String baseDN) {
        this.baseDN = baseDN;
        return this;
    }
    public String getBaseDN() {
        return this.baseDN;
    }

    public VerifyInstanceADAuthServerRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public VerifyInstanceADAuthServerRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public VerifyInstanceADAuthServerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public VerifyInstanceADAuthServerRequest setIsSSL(String isSSL) {
        this.isSSL = isSSL;
        return this;
    }
    public String getIsSSL() {
        return this.isSSL;
    }

    public VerifyInstanceADAuthServerRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public VerifyInstanceADAuthServerRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public VerifyInstanceADAuthServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public VerifyInstanceADAuthServerRequest setServer(String server) {
        this.server = server;
        return this;
    }
    public String getServer() {
        return this.server;
    }

    public VerifyInstanceADAuthServerRequest setStandbyServer(String standbyServer) {
        this.standbyServer = standbyServer;
        return this;
    }
    public String getStandbyServer() {
        return this.standbyServer;
    }

}
