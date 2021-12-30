// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetInstanceLDAPAuthServerResponseBody extends TeaModel {
    @NameInMap("LDAP")
    public GetInstanceLDAPAuthServerResponseBodyLDAP LDAP;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceLDAPAuthServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceLDAPAuthServerResponseBody self = new GetInstanceLDAPAuthServerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceLDAPAuthServerResponseBody setLDAP(GetInstanceLDAPAuthServerResponseBodyLDAP LDAP) {
        this.LDAP = LDAP;
        return this;
    }
    public GetInstanceLDAPAuthServerResponseBodyLDAP getLDAP() {
        return this.LDAP;
    }

    public GetInstanceLDAPAuthServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceLDAPAuthServerResponseBodyLDAP extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("BaseDN")
        public String baseDN;

        @NameInMap("EmailMapping")
        public String emailMapping;

        @NameInMap("Filter")
        public String filter;

        @NameInMap("HasPassword")
        public String hasPassword;

        @NameInMap("IsSSL")
        public Boolean isSSL;

        @NameInMap("LoginNameMapping")
        public String loginNameMapping;

        @NameInMap("MobileMapping")
        public String mobileMapping;

        @NameInMap("NameMapping")
        public String nameMapping;

        @NameInMap("Port")
        public Long port;

        @NameInMap("Server")
        public String server;

        @NameInMap("StandbyServer")
        public String standbyServer;

        public static GetInstanceLDAPAuthServerResponseBodyLDAP build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceLDAPAuthServerResponseBodyLDAP self = new GetInstanceLDAPAuthServerResponseBodyLDAP();
            return TeaModel.build(map, self);
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setBaseDN(String baseDN) {
            this.baseDN = baseDN;
            return this;
        }
        public String getBaseDN() {
            return this.baseDN;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setEmailMapping(String emailMapping) {
            this.emailMapping = emailMapping;
            return this;
        }
        public String getEmailMapping() {
            return this.emailMapping;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setFilter(String filter) {
            this.filter = filter;
            return this;
        }
        public String getFilter() {
            return this.filter;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setHasPassword(String hasPassword) {
            this.hasPassword = hasPassword;
            return this;
        }
        public String getHasPassword() {
            return this.hasPassword;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setIsSSL(Boolean isSSL) {
            this.isSSL = isSSL;
            return this;
        }
        public Boolean getIsSSL() {
            return this.isSSL;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setLoginNameMapping(String loginNameMapping) {
            this.loginNameMapping = loginNameMapping;
            return this;
        }
        public String getLoginNameMapping() {
            return this.loginNameMapping;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setMobileMapping(String mobileMapping) {
            this.mobileMapping = mobileMapping;
            return this;
        }
        public String getMobileMapping() {
            return this.mobileMapping;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setNameMapping(String nameMapping) {
            this.nameMapping = nameMapping;
            return this;
        }
        public String getNameMapping() {
            return this.nameMapping;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public GetInstanceLDAPAuthServerResponseBodyLDAP setStandbyServer(String standbyServer) {
            this.standbyServer = standbyServer;
            return this;
        }
        public String getStandbyServer() {
            return this.standbyServer;
        }

    }

}
