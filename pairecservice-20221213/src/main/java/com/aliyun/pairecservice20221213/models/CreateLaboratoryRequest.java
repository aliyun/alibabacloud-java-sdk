// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateLaboratoryRequest extends TeaModel {
    @NameInMap("BucketCount")
    public Integer bucketCount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BucketType")
    public String bucketType;

    @NameInMap("Buckets")
    public String buckets;

    @NameInMap("DebugCrowdId")
    public String debugCrowdId;

    @NameInMap("DebugUsers")
    public String debugUsers;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Environment")
    public String environment;

    @NameInMap("Filter")
    public String filter;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateLaboratoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLaboratoryRequest self = new CreateLaboratoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateLaboratoryRequest setBucketCount(Integer bucketCount) {
        this.bucketCount = bucketCount;
        return this;
    }
    public Integer getBucketCount() {
        return this.bucketCount;
    }

    public CreateLaboratoryRequest setBucketType(String bucketType) {
        this.bucketType = bucketType;
        return this;
    }
    public String getBucketType() {
        return this.bucketType;
    }

    public CreateLaboratoryRequest setBuckets(String buckets) {
        this.buckets = buckets;
        return this;
    }
    public String getBuckets() {
        return this.buckets;
    }

    public CreateLaboratoryRequest setDebugCrowdId(String debugCrowdId) {
        this.debugCrowdId = debugCrowdId;
        return this;
    }
    public String getDebugCrowdId() {
        return this.debugCrowdId;
    }

    public CreateLaboratoryRequest setDebugUsers(String debugUsers) {
        this.debugUsers = debugUsers;
        return this;
    }
    public String getDebugUsers() {
        return this.debugUsers;
    }

    public CreateLaboratoryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLaboratoryRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public CreateLaboratoryRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public CreateLaboratoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateLaboratoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLaboratoryRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public CreateLaboratoryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
