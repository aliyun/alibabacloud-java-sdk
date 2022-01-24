// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class DisassociateResourceShareResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceShareAssociations")
    public java.util.List<DisassociateResourceShareResponseBodyResourceShareAssociations> resourceShareAssociations;

    public static DisassociateResourceShareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisassociateResourceShareResponseBody self = new DisassociateResourceShareResponseBody();
        return TeaModel.build(map, self);
    }

    public DisassociateResourceShareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisassociateResourceShareResponseBody setResourceShareAssociations(java.util.List<DisassociateResourceShareResponseBodyResourceShareAssociations> resourceShareAssociations) {
        this.resourceShareAssociations = resourceShareAssociations;
        return this;
    }
    public java.util.List<DisassociateResourceShareResponseBodyResourceShareAssociations> getResourceShareAssociations() {
        return this.resourceShareAssociations;
    }

    public static class DisassociateResourceShareResponseBodyResourceShareAssociations extends TeaModel {
        @NameInMap("AssociationStatus")
        public String associationStatus;

        @NameInMap("AssociationStatusMessage")
        public String associationStatusMessage;

        @NameInMap("AssociationType")
        public String associationType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("ResourceShareId")
        public String resourceShareId;

        @NameInMap("ResourceShareName")
        public String resourceShareName;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static DisassociateResourceShareResponseBodyResourceShareAssociations build(java.util.Map<String, ?> map) throws Exception {
            DisassociateResourceShareResponseBodyResourceShareAssociations self = new DisassociateResourceShareResponseBodyResourceShareAssociations();
            return TeaModel.build(map, self);
        }

        public DisassociateResourceShareResponseBodyResourceShareAssociations setAssociationStatus(String associationStatus) {
            this.associationStatus = associationStatus;
            return this;
        }
        public String getAssociationStatus() {
            return this.associationStatus;
        }

        public DisassociateResourceShareResponseBodyResourceShareAssociations setAssociationStatusMessage(String associationStatusMessage) {
            this.associationStatusMessage = associationStatusMessage;
            return this;
        }
        public String getAssociationStatusMessage() {
            return this.associationStatusMessage;
        }

        public DisassociateResourceShareResponseBodyResourceShareAssociations setAssociationType(String associationType) {
            this.associationType = associationType;
            return this;
        }
        public String getAssociationType() {
            return this.associationType;
        }

        public DisassociateResourceShareResponseBodyResourceShareAssociations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DisassociateResourceShareResponseBodyResourceShareAssociations setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public DisassociateResourceShareResponseBodyResourceShareAssociations setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public DisassociateResourceShareResponseBodyResourceShareAssociations setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public DisassociateResourceShareResponseBodyResourceShareAssociations setResourceShareName(String resourceShareName) {
            this.resourceShareName = resourceShareName;
            return this;
        }
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        public DisassociateResourceShareResponseBodyResourceShareAssociations setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
