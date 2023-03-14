// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetInstanceADAuthServerResponseBody extends TeaModel {
    /**
     * <p>The settings of AD authentication.</p>
     */
    @NameInMap("AD")
    public GetInstanceADAuthServerResponseBodyAD AD;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
        /**
         * <p>The distinguished name (DN) of the AD server account.</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>The Base DN of the AD server.</p>
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
         * <p>Indicates whether passwords are required. Valid values:</p>
         * <br>
         * <p>*   **true**: required</p>
         * <p>*   **false**: not required</p>
         */
        @NameInMap("HasPassword")
        public Boolean hasPassword;

        /**
         * <p>Indicates whether SSL is supported. Valid values:</p>
         * <br>
         * <p>*   **true**: supported</p>
         * <p>*   **false**: not supported</p>
         */
        @NameInMap("IsSSL")
        public Boolean isSSL;

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
         * <p>The port that is used to access the AD server.</p>
         */
        @NameInMap("Port")
        public Long port;

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
