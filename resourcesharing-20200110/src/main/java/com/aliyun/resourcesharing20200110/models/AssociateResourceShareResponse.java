// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class AssociateResourceShareResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResourceShareAssociations")
    @Validation(required = true)
    public java.util.List<AssociateResourceShareResponseResourceShareAssociations> resourceShareAssociations;

    public static AssociateResourceShareResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateResourceShareResponse self = new AssociateResourceShareResponse();
        return TeaModel.build(map, self);
    }

    public AssociateResourceShareResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssociateResourceShareResponse setResourceShareAssociations(java.util.List<AssociateResourceShareResponseResourceShareAssociations> resourceShareAssociations) {
        this.resourceShareAssociations = resourceShareAssociations;
        return this;
    }
    public java.util.List<AssociateResourceShareResponseResourceShareAssociations> getResourceShareAssociations() {
        return this.resourceShareAssociations;
    }

    public static class AssociateResourceShareResponseResourceShareAssociations extends TeaModel {
        @NameInMap("ResourceShareId")
        @Validation(required = true)
        public String resourceShareId;

        @NameInMap("ResourceShareName")
        @Validation(required = true)
        public String resourceShareName;

        @NameInMap("AssociationType")
        @Validation(required = true)
        public String associationType;

        @NameInMap("EntityId")
        @Validation(required = true)
        public String entityId;

        @NameInMap("EntityType")
        @Validation(required = true)
        public String entityType;

        @NameInMap("AssociationStatus")
        @Validation(required = true)
        public String associationStatus;

        @NameInMap("AssociationStatusMessage")
        @Validation(required = true)
        public String associationStatusMessage;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        public static AssociateResourceShareResponseResourceShareAssociations build(java.util.Map<String, ?> map) throws Exception {
            AssociateResourceShareResponseResourceShareAssociations self = new AssociateResourceShareResponseResourceShareAssociations();
            return TeaModel.build(map, self);
        }

        public AssociateResourceShareResponseResourceShareAssociations setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public AssociateResourceShareResponseResourceShareAssociations setResourceShareName(String resourceShareName) {
            this.resourceShareName = resourceShareName;
            return this;
        }
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        public AssociateResourceShareResponseResourceShareAssociations setAssociationType(String associationType) {
            this.associationType = associationType;
            return this;
        }
        public String getAssociationType() {
            return this.associationType;
        }

        public AssociateResourceShareResponseResourceShareAssociations setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public AssociateResourceShareResponseResourceShareAssociations setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public AssociateResourceShareResponseResourceShareAssociations setAssociationStatus(String associationStatus) {
            this.associationStatus = associationStatus;
            return this;
        }
        public String getAssociationStatus() {
            return this.associationStatus;
        }

        public AssociateResourceShareResponseResourceShareAssociations setAssociationStatusMessage(String associationStatusMessage) {
            this.associationStatusMessage = associationStatusMessage;
            return this;
        }
        public String getAssociationStatusMessage() {
            return this.associationStatusMessage;
        }

        public AssociateResourceShareResponseResourceShareAssociations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public AssociateResourceShareResponseResourceShareAssociations setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
