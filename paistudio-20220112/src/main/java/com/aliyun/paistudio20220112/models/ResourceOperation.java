// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ResourceOperation extends TeaModel {
    /**
     * <p>The ID of the creator of the resource change.</p>
     * 
     * <strong>example:</strong>
     * <p>1884692****</p>
     */
    @NameInMap("CreatorId")
    public String creatorId;

    /**
     * <p>The time when the resource change was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("GmtCreatedTime")
    public String gmtCreatedTime;

    /**
     * <p>The time when the resource change ended.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:02:00Z</p>
     */
    @NameInMap("GmtEndTime")
    public String gmtEndTime;

    /**
     * <p>The time when the resource change was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-07-10T11:49:47Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The time when the resource change started.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:01:00Z</p>
     */
    @NameInMap("GmtStartTime")
    public String gmtStartTime;

    /**
     * <p>The object ID of the resource change.</p>
     * 
     * <strong>example:</strong>
     * <p>quotaxxx</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The object type of the resource change.</p>
     * 
     * <strong>example:</strong>
     * <p>Quota</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The description of the resource change.</p>
     * 
     * <strong>example:</strong>
     * <p>A user requests to change the Desired Capacity from 4 to 5.</p>
     */
    @NameInMap("OperationDescription")
    public String operationDescription;

    /**
     * <p>The resource change ID.</p>
     * 
     * <strong>example:</strong>
     * <p>operation-123</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>The details of the resource change.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ScaleQuota&quot;:{&quot;Min&quot;:{&quot;NodeSpecs&quot;:[{&quot;Type&quot;:&quot;ecs.gn6i-c8g1.2xlarge&quot;,&quot;Count&quot;:20,&quot;IncludeNodes&quot;:[&quot;A&quot;,&quot;B&quot;,&quot;C&quot;],&quot;ExcludeNodes&quot;:[&quot;D&quot;]}]}}}</p>
     */
    @NameInMap("OperationSpecJson")
    public String operationSpecJson;

    /**
     * <p>The type of the resource change.</p>
     * 
     * <strong>example:</strong>
     * <p>ScaleQuota</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("ReasonCode")
    public String reasonCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    /**
     * <p>The status of the resource change.</p>
     * 
     * <strong>example:</strong>
     * <p>Executing</p>
     */
    @NameInMap("Status")
    public String status;

    public static ResourceOperation build(java.util.Map<String, ?> map) throws Exception {
        ResourceOperation self = new ResourceOperation();
        return TeaModel.build(map, self);
    }

    public ResourceOperation setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public ResourceOperation setGmtCreatedTime(String gmtCreatedTime) {
        this.gmtCreatedTime = gmtCreatedTime;
        return this;
    }
    public String getGmtCreatedTime() {
        return this.gmtCreatedTime;
    }

    public ResourceOperation setGmtEndTime(String gmtEndTime) {
        this.gmtEndTime = gmtEndTime;
        return this;
    }
    public String getGmtEndTime() {
        return this.gmtEndTime;
    }

    public ResourceOperation setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public ResourceOperation setGmtStartTime(String gmtStartTime) {
        this.gmtStartTime = gmtStartTime;
        return this;
    }
    public String getGmtStartTime() {
        return this.gmtStartTime;
    }

    public ResourceOperation setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public ResourceOperation setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public ResourceOperation setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
        return this;
    }
    public String getOperationDescription() {
        return this.operationDescription;
    }

    public ResourceOperation setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public ResourceOperation setOperationSpecJson(String operationSpecJson) {
        this.operationSpecJson = operationSpecJson;
        return this;
    }
    public String getOperationSpecJson() {
        return this.operationSpecJson;
    }

    public ResourceOperation setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public ResourceOperation setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public ResourceOperation setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public ResourceOperation setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
