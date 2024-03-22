// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeProcessTasksRequest extends TeaModel {
    /**
     * <p>The sort order. Valid values:</p>
     * <br>
     * <p>*   **desc** (default)</p>
     * <p>*   **asc**</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The name of the handling entity.</p>
     */
    @NameInMap("EntityName")
    public String entityName;

    /**
     * <p>The type of the handling entity. Valid values:</p>
     * <br>
     * <p>*   **ip**</p>
     * <p>*   **file**</p>
     * <p>*   **process**</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The field that you use to sort the result.</p>
     * <br>
     * <p>>  You can obtain the field from the response result.</p>
     */
    @NameInMap("OrderField")
    public String orderField;

    /**
     * <p>The page number. Default value: 1. Pages start from page 1.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. If you do not specify the PageSize parameter, 10 entries are returned by default.</p>
     * <br>
     * <p>>  We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The handling entity, handling scenario, or handling parameter that is used for fuzzy match.</p>
     */
    @NameInMap("ParamContent")
    public String paramContent;

    /**
     * <p>The end of the time range for a handling task. The value is a 13-digit timestamp.</p>
     */
    @NameInMap("ProcessActionEnd")
    public Long processActionEnd;

    /**
     * <p>The beginning of the time range for a handling task. The value is a 13-digit timestamp.</p>
     */
    @NameInMap("ProcessActionStart")
    public Long processActionStart;

    /**
     * <p>The end of the time range for an unblocking task. The value is a 13-digit timestamp.</p>
     */
    @NameInMap("ProcessRemoveEnd")
    public Long processRemoveEnd;

    /**
     * <p>The beginning of the time range for an unblocking task. The value is a 13-digit timestamp.</p>
     */
    @NameInMap("ProcessRemoveStart")
    public Long processRemoveStart;

    /**
     * <p>The UUID of the handling policy.</p>
     * <br>
     * <p>>  You can call the [ListDisposeStrategy](~~2584440~~) operation to query the UUID of the handling policy.</p>
     */
    @NameInMap("ProcessStrategyUuid")
    public String processStrategyUuid;

    /**
     * <p>The scenario code of the handling task.</p>
     * <br>
     * <p>>  You can call the [DescribeEnumItems](~~DescribeEnumItems~~) operation to query the scenario code of the handling task. This parameter is available when you set **EnumType** to **process**.</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>The ID of the Alibaba Cloud account that is specified in the handling task.</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The triggering source of the handling task. The value is a string array. Valid values:</p>
     * <br>
     * <p>*   **system**: triggered when you manually handle an event</p>
     * <p>*   **custom**: triggered by an event based on an automatic response rule</p>
     * <p>*   **custom_alert**: triggered by an alert based on an automatic response rule</p>
     * <p>*   **soar-manual**: triggered when you use SOAR to manually run a playbook</p>
     * <p>*   **soar-mdr**: triggered by Managed Security Service</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The unique identifier of the handling task.</p>
     * <br>
     * <p>>  This parameter is used to query a specific task. You can obtain the value from the response result.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The status of the handling task. The value is a string. Valid values:</p>
     * <br>
     * <p>*   **11**: being handled</p>
     * <p>*   **21**: being blocked</p>
     * <p>*   **22**: being quarantined</p>
     * <p>*   **23**: completed</p>
     * <p>*   **24**: added to the whitelist</p>
     * <p>*   **20**: successful</p>
     * <p>*   **90**: failed</p>
     * <p>*   **91**: unblocking failed</p>
     * <p>*   **92**: restoring quarantined files failed</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <p>The cloud service that is associated with the handling task. The value is a string. Valid values:</p>
     * <br>
     * <p>*   **WAF**: Web Application Firewall (WAF)</p>
     * <p>*   **CFW**: Cloud Firewall</p>
     * <p>*   **Aegis**: Security Center</p>
     */
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
