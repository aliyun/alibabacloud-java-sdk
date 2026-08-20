// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseResourceXffRequest extends TeaModel {
    /**
     * <p>The status of the tracking cookie switch.</p>
     * <ul>
     * <li><p><strong>0</strong>: disabled.</p>
     * </li>
     * <li><p><strong>1 (default)</strong>: enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AcwCookieStatus")
    public Integer acwCookieStatus;

    /**
     * <p>The status of the secure attribute of the tracking cookie.</p>
     * <ul>
     * <li><p><strong>0 (default)</strong>: disabled.</p>
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
     * <p>The status of the secure attribute of the slider cookie.</p>
     * <ul>
     * <li><p><strong>0 (default)</strong>: disabled.</p>
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
     * <p>The list of specified header fields.</p>
     * <blockquote>
     * <p>The first IP address in the specified header field is used as the client source IP address to prevent XFF spoofing. If multiple headers are specified, the system attempts to obtain the source IP address from the headers in order. If the first header does not contain an IP address, the system tries the second header, and so on. If none of the specified headers contain an IP address, the first IP address in the X-Forwarded-For header is used.</p>
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
     * <p>The region where the WAF instance is deployed. Valid values:</p>
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
     * <p>The protected object must have been added to WAF. You can call the <a href="https://help.aliyun.com/document_detail/461612.html">DescribeDefenseResources</a> operation to query the name of the protected object.</p>
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
     * <p>Specifies whether a Layer 7 proxy (Anti-DDoS Pro, CDN, or similar) is deployed in front of WAF. Valid values:</p>
     * <ul>
     * <li><p><strong>0 (default)</strong>: No Layer 7 proxy is deployed.</p>
     * </li>
     * <li><p><strong>1</strong>: A Layer 7 proxy is deployed.</p>
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

    public static class ModifyDefenseResourceXffRequestResponseHeaders extends TeaModel {
        /**
         * <p>The key of the custom response header.</p>
         * 
         * <strong>example:</strong>
         * <p>Header-Key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the custom response header.</p>
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
