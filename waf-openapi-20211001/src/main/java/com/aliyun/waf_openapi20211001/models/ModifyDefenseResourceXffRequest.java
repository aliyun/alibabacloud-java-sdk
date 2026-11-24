// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseResourceXffRequest extends TeaModel {
    /**
     * <p>The status of the tracking cookie switch. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Disabled.</p>
     * </li>
     * <li><p><strong>1</strong> (default): Enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AcwCookieStatus")
    public Integer acwCookieStatus;

    /**
     * <p>The status of the Secure attribute for the tracking cookie. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong> (default): Disabled.</p>
     * </li>
     * <li><p><strong>1</strong>: Enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AcwSecureStatus")
    public Integer acwSecureStatus;

    /**
     * <p>The status of the Secure attribute for the slider cookie. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong> (default): Disabled.</p>
     * </li>
     * <li><p><strong>1</strong>: Enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AcwV3SecureStatus")
    public Integer acwV3SecureStatus;

    /**
     * <p>The aggregated configuration of cookie attributes.</p>
     */
    @NameInMap("CookieConfig")
    public ModifyDefenseResourceXffRequestCookieConfig cookieConfig;

    /**
     * <p>The list of specified header fields.</p>
     * <blockquote>
     * <p>The first IP address in the specified header field is used as the source IP address of the client to prevent X-Forwarded-For (XFF) spoofing. If multiple headers are specified, the system attempts to obtain the source IP address in sequence. If the first header does not contain an IP address, the system checks the second header, and so on. If no IP address is found in any of the specified headers, the first IP address in the X-Forwarded-For header is used.</p>
     * </blockquote>
     */
    @NameInMap("CustomHeaders")
    public java.util.List<String> customHeaders;

    /**
     * <p>Instance ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-wwo****ek07</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the protected object.</p>
     * <blockquote>
     * <p>The protected object must be added to WAF. You can call the <a href="https://help.aliyun.com/document_detail/461612.html">DescribeDefenseResources</a> operation to query the name of the protected object.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-4pxu81fgagx3h6y****-alb</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2ki****miwq</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The response header parameters.</p>
     */
    @NameInMap("ResponseHeaders")
    public java.util.List<ModifyDefenseResourceXffRequestResponseHeaders> responseHeaders;

    /**
     * <p>Specifies whether a Layer 7 proxy, such as Anti-DDoS or CDN, is enabled before WAF. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong> (default): The proxy is disabled.</p>
     * </li>
     * <li><p><strong>1</strong>: The proxy is enabled.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("XffStatus")
    public Integer xffStatus;

    public static ModifyDefenseResourceXffRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseResourceXffRequest self = new ModifyDefenseResourceXffRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseResourceXffRequest setAcwCookieStatus(Integer acwCookieStatus) {
        this.acwCookieStatus = acwCookieStatus;
        return this;
    }
    public Integer getAcwCookieStatus() {
        return this.acwCookieStatus;
    }

    public ModifyDefenseResourceXffRequest setAcwSecureStatus(Integer acwSecureStatus) {
        this.acwSecureStatus = acwSecureStatus;
        return this;
    }
    public Integer getAcwSecureStatus() {
        return this.acwSecureStatus;
    }

    public ModifyDefenseResourceXffRequest setAcwV3SecureStatus(Integer acwV3SecureStatus) {
        this.acwV3SecureStatus = acwV3SecureStatus;
        return this;
    }
    public Integer getAcwV3SecureStatus() {
        return this.acwV3SecureStatus;
    }

    public ModifyDefenseResourceXffRequest setCookieConfig(ModifyDefenseResourceXffRequestCookieConfig cookieConfig) {
        this.cookieConfig = cookieConfig;
        return this;
    }
    public ModifyDefenseResourceXffRequestCookieConfig getCookieConfig() {
        return this.cookieConfig;
    }

    public ModifyDefenseResourceXffRequest setCustomHeaders(java.util.List<String> customHeaders) {
        this.customHeaders = customHeaders;
        return this;
    }
    public java.util.List<String> getCustomHeaders() {
        return this.customHeaders;
    }

    public ModifyDefenseResourceXffRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDefenseResourceXffRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDefenseResourceXffRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public ModifyDefenseResourceXffRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ModifyDefenseResourceXffRequest setResponseHeaders(java.util.List<ModifyDefenseResourceXffRequestResponseHeaders> responseHeaders) {
        this.responseHeaders = responseHeaders;
        return this;
    }
    public java.util.List<ModifyDefenseResourceXffRequestResponseHeaders> getResponseHeaders() {
        return this.responseHeaders;
    }

    public ModifyDefenseResourceXffRequest setXffStatus(Integer xffStatus) {
        this.xffStatus = xffStatus;
        return this;
    }
    public Integer getXffStatus() {
        return this.xffStatus;
    }

    public static class ModifyDefenseResourceXffRequestCookieConfig extends TeaModel {
        /**
         * <p>The SameSite policy of the slider cookie. Valid values:</p>
         * <ul>
         * <li><p><strong>None</strong>: None.</p>
         * </li>
         * <li><p><strong>Lax</strong>: Lax.</p>
         * </li>
         * <li><p><strong>Strict</strong>: Strict.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>An empty string indicates that the SameSite attribute is not configured.<br>If the SameSite policy is set to None, the Secure attribute must be enabled for the cookie.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("AcwScV3SameSite")
        public String acwScV3SameSite;

        /**
         * <p>The SameSite policy of the tracking cookie. Valid values:</p>
         * <ul>
         * <li><p><strong>None</strong>: None.</p>
         * </li>
         * <li><p><strong>Lax</strong>: Lax.</p>
         * </li>
         * <li><p><strong>Strict</strong>: Strict.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>An empty string indicates that the SameSite attribute is not configured.<br>If the SameSite policy is set to None, the Secure attribute must be enabled for the cookie.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Lax</p>
         */
        @NameInMap("AcwTcSameSite")
        public String acwTcSameSite;

        public static ModifyDefenseResourceXffRequestCookieConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyDefenseResourceXffRequestCookieConfig self = new ModifyDefenseResourceXffRequestCookieConfig();
            return TeaModel.build(map, self);
        }

        public ModifyDefenseResourceXffRequestCookieConfig setAcwScV3SameSite(String acwScV3SameSite) {
            this.acwScV3SameSite = acwScV3SameSite;
            return this;
        }
        public String getAcwScV3SameSite() {
            return this.acwScV3SameSite;
        }

        public ModifyDefenseResourceXffRequestCookieConfig setAcwTcSameSite(String acwTcSameSite) {
            this.acwTcSameSite = acwTcSameSite;
            return this;
        }
        public String getAcwTcSameSite() {
            return this.acwTcSameSite;
        }

    }

    public static class ModifyDefenseResourceXffRequestResponseHeaders extends TeaModel {
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

        public static ModifyDefenseResourceXffRequestResponseHeaders build(java.util.Map<String, ?> map) throws Exception {
            ModifyDefenseResourceXffRequestResponseHeaders self = new ModifyDefenseResourceXffRequestResponseHeaders();
            return TeaModel.build(map, self);
        }

        public ModifyDefenseResourceXffRequestResponseHeaders setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyDefenseResourceXffRequestResponseHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
