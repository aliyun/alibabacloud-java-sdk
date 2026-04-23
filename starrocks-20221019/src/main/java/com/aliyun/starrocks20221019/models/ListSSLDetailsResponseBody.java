// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ListSSLDetailsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListSSLDetailsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>32A44F0D-BFF6-5664-999A-218BBDE74XXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListSSLDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSSLDetailsResponseBody self = new ListSSLDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSSLDetailsResponseBody setData(ListSSLDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSSLDetailsResponseBodyData getData() {
        return this.data;
    }

    public ListSSLDetailsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListSSLDetailsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListSSLDetailsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSSLDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSSLDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSSLDetailsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>starrocks-ssl</p>
         */
        @NameInMap("Aliases")
        public String aliases;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CustomCert")
        public Boolean customCert;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableSSL")
        public Boolean enableSSL;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsValid")
        public Boolean isValid;

        /**
         * <strong>example:</strong>
         * <p>CN=fe-sr-cn-xxx123-internal.starrocks.aliyuncs.com, OU=Aliyun Big Data Platform EMR StarRocks, O=Aliyun, L=BJ, ST=CN, C=CN</p>
         */
        @NameInMap("IssuerDN")
        public String issuerDN;

        /**
         * <strong>example:</strong>
         * <p>1751010702000</p>
         */
        @NameInMap("NotAfter")
        public Long notAfter;

        /**
         * <strong>example:</strong>
         * <p>1751000702000</p>
         */
        @NameInMap("NotBefore")
        public Long notBefore;

        /**
         * <strong>example:</strong>
         * <p>MIIJkAIBAzCCCVYGCSqGSIb3DQEHAaCCCUcEgglDMIIJPzCCA+8GCSqGSIb3DQEHBqCCA+AwggPc
         * AgEAMIID1QYJKoZIhvcNAQcBMBwGCiqGSIb3DQEMAQYwDgQI3e4V2eXgGFMCAggAgIIDqJ/L8sA
         * ......
         * AB3eKpMa7rQc==</p>
         */
        @NameInMap("SslCertificateText")
        public String sslCertificateText;

        /**
         * <strong>example:</strong>
         * <p>valid</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>CN=fe-{clusterId}-internal.starrocks.aliyuncs.com, OU=Aliyun Big Data Platform EMR StarRocks, O=Aliyun, L=BJ, ST=CN, C=CN</p>
         */
        @NameInMap("SubjectDN")
        public String subjectDN;

        public static ListSSLDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSSLDetailsResponseBodyData self = new ListSSLDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSSLDetailsResponseBodyData setAliases(String aliases) {
            this.aliases = aliases;
            return this;
        }
        public String getAliases() {
            return this.aliases;
        }

        public ListSSLDetailsResponseBodyData setCustomCert(Boolean customCert) {
            this.customCert = customCert;
            return this;
        }
        public Boolean getCustomCert() {
            return this.customCert;
        }

        public ListSSLDetailsResponseBodyData setEnableSSL(Boolean enableSSL) {
            this.enableSSL = enableSSL;
            return this;
        }
        public Boolean getEnableSSL() {
            return this.enableSSL;
        }

        public ListSSLDetailsResponseBodyData setIsValid(Boolean isValid) {
            this.isValid = isValid;
            return this;
        }
        public Boolean getIsValid() {
            return this.isValid;
        }

        public ListSSLDetailsResponseBodyData setIssuerDN(String issuerDN) {
            this.issuerDN = issuerDN;
            return this;
        }
        public String getIssuerDN() {
            return this.issuerDN;
        }

        public ListSSLDetailsResponseBodyData setNotAfter(Long notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        public Long getNotAfter() {
            return this.notAfter;
        }

        public ListSSLDetailsResponseBodyData setNotBefore(Long notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public Long getNotBefore() {
            return this.notBefore;
        }

        public ListSSLDetailsResponseBodyData setSslCertificateText(String sslCertificateText) {
            this.sslCertificateText = sslCertificateText;
            return this;
        }
        public String getSslCertificateText() {
            return this.sslCertificateText;
        }

        public ListSSLDetailsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSSLDetailsResponseBodyData setSubjectDN(String subjectDN) {
            this.subjectDN = subjectDN;
            return this;
        }
        public String getSubjectDN() {
            return this.subjectDN;
        }

    }

}
