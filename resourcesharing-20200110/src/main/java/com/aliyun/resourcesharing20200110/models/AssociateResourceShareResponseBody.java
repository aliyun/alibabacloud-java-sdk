// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class AssociateResourceShareResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceShareAssociations")
    public java.util.List<AssociateResourceShareResponseBodyResourceShareAssociations> resourceShareAssociations;

    public static AssociateResourceShareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateResourceShareResponseBody self = new AssociateResourceShareResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateResourceShareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssociateResourceShareResponseBody setResourceShareAssociations(java.util.List<AssociateResourceShareResponseBodyResourceShareAssociations> resourceShareAssociations) {
        this.resourceShareAssociations = resourceShareAssociations;
        return this;
    }
    public java.util.List<AssociateResourceShareResponseBodyResourceShareAssociations> getResourceShareAssociations() {
        return this.resourceShareAssociations;
    }

    public static class AssociateResourceShareResponseBodyResourceShareAssociations extends TeaModel {
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

        public static AssociateResourceShareResponseBodyResourceShareAssociations build(java.util.Map<String, ?> map) throws Exception {
            AssociateResourceShareResponseBodyResourceShareAssociations self = new AssociateResourceShareResponseBodyResourceShareAssociations();
            return TeaModel.build(map, self);
        }

        public AssociateResourceShareResponseBodyResourceShareAssociations setAssociationStatus(String associationStatus) {
            this.associationStatus = associationStatus;
            return this;
        }
        public String getAssociationStatus() {
            return this.associationStatus;
        }

        public AssociateResourceShareResponseBodyResourceShareAssociations setAssociationStatusMessage(String associationStatusMessage) {
            this.associationStatusMessage = associationStatusMessage;
            return this;
        }
        public String getAssociationStatusMessage() {
            return this.associationStatusMessage;
        }

        public AssociateResourceShareResponseBodyResourceShareAssociations setAssociationType(String associationType) {
            this.associationType = associationType;
            return this;
        }
        public String getAssociationType() {
            return this.associationType;
        }

        public AssociateResourceShareResponseBodyResourceShareAssociations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public AssociateResourceShareResponseBodyResourceShareAssociations setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public AssociateResourceShareResponseBodyResourceShareAssociations setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public AssociateResourceShareResponseBodyResourceShareAssociations setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public AssociateResourceShareResponseBodyResourceShareAssociations setResourceShareName(String resourceShareName) {
            this.resourceShareName = resourceShareName;
            return this;
        }
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        public AssociateResourceShareResponseBodyResourceShareAssociations setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
