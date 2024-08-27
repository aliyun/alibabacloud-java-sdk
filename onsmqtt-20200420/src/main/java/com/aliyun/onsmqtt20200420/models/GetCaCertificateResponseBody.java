// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class GetCaCertificateResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetCaCertificateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>020F6A43-19E6-4B6E-B846-44EB31DF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCaCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCaCertificateResponseBody self = new GetCaCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCaCertificateResponseBody setData(GetCaCertificateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCaCertificateResponseBodyData getData() {
        return this.data;
    }

    public GetCaCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCaCertificateResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----\nMIIDuzCCAqdGVzdC5jbi1xaW5n******\n-----END CERTIFICATE-----</p>
         */
        @NameInMap("CaContent")
        public String caContent;

        /**
         * <strong>example:</strong>
         * <p>mqtt_ca</p>
         */
        @NameInMap("CaName")
        public String caName;

        /**
         * <strong>example:</strong>
         * <p>13274673-8f90-4630-bea1-9cccb25756ad2089******</p>
         */
        @NameInMap("RegistrationCode")
        public String registrationCode;

        /**
         * <strong>example:</strong>
         * <p>00f26900ba87******</p>
         */
        @NameInMap("Sn")
        public String sn;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1654137303000</p>
         */
        @NameInMap("ValidBegin")
        public String validBegin;

        /**
         * <strong>example:</strong>
         * <p>1969497303000</p>
         */
        @NameInMap("ValidEnd")
        public String validEnd;

        /**
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----\nMIID/DCCAu+Y5sRMpp9tnd+4s******\n-----END CERTIFICATE-----</p>
         */
        @NameInMap("VerificationContent")
        public String verificationContent;

        public static GetCaCertificateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCaCertificateResponseBodyData self = new GetCaCertificateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCaCertificateResponseBodyData setCaContent(String caContent) {
            this.caContent = caContent;
            return this;
        }
        public String getCaContent() {
            return this.caContent;
        }

        public GetCaCertificateResponseBodyData setCaName(String caName) {
            this.caName = caName;
            return this;
        }
        public String getCaName() {
            return this.caName;
        }

        public GetCaCertificateResponseBodyData setRegistrationCode(String registrationCode) {
            this.registrationCode = registrationCode;
            return this;
        }
        public String getRegistrationCode() {
            return this.registrationCode;
        }

        public GetCaCertificateResponseBodyData setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public GetCaCertificateResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCaCertificateResponseBodyData setValidBegin(String validBegin) {
            this.validBegin = validBegin;
            return this;
        }
        public String getValidBegin() {
            return this.validBegin;
        }

        public GetCaCertificateResponseBodyData setValidEnd(String validEnd) {
            this.validEnd = validEnd;
            return this;
        }
        public String getValidEnd() {
            return this.validEnd;
        }

        public GetCaCertificateResponseBodyData setVerificationContent(String verificationContent) {
            this.verificationContent = verificationContent;
            return this;
        }
        public String getVerificationContent() {
            return this.verificationContent;
        }

    }

}
