// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkelinkflowLinkflowProcessRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("CandidateUserId")
    public String candidateUserId;

    @NameInMap("Current")
    public String current;

    @NameInMap("DefinitionKey")
    public String definitionKey;

    @NameInMap("Finished")
    public String finished;

    @NameInMap("Id")
    public String id;

    @NameInMap("IncludeVariables")
    public String includeVariables;

    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("StageId")
    public String stageId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Type")
    public String type;

    @NameInMap("UserId")
    public String userId;

    public static QueryLinkelinkflowLinkflowProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkelinkflowLinkflowProcessRequest self = new QueryLinkelinkflowLinkflowProcessRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkelinkflowLinkflowProcessRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkelinkflowLinkflowProcessRequest setCandidateUserId(String candidateUserId) {
        this.candidateUserId = candidateUserId;
        return this;
    }
    public String getCandidateUserId() {
        return this.candidateUserId;
    }

    public QueryLinkelinkflowLinkflowProcessRequest setCurrent(String current) {
        this.current = current;
        return this;
    }
    public String getCurrent() {
        return this.current;
    }

    public QueryLinkelinkflowLinkflowProcessRequest setDefinitionKey(String definitionKey) {
        this.definitionKey = definitionKey;
        return this;
    }
    public String getDefinitionKey() {
        return this.definitionKey;
    }

    public QueryLinkelinkflowLinkflowProcessRequest setFinished(String finished) {
        this.finished = finished;
        return this;
    }
    public String getFinished() {
        return this.finished;
    }

    public QueryLinkelinkflowLinkflowProcessRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkelinkflowLinkflowProcessRequest setIncludeVariables(String includeVariables) {
        this.includeVariables = includeVariables;
        return this;
    }
    public String getIncludeVariables() {
        return this.includeVariables;
    }

    public QueryLinkelinkflowLinkflowProcessRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public QueryLinkelinkflowLinkflowProcessRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryLinkelinkflowLinkflowProcessRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryLinkelinkflowLinkflowProcessRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public QueryLinkelinkflowLinkflowProcessRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryLinkelinkflowLinkflowProcessRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryLinkelinkflowLinkflowProcessRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryLinkelinkflowLinkflowProcessRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryLinkelinkflowLinkflowProcessRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
