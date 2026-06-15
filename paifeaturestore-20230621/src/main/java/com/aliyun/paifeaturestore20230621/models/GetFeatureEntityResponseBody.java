// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetFeatureEntityResponseBody extends TeaModel {
    /**
     * <p>The time when the feature entity was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The join ID used to associate with a feature view.</p>
     * 
     * <strong>example:</strong>
     * <p>user_id</p>
     */
    @NameInMap("JoinId")
    public String joinId;

    /**
     * <p>The name of the feature entity.</p>
     * 
     * <strong>example:</strong>
     * <p>feature_entity_1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The Alibaba Cloud account ID of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789*****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The ID of the parent feature entity. An empty value or 0 indicates a root feature entity.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ParentFeatureEntityId")
    public String parentFeatureEntityId;

    /**
     * <p>The name of the parent feature entity.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("ParentFeatureEntityName")
    public String parentFeatureEntityName;

    /**
     * <p>The join ID of the parent feature entity.</p>
     * 
     * <strong>example:</strong>
     * <p>user_id</p>
     */
    @NameInMap("ParentJoinId")
    public String parentJoinId;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The name of the project.</p>
     * 
     * <strong>example:</strong>
     * <p>project_1</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E23EFF09-58AA-5420-934F-8453AE01548D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFeatureEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureEntityResponseBody self = new GetFeatureEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFeatureEntityResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetFeatureEntityResponseBody setJoinId(String joinId) {
        this.joinId = joinId;
        return this;
    }
    public String getJoinId() {
        return this.joinId;
    }

    public GetFeatureEntityResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetFeatureEntityResponseBody setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public GetFeatureEntityResponseBody setParentFeatureEntityId(String parentFeatureEntityId) {
        this.parentFeatureEntityId = parentFeatureEntityId;
        return this;
    }
    public String getParentFeatureEntityId() {
        return this.parentFeatureEntityId;
    }

    public GetFeatureEntityResponseBody setParentFeatureEntityName(String parentFeatureEntityName) {
        this.parentFeatureEntityName = parentFeatureEntityName;
        return this;
    }
    public String getParentFeatureEntityName() {
        return this.parentFeatureEntityName;
    }

    public GetFeatureEntityResponseBody setParentJoinId(String parentJoinId) {
        this.parentJoinId = parentJoinId;
        return this;
    }
    public String getParentJoinId() {
        return this.parentJoinId;
    }

    public GetFeatureEntityResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetFeatureEntityResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetFeatureEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
