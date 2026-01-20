// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceShareAssociationsResponseBody extends TeaModel {
    /**
     * <p>The <code>token</code> that is used to initiate the next request if the response of the current request is truncated. You can use the token to initiate another request and obtain the remaining records.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cm****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>11BA57B5-7301-4E2F-BBA5-2AE4C2F4FCDB</p>
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
        /**
         * <p>This parameter is deprecated. The OperationType parameter is used instead.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("AssociateType")
        public String associateType;

        /**
         * <p>The ID of the entity. The value of this parameter depends on the value of the AssociationType parameter:</p>
         * <ul>
         * <li>If the value of AssociationType is Resource, the value of this parameter is the ID of the principal.</li>
         * <li>If the value of AssociationType is Target, the value of this parameter is the ID of the resource.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>172050525300****</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The type of the entity. The value of this parameter depends on the value of the AssociationType parameter:</p>
         * <ul>
         * <li>If the value of AssociationType is Resource, the value of this parameter is the type of the resource. For information about the types of resources that can be shared, see Services that work with Resource Sharing.</li>
         * <li>If the value of AssociationType is Target, the value of this parameter is <code>ResourceDirectory</code>, <code>Folder</code>, <code>Account</code>, or <code>Service</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Account</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The failure description.</p>
         * 
         * <strong>example:</strong>
         * <p>You cannot access the specified resource at this time.</p>
         */
        @NameInMap("FailureDescription")
        public String failureDescription;

        /**
         * <p>The failure cause. Valid values:</p>
         * <ul>
         * <li>Unavailable: The resource does not exist.</li>
         * <li>LimitExceeded: The number of principals for the resource exceeds the upper limit.</li>
         * <li>ZonalResourceInaccessible: The resource is unavailable in this region.</li>
         * <li>InternalError: An internal error occurred.</li>
         * <li>UnsupportedOperation: You cannot perform this operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unavailable</p>
         */
        @NameInMap("FailureReason")
        public String failureReason;

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li>Associate</li>
         * <li>Disassociate</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Associate</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("ResourceArn")
        public String resourceArn;

        /**
         * <p>This parameter is deprecated. The FailureReason parameter is used instead.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>This parameter is deprecated. The FailureDescription parameter is used instead.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
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

        public ListResourceShareAssociationsResponseBodyResourceShareAssociationsAssociationFailedDetails setFailureDescription(String failureDescription) {
            this.failureDescription = failureDescription;
            return this;
        }
        public String getFailureDescription() {
            return this.failureDescription;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociationsAssociationFailedDetails setFailureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }
        public String getFailureReason() {
            return this.failureReason;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociationsAssociationFailedDetails setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociationsAssociationFailedDetails setResourceArn(String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }
        public String getResourceArn() {
            return this.resourceArn;
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
        /**
         * <p>The information about the failure.</p>
         */
        @NameInMap("AssociationFailedDetails")
        public java.util.List<ListResourceShareAssociationsResponseBodyResourceShareAssociationsAssociationFailedDetails> associationFailedDetails;

        /**
         * <p>The association status. Valid values:</p>
         * <ul>
         * <li>Associating: The entity is being associated.</li>
         * <li>Associated: The entity is associated.</li>
         * <li>Failed: The entity fails to be associated.</li>
         * <li>Disassociating: The entity is being disassociated.</li>
         * <li>Disassociated: The entity is disassociated.</li>
         * </ul>
         * <blockquote>
         * <p> The system deletes the records of entities in the <code>Failed</code> or <code>Disassociated</code> state within 48 hours to 96 hours.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Associated</p>
         */
        @NameInMap("AssociationStatus")
        public String associationStatus;

        /**
         * <p>The cause of the association failure.</p>
         * 
         * <strong>example:</strong>
         * <p>The reason for the association failure.</p>
         */
        @NameInMap("AssociationStatusMessage")
        public String associationStatusMessage;

        /**
         * <p>The association type. Valid values:</p>
         * <ul>
         * <li>Resource</li>
         * <li>Target</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Resource</p>
         */
        @NameInMap("AssociationType")
        public String associationType;

        /**
         * <p>The time when the association of the entity was created. The value of this parameter depends on the value of the AssociationType parameter:</p>
         * <ul>
         * <li>If the value of <code>AssociationType</code> is <code>Resource</code>, the value of this parameter is the time when the shared resource was associated with or disassociated from the resource share.</li>
         * <li>If the value of <code>AssociationType</code> is <code>Target</code>, the value of this parameter is the time when the principal was associated with or disassociated from the resource share.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2020-12-07T07:39:01.818Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the entity. The value of this parameter depends on the value of the AssociationType parameter:</p>
         * <ul>
         * <li>If the value of <code>AssociationType</code> is <code>Resource</code>, the value of this parameter is the ID of the resource.</li>
         * <li>If the value of <code>AssociationType</code> is <code>Target</code>, the value of this parameter is the ID of the principal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1upw03qyz8n7us9****</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The type of the entity. The value of this parameter depends on the value of the AssociationType parameter:</p>
         * <ul>
         * <li>If the value of AssociationType is Resource, the value of this parameter is the type of the resource. For information about the types of resources that can be shared, see <a href="https://help.aliyun.com/document_detail/450526.html">Services that work with Resource Sharing</a>.</li>
         * <li>If the value of AssociationType is Target, the value of this parameter is <code>Account</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VSwitch</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>Indicates whether the principal is outside the resource directory. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("External")
        public Boolean external;

        @NameInMap("ResourceArn")
        public String resourceArn;

        /**
         * <strong>example:</strong>
         * <p>{&quot;sharePrincipals&quot;:true,&quot;shareTagOptions&quot;:false}</p>
         */
        @NameInMap("ResourceProperty")
        public String resourceProperty;

        /**
         * <p>The ID of the resource share.</p>
         * 
         * <strong>example:</strong>
         * <p>rs-6GRmdD3X****</p>
         */
        @NameInMap("ResourceShareId")
        public String resourceShareId;

        /**
         * <p>The name of the resource share.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("ResourceShareName")
        public String resourceShareName;

        /**
         * <p>The properties of the principal, such as the time range within which the resource is shared. Valid values of <code>timeRangeType</code>:</p>
         * <ul>
         * <li>timeRange: a specific time range</li>
         * <li>day: all day</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only if the principal is an Alibaba Cloud service.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;timeRange&quot;:{
         *         &quot;timeRangeType&quot;:&quot;timeRange&quot;,
         *         &quot;beginAtTime&quot;:&quot;00:00&quot;,
         *         &quot;timezone&quot;:&quot;UTC+8&quot;,
         *         &quot;endAtTime&quot;:&quot;19:59&quot;
         *     }
         * }</p>
         */
        @NameInMap("TargetProperty")
        public String targetProperty;

        /**
         * <p>The time when the association of the entity was updated. The value of this parameter depends on the value of the AssociationType parameter:</p>
         * <ul>
         * <li>If the value of <code>AssociationType</code> is <code>Resource</code>, the value of this parameter is the time when the association of the shared resource was updated.</li>
         * <li>If the value of <code>AssociationType</code> is <code>Target</code>, the value of this parameter is the time when the association of the principal was updated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2020-12-07T07:39:02.920Z</p>
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

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setResourceArn(String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }
        public String getResourceArn() {
            return this.resourceArn;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setResourceProperty(String resourceProperty) {
            this.resourceProperty = resourceProperty;
            return this;
        }
        public String getResourceProperty() {
            return this.resourceProperty;
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
