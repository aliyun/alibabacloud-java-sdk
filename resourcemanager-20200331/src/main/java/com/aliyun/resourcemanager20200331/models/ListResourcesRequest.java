// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListResourcesRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the resource.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type.</p>
     * <br>
     * <p>For more information about the supported resource types, see the **Resource type** column in [Services that work with Resource Group](~~94479~~).</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The resource types. A maximum of 50 resource types are supported.</p>
     * <br>
     * <p>>  If you configure `ResourceTypes`, you must configure both `Service` and `ResourceType`. Otherwise, the configured Service or ResourceType does not take effect.</p>
     */
    @NameInMap("ResourceTypes")
    public java.util.List<ListResourcesRequestResourceTypes> resourceTypes;

    /**
     * <p>The ID of the Alibaba Cloud service.</p>
     * <br>
     * <p>You can obtain the ID from the **Service code** column in [Services that work with Resource Group](~~94479~~).</p>
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
         * <br>
         * <p>Valid values of N: 1 to 50.</p>
         * <br>
         * <p>For more information about the supported resource types, see the **Resource type** column in [Services that work with Resource Group](~~94479~~).</p>
         * <br>
         * <p>>  You must configure both `Service` and `ResourceType` in `ResourceTypes`. Otherwise, the two parameters do not take effect.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the Alibaba Cloud service.</p>
         * <br>
         * <p>Valid values of N: 1 to 50.</p>
         * <br>
         * <p>You can obtain the ID from the **Service code** column in [Services that work with Resource Group](~~94479~~).</p>
         * <br>
         * <p>>  You must configure both `Service` and `ResourceType` in `ResourceTypes`. Otherwise, the two parameters do not take effect.</p>
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
