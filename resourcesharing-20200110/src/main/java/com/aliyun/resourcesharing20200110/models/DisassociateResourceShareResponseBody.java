// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class DisassociateResourceShareResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the entities that are associated with the resource share.</p>
     */
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
         * <p>The cause of the disassociation failure.</p>
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
         * <p>The time when the disassociation of the entity was performed. The value of this parameter depends on the value of the AssociationType parameter:</p>
         * <br>
         * <p>*   If the value of `AssociationType` is `Resource`, the value of this parameter is the time when the resource was disassociated from the resource share.</p>
         * <p>*   If the value of `AssociationType` is `Target`, the value of this parameter is the time when the principal was disassociated from the resource share.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the entity. The value of this parameter depends on the value of the AssociationType parameter:</p>
         * <br>
         * <p>*   If the value of `AssociationType` is `Resource`, the value of this parameter is the ID of the resource.</p>
         * <p>*   If the value of `AssociationType` is `Target`, the value of this parameter is the ID of the resource directory, folder, or member.</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The type of the entity. The value of this parameter depends on the value of the AssociationType parameter:</p>
         * <br>
         * <p>*   If the value of AssociationType is Resource, the value of this parameter is the type of the resource. For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](~~450526~~).</p>
         * <p>*   If the value of AssociationType is Target, the value of this parameter is Account.</p>
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

        /**
         * <p>The time when the disassociation of the entity was updated. The value of this parameter depends on the value of the AssociationType parameter:</p>
         * <br>
         * <p>*   If the value of `AssociationType` is `Resource`, the value of this parameter is the time when the disassociation of the resource was updated.</p>
         * <p>*   If the value of `AssociationType` is `Target`, the value of this parameter is the time when the disassociation of the principal was updated.</p>
         */
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
