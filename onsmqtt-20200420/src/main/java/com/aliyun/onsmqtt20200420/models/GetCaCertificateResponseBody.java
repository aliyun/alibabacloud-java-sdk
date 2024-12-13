// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class GetCaCertificateResponseBody extends TeaModel {
    /**
     * <p>Certificate details.</p>
     */
    @NameInMap("Data")
    public GetCaCertificateResponseBodyData data;

    /**
     * <p>Public parameters, each request ID is unique and can be used for troubleshooting and problem localization.</p>
     * 
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
         * <p>Content of the CA certificate.</p>
         * <blockquote>
         * <p>\n represents a new line.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----\nMIIDuzCCAqdGVzdC5jbi1xaW5n******\n-----END CERTIFICATE-----</p>
         */
        @NameInMap("CaContent")
        public String caContent;

        /**
         * <p>Name of the CA certificate</p>
         * 
         * <strong>example:</strong>
         * <p>mqtt_ca</p>
         */
        @NameInMap("CaName")
        public String caName;

        /**
         * <p>Registration code of the CA certificate</p>
         * 
         * <strong>example:</strong>
         * <p>13274673-8f90-4630-bea1-9cccb25756ad2089******</p>
         */
        @NameInMap("RegistrationCode")
        public String registrationCode;

        /**
         * <p>The SN serial number of the CA certificate, used to uniquely identify a CA certificate. Value range: no more than 128 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>00f26900ba87******</p>
         */
        @NameInMap("Sn")
        public String sn;

        /**
         * <p>The status of the CA certificate. The values are as follows:</p>
         * <ul>
         * <li><strong>0</strong>: Indicates that the certificate is in an inactive state. - <strong>1</strong>: Indicates that the certificate is in an active state.<blockquote>
         * <p>After the CA certificate is registered, it is in an active state by default.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The start time when the CA certificate becomes effective. The format is a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1654137303000</p>
         */
        @NameInMap("ValidBegin")
        public String validBegin;

        /**
         * <p>The end time when the CA certificate becomes effective. The format is a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1969497303000</p>
         */
        @NameInMap("ValidEnd")
        public String validEnd;

        /**
         * <p>Content of the Verification certificate.</p>
         * <blockquote>
         * <p>\n represents a new line.</p>
         * </blockquote>
         * 
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
