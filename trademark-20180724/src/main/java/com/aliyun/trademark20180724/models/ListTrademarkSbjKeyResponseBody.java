// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ListTrademarkSbjKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TmSbjKeyInfo")
    public java.util.List<ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo> tmSbjKeyInfo;

    public static ListTrademarkSbjKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrademarkSbjKeyResponseBody self = new ListTrademarkSbjKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrademarkSbjKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrademarkSbjKeyResponseBody setTmSbjKeyInfo(java.util.List<ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo> tmSbjKeyInfo) {
        this.tmSbjKeyInfo = tmSbjKeyInfo;
        return this;
    }
    public java.util.List<ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo> getTmSbjKeyInfo() {
        return this.tmSbjKeyInfo;
    }

    public static class ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo extends TeaModel {
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgreeProt")
        public String agreeProt;

        @NameInMap("CertInfo")
        public String certInfo;

        @NameInMap("ClearData")
        public String clearData;

        @NameInMap("HashData")
        public String hashData;

        @NameInMap("KeyType")
        public Integer keyType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Pin")
        public String pin;

        @NameInMap("PrincipalKey")
        public String principalKey;

        @NameInMap("PrincipalName")
        public String principalName;

        @NameInMap("SignCert")
        public String signCert;

        @NameInMap("SignData")
        public String signData;

        @NameInMap("StartValidDate")
        public String startValidDate;

        @NameInMap("SubmitSignData")
        public String submitSignData;

        @NameInMap("TypeCert")
        public String typeCert;

        @NameInMap("Username")
        public String username;

        @NameInMap("ValidDate")
        public String validDate;

        @NameInMap("tmurl")
        public String tmurl;

        public static ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo build(java.util.Map<String, ?> map) throws Exception {
            ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo self = new ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo();
            return TeaModel.build(map, self);
        }

        public ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo setAgreeProt(String agreeProt) {
            this.agreeProt = agreeProt;
            return this;
        }
        public String getAgreeProt() {
            return this.agreeProt;
        }

        public ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo setCertInfo(String certInfo) {
            this.certInfo = certInfo;
            return this;
        }
        public String getCertInfo() {
            return this.certInfo;
        }

        public ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo setClearData(String clearData) {
            this.clearData = clearData;
            return this;
        }
        public String getClearData() {
            return this.clearData;
        }

        public ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo setHashData(String hashData) {
            this.hashData = hashData;
            return this;
        }
        public String getHashData() {
            return this.hashData;
        }

        public ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo setKeyType(Integer keyType) {
            this.keyType = keyType;
            return this;
        }
        public Integer getKeyType() {
            return this.keyType;
        }

        public ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo setPin(String pin) {
            this.pin = pin;
            return this;
        }
        public String getPin() {
            return this.pin;
        }

        public ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo setPrincipalKey(String principalKey) {
            this.principalKey = principalKey;
            return this;
        }
        public String getPrincipalKey() {
            return this.principalKey;
        }

        public ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo setSignCert(String signCert) {
            this.signCert = signCert;
            return this;
        }
        public String getSignCert() {
            return this.signCert;
        }

        public ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo setSignData(String signData) {
            this.signData = signData;
            return this;
        }
        public String getSignData() {
            return this.signData;
        }

        public ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo setStartValidDate(String startValidDate) {
            this.startValidDate = startValidDate;
            return this;
        }
        public String getStartValidDate() {
            return this.startValidDate;
        }

        public ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo setSubmitSignData(String submitSignData) {
            this.submitSignData = submitSignData;
            return this;
        }
        public String getSubmitSignData() {
            return this.submitSignData;
        }

        public ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo setTypeCert(String typeCert) {
            this.typeCert = typeCert;
            return this;
        }
        public String getTypeCert() {
            return this.typeCert;
        }

        public ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo setValidDate(String validDate) {
            this.validDate = validDate;
            return this;
        }
        public String getValidDate() {
            return this.validDate;
        }

        public ListTrademarkSbjKeyResponseBodyTmSbjKeyInfo setTmurl(String tmurl) {
            this.tmurl = tmurl;
            return this;
        }
        public String getTmurl() {
            return this.tmurl;
        }

    }

}
