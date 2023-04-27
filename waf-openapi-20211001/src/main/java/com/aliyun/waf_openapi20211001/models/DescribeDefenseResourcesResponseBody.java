// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourcesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array of protected objects.</p>
     */
    @NameInMap("Resources")
    public java.util.List<DescribeDefenseResourcesResponseBodyResources> resources;

    /**
     * <p>The total number of entries that are returned.</p>
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
         * <p>An array of custom XFF headers that are used to identify the originating IP addresses of clients. If the value of the XffStatus parameter is 1 and the CustomHeaders field is left empty, the first IP address in the XFF header is the originating IP address of the client.</p>
         */
        @NameInMap("CustomHeaders")
        public java.util.List<String> customHeaders;

        /**
         * <p>The description of the protected object.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The description of the protected object. Different key-value pairs in a map indicate different properties of the protected object.</p>
         */
        @NameInMap("Detail")
        public java.util.Map<String, ?> detail;

        /**
         * <p>The creation time of the protected object. Unit: seconds.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The most recent modification time of the protected object. Unit: seconds.</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The protection pattern.</p>
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
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceManagerResourceGroupId")
        public String resourceManagerResourceGroupId;

        /**
         * <p>The origin of the protected object.</p>
         */
        @NameInMap("ResourceOrigin")
        public String resourceOrigin;

        /**
         * <p>Indicates whether the X-Forwarded-For (XFF) header is used.</p>
         */
        @NameInMap("XffStatus")
        public Integer xffStatus;

        public static DescribeDefenseResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseResourcesResponseBodyResources self = new DescribeDefenseResourcesResponseBodyResources();
            return TeaModel.build(map, self);
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
