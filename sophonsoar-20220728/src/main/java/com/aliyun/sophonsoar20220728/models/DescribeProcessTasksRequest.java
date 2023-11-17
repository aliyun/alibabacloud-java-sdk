// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeProcessTasksRequest extends TeaModel {
    @NameInMap("Direction")
    public String direction;

    @NameInMap("EntityName")
    public String entityName;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("OrderField")
    public String orderField;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ParamContent")
    public String paramContent;

    @NameInMap("ProcessActionEnd")
    public Long processActionEnd;

    @NameInMap("ProcessActionStart")
    public Long processActionStart;

    @NameInMap("ProcessRemoveEnd")
    public Long processRemoveEnd;

    @NameInMap("ProcessRemoveStart")
    public Long processRemoveStart;

    @NameInMap("ProcessStrategyUuid")
    public String processStrategyUuid;

    @NameInMap("SceneCode")
    public String sceneCode;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("Source")
    public String source;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskStatus")
    public String taskStatus;

    @NameInMap("YunCode")
    public String yunCode;

    public static DescribeProcessTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessTasksRequest self = new DescribeProcessTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProcessTasksRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeProcessTasksRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public DescribeProcessTasksRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public DescribeProcessTasksRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public DescribeProcessTasksRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProcessTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeProcessTasksRequest setParamContent(String paramContent) {
        this.paramContent = paramContent;
        return this;
    }
    public String getParamContent() {
        return this.paramContent;
    }

    public DescribeProcessTasksRequest setProcessActionEnd(Long processActionEnd) {
        this.processActionEnd = processActionEnd;
        return this;
    }
    public Long getProcessActionEnd() {
        return this.processActionEnd;
    }

    public DescribeProcessTasksRequest setProcessActionStart(Long processActionStart) {
        this.processActionStart = processActionStart;
        return this;
    }
    public Long getProcessActionStart() {
        return this.processActionStart;
    }

    public DescribeProcessTasksRequest setProcessRemoveEnd(Long processRemoveEnd) {
        this.processRemoveEnd = processRemoveEnd;
        return this;
    }
    public Long getProcessRemoveEnd() {
        return this.processRemoveEnd;
    }

    public DescribeProcessTasksRequest setProcessRemoveStart(Long processRemoveStart) {
        this.processRemoveStart = processRemoveStart;
        return this;
    }
    public Long getProcessRemoveStart() {
        return this.processRemoveStart;
    }

    public DescribeProcessTasksRequest setProcessStrategyUuid(String processStrategyUuid) {
        this.processStrategyUuid = processStrategyUuid;
        return this;
    }
    public String getProcessStrategyUuid() {
        return this.processStrategyUuid;
    }

    public DescribeProcessTasksRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public DescribeProcessTasksRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public DescribeProcessTasksRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeProcessTasksRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeProcessTasksRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public DescribeProcessTasksRequest setYunCode(String yunCode) {
        this.yunCode = yunCode;
        return this;
    }
    public String getYunCode() {
        return this.yunCode;
    }

}
