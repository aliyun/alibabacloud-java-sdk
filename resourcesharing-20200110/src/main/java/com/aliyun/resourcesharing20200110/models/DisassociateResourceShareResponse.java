// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class DisassociateResourceShareResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResourceShareAssociations")
    @Validation(required = true)
    public java.util.List<DisassociateResourceShareResponseResourceShareAssociations> resourceShareAssociations;

    public static DisassociateResourceShareResponse build(java.util.Map<String, ?> map) throws Exception {
        DisassociateResourceShareResponse self = new DisassociateResourceShareResponse();
        return TeaModel.build(map, self);
    }

    public DisassociateResourceShareResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisassociateResourceShareResponse setResourceShareAssociations(java.util.List<DisassociateResourceShareResponseResourceShareAssociations> resourceShareAssociations) {
        this.resourceShareAssociations = resourceShareAssociations;
        return this;
    }
    public java.util.List<DisassociateResourceShareResponseResourceShareAssociations> getResourceShareAssociations() {
        return this.resourceShareAssociations;
    }

    public static class DisassociateResourceShareResponseResourceShareAssociations extends TeaModel {
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

        public static DisassociateResourceShareResponseResourceShareAssociations build(java.util.Map<String, ?> map) throws Exception {
            DisassociateResourceShareResponseResourceShareAssociations self = new DisassociateResourceShareResponseResourceShareAssociations();
            return TeaModel.build(map, self);
        }

        public DisassociateResourceShareResponseResourceShareAssociations setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public DisassociateResourceShareResponseResourceShareAssociations setResourceShareName(String resourceShareName) {
            this.resourceShareName = resourceShareName;
            return this;
        }
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        public DisassociateResourceShareResponseResourceShareAssociations setAssociationType(String associationType) {
            this.associationType = associationType;
            return this;
        }
        public String getAssociationType() {
            return this.associationType;
        }

        public DisassociateResourceShareResponseResourceShareAssociations setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public DisassociateResourceShareResponseResourceShareAssociations setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public DisassociateResourceShareResponseResourceShareAssociations setAssociationStatus(String associationStatus) {
            this.associationStatus = associationStatus;
            return this;
        }
        public String getAssociationStatus() {
            return this.associationStatus;
        }

        public DisassociateResourceShareResponseResourceShareAssociations setAssociationStatusMessage(String associationStatusMessage) {
            this.associationStatusMessage = associationStatusMessage;
            return this;
        }
        public String getAssociationStatusMessage() {
            return this.associationStatusMessage;
        }

        public DisassociateResourceShareResponseResourceShareAssociations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DisassociateResourceShareResponseResourceShareAssociations setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
