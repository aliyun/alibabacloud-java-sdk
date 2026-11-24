// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>439AADF2-368C-5E98-B14E-3086****0573</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The protected object information.</p>
     */
    @NameInMap("Resource")
    public DescribeDefenseResourceResponseBodyResource resource;

    public static DescribeDefenseResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourceResponseBody self = new DescribeDefenseResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefenseResourceResponseBody setResource(DescribeDefenseResourceResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public DescribeDefenseResourceResponseBodyResource getResource() {
        return this.resource;
    }

    public static class DescribeDefenseResourceResponseBodyResourceCookieConfig extends TeaModel {
        /**
         * <p>The SameSite policy for the slider cookie. Valid values:</p>
         * <ul>
         * <li><strong>None</strong>: None.</li>
         * <li><strong>Lax</strong>: Lax.</li>
         * <li><strong>Strict</strong>: Strict.<blockquote>
         * <p>An empty string indicates that the SameSite attribute is not set.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Lax</p>
         */
        @NameInMap("AcwScV3SameSite")
        public String acwScV3SameSite;

        /**
         * <p>The SameSite policy for the tracking cookie. Valid values:</p>
         * <ul>
         * <li><strong>None</strong>: None.</li>
         * <li><strong>Lax</strong>: Lax.</li>
         * <li><strong>Strict</strong>: Strict.<blockquote>
         * <p>An empty string indicates that the SameSite attribute is not set.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("AcwTcSameSite")
        public String acwTcSameSite;

        public static DescribeDefenseResourceResponseBodyResourceCookieConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseResourceResponseBodyResourceCookieConfig self = new DescribeDefenseResourceResponseBodyResourceCookieConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseResourceResponseBodyResourceCookieConfig setAcwScV3SameSite(String acwScV3SameSite) {
            this.acwScV3SameSite = acwScV3SameSite;
            return this;
        }
        public String getAcwScV3SameSite() {
            return this.acwScV3SameSite;
        }

        public DescribeDefenseResourceResponseBodyResourceCookieConfig setAcwTcSameSite(String acwTcSameSite) {
            this.acwTcSameSite = acwTcSameSite;
            return this;
        }
        public String getAcwTcSameSite() {
            return this.acwTcSameSite;
        }

    }

    public static class DescribeDefenseResourceResponseBodyResourceResponseHeaders extends TeaModel {
        /**
         * <p>The key of the specified custom response header.</p>
         * 
         * <strong>example:</strong>
         * <p>Header-Key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the specified custom response header.</p>
         * 
         * <strong>example:</strong>
         * <p>Header-Value</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDefenseResourceResponseBodyResourceResponseHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseResourceResponseBodyResourceResponseHeaders self = new DescribeDefenseResourceResponseBodyResourceResponseHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseResourceResponseBodyResourceResponseHeaders setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDefenseResourceResponseBodyResourceResponseHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDefenseResourceResponseBodyResource extends TeaModel {
        /**
         * <p>The enabling status of the tracking cookie.</p>
         * <ul>
         * <li><p><strong>0</strong>: disabled.</p>
         * </li>
         * <li><p><strong>1</strong>: enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AcwCookieStatus")
        public Integer acwCookieStatus;

        /**
         * <p>The status of the Secure attribute for the tracking cookie.</p>
         * <ul>
         * <li><p><strong>0</strong>: disabled.</p>
         * </li>
         * <li><p><strong>1</strong>: enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AcwSecureStatus")
        public Integer acwSecureStatus;

        /**
         * <p>The status of the Secure attribute for the slider cookie.</p>
         * <ul>
         * <li><p><strong>0</strong>: disabled.</p>
         * </li>
         * <li><p><strong>1</strong>: enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AcwV3SecureStatus")
        public Integer acwV3SecureStatus;

        /**
         * <p>The cookie attribute aggregation configuration.</p>
         */
        @NameInMap("CookieConfig")
        public DescribeDefenseResourceResponseBodyResourceCookieConfig cookieConfig;

        /**
         * <p>The list of specified header fields.</p>
         * <blockquote>
         * <p>When XffStatus is set to 1, the first IP address in the specified header field is used as the originating IP address of the client to prevent XFF spoofing. If multiple headers are specified, the system attempts to obtain the originating IP address in sequence. If the first header does not contain an IP address, the system checks the second header, and so on. If no IP address is found in any of the specified headers, the first IP address in the X-Forwarded-For header is used. When XffStatus is set to 1, the first IP address is extracted.</p>
         * </blockquote>
         */
        @NameInMap("CustomHeaders")
        public java.util.List<String> customHeaders;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The detailed description of the protected object. Different key-value pairs in the map represent different attributes of the protected object.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         * &quot;product&quot;: &quot;waf&quot;,
         *  &quot;domain&quot;: &quot;demo.aliyundoc****.com&quot;
         * }</p>
         */
        @NameInMap("Detail")
        public java.util.Map<String, ?> detail;

        /**
         * <p>The time when the protected object was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1607493144000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The time when the protected object was modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1691720010000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The WAF instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v2_public_cn-wwo****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The owner UID of the protected object.</p>
         * 
         * <strong>example:</strong>
         * <p>170457******9107</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <p>The protection mode of the protected object.</p>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>The name of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>alb</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The name of the protected object.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-rencs***</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The name of the protected object group to which the protected object is added.</p>
         * 
         * <strong>example:</strong>
         * <p>example_resource_group</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmoiy****p2oq</p>
         */
        @NameInMap("ResourceManagerResourceGroupId")
        public String resourceManagerResourceGroupId;

        /**
         * <p>The source of the protected object. Valid values:</p>
         * <ul>
         * <li><p><strong>custom</strong>: the protected object created from the Provisioning page.</p>
         * </li>
         * <li><p><strong>access</strong>: the protected object created by the user.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("ResourceOrigin")
        public String resourceOrigin;

        /**
         * <p>The status of the protected object. Valid values:</p>
         * <ul>
         * <li><p><strong>initializing</strong>: default protection is being initialized.</p>
         * </li>
         * <li><p><strong>active</strong>: running normally.</p>
         * </li>
         * <li><p><strong>init_failed</strong>: default protection initialization failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("ResourceStatus")
        public String resourceStatus;

        /**
         * <p>The response header parameters.</p>
         */
        @NameInMap("ResponseHeaders")
        public java.util.List<DescribeDefenseResourceResponseBodyResourceResponseHeaders> responseHeaders;

        /**
         * <p>Specifies whether a Layer 7 proxy, such as Anti-DDoS or CDN, is enabled before WAF. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: disabled.</p>
         * </li>
         * <li><p><strong>1</strong>: enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("XffStatus")
        public Integer xffStatus;

        public static DescribeDefenseResourceResponseBodyResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseResourceResponseBodyResource self = new DescribeDefenseResourceResponseBodyResource();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseResourceResponseBodyResource setAcwCookieStatus(Integer acwCookieStatus) {
            this.acwCookieStatus = acwCookieStatus;
            return this;
        }
        public Integer getAcwCookieStatus() {
            return this.acwCookieStatus;
        }

        public DescribeDefenseResourceResponseBodyResource setAcwSecureStatus(Integer acwSecureStatus) {
            this.acwSecureStatus = acwSecureStatus;
            return this;
        }
        public Integer getAcwSecureStatus() {
            return this.acwSecureStatus;
        }

        public DescribeDefenseResourceResponseBodyResource setAcwV3SecureStatus(Integer acwV3SecureStatus) {
            this.acwV3SecureStatus = acwV3SecureStatus;
            return this;
        }
        public Integer getAcwV3SecureStatus() {
            return this.acwV3SecureStatus;
        }

        public DescribeDefenseResourceResponseBodyResource setCookieConfig(DescribeDefenseResourceResponseBodyResourceCookieConfig cookieConfig) {
            this.cookieConfig = cookieConfig;
            return this;
        }
        public DescribeDefenseResourceResponseBodyResourceCookieConfig getCookieConfig() {
            return this.cookieConfig;
        }

        public DescribeDefenseResourceResponseBodyResource setCustomHeaders(java.util.List<String> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }
        public java.util.List<String> getCustomHeaders() {
            return this.customHeaders;
        }

        public DescribeDefenseResourceResponseBodyResource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDefenseResourceResponseBodyResource setDetail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
        }

        public DescribeDefenseResourceResponseBodyResource setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDefenseResourceResponseBodyResource setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDefenseResourceResponseBodyResource setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDefenseResourceResponseBodyResource setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public DescribeDefenseResourceResponseBodyResource setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public DescribeDefenseResourceResponseBodyResource setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeDefenseResourceResponseBodyResource setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeDefenseResourceResponseBodyResource setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public DescribeDefenseResourceResponseBodyResource setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }
        public String getResourceManagerResourceGroupId() {
            return this.resourceManagerResourceGroupId;
        }

        public DescribeDefenseResourceResponseBodyResource setResourceOrigin(String resourceOrigin) {
            this.resourceOrigin = resourceOrigin;
            return this;
        }
        public String getResourceOrigin() {
            return this.resourceOrigin;
        }

        public DescribeDefenseResourceResponseBodyResource setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public DescribeDefenseResourceResponseBodyResource setResponseHeaders(java.util.List<DescribeDefenseResourceResponseBodyResourceResponseHeaders> responseHeaders) {
            this.responseHeaders = responseHeaders;
            return this;
        }
        public java.util.List<DescribeDefenseResourceResponseBodyResourceResponseHeaders> getResponseHeaders() {
            return this.responseHeaders;
        }

        public DescribeDefenseResourceResponseBodyResource setXffStatus(Integer xffStatus) {
            this.xffStatus = xffStatus;
            return this;
        }
        public Integer getXffStatus() {
            return this.xffStatus;
        }

    }

}
