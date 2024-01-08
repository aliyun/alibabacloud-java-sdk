// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceShareAssociationsResponseBody extends TeaModel {
    /**
     * <p>The `token` that is used to initiate the next request. If the response of the current request is truncated, you can use the token to initiate another request and obtain the remaining records.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the entities.</p>
     */
    @NameInMap("ResourceShareAssociations")
    public java.util.List<ListResourceShareAssociationsResponseBodyResourceShareAssociations> resourceShareAssociations;

    public static ListResourceShareAssociationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceShareAssociationsResponseBody self = new ListResourceShareAssociationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceShareAssociationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceShareAssociationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceShareAssociationsResponseBody setResourceShareAssociations(java.util.List<ListResourceShareAssociationsResponseBodyResourceShareAssociations> resourceShareAssociations) {
        this.resourceShareAssociations = resourceShareAssociations;
        return this;
    }
    public java.util.List<ListResourceShareAssociationsResponseBodyResourceShareAssociations> getResourceShareAssociations() {
        return this.resourceShareAssociations;
    }

    public static class ListResourceShareAssociationsResponseBodyResourceShareAssociationsAssociationFailedDetails extends TeaModel {
        @NameInMap("AssociateType")
        public String associateType;

        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusMessage")
        public String statusMessage;

        public static ListResourceShareAssociationsResponseBodyResourceShareAssociationsAssociationFailedDetails build(java.util.Map<String, ?> map) throws Exception {
            ListResourceShareAssociationsResponseBodyResourceShareAssociationsAssociationFailedDetails self = new ListResourceShareAssociationsResponseBodyResourceShareAssociationsAssociationFailedDetails();
            return TeaModel.build(map, self);
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociationsAssociationFailedDetails setAssociateType(String associateType) {
            this.associateType = associateType;
            return this;
        }
        public String getAssociateType() {
            return this.associateType;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociationsAssociationFailedDetails setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociationsAssociationFailedDetails setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociationsAssociationFailedDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociationsAssociationFailedDetails setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

    }

    public static class ListResourceShareAssociationsResponseBodyResourceShareAssociations extends TeaModel {
        @NameInMap("AssociationFailedDetails")
        public java.util.List<ListResourceShareAssociationsResponseBodyResourceShareAssociationsAssociationFailedDetails> associationFailedDetails;

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
         * <p>*   If the value of `AssociationType` is `Resource`, the value of this parameter is the time when the shared resource was associated with or disassociated from the resource share.</p>
         * <p>*   If the value of `AssociationType` is `Target`, the value of this parameter is the time when the principal was associated with or disassociated from the resource share.</p>
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
         * <p>*   If the value of AssociationType is Resource, the value of this parameter is the type of the resource. For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](~~450526~~).</p>
         * <p>*   If the value of AssociationType is Target, the value of this parameter is `Account`.</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>Indicates whether the principal is outside the resource directory. Valid values:</p>
         * <br>
         * <p>*   true: The principal is outside the resource directory.</p>
         * <p>*   false: The principal is in the resource directory.</p>
         */
        @NameInMap("External")
        public Boolean external;

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

        public static ListResourceShareAssociationsResponseBodyResourceShareAssociations build(java.util.Map<String, ?> map) throws Exception {
            ListResourceShareAssociationsResponseBodyResourceShareAssociations self = new ListResourceShareAssociationsResponseBodyResourceShareAssociations();
            return TeaModel.build(map, self);
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setAssociationFailedDetails(java.util.List<ListResourceShareAssociationsResponseBodyResourceShareAssociationsAssociationFailedDetails> associationFailedDetails) {
            this.associationFailedDetails = associationFailedDetails;
            return this;
        }
        public java.util.List<ListResourceShareAssociationsResponseBodyResourceShareAssociationsAssociationFailedDetails> getAssociationFailedDetails() {
            return this.associationFailedDetails;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setAssociationStatus(String associationStatus) {
            this.associationStatus = associationStatus;
            return this;
        }
        public String getAssociationStatus() {
            return this.associationStatus;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setAssociationStatusMessage(String associationStatusMessage) {
            this.associationStatusMessage = associationStatusMessage;
            return this;
        }
        public String getAssociationStatusMessage() {
            return this.associationStatusMessage;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setAssociationType(String associationType) {
            this.associationType = associationType;
            return this;
        }
        public String getAssociationType() {
            return this.associationType;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setExternal(Boolean external) {
            this.external = external;
            return this;
        }
        public Boolean getExternal() {
            return this.external;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setResourceShareName(String resourceShareName) {
            this.resourceShareName = resourceShareName;
            return this;
        }
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setTargetProperty(String targetProperty) {
            this.targetProperty = targetProperty;
            return this;
        }
        public String getTargetProperty() {
            return this.targetProperty;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
