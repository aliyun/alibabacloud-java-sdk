// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class VerifyInstanceLDAPAuthServerRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("BaseDN")
    public String baseDN;

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

    public static VerifyInstanceLDAPAuthServerRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyInstanceLDAPAuthServerRequest self = new VerifyInstanceLDAPAuthServerRequest();
        return TeaModel.build(map, self);
    }

    public VerifyInstanceLDAPAuthServerRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public VerifyInstanceLDAPAuthServerRequest setBaseDN(String baseDN) {
        this.baseDN = baseDN;
        return this;
    }
    public String getBaseDN() {
        return this.baseDN;
    }

    public VerifyInstanceLDAPAuthServerRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public VerifyInstanceLDAPAuthServerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public VerifyInstanceLDAPAuthServerRequest setIsSSL(String isSSL) {
        this.isSSL = isSSL;
        return this;
    }
    public String getIsSSL() {
        return this.isSSL;
    }

    public VerifyInstanceLDAPAuthServerRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public VerifyInstanceLDAPAuthServerRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public VerifyInstanceLDAPAuthServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public VerifyInstanceLDAPAuthServerRequest setServer(String server) {
        this.server = server;
        return this;
    }
    public String getServer() {
        return this.server;
    }

    public VerifyInstanceLDAPAuthServerRequest setStandbyServer(String standbyServer) {
        this.standbyServer = standbyServer;
        return this;
    }
    public String getStandbyServer() {
        return this.standbyServer;
    }

}
