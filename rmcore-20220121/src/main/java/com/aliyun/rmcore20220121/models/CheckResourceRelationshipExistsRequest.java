// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class CheckResourceRelationshipExistsRequest extends TeaModel {
    @NameInMap("SourceResource")
    public CheckResourceRelationshipExistsRequestSourceResource sourceResource;

    @NameInMap("TargetResource")
    public CheckResourceRelationshipExistsRequestTargetResource targetResource;

    public static CheckResourceRelationshipExistsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceRelationshipExistsRequest self = new CheckResourceRelationshipExistsRequest();
        return TeaModel.build(map, self);
    }

    public CheckResourceRelationshipExistsRequest setSourceResource(CheckResourceRelationshipExistsRequestSourceResource sourceResource) {
        this.sourceResource = sourceResource;
        return this;
    }
    public CheckResourceRelationshipExistsRequestSourceResource getSourceResource() {
        return this.sourceResource;
    }

    public CheckResourceRelationshipExistsRequest setTargetResource(CheckResourceRelationshipExistsRequestTargetResource targetResource) {
        this.targetResource = targetResource;
        return this;
    }
    public CheckResourceRelationshipExistsRequestTargetResource getTargetResource() {
        return this.targetResource;
    }

    public static class CheckResourceRelationshipExistsRequestSourceResource extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        public static CheckResourceRelationshipExistsRequestSourceResource build(java.util.Map<String, ?> map) throws Exception {
            CheckResourceRelationshipExistsRequestSourceResource self = new CheckResourceRelationshipExistsRequestSourceResource();
            return TeaModel.build(map, self);
        }

        public CheckResourceRelationshipExistsRequestSourceResource setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public CheckResourceRelationshipExistsRequestSourceResource setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CheckResourceRelationshipExistsRequestSourceResource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CheckResourceRelationshipExistsRequestSourceResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CheckResourceRelationshipExistsRequestSourceResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class CheckResourceRelationshipExistsRequestTargetResource extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        public static CheckResourceRelationshipExistsRequestTargetResource build(java.util.Map<String, ?> map) throws Exception {
            CheckResourceRelationshipExistsRequestTargetResource self = new CheckResourceRelationshipExistsRequestTargetResource();
            return TeaModel.build(map, self);
        }

        public CheckResourceRelationshipExistsRequestTargetResource setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public CheckResourceRelationshipExistsRequestTargetResource setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CheckResourceRelationshipExistsRequestTargetResource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CheckResourceRelationshipExistsRequestTargetResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CheckResourceRelationshipExistsRequestTargetResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
