// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryCredentialsInfoResponseBody extends TeaModel {
    @NameInMap("CredentialsInfo")
    public QueryCredentialsInfoResponseBodyCredentialsInfo credentialsInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryCredentialsInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCredentialsInfoResponseBody self = new QueryCredentialsInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCredentialsInfoResponseBody setCredentialsInfo(QueryCredentialsInfoResponseBodyCredentialsInfo credentialsInfo) {
        this.credentialsInfo = credentialsInfo;
        return this;
    }
    public QueryCredentialsInfoResponseBodyCredentialsInfo getCredentialsInfo() {
        return this.credentialsInfo;
    }

    public QueryCredentialsInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryCredentialsInfoResponseBodyCredentialsInfo extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("CardNumber")
        public String cardNumber;

        @NameInMap("CompanyName")
        public String companyName;

        @NameInMap("PersonName")
        public String personName;

        @NameInMap("Province")
        public String province;

        public static QueryCredentialsInfoResponseBodyCredentialsInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryCredentialsInfoResponseBodyCredentialsInfo self = new QueryCredentialsInfoResponseBodyCredentialsInfo();
            return TeaModel.build(map, self);
        }

        public QueryCredentialsInfoResponseBodyCredentialsInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryCredentialsInfoResponseBodyCredentialsInfo setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public String getCardNumber() {
            return this.cardNumber;
        }

        public QueryCredentialsInfoResponseBodyCredentialsInfo setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public QueryCredentialsInfoResponseBodyCredentialsInfo setPersonName(String personName) {
            this.personName = personName;
            return this;
        }
        public String getPersonName() {
            return this.personName;
        }

        public QueryCredentialsInfoResponseBodyCredentialsInfo setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

}
