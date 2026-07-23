// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetLaboratoryResponseBody extends TeaModel {
    /**
     * <p>The number of buckets.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("BucketCount")
    public Integer bucketCount;

    /**
     * <p>The bucketing method. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>Filter</p>
     */
    @NameInMap("BucketType")
    public String bucketType;

    /**
     * <p>The assigned buckets.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3,10-20</p>
     */
    @NameInMap("Buckets")
    public String buckets;

    /**
     * <p>The crowd ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CrowdId")
    public String crowdId;

    /**
     * <p>The debug crowd ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DebugCrowdId")
    public String debugCrowdId;

    /**
     * <p>The debug users.</p>
     * 
     * <strong>example:</strong>
     * <p>user1,user2,user3</p>
     */
    @NameInMap("DebugUsers")
    public String debugUsers;

    /**
     * <p>The laboratory description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The environment. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>The filter.</p>
     * 
     * <strong>example:</strong>
     * <p>filter=xxx</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The laboratory name.</p>
     * 
     * <strong>example:</strong>
     * <p>laboratory1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1C0898E5-9220-5443-B2D9-445FF0688215</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scene ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>The status of the laboratory. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>Offline</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The laboratory type. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>Base</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetLaboratoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLaboratoryResponseBody self = new GetLaboratoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLaboratoryResponseBody setBucketCount(Integer bucketCount) {
        this.bucketCount = bucketCount;
        return this;
    }
    public Integer getBucketCount() {
        return this.bucketCount;
    }

    public GetLaboratoryResponseBody setBucketType(String bucketType) {
        this.bucketType = bucketType;
        return this;
    }
    public String getBucketType() {
        return this.bucketType;
    }

    public GetLaboratoryResponseBody setBuckets(String buckets) {
        this.buckets = buckets;
        return this;
    }
    public String getBuckets() {
        return this.buckets;
    }

    public GetLaboratoryResponseBody setCrowdId(String crowdId) {
        this.crowdId = crowdId;
        return this;
    }
    public String getCrowdId() {
        return this.crowdId;
    }

    public GetLaboratoryResponseBody setDebugCrowdId(String debugCrowdId) {
        this.debugCrowdId = debugCrowdId;
        return this;
    }
    public String getDebugCrowdId() {
        return this.debugCrowdId;
    }

    public GetLaboratoryResponseBody setDebugUsers(String debugUsers) {
        this.debugUsers = debugUsers;
        return this;
    }
    public String getDebugUsers() {
        return this.debugUsers;
    }

    public GetLaboratoryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetLaboratoryResponseBody setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public GetLaboratoryResponseBody setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public GetLaboratoryResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetLaboratoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLaboratoryResponseBody setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public GetLaboratoryResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetLaboratoryResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
