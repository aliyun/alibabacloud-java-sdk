// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourcesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>618F2626-DB27-5187-8C6C-4E61A491DF29</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The protected objects.</p>
     */
    @NameInMap("Resources")
    public java.util.List<DescribeDefenseResourcesResponseBodyResources> resources;

    /**
     * <p>The total number of entries that are returned.</p>
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

    public static class DescribeDefenseResourcesResponseBodyResources extends TeaModel {
        /**
         * <p>The status of the tracking cookie.</p>
         * <ul>
         * <li><strong>0:</strong> disabled.</li>
         * <li><strong>1:</strong> enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AcwCookieStatus")
        public Integer acwCookieStatus;

        /**
         * <p>The status of the secure attribute in the tracking cookie.</p>
         * <ul>
         * <li><strong>0:</strong> disabled.</li>
         * <li><strong>1:</strong> enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AcwSecureStatus")
        public Integer acwSecureStatus;

        /**
         * <p>The status of the secure attribute in the slider CAPTCHA cookie.</p>
         * <ul>
         * <li><strong>0:</strong> disabled.</li>
         * <li><strong>1:</strong> enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AcwV3SecureStatus")
        public Integer acwV3SecureStatus;

        /**
         * <p>The custom XFF headers that are used to identify the originating IP addresses of clients. If the value of XffStatus is 1 and CustomHeaders is left empty, the first IP addresses in the XFF headers are used as the originating IP addresses of clients.</p>
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
         * <p>The details of the protected object. Different key-value pairs indicate different attributes of the protected object.</p>
         */
        @NameInMap("Detail")
        public java.util.Map<String, ?> detail;

        /**
         * <p>The time when the protected object was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652149203187</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The time when the protected object was modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1665633032000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>135*********46</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <p>The pattern in which the protected object is protected.</p>
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
         * <p>The name of the protected object group to which the protected object belongs.</p>
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
         * <p>The origin of the protected object.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("ResourceOrigin")
        public String resourceOrigin;

        /**
         * <p>Indicates whether the X-Forwarded-For (XFF) proxy is enabled.</p>
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

        public DescribeDefenseResourcesResponseBodyResources setXffStatus(Integer xffStatus) {
            this.xffStatus = xffStatus;
            return this;
        }
        public Integer getXffStatus() {
            return this.xffStatus;
        }

    }

}
