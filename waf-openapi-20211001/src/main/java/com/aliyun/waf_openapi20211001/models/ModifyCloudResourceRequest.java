// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyCloudResourceRequest extends TeaModel {
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
     * <p>The configurations of the listeners.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Listen")
    public ModifyCloudResourceRequestListen listen;

    /**
     * <p>The configurations of the forwarding rule.</p>
     */
    @NameInMap("Redirect")
    public ModifyCloudResourceRequestRedirect redirect;

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

    public static ModifyCloudResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudResourceRequest self = new ModifyCloudResourceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCloudResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyCloudResourceRequest setListen(ModifyCloudResourceRequestListen listen) {
        this.listen = listen;
        return this;
    }
    public ModifyCloudResourceRequestListen getListen() {
        return this.listen;
    }

    public ModifyCloudResourceRequest setRedirect(ModifyCloudResourceRequestRedirect redirect) {
        this.redirect = redirect;
        return this;
    }
    public ModifyCloudResourceRequestRedirect getRedirect() {
        return this.redirect;
    }

    public ModifyCloudResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCloudResourceRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public static class ModifyCloudResourceRequestListenCertificates extends TeaModel {
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

        public static ModifyCloudResourceRequestListenCertificates build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudResourceRequestListenCertificates self = new ModifyCloudResourceRequestListenCertificates();
            return TeaModel.build(map, self);
        }

        public ModifyCloudResourceRequestListenCertificates setAppliedType(String appliedType) {
            this.appliedType = appliedType;
            return this;
        }
        public String getAppliedType() {
            return this.appliedType;
        }

        public ModifyCloudResourceRequestListenCertificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

    }

    public static class ModifyCloudResourceRequestListen extends TeaModel {
        /**
         * <p>An array of certificates.</p>
         */
        @NameInMap("Certificates")
        public java.util.List<ModifyCloudResourceRequestListenCertificates> certificates;

        /**
         * <p>The type of the cipher suites that you want to add. This parameter is available only if you specify <strong>HttpsPorts</strong>. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: all cipher suites.</li>
         * <li><strong>2</strong>: strong cipher suites. You can set the parameter to this value only if you set <strong>TLSVersion</strong> to <strong>tlsv1.2</strong>.</li>
         * <li><strong>99</strong>: custom cipher suites.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CipherSuite")
        public Integer cipherSuite;

        /**
         * <p>An array of custom cipher suites.</p>
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
         * <p>The port of the resource that you want to add to WAF.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The type of the protocol. Valid values:</p>
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
         * <p>The ID of the resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-***</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <p>The cloud service. Valid values:</p>
         * <ul>
         * <li><strong>clb4</strong>: Layer 4 Classic Load Balancer (CLB).</li>
         * <li><strong>clb7</strong>: Layer 7 CLB.</li>
         * <li><strong>ecs</strong>: Elastic Compute Service (ECS).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>clb7</p>
         */
        @NameInMap("ResourceProduct")
        public String resourceProduct;

        /**
         * <p>The Transport Layer Security (TLS) version. This parameter is available only if you specify <strong>HttpsPorts</strong>. Valid values:</p>
         * <ul>
         * <li><strong>tlsv1</strong></li>
         * <li><strong>tlsv1.1</strong></li>
         * <li><strong>tlsv1.2</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tlsv1.2</p>
         */
        @NameInMap("TLSVersion")
        public String TLSVersion;

        public static ModifyCloudResourceRequestListen build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudResourceRequestListen self = new ModifyCloudResourceRequestListen();
            return TeaModel.build(map, self);
        }

        public ModifyCloudResourceRequestListen setCertificates(java.util.List<ModifyCloudResourceRequestListenCertificates> certificates) {
            this.certificates = certificates;
            return this;
        }
        public java.util.List<ModifyCloudResourceRequestListenCertificates> getCertificates() {
            return this.certificates;
        }

        public ModifyCloudResourceRequestListen setCipherSuite(Integer cipherSuite) {
            this.cipherSuite = cipherSuite;
            return this;
        }
        public Integer getCipherSuite() {
            return this.cipherSuite;
        }

        public ModifyCloudResourceRequestListen setCustomCiphers(java.util.List<String> customCiphers) {
            this.customCiphers = customCiphers;
            return this;
        }
        public java.util.List<String> getCustomCiphers() {
            return this.customCiphers;
        }

        public ModifyCloudResourceRequestListen setEnableTLSv3(Boolean enableTLSv3) {
            this.enableTLSv3 = enableTLSv3;
            return this;
        }
        public Boolean getEnableTLSv3() {
            return this.enableTLSv3;
        }

        public ModifyCloudResourceRequestListen setHttp2Enabled(Boolean http2Enabled) {
            this.http2Enabled = http2Enabled;
            return this;
        }
        public Boolean getHttp2Enabled() {
            return this.http2Enabled;
        }

        public ModifyCloudResourceRequestListen setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ModifyCloudResourceRequestListen setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ModifyCloudResourceRequestListen setResourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        public ModifyCloudResourceRequestListen setResourceProduct(String resourceProduct) {
            this.resourceProduct = resourceProduct;
            return this;
        }
        public String getResourceProduct() {
            return this.resourceProduct;
        }

        public ModifyCloudResourceRequestListen setTLSVersion(String TLSVersion) {
            this.TLSVersion = TLSVersion;
            return this;
        }
        public String getTLSVersion() {
            return this.TLSVersion;
        }

    }

    public static class ModifyCloudResourceRequestRedirectRequestHeaders extends TeaModel {
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

        public static ModifyCloudResourceRequestRedirectRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudResourceRequestRedirectRequestHeaders self = new ModifyCloudResourceRequestRedirectRequestHeaders();
            return TeaModel.build(map, self);
        }

        public ModifyCloudResourceRequestRedirectRequestHeaders setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyCloudResourceRequestRedirectRequestHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyCloudResourceRequestRedirect extends TeaModel {
        /**
         * <p>Specifies whether to enable the persistent connection feature. Valid values:</p>
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
         * <p>The number of requests that reuse persistent connections. Valid values: 60 to 1000.</p>
         * <blockquote>
         * <p> This parameter specifies the number of requests that can reuse persistent connections after you enable the persistent connection feature.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("KeepaliveRequests")
        public Integer keepaliveRequests;

        /**
         * <p>The timeout period for idle persistent connections. Valid values: 10 to 3600. Default value: 3600. Unit: seconds.</p>
         * <blockquote>
         * <p> If no new requests are initiated over the idle persistent connection within the specified timeout period, the connection is closed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("KeepaliveTimeout")
        public Integer keepaliveTimeout;

        /**
         * <p>The timeout period for read connections. Unit: seconds. Valid values: 1 to 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReadTimeout")
        public Integer readTimeout;

        /**
         * <p>The custom header field that you want to use to label requests that are processed by WAF.</p>
         */
        @NameInMap("RequestHeaders")
        public java.util.List<ModifyCloudResourceRequestRedirectRequestHeaders> requestHeaders;

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
         * <p>Specifies whether to use the X-Forward-For-Proto header to identify the protocol used by WAF to forward requests to the origin server. Valid values:</p>
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

        public static ModifyCloudResourceRequestRedirect build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudResourceRequestRedirect self = new ModifyCloudResourceRequestRedirect();
            return TeaModel.build(map, self);
        }

        public ModifyCloudResourceRequestRedirect setKeepalive(Boolean keepalive) {
            this.keepalive = keepalive;
            return this;
        }
        public Boolean getKeepalive() {
            return this.keepalive;
        }

        public ModifyCloudResourceRequestRedirect setKeepaliveRequests(Integer keepaliveRequests) {
            this.keepaliveRequests = keepaliveRequests;
            return this;
        }
        public Integer getKeepaliveRequests() {
            return this.keepaliveRequests;
        }

        public ModifyCloudResourceRequestRedirect setKeepaliveTimeout(Integer keepaliveTimeout) {
            this.keepaliveTimeout = keepaliveTimeout;
            return this;
        }
        public Integer getKeepaliveTimeout() {
            return this.keepaliveTimeout;
        }

        public ModifyCloudResourceRequestRedirect setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }
        public Integer getReadTimeout() {
            return this.readTimeout;
        }

        public ModifyCloudResourceRequestRedirect setRequestHeaders(java.util.List<ModifyCloudResourceRequestRedirectRequestHeaders> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public java.util.List<ModifyCloudResourceRequestRedirectRequestHeaders> getRequestHeaders() {
            return this.requestHeaders;
        }

        public ModifyCloudResourceRequestRedirect setWriteTimeout(Integer writeTimeout) {
            this.writeTimeout = writeTimeout;
            return this;
        }
        public Integer getWriteTimeout() {
            return this.writeTimeout;
        }

        public ModifyCloudResourceRequestRedirect setXffHeaderMode(Integer xffHeaderMode) {
            this.xffHeaderMode = xffHeaderMode;
            return this;
        }
        public Integer getXffHeaderMode() {
            return this.xffHeaderMode;
        }

        public ModifyCloudResourceRequestRedirect setXffHeaders(java.util.List<String> xffHeaders) {
            this.xffHeaders = xffHeaders;
            return this;
        }
        public java.util.List<String> getXffHeaders() {
            return this.xffHeaders;
        }

        public ModifyCloudResourceRequestRedirect setXffProto(Boolean xffProto) {
            this.xffProto = xffProto;
            return this;
        }
        public Boolean getXffProto() {
            return this.xffProto;
        }

    }

}
