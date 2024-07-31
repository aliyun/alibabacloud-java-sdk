// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateCloudResourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Listen")
    public CreateCloudResourceRequestListen listen;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("OwnerUserId")
    public String ownerUserId;

    @NameInMap("Redirect")
    public CreateCloudResourceRequestRedirect redirect;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

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

    public static class CreateCloudResourceRequestListenCertificates extends TeaModel {
        @NameInMap("AppliedType")
        public String appliedType;

        /**
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
        @NameInMap("Certificates")
        public java.util.List<CreateCloudResourceRequestListenCertificates> certificates;

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
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableTLSv3")
        public Boolean enableTLSv3;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Http2Enabled")
        public Boolean http2Enabled;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1*****</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>clb4</p>
         */
        @NameInMap("ResourceProduct")
        public String resourceProduct;

        /**
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
         * <p>15</p>
         */
        @NameInMap("KeepaliveTimeout")
        public Integer keepaliveTimeout;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReadTimeout")
        public Integer readTimeout;

        @NameInMap("RequestHeaders")
        public java.util.List<CreateCloudResourceRequestRedirectRequestHeaders> requestHeaders;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WriteTimeout")
        public Integer writeTimeout;

        /**
         * <strong>example:</strong>
         * <p>1</p>
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

}
