// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class AssociateResourceShareResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the entities that are associated with the resource share.</p>
     */
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
        /**
         * <p>The association status. Valid values:</p>
         * <br>
         * <p>*   Associating: The entity is being associated.</p>
         * <p>*   Associated: The entity is associated.</p>
         * <p>*   Failed: The entity fails to be associated.</p>
         * <p>*   Disassociating: The entity is being disassociated.</p>
         * <p>*   Disassociated: The entity is disassociated.</p>
         * <br>
         * <p>>  The system deletes the records of entities in the `Failed` or `Disassociated` state within 48 hours to 96 hours.</p>
         */
        @NameInMap("AssociationStatus")
        public String associationStatus;

        /**
         * <p>The cause of the association failure.</p>
         */
        @NameInMap("AssociationStatusMessage")
        public String associationStatusMessage;

        /**
         * <p>The association type. Valid values:</p>
         * <br>
         * <p>*   Resource</p>
         * <p>*   Target</p>
         */
        @NameInMap("AssociationType")
        public String associationType;

        /**
         * <p>The time when the association of the entity was created. The value of this parameter depends on the value of the AssociationType parameter:</p>
         * <br>
         * <p>*   If the value of `AssociationType` is `Resource`, the value of this parameter is the time when the shared resource was associated with the resource share.</p>
         * <p>*   If the value of `AssociationType` is `Target`, the value of this parameter is the time when the principal was associated with the resource share.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the entity. The value of this parameter depends on the value of the AssociationType parameter:</p>
         * <br>
         * <p>*   If the value of `AssociationType` is `Resource`, the value of this parameter is the ID of the shared resource.</p>
         * <p>*   If the value of `AssociationType` is `Target`, the value of this parameter is the ID of the principal.</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The type of the entity. The value of this parameter depends on the value of the AssociationType parameter:</p>
         * <br>
         * <p>*   If the value of AssociationType is Resource, the value of this parameter is the type of the shared resource. For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](~~450526~~).</p>
         * <p>*   If the value of AssociationType is Target, the value of this parameter is `Account`.</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The ID of the resource share.</p>
         */
        @NameInMap("ResourceShareId")
        public String resourceShareId;

        /**
         * <p>The name of the resource share.</p>
         */
        @NameInMap("ResourceShareName")
        public String resourceShareName;

        @NameInMap("TargetProperty")
        public String targetProperty;

        /**
         * <p>The time when the association of the entity was updated. The value of this parameter depends on the value of the AssociationType parameter:</p>
         * <br>
         * <p>*   If the value of `AssociationType` is `Resource`, the value of this parameter is the time when the association of the shared resource was updated.</p>
         * <p>*   If the value of `AssociationType` is `Target`, the value of this parameter is the time when the association of the principal was updated.</p>
         */
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

        public AssociateResourceShareResponseBodyResourceShareAssociations setTargetProperty(String targetProperty) {
            this.targetProperty = targetProperty;
            return this;
        }
        public String getTargetProperty() {
            return this.targetProperty;
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
