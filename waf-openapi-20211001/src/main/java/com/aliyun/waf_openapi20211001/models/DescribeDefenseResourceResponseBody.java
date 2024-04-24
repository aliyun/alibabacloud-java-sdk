// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the protected object.</p>
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

    public static class DescribeDefenseResourceResponseBodyResource extends TeaModel {
        /**
         * <p>The status of the tracking cookie.</p>
         * <br>
         * <p>*   **0**: disabled.</p>
         * <p>*   **1**: enabled.</p>
         */
        @NameInMap("AcwCookieStatus")
        public Integer acwCookieStatus;

        /**
         * <p>The status of the secure attribute of the tracking cookie.</p>
         * <br>
         * <p>*   **0**: disabled.</p>
         * <p>*   **1**: enabled.</p>
         */
        @NameInMap("AcwSecureStatus")
        public Integer acwSecureStatus;

        /**
         * <p>The status of the secure attribute of the slider CAPTCHA cookie.</p>
         * <br>
         * <p>*   **0**: disabled.</p>
         * <p>*   **1**: enabled.</p>
         */
        @NameInMap("AcwV3SecureStatus")
        public Integer acwV3SecureStatus;

        /**
         * <p>The custom header fields.</p>
         * <br>
         * <p>>  If the value of XffStatus is 1, the first IP address in the specified header field is used as the originating IP address of the client to prevent X-Forwarded-For (XFF) forgery. If you specify multiple header fields, WAF reads the values of the header fields in sequence until the originating IP address is obtained. If the originating IP address cannot be obtained, the first IP address in the XFF header field is used as the originating IP address of the client.</p>
         */
        @NameInMap("CustomHeaders")
        public java.util.List<String> customHeaders;

        /**
         * <p>The description of the protected object.</p>
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
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The time when the protected object was modified. Unit: milliseconds.</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The user ID (UID) of the Alibaba Cloud account to which the protected object belongs.</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <p>The pattern used for the protected object.</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>The name of the cloud service.</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The name of the protected object.</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The name of the protected object group to which the protected object belongs.</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <p>The ID of the Alibaba Cloud resource group.</p>
         */
        @NameInMap("ResourceManagerResourceGroupId")
        public String resourceManagerResourceGroupId;

        /**
         * <p>The origin of the protected object. Valid values:</p>
         * <br>
         * <p>*   **custom**</p>
         * <p>*   **access**</p>
         */
        @NameInMap("ResourceOrigin")
        public String resourceOrigin;

        /**
         * <p>Indicates whether a Layer 7 proxy is deployed in front of WAF, such as Anti-DDoS Proxy and Alibaba Cloud CDN. Valid values:</p>
         * <br>
         * <p>*   **0**: No Layer 7 proxy is deployed.</p>
         * <p>*   **1**: A Layer 7 proxy is deployed.</p>
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

        public DescribeDefenseResourceResponseBodyResource setXffStatus(Integer xffStatus) {
            this.xffStatus = xffStatus;
            return this;
        }
        public Integer getXffStatus() {
            return this.xffStatus;
        }

    }

}
