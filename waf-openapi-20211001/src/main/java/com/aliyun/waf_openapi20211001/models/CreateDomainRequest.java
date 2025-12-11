// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDomainRequest extends TeaModel {
    /**
     * <p>The mode in which you want to add the domain name to WAF. Valid values:</p>
     * <ul>
     * <li><strong>share:</strong> adds the domain name to WAF in CNAME record mode. This is the default value.</li>
     * <li><strong>hybrid_cloud_cname:</strong> adds the domain name to WAF in hybrid cloud reverse proxy mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>share</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The domain name that you want to add to WAF.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to obtain the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The listener configurations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Listen")
    public CreateDomainRequestListen listen;

    /**
     * <p>The forwarding configurations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Redirect")
    public CreateDomainRequestRedirect redirect;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: the Chinese mainland</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
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
    public java.util.List<CreateDomainRequestTag> tag;

    public static CreateDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainRequest self = new CreateDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateDomainRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public CreateDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDomainRequest setListen(CreateDomainRequestListen listen) {
        this.listen = listen;
        return this;
    }
    public CreateDomainRequestListen getListen() {
        return this.listen;
    }

    public CreateDomainRequest setRedirect(CreateDomainRequestRedirect redirect) {
        this.redirect = redirect;
        return this;
    }
    public CreateDomainRequestRedirect getRedirect() {
        return this.redirect;
    }

    public CreateDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDomainRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public CreateDomainRequest setTag(java.util.List<CreateDomainRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDomainRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateDomainRequestListen extends TeaModel {
        /**
         * <p>The ID of the certificate that you want to add. This parameter is available only if you specify <strong>HttpsPorts</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The type of the cipher suites that you want to add. This parameter is available only if you specify <strong>HttpsPorts</strong>. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: all cipher suites.</li>
         * <li><strong>2</strong>: strong cipher suites. This value is available only if you set <strong>TLSVersion</strong> to <strong>tlsv1.2</strong>.</li>
         * <li><strong>99</strong>: custom cipher suites.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CipherSuite")
        public Integer cipherSuite;

        /**
         * <p>The custom cipher suites that you want to add.</p>
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
         * <p>Specifies whether to enable the exclusive IP address feature. This parameter is available only if you set <strong>IPv6Enabled</strong> to <strong>false</strong> and <strong>ProtectionResource</strong> to <strong>share</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExclusiveIp")
        public Boolean exclusiveIp;

        /**
         * <p>Specifies whether to enable force redirect from HTTP to HTTPS for received requests. This parameter is available only if you specify HttpsPorts and leave HttpPorts empty. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FocusHttps")
        public Boolean focusHttps;

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
         * <p>The HTTP listener ports.</p>
         */
        @NameInMap("HttpPorts")
        public java.util.List<Integer> httpPorts;

        /**
         * <p>The HTTPS listener ports.</p>
         */
        @NameInMap("HttpsPorts")
        public java.util.List<Integer> httpsPorts;

        /**
         * <p>Specifies whether to enable IPv6 protection. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IPv6Enabled")
        public Boolean IPv6Enabled;

        /**
         * <p>The type of the protection resource. Valid values:</p>
         * <ul>
         * <li><strong>share</strong> (default): a shared cluster.</li>
         * <li><strong>gslb</strong>: shared cluster-based intelligent load balancing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>share</p>
         */
        @NameInMap("ProtectionResource")
        public String protectionResource;

        /**
         * <p>Specifies whether to allow access only from SM certificate-based clients. This parameter is available only if you set SM2Enabled to true.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("SM2AccessOnly")
        public Boolean SM2AccessOnly;

        /**
         * <p>The ID of the SM certificate that you want to add. This parameter is available only if you set SM2Enabled to true.</p>
         * 
         * <strong>example:</strong>
         * <p>123-cn-hangzhou</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("SM2CertId")
        public String SM2CertId;

        /**
         * <p>Specifies whether to add an SM certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("SM2Enabled")
        public Boolean SM2Enabled;

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

        /**
         * <p>The method that is used to obtain the originating IP address of a client. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): Client traffic is not filtered by a Layer 7 proxy before the traffic reaches WAF.</li>
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
         * <p>The custom header fields that are used to obtain the originating IP address of a client.</p>
         */
        @NameInMap("XffHeaders")
        public java.util.List<String> xffHeaders;

        public static CreateDomainRequestListen build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainRequestListen self = new CreateDomainRequestListen();
            return TeaModel.build(map, self);
        }

        public CreateDomainRequestListen setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
        }

        public CreateDomainRequestListen setCipherSuite(Integer cipherSuite) {
            this.cipherSuite = cipherSuite;
            return this;
        }
        public Integer getCipherSuite() {
            return this.cipherSuite;
        }

        public CreateDomainRequestListen setCustomCiphers(java.util.List<String> customCiphers) {
            this.customCiphers = customCiphers;
            return this;
        }
        public java.util.List<String> getCustomCiphers() {
            return this.customCiphers;
        }

        public CreateDomainRequestListen setEnableTLSv3(Boolean enableTLSv3) {
            this.enableTLSv3 = enableTLSv3;
            return this;
        }
        public Boolean getEnableTLSv3() {
            return this.enableTLSv3;
        }

        public CreateDomainRequestListen setExclusiveIp(Boolean exclusiveIp) {
            this.exclusiveIp = exclusiveIp;
            return this;
        }
        public Boolean getExclusiveIp() {
            return this.exclusiveIp;
        }

        public CreateDomainRequestListen setFocusHttps(Boolean focusHttps) {
            this.focusHttps = focusHttps;
            return this;
        }
        public Boolean getFocusHttps() {
            return this.focusHttps;
        }

        public CreateDomainRequestListen setHttp2Enabled(Boolean http2Enabled) {
            this.http2Enabled = http2Enabled;
            return this;
        }
        public Boolean getHttp2Enabled() {
            return this.http2Enabled;
        }

        public CreateDomainRequestListen setHttpPorts(java.util.List<Integer> httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }
        public java.util.List<Integer> getHttpPorts() {
            return this.httpPorts;
        }

        public CreateDomainRequestListen setHttpsPorts(java.util.List<Integer> httpsPorts) {
            this.httpsPorts = httpsPorts;
            return this;
        }
        public java.util.List<Integer> getHttpsPorts() {
            return this.httpsPorts;
        }

        public CreateDomainRequestListen setIPv6Enabled(Boolean IPv6Enabled) {
            this.IPv6Enabled = IPv6Enabled;
            return this;
        }
        public Boolean getIPv6Enabled() {
            return this.IPv6Enabled;
        }

        public CreateDomainRequestListen setProtectionResource(String protectionResource) {
            this.protectionResource = protectionResource;
            return this;
        }
        public String getProtectionResource() {
            return this.protectionResource;
        }

        public CreateDomainRequestListen setSM2AccessOnly(Boolean SM2AccessOnly) {
            this.SM2AccessOnly = SM2AccessOnly;
            return this;
        }
        public Boolean getSM2AccessOnly() {
            return this.SM2AccessOnly;
        }

        public CreateDomainRequestListen setSM2CertId(String SM2CertId) {
            this.SM2CertId = SM2CertId;
            return this;
        }
        public String getSM2CertId() {
            return this.SM2CertId;
        }

        public CreateDomainRequestListen setSM2Enabled(Boolean SM2Enabled) {
            this.SM2Enabled = SM2Enabled;
            return this;
        }
        public Boolean getSM2Enabled() {
            return this.SM2Enabled;
        }

        public CreateDomainRequestListen setTLSVersion(String TLSVersion) {
            this.TLSVersion = TLSVersion;
            return this;
        }
        public String getTLSVersion() {
            return this.TLSVersion;
        }

        public CreateDomainRequestListen setXffHeaderMode(Integer xffHeaderMode) {
            this.xffHeaderMode = xffHeaderMode;
            return this;
        }
        public Integer getXffHeaderMode() {
            return this.xffHeaderMode;
        }

        public CreateDomainRequestListen setXffHeaders(java.util.List<String> xffHeaders) {
            this.xffHeaders = xffHeaders;
            return this;
        }
        public java.util.List<String> getXffHeaders() {
            return this.xffHeaders;
        }

    }

    public static class CreateDomainRequestRedirectBackendPorts extends TeaModel {
        @NameInMap("BackendPort")
        public Integer backendPort;

        @NameInMap("ListenPort")
        public Integer listenPort;

        @NameInMap("Protocol")
        public String protocol;

        public static CreateDomainRequestRedirectBackendPorts build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainRequestRedirectBackendPorts self = new CreateDomainRequestRedirectBackendPorts();
            return TeaModel.build(map, self);
        }

        public CreateDomainRequestRedirectBackendPorts setBackendPort(Integer backendPort) {
            this.backendPort = backendPort;
            return this;
        }
        public Integer getBackendPort() {
            return this.backendPort;
        }

        public CreateDomainRequestRedirectBackendPorts setListenPort(Integer listenPort) {
            this.listenPort = listenPort;
            return this;
        }
        public Integer getListenPort() {
            return this.listenPort;
        }

        public CreateDomainRequestRedirectBackendPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class CreateDomainRequestRedirectRequestHeaders extends TeaModel {
        /**
         * <p>The key of the custom header field.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the custom header field.</p>
         * 
         * <strong>example:</strong>
         * <p>bbb</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDomainRequestRedirectRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainRequestRedirectRequestHeaders self = new CreateDomainRequestRedirectRequestHeaders();
            return TeaModel.build(map, self);
        }

        public CreateDomainRequestRedirectRequestHeaders setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDomainRequestRedirectRequestHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateDomainRequestRedirect extends TeaModel {
        @NameInMap("BackendPorts")
        public java.util.List<CreateDomainRequestRedirectBackendPorts> backendPorts;

        /**
         * <p>The IP addresses or domain names of the origin server.</p>
         */
        @NameInMap("Backends")
        public java.util.List<String> backends;

        /**
         * <p>The secondary IP addresses or domain names of the origin server.</p>
         */
        @NameInMap("BackupBackends")
        public java.util.List<String> backupBackends;

        /**
         * <p>Specifies whether to enable the public cloud disaster recovery feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CnameEnabled")
        public Boolean cnameEnabled;

        /**
         * <p>The timeout period of connections. Unit: seconds. Valid values: 1 to 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("ConnectTimeout")
        public Integer connectTimeout;

        /**
         * <p>Specifies whether to enable force redirect from HTTPS to HTTP for back-to-origin requests. This parameter is available only if you specify <strong>HttpsPorts</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FocusHttpBackend")
        public Boolean focusHttpBackend;

        @NameInMap("Http2Origin")
        public Boolean http2Origin;

        /**
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Http2OriginMaxConcurrency")
        public Integer http2OriginMaxConcurrency;

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
         * <p>The timeout period of idle persistent connections. Valid values: 1 to 60. Default value: 15. Unit: seconds.</p>
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
         * <p>The load balancing algorithm that you want to use to forward requests to the origin server. Valid values:</p>
         * <ul>
         * <li><strong>iphash</strong></li>
         * <li><strong>roundRobin</strong></li>
         * <li><strong>leastTime</strong>: This value is available only if you set <strong>ProtectionResource</strong> to <strong>gslb</strong>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>roundRobin</p>
         */
        @NameInMap("Loadbalance")
        public String loadbalance;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxBodySize")
        public Integer maxBodySize;

        /**
         * <p>The timeout period of read connections. Unit: seconds. Valid values: 1 to 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ReadTimeout")
        public Integer readTimeout;

        /**
         * <p>The custom header fields, which are key-value pairs. The fields are used to mark requests that pass through WAF.</p>
         * <p>When a request passes through WAF, WAF automatically adds the custom header fields to the request to mark the request. This way, the backend service can identify requests that are processed by WAF.</p>
         */
        @NameInMap("RequestHeaders")
        public java.util.List<CreateDomainRequestRedirectRequestHeaders> requestHeaders;

        /**
         * <p>Specifies whether WAF retries if WAF fails to forward requests to the origin server. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default)</li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Retry")
        public Boolean retry;

        /**
         * <p>The forwarding rules for the hybrid cloud mode. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:</p>
         * <ul>
         * <li><strong>rs</strong>: the back-to-origin IP addresses or CNAMEs. Data type: array.</li>
         * <li><strong>location</strong>: the name of the protection node. Data type: string.</li>
         * <li><strong>locationId</strong>: the ID of the protection node. Data type: long.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;rs&quot;: [
         *                   &quot;1.1.XX.XX&quot;
         *             ],
         *             &quot;locationId&quot;: 535,
         *             &quot;location&quot;: &quot;test1111&quot;
         *       }
         * ]</p>
         */
        @NameInMap("RoutingRules")
        public String routingRules;

        /**
         * <p>Specifies whether to enable the Server Name Indication (SNI) feature for back-to-origin requests. This parameter is available only if you specify <strong>HttpsPorts</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SniEnabled")
        public Boolean sniEnabled;

        /**
         * <p>The custom value of the SNI field. If you do not specify this parameter, the value of the <strong>Host</strong> header field is automatically used. In most cases, you do not need to specify a custom value for the SNI field. However, if you want WAF to use an SNI field whose value is different from the value of the Host header field in back-to-origin requests, you can specify a custom value for the SNI field.</p>
         * <blockquote>
         * <p> This parameter is required only if you set <strong>SniEnabled</strong> to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        @NameInMap("SniHost")
        public String sniHost;

        @NameInMap("WLProxyClientIp")
        public Boolean WLProxyClientIp;

        @NameInMap("WebServerType")
        public Boolean webServerType;

        /**
         * <p>The timeout period of write connections. Unit: seconds. Valid values: 1 to 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("WriteTimeout")
        public Integer writeTimeout;

        @NameInMap("XClientIp")
        public Boolean XClientIp;

        @NameInMap("XTrueIp")
        public Boolean XTrueIp;

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

        public static CreateDomainRequestRedirect build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainRequestRedirect self = new CreateDomainRequestRedirect();
            return TeaModel.build(map, self);
        }

        public CreateDomainRequestRedirect setBackendPorts(java.util.List<CreateDomainRequestRedirectBackendPorts> backendPorts) {
            this.backendPorts = backendPorts;
            return this;
        }
        public java.util.List<CreateDomainRequestRedirectBackendPorts> getBackendPorts() {
            return this.backendPorts;
        }

        public CreateDomainRequestRedirect setBackends(java.util.List<String> backends) {
            this.backends = backends;
            return this;
        }
        public java.util.List<String> getBackends() {
            return this.backends;
        }

        public CreateDomainRequestRedirect setBackupBackends(java.util.List<String> backupBackends) {
            this.backupBackends = backupBackends;
            return this;
        }
        public java.util.List<String> getBackupBackends() {
            return this.backupBackends;
        }

        public CreateDomainRequestRedirect setCnameEnabled(Boolean cnameEnabled) {
            this.cnameEnabled = cnameEnabled;
            return this;
        }
        public Boolean getCnameEnabled() {
            return this.cnameEnabled;
        }

        public CreateDomainRequestRedirect setConnectTimeout(Integer connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }
        public Integer getConnectTimeout() {
            return this.connectTimeout;
        }

        public CreateDomainRequestRedirect setFocusHttpBackend(Boolean focusHttpBackend) {
            this.focusHttpBackend = focusHttpBackend;
            return this;
        }
        public Boolean getFocusHttpBackend() {
            return this.focusHttpBackend;
        }

        public CreateDomainRequestRedirect setHttp2Origin(Boolean http2Origin) {
            this.http2Origin = http2Origin;
            return this;
        }
        public Boolean getHttp2Origin() {
            return this.http2Origin;
        }

        public CreateDomainRequestRedirect setHttp2OriginMaxConcurrency(Integer http2OriginMaxConcurrency) {
            this.http2OriginMaxConcurrency = http2OriginMaxConcurrency;
            return this;
        }
        public Integer getHttp2OriginMaxConcurrency() {
            return this.http2OriginMaxConcurrency;
        }

        public CreateDomainRequestRedirect setKeepalive(Boolean keepalive) {
            this.keepalive = keepalive;
            return this;
        }
        public Boolean getKeepalive() {
            return this.keepalive;
        }

        public CreateDomainRequestRedirect setKeepaliveRequests(Integer keepaliveRequests) {
            this.keepaliveRequests = keepaliveRequests;
            return this;
        }
        public Integer getKeepaliveRequests() {
            return this.keepaliveRequests;
        }

        public CreateDomainRequestRedirect setKeepaliveTimeout(Integer keepaliveTimeout) {
            this.keepaliveTimeout = keepaliveTimeout;
            return this;
        }
        public Integer getKeepaliveTimeout() {
            return this.keepaliveTimeout;
        }

        public CreateDomainRequestRedirect setLoadbalance(String loadbalance) {
            this.loadbalance = loadbalance;
            return this;
        }
        public String getLoadbalance() {
            return this.loadbalance;
        }

        public CreateDomainRequestRedirect setMaxBodySize(Integer maxBodySize) {
            this.maxBodySize = maxBodySize;
            return this;
        }
        public Integer getMaxBodySize() {
            return this.maxBodySize;
        }

        public CreateDomainRequestRedirect setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }
        public Integer getReadTimeout() {
            return this.readTimeout;
        }

        public CreateDomainRequestRedirect setRequestHeaders(java.util.List<CreateDomainRequestRedirectRequestHeaders> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public java.util.List<CreateDomainRequestRedirectRequestHeaders> getRequestHeaders() {
            return this.requestHeaders;
        }

        public CreateDomainRequestRedirect setRetry(Boolean retry) {
            this.retry = retry;
            return this;
        }
        public Boolean getRetry() {
            return this.retry;
        }

        public CreateDomainRequestRedirect setRoutingRules(String routingRules) {
            this.routingRules = routingRules;
            return this;
        }
        public String getRoutingRules() {
            return this.routingRules;
        }

        public CreateDomainRequestRedirect setSniEnabled(Boolean sniEnabled) {
            this.sniEnabled = sniEnabled;
            return this;
        }
        public Boolean getSniEnabled() {
            return this.sniEnabled;
        }

        public CreateDomainRequestRedirect setSniHost(String sniHost) {
            this.sniHost = sniHost;
            return this;
        }
        public String getSniHost() {
            return this.sniHost;
        }

        public CreateDomainRequestRedirect setWLProxyClientIp(Boolean WLProxyClientIp) {
            this.WLProxyClientIp = WLProxyClientIp;
            return this;
        }
        public Boolean getWLProxyClientIp() {
            return this.WLProxyClientIp;
        }

        public CreateDomainRequestRedirect setWebServerType(Boolean webServerType) {
            this.webServerType = webServerType;
            return this;
        }
        public Boolean getWebServerType() {
            return this.webServerType;
        }

        public CreateDomainRequestRedirect setWriteTimeout(Integer writeTimeout) {
            this.writeTimeout = writeTimeout;
            return this;
        }
        public Integer getWriteTimeout() {
            return this.writeTimeout;
        }

        public CreateDomainRequestRedirect setXClientIp(Boolean XClientIp) {
            this.XClientIp = XClientIp;
            return this;
        }
        public Boolean getXClientIp() {
            return this.XClientIp;
        }

        public CreateDomainRequestRedirect setXTrueIp(Boolean XTrueIp) {
            this.XTrueIp = XTrueIp;
            return this;
        }
        public Boolean getXTrueIp() {
            return this.XTrueIp;
        }

        public CreateDomainRequestRedirect setXffProto(Boolean xffProto) {
            this.xffProto = xffProto;
            return this;
        }
        public Boolean getXffProto() {
            return this.xffProto;
        }

    }

    public static class CreateDomainRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>Tagkey1</p>
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

        public static CreateDomainRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainRequestTag self = new CreateDomainRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDomainRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDomainRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
