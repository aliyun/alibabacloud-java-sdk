// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class MoveResourcesRequest extends TeaModel {
    /**
     * <p>The ID of the resource group to which you want to move the resources.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The resources that you want to move.</p>
     * <br>
     * <p>>  You can move a maximum of 10 resources at a time. If you want to move more than 10 resources, move them in batches.</p>
     */
    @NameInMap("Resources")
    public java.util.List<MoveResourcesRequestResources> resources;

    public static MoveResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveResourcesRequest self = new MoveResourcesRequest();
        return TeaModel.build(map, self);
    }

    public MoveResourcesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public MoveResourcesRequest setResources(java.util.List<MoveResourcesRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<MoveResourcesRequestResources> getResources() {
        return this.resources;
    }

    public static class MoveResourcesRequestResources extends TeaModel {
        /**
         * <p>The region ID of the resource.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the Alibaba Cloud service to which the resource belongs.</p>
         */
        @NameInMap("Service")
        public String service;

        public static MoveResourcesRequestResources build(java.util.Map<String, ?> map) throws Exception {
            MoveResourcesRequestResources self = new MoveResourcesRequestResources();
            return TeaModel.build(map, self);
        }

        public MoveResourcesRequestResources setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public MoveResourcesRequestResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public MoveResourcesRequestResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public MoveResourcesRequestResources setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

    }

}
