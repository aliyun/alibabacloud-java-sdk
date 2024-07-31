// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCloudResourceAccessPortDetailsResponseBody extends TeaModel {
    @NameInMap("AccessPortDetails")
    public java.util.List<DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails> accessPortDetails;

    /**
     * <strong>example:</strong>
     * <p>2EFCFE18-78F8-5079-B312-07***48B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCloudResourceAccessPortDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudResourceAccessPortDetailsResponseBody self = new DescribeCloudResourceAccessPortDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudResourceAccessPortDetailsResponseBody setAccessPortDetails(java.util.List<DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails> accessPortDetails) {
        this.accessPortDetails = accessPortDetails;
        return this;
    }
    public java.util.List<DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails> getAccessPortDetails() {
        return this.accessPortDetails;
    }

    public DescribeCloudResourceAccessPortDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudResourceAccessPortDetailsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsCertificates extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AppliedType")
        public String appliedType;

        /**
         * <strong>example:</strong>
         * <p>123-cn-hangzhou</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        /**
         * <strong>example:</strong>
         * <p>cert-name1</p>
         */
        @NameInMap("CertificateName")
        public String certificateName;

        public static DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsCertificates build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsCertificates self = new DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsCertificates();
            return TeaModel.build(map, self);
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsCertificates setAppliedType(String appliedType) {
            this.appliedType = appliedType;
            return this;
        }
        public String getAppliedType() {
            return this.appliedType;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsCertificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsCertificates setCertificateName(String certificateName) {
            this.certificateName = certificateName;
            return this;
        }
        public String getCertificateName() {
            return this.certificateName;
        }

    }

    public static class DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsLogHeaders extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsLogHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsLogHeaders self = new DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsLogHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsLogHeaders setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsLogHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails extends TeaModel {
        @NameInMap("Certificates")
        public java.util.List<DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsCertificates> certificates;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CipherSuite")
        public Integer cipherSuite;

        @NameInMap("CustomCiphers")
        public java.util.List<String> customCiphers;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableTLSv3")
        public Boolean enableTLSv3;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Http2Enabled")
        public Boolean http2Enabled;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Keepalive")
        public Boolean keepalive;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("KeepaliveRequests")
        public Integer keepaliveRequests;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("KeepaliveTimeout")
        public Integer keepaliveTimeout;

        @NameInMap("LogHeaders")
        public java.util.List<DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsLogHeaders> logHeaders;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>https</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ReadTimeout")
        public Integer readTimeout;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>tlsv1</p>
         */
        @NameInMap("TLSVersion")
        public String TLSVersion;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WriteTimeout")
        public Integer writeTimeout;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("XffHeaderMode")
        public Integer xffHeaderMode;

        @NameInMap("XffHeaders")
        public java.util.List<String> xffHeaders;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("XffProto")
        public Boolean xffProto;

        public static DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails self = new DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails();
            return TeaModel.build(map, self);
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setCertificates(java.util.List<DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsCertificates> certificates) {
            this.certificates = certificates;
            return this;
        }
        public java.util.List<DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsCertificates> getCertificates() {
            return this.certificates;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setCipherSuite(Integer cipherSuite) {
            this.cipherSuite = cipherSuite;
            return this;
        }
        public Integer getCipherSuite() {
            return this.cipherSuite;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setCustomCiphers(java.util.List<String> customCiphers) {
            this.customCiphers = customCiphers;
            return this;
        }
        public java.util.List<String> getCustomCiphers() {
            return this.customCiphers;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setEnableTLSv3(Boolean enableTLSv3) {
            this.enableTLSv3 = enableTLSv3;
            return this;
        }
        public Boolean getEnableTLSv3() {
            return this.enableTLSv3;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setHttp2Enabled(Boolean http2Enabled) {
            this.http2Enabled = http2Enabled;
            return this;
        }
        public Boolean getHttp2Enabled() {
            return this.http2Enabled;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setKeepalive(Boolean keepalive) {
            this.keepalive = keepalive;
            return this;
        }
        public Boolean getKeepalive() {
            return this.keepalive;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setKeepaliveRequests(Integer keepaliveRequests) {
            this.keepaliveRequests = keepaliveRequests;
            return this;
        }
        public Integer getKeepaliveRequests() {
            return this.keepaliveRequests;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setKeepaliveTimeout(Integer keepaliveTimeout) {
            this.keepaliveTimeout = keepaliveTimeout;
            return this;
        }
        public Integer getKeepaliveTimeout() {
            return this.keepaliveTimeout;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setLogHeaders(java.util.List<DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsLogHeaders> logHeaders) {
            this.logHeaders = logHeaders;
            return this;
        }
        public java.util.List<DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsLogHeaders> getLogHeaders() {
            return this.logHeaders;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }
        public Integer getReadTimeout() {
            return this.readTimeout;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setTLSVersion(String TLSVersion) {
            this.TLSVersion = TLSVersion;
            return this;
        }
        public String getTLSVersion() {
            return this.TLSVersion;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setWriteTimeout(Integer writeTimeout) {
            this.writeTimeout = writeTimeout;
            return this;
        }
        public Integer getWriteTimeout() {
            return this.writeTimeout;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setXffHeaderMode(Integer xffHeaderMode) {
            this.xffHeaderMode = xffHeaderMode;
            return this;
        }
        public Integer getXffHeaderMode() {
            return this.xffHeaderMode;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setXffHeaders(java.util.List<String> xffHeaders) {
            this.xffHeaders = xffHeaders;
            return this;
        }
        public java.util.List<String> getXffHeaders() {
            return this.xffHeaders;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setXffProto(Boolean xffProto) {
            this.xffProto = xffProto;
            return this;
        }
        public Boolean getXffProto() {
            return this.xffProto;
        }

    }

}
