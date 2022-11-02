// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.List<DescribeDefenseResourcesResponseBodyResources> resources;

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
        @NameInMap("CustomHeaders")
        public java.util.List<String> customHeaders;

        @NameInMap("Description")
        public String description;

        @NameInMap("Detail")
        public java.util.Map<String, ?> detail;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Pattern")
        public String pattern;

        @NameInMap("Product")
        public String product;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("ResourceGroup")
        public String resourceGroup;

        @NameInMap("ResourceOrigin")
        public String resourceOrigin;

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
