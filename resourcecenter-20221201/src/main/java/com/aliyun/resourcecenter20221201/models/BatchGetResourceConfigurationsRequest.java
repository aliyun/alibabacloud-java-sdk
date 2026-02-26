// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class BatchGetResourceConfigurationsRequest extends TeaModel {
    /**
     * <p>The list of resources.</p>
     */
    @NameInMap("Resources")
    public java.util.List<BatchGetResourceConfigurationsRequestResources> resources;

    public static BatchGetResourceConfigurationsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetResourceConfigurationsRequest self = new BatchGetResourceConfigurationsRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetResourceConfigurationsRequest setResources(java.util.List<BatchGetResourceConfigurationsRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<BatchGetResourceConfigurationsRequestResources> getResources() {
        return this.resources;
    }

    public static class BatchGetResourceConfigurationsRequestResources extends TeaModel {
        /**
         * <p>The region ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bp1kyg72m****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type.</p>
         * <p>For a list of resource types supported by Resource Center, see <a href="https://help.aliyun.com/document_detail/477798.html">Alibaba Cloud services and resource types that are supported by Resource Center</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::VPC::RouteTable</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static BatchGetResourceConfigurationsRequestResources build(java.util.Map<String, ?> map) throws Exception {
            BatchGetResourceConfigurationsRequestResources self = new BatchGetResourceConfigurationsRequestResources();
            return TeaModel.build(map, self);
        }

        public BatchGetResourceConfigurationsRequestResources setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public BatchGetResourceConfigurationsRequestResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public BatchGetResourceConfigurationsRequestResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
