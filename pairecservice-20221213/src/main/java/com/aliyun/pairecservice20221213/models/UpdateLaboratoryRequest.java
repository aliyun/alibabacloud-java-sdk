// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateLaboratoryRequest extends TeaModel {
    /**
     * <p>The number of buckets.</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("BucketCount")
    public Integer bucketCount;

    /**
     * <p>The bucketing method. Valid values: ● Uid: Bucketing by UID (default). ● UidHash: Bucketing by UID hash. ● Filter: Bucketing by a filter condition.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Filter</p>
     */
    @NameInMap("BucketType")
    public String bucketType;

    /**
     * <p>The assigned bucket numbers.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3,10-20</p>
     */
    @NameInMap("Buckets")
    public String buckets;

    /**
     * <p>The debug crowd ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DebugCrowdId")
    public String debugCrowdId;

    /**
     * <p>The UIDs of debugging users. These UIDs must belong to an Alibaba Cloud main account or a sub-account. Separate multiple UIDs with a comma (,).</p>
     * 
     * <strong>example:</strong>
     * <p>1124512470******,1124512471******,1124512472******</p>
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
     * <p>The environment. Valid values: ● Daily: The daily environment. ● Pre: The staging environment. ● Prod: The production environment.</p>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>The filter condition.</p>
     * 
     * <strong>example:</strong>
     * <p>filter=xxx</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The instance ID. Call the ListInstances operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The laboratory name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>laboratory1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The laboratory type. Valid values: ● Base ● NonBase</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Base</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateLaboratoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLaboratoryRequest self = new UpdateLaboratoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLaboratoryRequest setBucketCount(Integer bucketCount) {
        this.bucketCount = bucketCount;
        return this;
    }
    public Integer getBucketCount() {
        return this.bucketCount;
    }

    public UpdateLaboratoryRequest setBucketType(String bucketType) {
        this.bucketType = bucketType;
        return this;
    }
    public String getBucketType() {
        return this.bucketType;
    }

    public UpdateLaboratoryRequest setBuckets(String buckets) {
        this.buckets = buckets;
        return this;
    }
    public String getBuckets() {
        return this.buckets;
    }

    public UpdateLaboratoryRequest setDebugCrowdId(String debugCrowdId) {
        this.debugCrowdId = debugCrowdId;
        return this;
    }
    public String getDebugCrowdId() {
        return this.debugCrowdId;
    }

    public UpdateLaboratoryRequest setDebugUsers(String debugUsers) {
        this.debugUsers = debugUsers;
        return this;
    }
    public String getDebugUsers() {
        return this.debugUsers;
    }

    public UpdateLaboratoryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLaboratoryRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public UpdateLaboratoryRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public UpdateLaboratoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateLaboratoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLaboratoryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
