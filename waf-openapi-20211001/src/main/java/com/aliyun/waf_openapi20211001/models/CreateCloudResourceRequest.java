// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateCloudResourceRequest extends TeaModel {
    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The listener configurations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Listen")
    public CreateCloudResourceRequestListen listen;

    /**
     * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("OwnerUserId")
    public String ownerUserId;

    /**
     * <p>The forwarding configurations.</p>
     */
    @NameInMap("Redirect")
    public CreateCloudResourceRequestRedirect redirect;

    /**
     * <p>The region in which the WAF instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: the Chinese mainland.</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The tags. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateCloudResourceRequestTag> tag;

    public static CreateCloudResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudResourceRequest self = new CreateCloudResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCloudResourceRequest setListen(CreateCloudResourceRequestListen listen) {
        this.listen = listen;
        return this;
    }
    public CreateCloudResourceRequestListen getListen() {
        return this.listen;
    }

    public CreateCloudResourceRequest setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    public CreateCloudResourceRequest setRedirect(CreateCloudResourceRequestRedirect redirect) {
        this.redirect = redirect;
        return this;
    }
    public CreateCloudResourceRequestRedirect getRedirect() {
        return this.redirect;
    }

    public CreateCloudResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCloudResourceRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public CreateCloudResourceRequest setTag(java.util.List<CreateCloudResourceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateCloudResourceRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateCloudResourceRequestListenCertificates extends TeaModel {
        /**
         * <p>The type of the certificate. Valid values:</p>
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
         * <p>The ID of the certificate that you want to add.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/160783.html">DescribeCertificates</a> operation to query the IDs of all SSL certificates that are associated with a domain name.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123-cn-hangzhou</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        public static CreateCloudResourceRequestListenCertificates build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudResourceRequestListenCertificates self = new CreateCloudResourceRequestListenCertificates();
            return TeaModel.build(map, self);
        }

        public CreateCloudResourceRequestListenCertificates setAppliedType(String appliedType) {
            this.appliedType = appliedType;
            return this;
        }
        public String getAppliedType() {
            return this.appliedType;
        }

        public CreateCloudResourceRequestListenCertificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

    }

    public static class CreateCloudResourceRequestListen extends TeaModel {
        /**
         * <p>The certificates.</p>
         */
        @NameInMap("Certificates")
        public java.util.List<CreateCloudResourceRequestListenCertificates> certificates;

        /**
         * <p>The type of the cipher suites that you want to add. This parameter is available only if you specify <strong>HttpsPorts</strong>. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: all cipher suites.</li>
         * <li><strong>2</strong>: strong cipher suites. This value is available only if you set <strong>TLSVersion</strong> to <strong>tlsv1.2</strong>.</li>
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
         * <p>Specifies whether to support TLS 1.3. This parameter is available only if you specify <strong>HttpsPorts</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableTLSv3")
        public Boolean enableTLSv3;

        /**
         * <p>Specifies whether to enable HTTP/2. This parameter is available only if you specify <strong>HttpsPorts</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Http2Enabled")
        public Boolean http2Enabled;

        /**
         * <p>The port of the cloud service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li><strong>http</strong></li>
         * <li><strong>https</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The instance ID of the cloud service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1*****</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <p>The type of the cloud service that you want to add. Valid values:</p>
         * <ul>
         * <li><strong>clb4</strong>: Layer 4 CLB.</li>
         * <li><strong>clb7</strong>: Layer 7 CLB.</li>
         * <li><strong>ecs</strong>: ECS.</li>
         * <li><strong>nlb</strong>: Network Load Balancer (NLB).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>clb4</p>
         */
        @NameInMap("ResourceProduct")
        public String resourceProduct;

        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        /**
         * <p>The Transport Layer Security (TLS) version that you want to add. This parameter is available only if you specify <strong>HttpsPorts</strong>. Valid values:</p>
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

        public static CreateCloudResourceRequestListen build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudResourceRequestListen self = new CreateCloudResourceRequestListen();
            return TeaModel.build(map, self);
        }

        public CreateCloudResourceRequestListen setCertificates(java.util.List<CreateCloudResourceRequestListenCertificates> certificates) {
            this.certificates = certificates;
            return this;
        }
        public java.util.List<CreateCloudResourceRequestListenCertificates> getCertificates() {
            return this.certificates;
        }

        public CreateCloudResourceRequestListen setCipherSuite(Integer cipherSuite) {
            this.cipherSuite = cipherSuite;
            return this;
        }
        public Integer getCipherSuite() {
            return this.cipherSuite;
        }

        public CreateCloudResourceRequestListen setCustomCiphers(java.util.List<String> customCiphers) {
            this.customCiphers = customCiphers;
            return this;
        }
        public java.util.List<String> getCustomCiphers() {
            return this.customCiphers;
        }

        public CreateCloudResourceRequestListen setEnableTLSv3(Boolean enableTLSv3) {
            this.enableTLSv3 = enableTLSv3;
            return this;
        }
        public Boolean getEnableTLSv3() {
            return this.enableTLSv3;
        }

        public CreateCloudResourceRequestListen setHttp2Enabled(Boolean http2Enabled) {
            this.http2Enabled = http2Enabled;
            return this;
        }
        public Boolean getHttp2Enabled() {
            return this.http2Enabled;
        }

        public CreateCloudResourceRequestListen setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateCloudResourceRequestListen setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateCloudResourceRequestListen setResourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        public CreateCloudResourceRequestListen setResourceProduct(String resourceProduct) {
            this.resourceProduct = resourceProduct;
            return this;
        }
        public String getResourceProduct() {
            return this.resourceProduct;
        }

        public CreateCloudResourceRequestListen setResourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
            return this;
        }
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        public CreateCloudResourceRequestListen setTLSVersion(String TLSVersion) {
            this.TLSVersion = TLSVersion;
            return this;
        }
        public String getTLSVersion() {
            return this.TLSVersion;
        }

    }

    public static class CreateCloudResourceRequestRedirectRequestHeaders extends TeaModel {
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

        public static CreateCloudResourceRequestRedirectRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudResourceRequestRedirectRequestHeaders self = new CreateCloudResourceRequestRedirectRequestHeaders();
            return TeaModel.build(map, self);
        }

        public CreateCloudResourceRequestRedirectRequestHeaders setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCloudResourceRequestRedirectRequestHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateCloudResourceRequestRedirect extends TeaModel {
        /**
         * <p>Specifies whether to enable the persistent connection feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default)</li>
         * <li><strong>false</strong></li>
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
         * <p> This parameter specifies the number of persistent connections that can be reused after you enable the persistent connection feature.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("KeepaliveRequests")
        public Integer keepaliveRequests;

        /**
         * <p>The timeout period of idle persistent connections. Valid values: 10 to 3600. Default value: 3600. Unit: seconds.</p>
         * <blockquote>
         * <p> This parameter specifies the period of time after which an idle persistent connection is closed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("KeepaliveTimeout")
        public Integer keepaliveTimeout;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxBodySize")
        public Integer maxBodySize;

        /**
         * <p>The timeout period of read connections. Unit: seconds. Valid values: 1 to 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReadTimeout")
        public Integer readTimeout;

        /**
         * <p>The custom header fields. Specify the value in the [<strong>{&quot;k&quot;:&quot;<em>key</em>&quot;,&quot;v&quot;:&quot;<em>value</em>&quot;}</strong>] format. <em><strong>key</strong></em> specifies the key of a custom header field. <em><strong>value</strong></em> specifies the value of a custom header field.</p>
         * <blockquote>
         * <p> If a request contains a custom header field, WAF overwrites the original value of the field with the specified value.</p>
         * </blockquote>
         */
        @NameInMap("RequestHeaders")
        public java.util.List<CreateCloudResourceRequestRedirectRequestHeaders> requestHeaders;

        /**
         * <p>The timeout period of write connections. Unit: seconds. Valid values: 1 to 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WriteTimeout")
        public Integer writeTimeout;

        /**
         * <p>The method that is used to obtain the originating IP address of a client. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No Layer 7 proxies are deployed in front of WAF.</li>
         * <li><strong>1</strong>: WAF reads the first value of the X-Forwarded-For (XFF) header field as the originating IP address of the client.</li>
         * <li><strong>2</strong>: WAF reads the value of a custom header field as the originating IP address of the client.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("XffHeaderMode")
        public Integer xffHeaderMode;

        /**
         * <p>The custom header fields that are used to obtain the originating IP address of a client. Specify the value in the <strong>[&quot;header1&quot;,&quot;header2&quot;,...]</strong> format.</p>
         * <blockquote>
         * <p> This parameter is required only if you set <strong>XffHeaderMode</strong> to 2.</p>
         * </blockquote>
         */
        @NameInMap("XffHeaders")
        public java.util.List<String> xffHeaders;

        /**
         * <p>Specifies whether to use the X-Forward-For-Proto header field to pass the protocol used by WAF to forward requests to the origin server. Valid values:</p>
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

        public static CreateCloudResourceRequestRedirect build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudResourceRequestRedirect self = new CreateCloudResourceRequestRedirect();
            return TeaModel.build(map, self);
        }

        public CreateCloudResourceRequestRedirect setKeepalive(Boolean keepalive) {
            this.keepalive = keepalive;
            return this;
        }
        public Boolean getKeepalive() {
            return this.keepalive;
        }

        public CreateCloudResourceRequestRedirect setKeepaliveRequests(Integer keepaliveRequests) {
            this.keepaliveRequests = keepaliveRequests;
            return this;
        }
        public Integer getKeepaliveRequests() {
            return this.keepaliveRequests;
        }

        public CreateCloudResourceRequestRedirect setKeepaliveTimeout(Integer keepaliveTimeout) {
            this.keepaliveTimeout = keepaliveTimeout;
            return this;
        }
        public Integer getKeepaliveTimeout() {
            return this.keepaliveTimeout;
        }

        public CreateCloudResourceRequestRedirect setMaxBodySize(Integer maxBodySize) {
            this.maxBodySize = maxBodySize;
            return this;
        }
        public Integer getMaxBodySize() {
            return this.maxBodySize;
        }

        public CreateCloudResourceRequestRedirect setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }
        public Integer getReadTimeout() {
            return this.readTimeout;
        }

        public CreateCloudResourceRequestRedirect setRequestHeaders(java.util.List<CreateCloudResourceRequestRedirectRequestHeaders> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public java.util.List<CreateCloudResourceRequestRedirectRequestHeaders> getRequestHeaders() {
            return this.requestHeaders;
        }

        public CreateCloudResourceRequestRedirect setWriteTimeout(Integer writeTimeout) {
            this.writeTimeout = writeTimeout;
            return this;
        }
        public Integer getWriteTimeout() {
            return this.writeTimeout;
        }

        public CreateCloudResourceRequestRedirect setXffHeaderMode(Integer xffHeaderMode) {
            this.xffHeaderMode = xffHeaderMode;
            return this;
        }
        public Integer getXffHeaderMode() {
            return this.xffHeaderMode;
        }

        public CreateCloudResourceRequestRedirect setXffHeaders(java.util.List<String> xffHeaders) {
            this.xffHeaders = xffHeaders;
            return this;
        }
        public java.util.List<String> getXffHeaders() {
            return this.xffHeaders;
        }

        public CreateCloudResourceRequestRedirect setXffProto(Boolean xffProto) {
            this.xffProto = xffProto;
            return this;
        }
        public Boolean getXffProto() {
            return this.xffProto;
        }

    }

    public static class CreateCloudResourceRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TagKey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TagValue1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateCloudResourceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudResourceRequestTag self = new CreateCloudResourceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateCloudResourceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCloudResourceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
