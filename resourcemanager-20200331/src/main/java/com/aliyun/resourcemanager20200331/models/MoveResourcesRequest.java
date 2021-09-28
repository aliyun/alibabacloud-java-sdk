// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class MoveResourcesRequest extends TeaModel {
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Service")
        public String service;

        public static MoveResourcesRequestResources build(java.util.Map<String, ?> map) throws Exception {
            MoveResourcesRequestResources self = new MoveResourcesRequestResources();
            return TeaModel.build(map, self);
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

        public MoveResourcesRequestResources setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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
