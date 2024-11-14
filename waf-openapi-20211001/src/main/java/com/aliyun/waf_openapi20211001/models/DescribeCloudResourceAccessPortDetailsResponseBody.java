// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCloudResourceAccessPortDetailsResponseBody extends TeaModel {
    /**
     * <p>The details of the ports of cloud services that are added to WAF.</p>
     */
    @NameInMap("AccessPortDetails")
    public java.util.List<DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails> accessPortDetails;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2EFCFE18-78F8-5079-B312-07***48B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
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
         * <p>The type of the HTTPS certificate. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: default certificate.</li>
         * <li><strong>extension</strong>: additional certificate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AppliedType")
        public String appliedType;

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>123-cn-hangzhou</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        /**
         * <p>The name of the certificate.</p>
         * 
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
         * <p>The key of the custom header field.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the custom header field.</p>
         * 
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
        /**
         * <p>The certificates that are associated with the ports of cloud services.</p>
         */
        @NameInMap("Certificates")
        public java.util.List<DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsCertificates> certificates;

        /**
         * <p>The type of the cipher suites. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: all cipher suites.</li>
         * <li><strong>2</strong>: strong cipher suites.</li>
         * <li><strong>99</strong>: custom cipher suites.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CipherSuite")
        public Integer cipherSuite;

        /**
         * <p>The custom cipher suites that you want to add. This parameter is available only if you set <strong>CipherSuite</strong> to <strong>99</strong>.</p>
         */
        @NameInMap("CustomCiphers")
        public java.util.List<String> customCiphers;

        /**
         * <p>Indicates whether to support TLS 1.3. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableTLSv3")
        public Boolean enableTLSv3;

        /**
         * <p>Indicates whether to enable HTTP/2. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Http2Enabled")
        public Boolean http2Enabled;

        /**
         * <p>Indicates whether to enable the persistent connection feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default)</li>
         * <li><strong>false:</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Keepalive")
        public Boolean keepalive;

        /**
         * <p>The number of reused persistent connections. Valid values: 60 to 1000.</p>
         * <blockquote>
         * <p> This parameter specifies the number of requests that reuse persistent connections after you enable the persistent connection feature.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("KeepaliveRequests")
        public Integer keepaliveRequests;

        /**
         * <p>The timeout period for idle persistent connections. Valid values: 10 to 3600. Default value: 15. Unit: seconds.</p>
         * <blockquote>
         * <p> If no new requests are initiated over the idle persistent connection within the specified timeout period, the connection is closed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("KeepaliveTimeout")
        public Integer keepaliveTimeout;

        /**
         * <p>The custom header field that you want to use to label requests that are processed by WAF.</p>
         * <blockquote>
         * <p> This parameter is returned only when the traffic marking feature is enabled for the domain name.</p>
         * </blockquote>
         */
        @NameInMap("LogHeaders")
        public java.util.List<DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsLogHeaders> logHeaders;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <p>The port of the cloud service that is added to WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <ul>
         * <li><strong>http</strong></li>
         * <li><strong>https</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>https</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The timeout period for read connections. Unit: seconds. Valid values: 1 to 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ReadTimeout")
        public Integer readTimeout;

        /**
         * <p>The status of the domain name. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: indicates that the port is available.</li>
         * <li><strong>2</strong>: indicates that the port is being created.</li>
         * <li><strong>3</strong>: indicates that the port is being modified.</li>
         * <li><strong>4</strong>: indicates that the port is being released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The version of the Transport Layer Security (TLS) protocol. Valid values:</p>
         * <ul>
         * <li><strong>tlsv1</strong></li>
         * <li><strong>tlsv1.1</strong></li>
         * <li><strong>tlsv1.2</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tlsv1</p>
         */
        @NameInMap("TLSVersion")
        public String TLSVersion;

        /**
         * <p>The timeout period for write connections. Unit: seconds. Valid values: 1 to 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WriteTimeout")
        public Integer writeTimeout;

        /**
         * <p>The method that WAF uses to obtain the originating IP address of a client. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No Layer 7 proxies are deployed in front of WAF.</li>
         * <li><strong>1</strong>: WAF reads the first value of the X-Forwarded-For (XFF) header field as the originating IP address of the client.</li>
         * <li><strong>2</strong>: WAF reads the value of a custom header field as the originating IP address of the client.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("XffHeaderMode")
        public Integer xffHeaderMode;

        /**
         * <p>The custom header field that is used to obtain the originating IP address of a client. Specify the value in the [&quot;header1&quot;,&quot;header2&quot;,...] format.</p>
         * <blockquote>
         * <p> This parameter is required only if you set <strong>XffHeaderMode</strong> to 2.</p>
         * </blockquote>
         */
        @NameInMap("XffHeaders")
        public java.util.List<String> xffHeaders;

        /**
         * <p>Indicates whether to use the X-Forward-For-Proto header to identify the protocol used by WAF to forward requests to the origin server. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default)</li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
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
