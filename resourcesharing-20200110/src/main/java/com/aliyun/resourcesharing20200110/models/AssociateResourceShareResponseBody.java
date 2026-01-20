// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class AssociateResourceShareResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>111FB84A-60A9-403E-9067-E55D7EE95BD1</p>
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
         * <p>Associating</p>
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
         * <li>If the value of <code>AssociationType</code> is <code>Resource</code>, the value of this parameter is the time when the shared resource was associated with the resource share.</li>
         * <li>If the value of <code>AssociationType</code> is <code>Target</code>, the value of this parameter is the time when the principal was associated with the resource share.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2020-12-04T09:40:41.246Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the entity. The value of this parameter depends on the value of the AssociationType parameter:</p>
         * <ul>
         * <li>If the value of <code>AssociationType</code> is <code>Resource</code>, the value of this parameter is the ID of the shared resource.</li>
         * <li>If the value of <code>AssociationType</code> is <code>Target</code>, the value of this parameter is the ID of the principal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp183p93qs667muql****</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The type of the entity. The value of this parameter depends on the value of the AssociationType parameter:</p>
         * <ul>
         * <li>If the value of AssociationType is Resource, the value of this parameter is the type of the shared resource. For information about the types of resources that can be shared, see <a href="https://help.aliyun.com/document_detail/450526.html">Services that work with Resource Sharing</a>.</li>
         * <li>If the value of AssociationType is Target, the value of this parameter is <code>Account</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VSwitch</p>
         */
        @NameInMap("EntityType")
        public String entityType;

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
         * <p>test</p>
         */
        @NameInMap("ResourceShareName")
        public String resourceShareName;

        /**
         * <p>The properties of the principal, such as the time range within which the resource is shared.</p>
         * <blockquote>
         * <p> This parameter is returned only if the principal is an Alibaba Cloud service.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;plan&quot;:{
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
         * <p>2020-12-04T09:40:41.246Z</p>
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

        public AssociateResourceShareResponseBodyResourceShareAssociations setResourceArn(String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }
        public String getResourceArn() {
            return this.resourceArn;
        }

        public AssociateResourceShareResponseBodyResourceShareAssociations setResourceProperty(String resourceProperty) {
            this.resourceProperty = resourceProperty;
            return this;
        }
        public String getResourceProperty() {
            return this.resourceProperty;
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
