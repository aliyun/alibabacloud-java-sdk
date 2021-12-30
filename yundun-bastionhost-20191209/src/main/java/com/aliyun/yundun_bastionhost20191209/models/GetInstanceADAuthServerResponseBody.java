// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetInstanceADAuthServerResponseBody extends TeaModel {
    @NameInMap("AD")
    public GetInstanceADAuthServerResponseBodyAD AD;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceADAuthServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceADAuthServerResponseBody self = new GetInstanceADAuthServerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceADAuthServerResponseBody setAD(GetInstanceADAuthServerResponseBodyAD AD) {
        this.AD = AD;
        return this;
    }
    public GetInstanceADAuthServerResponseBodyAD getAD() {
        return this.AD;
    }

    public GetInstanceADAuthServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceADAuthServerResponseBodyAD extends TeaModel {
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

        @NameInMap("HasPassword")
        public Boolean hasPassword;

        @NameInMap("IsSSL")
        public Boolean isSSL;

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

        public static GetInstanceADAuthServerResponseBodyAD build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceADAuthServerResponseBodyAD self = new GetInstanceADAuthServerResponseBodyAD();
            return TeaModel.build(map, self);
        }

        public GetInstanceADAuthServerResponseBodyAD setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public GetInstanceADAuthServerResponseBodyAD setBaseDN(String baseDN) {
            this.baseDN = baseDN;
            return this;
        }
        public String getBaseDN() {
            return this.baseDN;
        }

        public GetInstanceADAuthServerResponseBodyAD setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetInstanceADAuthServerResponseBodyAD setEmailMapping(String emailMapping) {
            this.emailMapping = emailMapping;
            return this;
        }
        public String getEmailMapping() {
            return this.emailMapping;
        }

        public GetInstanceADAuthServerResponseBodyAD setFilter(String filter) {
            this.filter = filter;
            return this;
        }
        public String getFilter() {
            return this.filter;
        }

        public GetInstanceADAuthServerResponseBodyAD setHasPassword(Boolean hasPassword) {
            this.hasPassword = hasPassword;
            return this;
        }
        public Boolean getHasPassword() {
            return this.hasPassword;
        }

        public GetInstanceADAuthServerResponseBodyAD setIsSSL(Boolean isSSL) {
            this.isSSL = isSSL;
            return this;
        }
        public Boolean getIsSSL() {
            return this.isSSL;
        }

        public GetInstanceADAuthServerResponseBodyAD setMobileMapping(String mobileMapping) {
            this.mobileMapping = mobileMapping;
            return this;
        }
        public String getMobileMapping() {
            return this.mobileMapping;
        }

        public GetInstanceADAuthServerResponseBodyAD setNameMapping(String nameMapping) {
            this.nameMapping = nameMapping;
            return this;
        }
        public String getNameMapping() {
            return this.nameMapping;
        }

        public GetInstanceADAuthServerResponseBodyAD setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public GetInstanceADAuthServerResponseBodyAD setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public GetInstanceADAuthServerResponseBodyAD setStandbyServer(String standbyServer) {
            this.standbyServer = standbyServer;
            return this;
        }
        public String getStandbyServer() {
            return this.standbyServer;
        }

    }

}
