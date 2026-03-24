// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateCloudResourceRequest extends TeaModel {
    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The listener configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Listen")
    public CreateCloudResourceRequestListen listen;

    /**
     * <p>The Alibaba Cloud account ID of the resource owner.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("OwnerUserId")
    public String ownerUserId;

    /**
     * <p>The forwarding configuration.</p>
     */
    @NameInMap("Redirect")
    public CreateCloudResourceRequestRedirect redirect;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
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
     * <p>The list of tags. You can add up to 20 tags.</p>
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
         * <p>The type of the certificate for the HTTPS protocol. Valid values:</p>
         * <ul>
         * <li><p><strong>default</strong>: the default certificate.</p>
         * </li>
         * <li><p><strong>extension</strong>: the additional certificate.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AppliedType")
        public String appliedType;

        /**
         * <p>The ID of the certificate to add.</p>
         * <blockquote>
         * <p>Call <a href="https://help.aliyun.com/document_detail/2718120.html">DescribeResourceInstanceCerts</a> to query the IDs of all SSL certificates that are associated with the cloud product instance.</p>
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
         * <p>The list of certificate IDs.</p>
         */
        @NameInMap("Certificates")
        public java.util.List<CreateCloudResourceRequestListenCertificates> certificates;

        /**
         * <p>The type of cipher suite to add. This parameter is used only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Adds all cipher suites.</p>
         * </li>
         * <li><p><strong>2</strong>: Adds strong cipher suites. You can select this value only when <strong>TLSVersion</strong> is set to <strong>tlsv1.2</strong>.</p>
         * </li>
         * <li><p><strong>99</strong>: Adds custom cipher suites.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CipherSuite")
        public Integer cipherSuite;

        /**
         * <p>The custom cipher suites to add. This parameter is used only when <strong>CipherSuite</strong> is set to <strong>99</strong>.</p>
         */
        @NameInMap("CustomCiphers")
        public java.util.List<String> customCiphers;

        /**
         * <p>Specifies whether to support TLS 1.3. This parameter is used only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: TLS 1.3 is supported.</p>
         * </li>
         * <li><p><strong>false</strong>: TLS 1.3 is not supported.</p>
         * </li>
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
         * <p>Specifies whether to enable HTTP/2. This parameter is used only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables HTTP/2.</p>
         * </li>
         * <li><p><strong>false</strong> (default): disables HTTP/2.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Http2Enabled")
        public Boolean http2Enabled;

        /**
         * <p>The port of the cloud product that is added to WAF.</p>
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
         * <li><p><strong>http</strong>: HTTP.</p>
         * </li>
         * <li><p><strong>https</strong>: HTTPS.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The ID of the cloud product instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1*****</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <p>The type of the cloud product. Valid values:</p>
         * <ul>
         * <li><p><strong>clb4</strong>: Layer 4 CLB instance.</p>
         * </li>
         * <li><p><strong>clb7</strong>: Layer 7 CLB instance.</p>
         * </li>
         * <li><p><strong>ecs</strong>: ECS instance.</p>
         * </li>
         * <li><p><strong>nlb</strong>: Network Load Balancer (NLB) instance.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>clb4</p>
         */
        @NameInMap("ResourceProduct")
        public String resourceProduct;

        /**
         * <p>The region ID of the cloud product.</p>
         * <blockquote>
         * <p>This parameter is required if the ID of the instance that you want to add has not been synchronized to WAF.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        /**
         * <p>The TLS version to add. This parameter is used only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS. Valid values:</p>
         * <ul>
         * <li><p><strong>tlsv1</strong></p>
         * </li>
         * <li><p><strong>tlsv1.1</strong></p>
         * </li>
         * <li><p><strong>tlsv1.2</strong></p>
         * </li>
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
         * <p>The custom request header field.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the custom request header field.</p>
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
         * <p>Specifies whether to enable persistent connections. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): enables persistent connections.</p>
         * </li>
         * <li><p><strong>false</strong>: disables persistent connections.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Keepalive")
        public Boolean keepalive;

        /**
         * <p>The number of requests that can be reused in a persistent connection. Valid values: 60 to 1000.</p>
         * <blockquote>
         * <p>The number of requests that are reused over a persistent connection.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("KeepaliveRequests")
        public Integer keepaliveRequests;

        /**
         * <p>The timeout period for an idle persistent connection. Valid values: 10 to 3600. Default value: 3600. Unit: seconds.</p>
         * <blockquote>
         * <p>The period of time after which an idle persistent connection is released.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("KeepaliveTimeout")
        public Integer keepaliveTimeout;

        /**
         * <p>The maximum size of a request body. Valid values: 2 to 10. Default value: 2. Unit: GB.</p>
         * <blockquote>
         * <p>This feature is available only for the WAF Ultimate edition.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxBodySize")
        public Integer maxBodySize;

        /**
         * <p>The read timeout period. Unit: seconds. Valid values: 1 to 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReadTimeout")
        public Integer readTimeout;

        /**
         * <p>The value of this parameter is in the \<code>[**{&quot;k&quot;:&quot;*****key*****&quot;,&quot;v&quot;:&quot;*****value*****&quot;}**]\\</code> format. <em><strong>key</strong></em> indicates the custom request header field. <em><strong>value</strong></em> indicates the value of the field.</p>
         * <blockquote>
         * <p>If the custom header field already exists in the request, the system overwrites the value of the custom header field with the specified value.</p>
         * </blockquote>
         */
        @NameInMap("RequestHeaders")
        public java.util.List<CreateCloudResourceRequestRedirectRequestHeaders> requestHeaders;

        /**
         * <p>The write timeout period. Unit: seconds. Valid values: 1 to 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WriteTimeout")
        public Integer writeTimeout;

        /**
         * <p>The method that WAF uses to obtain the real IP address of a client. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: No Layer 7 proxy is deployed before WAF.</p>
         * </li>
         * <li><p><strong>1</strong>: WAF reads the first value of the XFF header field to obtain the client IP address.</p>
         * </li>
         * <li><p><strong>2</strong>: WAF reads the value of a custom header field to obtain the client IP address.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("XffHeaderMode")
        public Integer xffHeaderMode;

        /**
         * <p>The list of custom header fields that are used to obtain the client IP address. The value is in the \<code>[**&quot;header1&quot;,&quot;header2&quot;,...**]\\</code> format.</p>
         * <blockquote>
         * <p>This parameter is required only when <strong>XffHeaderMode</strong> is set to 2, which indicates that WAF reads the value of a custom header field to obtain the client IP address.</p>
         * </blockquote>
         */
        @NameInMap("XffHeaders")
        public java.util.List<String> xffHeaders;

        /**
         * <p>Specifies whether to use the X-Forwarded-Proto header to pass the WAF protocol. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): passes the WAF protocol.</p>
         * </li>
         * <li><p><strong>false</strong>: does not pass the WAF protocol.</p>
         * </li>
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TagKey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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
