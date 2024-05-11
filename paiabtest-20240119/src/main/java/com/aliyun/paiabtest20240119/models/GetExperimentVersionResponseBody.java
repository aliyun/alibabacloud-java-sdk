// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class GetExperimentVersionResponseBody extends TeaModel {
    @NameInMap("Buckets")
    public String buckets;

    @NameInMap("Config")
    public String config;

    @NameInMap("CrowdIds")
    public String crowdIds;

    @NameInMap("DebugUsers")
    public String debugUsers;

    @NameInMap("Description")
    public String description;

    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("ExperimentVersionId")
    public String experimentVersionId;

    @NameInMap("Flow")
    public Integer flow;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Type")
    public String type;

    public static GetExperimentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentVersionResponseBody self = new GetExperimentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExperimentVersionResponseBody setBuckets(String buckets) {
        this.buckets = buckets;
        return this;
    }
    public String getBuckets() {
        return this.buckets;
    }

    public GetExperimentVersionResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetExperimentVersionResponseBody setCrowdIds(String crowdIds) {
        this.crowdIds = crowdIds;
        return this;
    }
    public String getCrowdIds() {
        return this.crowdIds;
    }

    public GetExperimentVersionResponseBody setDebugUsers(String debugUsers) {
        this.debugUsers = debugUsers;
        return this;
    }
    public String getDebugUsers() {
        return this.debugUsers;
    }

    public GetExperimentVersionResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetExperimentVersionResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public GetExperimentVersionResponseBody setExperimentVersionId(String experimentVersionId) {
        this.experimentVersionId = experimentVersionId;
        return this;
    }
    public String getExperimentVersionId() {
        return this.experimentVersionId;
    }

    public GetExperimentVersionResponseBody setFlow(Integer flow) {
        this.flow = flow;
        return this;
    }
    public Integer getFlow() {
        return this.flow;
    }

    public GetExperimentVersionResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetExperimentVersionResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetExperimentVersionResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetExperimentVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExperimentVersionResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
