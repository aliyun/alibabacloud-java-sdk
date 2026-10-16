// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class MoveResourcesRequest extends TeaModel {
    /**
     * <p>The ID of the destination resource group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzmeobk5w****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of resources to move.</p>
     * <blockquote>
     * <p>A maximum of 10 resources can be moved at a time. Move resources in batches if you have more than 10.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
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
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-23v38****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type.</p>
         * <p>You can obtain the value from the <strong>Resource Type</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Cloud services that support resource groups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The cloud service code.</p>
         * <p>You can obtain the value from the <strong>Cloud Service Code</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Cloud services that support resource groups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
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
