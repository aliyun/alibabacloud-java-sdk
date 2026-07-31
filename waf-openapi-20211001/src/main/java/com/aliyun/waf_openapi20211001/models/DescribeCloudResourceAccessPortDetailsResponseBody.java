// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCloudResourceAccessPortDetailsResponseBody extends TeaModel {
    /**
     * <p>The port details of cloud service instances connected to WAF.</p>
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
         * <p>The certificate type for the HTTPS protocol. Valid values:</p>
         * <ul>
         * <li><p><strong>default</strong>: default certificate.</p>
         * </li>
         * <li><p><strong>extension</strong>: extension certificate.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AppliedType")
        public String appliedType;

        /**
         * <p>The ID of the added certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>123-cn-hangzhou</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        /**
         * <p>The certificate name.</p>
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
         * <p>The specified custom request header field.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the specified custom request header field.</p>
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

    public static class DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsSubStatusDetails extends TeaModel {
        /**
         * <p>The certificate type for the HTTPS protocol. Valid values:</p>
         * <ul>
         * <li><p><strong>default</strong>: default certificate.</p>
         * </li>
         * <li><p><strong>extension</strong>: extension certificate.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AppliedType")
        public String appliedType;

        /**
         * <p>The certificate ID in SSL Certificates Service.</p>
         * 
         * <strong>example:</strong>
         * <p>123-cn-hangzhou</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The certificate name in SSL Certificates Service.</p>
         * 
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The common name (CN).</p>
         * 
         * <strong>example:</strong>
         * <p>test.aliyun.com</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The domain name bound to the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>test.aliyun.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The expiration time of the certificate, in UNIX timestamp format. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1746328456000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The certificate ID stored in the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ProductCertId")
        public String productCertId;

        /**
         * <p>The certificate name stored in the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        @NameInMap("ProductCertName")
        public String productCertName;

        /**
         * <p>The specific reason for the protection exception status. Valid values:</p>
         * <ul>
         * <li><p><strong>UserUploadCert</strong>: The certificate is manually uploaded.</p>
         * </li>
         * <li><p><strong>CertNotExistInCertCenter</strong>: The certificate does not exist in SSL Certificates Service.</p>
         * </li>
         * <li><p><strong>CertExpired</strong>: The cloud certificate has expired.</p>
         * </li>
         * <li><p><strong>EmptyCertCN</strong>: The CN of the certificate is empty.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CertNotExistInCertCenter</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        public static DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsSubStatusDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsSubStatusDetails self = new DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsSubStatusDetails();
            return TeaModel.build(map, self);
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsSubStatusDetails setAppliedType(String appliedType) {
            this.appliedType = appliedType;
            return this;
        }
        public String getAppliedType() {
            return this.appliedType;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsSubStatusDetails setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsSubStatusDetails setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsSubStatusDetails setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsSubStatusDetails setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsSubStatusDetails setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsSubStatusDetails setProductCertId(String productCertId) {
            this.productCertId = productCertId;
            return this;
        }
        public String getProductCertId() {
            return this.productCertId;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsSubStatusDetails setProductCertName(String productCertName) {
            this.productCertName = productCertName;
            return this;
        }
        public String getProductCertName() {
            return this.productCertName;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsSubStatusDetails setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

    }

    public static class DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails extends TeaModel {
        /**
         * <p>The list of certificates for the cloud service ports connected to WAF.</p>
         */
        @NameInMap("Certificates")
        public java.util.List<DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsCertificates> certificates;

        /**
         * <p>The cipher suite type. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: all cipher suites are added.</p>
         * </li>
         * <li><p><strong>2</strong>: strong cipher suites are added. This value is available only when TLSVersion is set to tlsv1.2.</p>
         * </li>
         * <li><p><strong>99</strong>: custom cipher suites are added. This value is available only when TLSVersion is not set to tlsv1.3.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CipherSuite")
        public Integer cipherSuite;

        /**
         * <p>The ID of the connected resource, automatically generated by WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1**************7ey-80-ecs</p>
         */
        @NameInMap("CloudResourceId")
        public String cloudResourceId;

        /**
         * <p>The specific custom cipher suites to add. This parameter is used only when <strong>CipherSuite</strong> is set to <strong>99</strong>.</p>
         */
        @NameInMap("CustomCiphers")
        public java.util.List<String> customCiphers;

        /**
         * <p>Indicates whether TLS 1.3 is supported. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: TLS 1.3 is supported.</p>
         * </li>
         * <li><p><strong>false</strong>: TLS 1.3 is not supported.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is used only when HttpsPorts is not empty (the domain name uses the HTTPS protocol). When TLSVersion is set to tlsv1.3, this value must be true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableTLSv3")
        public Boolean enableTLSv3;

        /**
         * <p>Indicates whether HTTP/2 is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: HTTP/2 is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: HTTP/2 is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Http2Enabled")
        public Boolean http2Enabled;

        /**
         * <p>Indicates whether keep-alive connections are enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): Keep-alive connections are enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Keep-alive connections are disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Keepalive")
        public Boolean keepalive;

        /**
         * <p>The number of requests that can reuse a keep-alive connection. Valid values: 60 to 1000.</p>
         * <blockquote>
         * <p>Specifies how many requests can reuse a keep-alive connection after keep-alive is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("KeepaliveRequests")
        public Integer keepaliveRequests;

        /**
         * <p>The idle timeout period for keep-alive connections. Valid values: 10 to 3600. Default value: 15. Unit: seconds.</p>
         * <blockquote>
         * <p>Specifies how long an idle keep-alive connection is retained before it is released.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("KeepaliveTimeout")
        public Integer keepaliveTimeout;

        /**
         * <p>The traffic tag fields and values of the domain name, used to mark traffic processed by WAF.</p>
         * <blockquote>
         * <p>This parameter is returned only when the traffic tag feature is enabled for the domain name.</p>
         * </blockquote>
         */
        @NameInMap("LogHeaders")
        public java.util.List<DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsLogHeaders> logHeaders;

        /**
         * <p>The maximum request body size. Valid values: 2 to 10. Default value: 2. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxBodySize")
        public Integer maxBodySize;

        /**
         * <p>The UID that indicates the resource ownership of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <p>The port of the cloud service that is connected to WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li><strong>http</strong>: HTTP protocol.</li>
         * <li><strong>https</strong>: HTTPS protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>https</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The read timeout period. Unit: seconds.
         * Valid values: 1 to 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ReadTimeout")
        public Integer readTimeout;

        /**
         * <p>The domain name status. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: The port is in a normal state.</p>
         * </li>
         * <li><p><strong>2</strong>: The port is being created.</p>
         * </li>
         * <li><p><strong>3</strong>: The port is being modified.</p>
         * </li>
         * <li><p><strong>4</strong>: The port is being released.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The protection exception status. Valid values:</p>
         * <ul>
         * <li><p><strong>InvalidCert</strong>: invalid certificate.</p>
         * </li>
         * <li><p><strong>ClientCertOpend</strong>: mutual authentication is enabled.</p>
         * </li>
         * <li><p><strong>NetworkConfigLost</strong>: the cloud service network configuration is abnormal.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InvalidCert</p>
         */
        @NameInMap("SubStatus")
        public String subStatus;

        /**
         * <p>The specific reasons for the protection exception status. This parameter has a value only when SubStatus is set to InvalidCert.</p>
         */
        @NameInMap("SubStatusDetails")
        public java.util.List<DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsSubStatusDetails> subStatusDetails;

        /**
         * <p>The TLS version. Valid values:</p>
         * <ul>
         * <li><p><strong>tlsv1</strong>: Supports TLS 1.0 and later. Highest compatibility, lower security.</p>
         * </li>
         * <li><p><strong>tlsv1.1</strong>: Supports TLS 1.1 and later. Good compatibility, good security.</p>
         * </li>
         * <li><p><strong>tlsv1.2</strong>: Supports TLS 1.2 and later. Good compatibility, highest security.</p>
         * </li>
         * <li><p><strong>tlsv1.3</strong>: Supports only TLS 1.3. Highest security, lower compatibility.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tlsv1</p>
         */
        @NameInMap("TLSVersion")
        public String TLSVersion;

        /**
         * <p>The write timeout period. Unit: seconds.
         * Valid values: 1 to 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WriteTimeout")
        public Integer writeTimeout;

        /**
         * <p>The method that WAF uses to obtain the originating IP address of the client. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: The client traffic does not pass through any Layer 7 proxy before reaching WAF.</p>
         * </li>
         * <li><p><strong>1</strong>: WAF reads the first value in the X-Forwarded-For (XFF) header as the client IP address.</p>
         * </li>
         * <li><p><strong>2</strong>: WAF reads the value of a custom header field that you specify as the client IP address.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("XffHeaderMode")
        public Integer xffHeaderMode;

        /**
         * <p>The list of custom header fields used to obtain the client IP address, in the format <strong>[&quot;header1&quot;,&quot;header2&quot;,...]</strong>.</p>
         * <blockquote>
         * <p>This parameter is required only when <strong>XffHeaderMode</strong> is set to 2 (WAF reads the value of a custom header field that you specify as the client IP address).</p>
         * </blockquote>
         */
        @NameInMap("XffHeaders")
        public java.util.List<String> xffHeaders;

        /**
         * <p>Specifies whether the X-Forward-For-Proto header is used to pass the WAF protocol. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): The WAF protocol is passed.</p>
         * </li>
         * <li><p><strong>false</strong>: The WAF protocol is not passed.</p>
         * </li>
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

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setCloudResourceId(String cloudResourceId) {
            this.cloudResourceId = cloudResourceId;
            return this;
        }
        public String getCloudResourceId() {
            return this.cloudResourceId;
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

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setMaxBodySize(Integer maxBodySize) {
            this.maxBodySize = maxBodySize;
            return this;
        }
        public Integer getMaxBodySize() {
            return this.maxBodySize;
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

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setSubStatus(String subStatus) {
            this.subStatus = subStatus;
            return this;
        }
        public String getSubStatus() {
            return this.subStatus;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetails setSubStatusDetails(java.util.List<DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsSubStatusDetails> subStatusDetails) {
            this.subStatusDetails = subStatusDetails;
            return this;
        }
        public java.util.List<DescribeCloudResourceAccessPortDetailsResponseBodyAccessPortDetailsSubStatusDetails> getSubStatusDetails() {
            return this.subStatusDetails;
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
