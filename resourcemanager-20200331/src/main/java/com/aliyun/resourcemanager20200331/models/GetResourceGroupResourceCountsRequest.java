// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetResourceGroupResourceCountsRequest extends TeaModel {
    /**
     * <p>The grouping dimension for resource count statistics.</p>
     * <blockquote>
     * <p>Specify a grouping dimension. If you do not specify this parameter, the returned result is empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ResourceGroupId</p>
     */
    @NameInMap("GroupByKey")
    public String groupByKey;

    /**
     * <p>The ID of the resource group.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2716558.html">ListResourceGroups</a> operation to obtain the resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-9gLOoK****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The region where the resource resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    /**
     * <p>The list of resource types.</p>
     */
    @NameInMap("ResourceTypes")
    public java.util.List<GetResourceGroupResourceCountsRequestResourceTypes> resourceTypes;

    public static GetResourceGroupResourceCountsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupResourceCountsRequest self = new GetResourceGroupResourceCountsRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupResourceCountsRequest setGroupByKey(String groupByKey) {
        this.groupByKey = groupByKey;
        return this;
    }
    public String getGroupByKey() {
        return this.groupByKey;
    }

    public GetResourceGroupResourceCountsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetResourceGroupResourceCountsRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public GetResourceGroupResourceCountsRequest setResourceTypes(java.util.List<GetResourceGroupResourceCountsRequestResourceTypes> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<GetResourceGroupResourceCountsRequestResourceTypes> getResourceTypes() {
        return this.resourceTypes;
    }

    public static class GetResourceGroupResourceCountsRequestResourceTypes extends TeaModel {
        /**
         * <p>The resource type.</p>
         * <p>You can obtain the value from the <strong>Resource type</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Cloud services that support resource groups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("ResourceTypeCode")
        public String resourceTypeCode;

        /**
         * <p>The cloud service code.</p>
         * <p>You can obtain the value from the <strong>Cloud service code</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Cloud services that support resource groups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Service")
        public String service;

        public static GetResourceGroupResourceCountsRequestResourceTypes build(java.util.Map<String, ?> map) throws Exception {
            GetResourceGroupResourceCountsRequestResourceTypes self = new GetResourceGroupResourceCountsRequestResourceTypes();
            return TeaModel.build(map, self);
        }

        public GetResourceGroupResourceCountsRequestResourceTypes setResourceTypeCode(String resourceTypeCode) {
            this.resourceTypeCode = resourceTypeCode;
            return this;
        }
        public String getResourceTypeCode() {
            return this.resourceTypeCode;
        }

        public GetResourceGroupResourceCountsRequestResourceTypes setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

    }

}
