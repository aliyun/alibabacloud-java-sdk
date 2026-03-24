// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourcesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>618F2626-DB27-5187-8C6C-4E61A491****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of protected objects.</p>
     */
    @NameInMap("Resources")
    public java.util.List<DescribeDefenseResourcesResponseBodyResources> resources;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>73</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDefenseResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourcesResponseBody self = new DescribeDefenseResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefenseResourcesResponseBody setResources(java.util.List<DescribeDefenseResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<DescribeDefenseResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public DescribeDefenseResourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDefenseResourcesResponseBodyResourcesResponseHeaders extends TeaModel {
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

        public static DescribeDefenseResourcesResponseBodyResourcesResponseHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseResourcesResponseBodyResourcesResponseHeaders self = new DescribeDefenseResourcesResponseBodyResourcesResponseHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseResourcesResponseBodyResourcesResponseHeaders setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDefenseResourcesResponseBodyResourcesResponseHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDefenseResourcesResponseBodyResources extends TeaModel {
        /**
         * <p>Indicates whether the tracking cookie feature is enabled.</p>
         * <ul>
         * <li><p><strong>0</strong>: disabled.</p>
         * </li>
         * <li><p><strong>1</strong>: enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AcwCookieStatus")
        public Integer acwCookieStatus;

        /**
         * <p>Indicates whether the secure attribute of the tracking cookie is enabled.</p>
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
         * <p>Indicates whether the secure attribute of the slider CAPTCHA cookie is enabled.</p>
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
         * <p>The custom XFF header that is used to obtain the real IP address of a client. If \<code>XffStatus\\</code> is set to 1 and this parameter is left empty, the first IP address in the XFF header is used as the client IP address.</p>
         */
        @NameInMap("CustomHeaders")
        public java.util.List<String> customHeaders;

        /**
         * <p>The description of the protected object.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The details of the protected object. The key-value pairs vary by product type.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;domain&quot;:&quot;eou.eleme.cn&quot;,&quot;uri&quot;:&quot;/&quot;}</p>
         */
        @NameInMap("Detail")
        public java.util.Map<String, ?> detail;

        /**
         * <p>The time when the protected object was created. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652149203187</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The time when the protected object was modified. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1665633032000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The ID of the WAF instance.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v2_public_cn-k*****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The account to which the asset of the protected object belongs. This parameter is returned in a multi-account management scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>135*********46</p>
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
         * <p>The type of cloud service to which the protected object belongs.</p>
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
         * <p>test</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        @NameInMap("ResourceManagerResourceGroupId")
        public String resourceManagerResourceGroupId;

        /**
         * <p>The source of the protected object.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("ResourceOrigin")
        public String resourceOrigin;

        /**
         * <p>The custom response headers configured for the protected object.</p>
         */
        @NameInMap("ResponseHeaders")
        public java.util.List<DescribeDefenseResourcesResponseBodyResourcesResponseHeaders> responseHeaders;

        /**
         * <p>Indicates whether the X-Forwarded-For (XFF) proxy is enabled for the protected object.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("XffStatus")
        public Integer xffStatus;

        public static DescribeDefenseResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseResourcesResponseBodyResources self = new DescribeDefenseResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseResourcesResponseBodyResources setAcwCookieStatus(Integer acwCookieStatus) {
            this.acwCookieStatus = acwCookieStatus;
            return this;
        }
        public Integer getAcwCookieStatus() {
            return this.acwCookieStatus;
        }

        public DescribeDefenseResourcesResponseBodyResources setAcwSecureStatus(Integer acwSecureStatus) {
            this.acwSecureStatus = acwSecureStatus;
            return this;
        }
        public Integer getAcwSecureStatus() {
            return this.acwSecureStatus;
        }

        public DescribeDefenseResourcesResponseBodyResources setAcwV3SecureStatus(Integer acwV3SecureStatus) {
            this.acwV3SecureStatus = acwV3SecureStatus;
            return this;
        }
        public Integer getAcwV3SecureStatus() {
            return this.acwV3SecureStatus;
        }

        public DescribeDefenseResourcesResponseBodyResources setCustomHeaders(java.util.List<String> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }
        public java.util.List<String> getCustomHeaders() {
            return this.customHeaders;
        }

        public DescribeDefenseResourcesResponseBodyResources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDefenseResourcesResponseBodyResources setDetail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
        }

        public DescribeDefenseResourcesResponseBodyResources setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDefenseResourcesResponseBodyResources setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDefenseResourcesResponseBodyResources setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDefenseResourcesResponseBodyResources setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public DescribeDefenseResourcesResponseBodyResources setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public DescribeDefenseResourcesResponseBodyResources setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeDefenseResourcesResponseBodyResources setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeDefenseResourcesResponseBodyResources setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public DescribeDefenseResourcesResponseBodyResources setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }
        public String getResourceManagerResourceGroupId() {
            return this.resourceManagerResourceGroupId;
        }

        public DescribeDefenseResourcesResponseBodyResources setResourceOrigin(String resourceOrigin) {
            this.resourceOrigin = resourceOrigin;
            return this;
        }
        public String getResourceOrigin() {
            return this.resourceOrigin;
        }

        public DescribeDefenseResourcesResponseBodyResources setResponseHeaders(java.util.List<DescribeDefenseResourcesResponseBodyResourcesResponseHeaders> responseHeaders) {
            this.responseHeaders = responseHeaders;
            return this;
        }
        public java.util.List<DescribeDefenseResourcesResponseBodyResourcesResponseHeaders> getResponseHeaders() {
            return this.responseHeaders;
        }

        public DescribeDefenseResourcesResponseBodyResources setXffStatus(Integer xffStatus) {
            this.xffStatus = xffStatus;
            return this;
        }
        public Integer getXffStatus() {
            return this.xffStatus;
        }

    }

}
