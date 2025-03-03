// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListResourcesRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-uPJpP****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>i-23v38****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type.</p>
     * <p>For more information about the supported resource types, see the <strong>Resource type</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The resource types. A maximum of 50 resource types are supported.</p>
     * <blockquote>
     * <p> If you configure <code>ResourceTypes</code>, you must configure both <code>Service</code> and <code>ResourceType</code>. Otherwise, the configured Service or ResourceType does not take effect.</p>
     * </blockquote>
     */
    @NameInMap("ResourceTypes")
    public java.util.List<ListResourcesRequestResourceTypes> resourceTypes;

    /**
     * <p>The ID of the Alibaba Cloud service.</p>
     * <p>You can obtain the ID from the <strong>Service code</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Service")
    public String service;

    public static ListResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesRequest self = new ListResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListResourcesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourcesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListResourcesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListResourcesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListResourcesRequest setResourceTypes(java.util.List<ListResourcesRequestResourceTypes> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<ListResourcesRequestResourceTypes> getResourceTypes() {
        return this.resourceTypes;
    }

    public ListResourcesRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public static class ListResourcesRequestResourceTypes extends TeaModel {
        /**
         * <p>The resource type.</p>
         * <p>Valid values of N: 1 to 50.</p>
         * <p>For more information about the supported resource types, see the <strong>Resource type</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
         * <blockquote>
         * <p> You must configure both <code>Service</code> and <code>ResourceType</code> in <code>ResourceTypes</code>. Otherwise, the two parameters do not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the Alibaba Cloud service.</p>
         * <p>Valid values of N: 1 to 50.</p>
         * <p>You can obtain the ID from the <strong>Service code</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
         * <blockquote>
         * <p> You must configure both <code>Service</code> and <code>ResourceType</code> in <code>ResourceTypes</code>. Otherwise, the two parameters do not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Service")
        public String service;

        public static ListResourcesRequestResourceTypes build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesRequestResourceTypes self = new ListResourcesRequestResourceTypes();
            return TeaModel.build(map, self);
        }

        public ListResourcesRequestResourceTypes setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListResourcesRequestResourceTypes setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

    }

}
