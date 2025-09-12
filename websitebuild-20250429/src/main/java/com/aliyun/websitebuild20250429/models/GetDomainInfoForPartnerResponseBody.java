// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetDomainInfoForPartnerResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetDomainInfoForPartnerResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDomainInfoForPartnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDomainInfoForPartnerResponseBody self = new GetDomainInfoForPartnerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDomainInfoForPartnerResponseBody setData(GetDomainInfoForPartnerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDomainInfoForPartnerResponseBodyData getData() {
        return this.data;
    }

    public GetDomainInfoForPartnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDomainInfoForPartnerResponseBodyDataOwnership extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1189245564569485</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <strong>example:</strong>
         * <p>pai</p>
         */
        @NameInMap("Provider")
        public String provider;

        public static GetDomainInfoForPartnerResponseBodyDataOwnership build(java.util.Map<String, ?> map) throws Exception {
            GetDomainInfoForPartnerResponseBodyDataOwnership self = new GetDomainInfoForPartnerResponseBodyDataOwnership();
            return TeaModel.build(map, self);
        }

        public GetDomainInfoForPartnerResponseBodyDataOwnership setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public GetDomainInfoForPartnerResponseBodyDataOwnership setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

    }

    public static class GetDomainInfoForPartnerResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>playnew-alilive.daotantan.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>NS3.ALIYUN.COM,NS4.ALIYUN.COM</p>
         */
        @NameInMap("NameServers")
        public String nameServers;

        @NameInMap("Ownership")
        public GetDomainInfoForPartnerResponseBodyDataOwnership ownership;

        /**
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("Registrar")
        public String registrar;

        public static GetDomainInfoForPartnerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDomainInfoForPartnerResponseBodyData self = new GetDomainInfoForPartnerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDomainInfoForPartnerResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public GetDomainInfoForPartnerResponseBodyData setNameServers(String nameServers) {
            this.nameServers = nameServers;
            return this;
        }
        public String getNameServers() {
            return this.nameServers;
        }

        public GetDomainInfoForPartnerResponseBodyData setOwnership(GetDomainInfoForPartnerResponseBodyDataOwnership ownership) {
            this.ownership = ownership;
            return this;
        }
        public GetDomainInfoForPartnerResponseBodyDataOwnership getOwnership() {
            return this.ownership;
        }

        public GetDomainInfoForPartnerResponseBodyData setRegistrar(String registrar) {
            this.registrar = registrar;
            return this;
        }
        public String getRegistrar() {
            return this.registrar;
        }

    }

}
