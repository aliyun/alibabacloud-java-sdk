// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeProcessTasksRequest extends TeaModel {
    @NameInMap("AlertId")
    public String alertId;

    /**
     * <p>The sort direction. Valid values:</p>
     * <ul>
     * <li><strong>desc</strong>: Descending (default).</li>
     * <li><strong>asc</strong>: Ascending.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The name of the entity to be disposed.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("EntityName")
    public String entityName;

    /**
     * <p>The type of the entity to be disposed. Valid values:</p>
     * <ul>
     * <li><strong>ip</strong>: IP address entity.</li>
     * <li><strong>file</strong>: File entity.</li>
     * <li><strong>process</strong>: Process entity.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The UUID of the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>69d189e2-ec17-4676-a2fe-02969234****</p>
     */
    @NameInMap("EntityUuid")
    public String entityUuid;

    /**
     * <p>The UUID of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>c1020ce1-d6a5-11e8-8298-00163e10****</p>
     */
    @NameInMap("EventUuid")
    public String eventUuid;

    @NameInMap("ExecuteUuid")
    public String executeUuid;

    /**
     * <p>The field used to sort the results.</p>
     * <blockquote>
     * <p>You can obtain the sort field from the response of this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gmtCreate</p>
     */
    @NameInMap("OrderField")
    public String orderField;

    /**
     * <p>The page number of the page to return. Default value: 1, which indicates the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The maximum number of entries to return on each page for paging queries. Default value: 20. If the PageSize parameter is left empty, 10 entries are returned by default.</p>
     * <blockquote>
     * <p>Do not leave PageSize empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The fuzzy match content. This parameter queries the entity, disposal scene, and disposal parameter fields.</p>
     * 
     * <strong>example:</strong>
     * <p>12.x.x.x</p>
     */
    @NameInMap("ParamContent")
    public String paramContent;

    /**
     * <p>The end time of the query range for the disposal time. Format: 13-digit timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1700031183572</p>
     */
    @NameInMap("ProcessActionEnd")
    public Long processActionEnd;

    /**
     * <p>The start time of the query range for the disposal time. Format: 13-digit timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1700031183572</p>
     */
    @NameInMap("ProcessActionStart")
    public Long processActionStart;

    /**
     * <p>The end time of the query range for the unblocking time. Format: 13-digit timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1700031183572</p>
     */
    @NameInMap("ProcessRemoveEnd")
    public Long processRemoveEnd;

    /**
     * <p>The start time of the query range for the unblocking time. Format: 13-digit timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1700031183572</p>
     */
    @NameInMap("ProcessRemoveStart")
    public Long processRemoveStart;

    /**
     * <p>The UUID of the disposal strategy.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2584440.html">ListDisposeStrategy</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>92af3c79-1754-4646-9366-9ddbd1e45536_****</p>
     */
    @NameInMap("ProcessStrategyUuid")
    public String processStrategyUuid;

    /**
     * <p>The trigger ID of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>b73d0b08-f1bd-4e8f-967a-8e2982c9****</p>
     */
    @NameInMap("ReqUuid")
    public String reqUuid;

    @NameInMap("ResponseRuleId")
    public String responseRuleId;

    /**
     * <p>The scene code of the disposal task.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeEnumItems~~">DescribeEnumItems</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>event_xxx_whole_process</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>The Alibaba Cloud account ID for the disposal.</p>
     * 
     * <strong>example:</strong>
     * <p>125xxxxx9870</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The trigger source of the disposal task, in array string format. Valid values:</p>
     * <ul>
     * <li><strong>system</strong>: Triggered by manual event disposal.</li>
     * <li><strong>custom</strong>: Triggered by an automatic response rule based on an event.</li>
     * <li><strong>custom_alert</strong>: Triggered by an automatic response rule based on an alert.</li>
     * <li><strong>soar-manual</strong>: Triggered by manually invoking a SOAR playbook.</li>
     * <li><strong>soar-mdr</strong>: Triggered by the Managed Security Service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;system&quot;]</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The unique identifier of the disposal task.</p>
     * <blockquote>
     * <p>This parameter is used to query a specific task. You can obtain the value from the response of this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>150xxxxxxxxx95066</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The status list of the disposal task, in data string format. Valid values:</p>
     * <ul>
     * <li><strong>11</strong>: Disposing.</li>
     * <li><strong>21</strong>: Blocking.</li>
     * <li><strong>22</strong>: Isolating.</li>
     * <li><strong>23</strong>: Ended.</li>
     * <li><strong>24</strong>: Whitelisted.</li>
     * <li><strong>20</strong>: Succeeded.</li>
     * <li><strong>90</strong>: Failed.</li>
     * <li><strong>91</strong>: Unblocking failed.</li>
     * <li><strong>92</strong>: Unisolation failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;11&quot;,&quot;21&quot;]</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <p>The trigger source of the disposal task. Valid values:</p>
     * <ul>
     * <li><strong>system</strong>: Triggered by manual event disposal.</li>
     * <li><strong>custom</strong>: Triggered by an automatic response rule based on an event.</li>
     * <li><strong>custom_alert</strong>: Triggered by an automatic response rule based on an alert.</li>
     * <li><strong>soar-manual</strong>: Triggered by manually invoking a SOAR playbook.</li>
     * <li><strong>soar-mdr</strong>: Triggered by the Managed Security Service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("TriggerSource")
    public String triggerSource;

    /**
     * <p>The cloud product associated with the disposal task, in data string format. Valid values:</p>
     * <ul>
     * <li><strong>WAF</strong>: Web Application Firewall.</li>
     * <li><strong>CFW</strong>: Cloud Firewall.</li>
     * <li><strong>Aegis</strong>: Security Center.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;WAF&quot;]</p>
     */
    @NameInMap("YunCode")
    public String yunCode;

    public static DescribeProcessTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessTasksRequest self = new DescribeProcessTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProcessTasksRequest setAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }
    public String getAlertId() {
        return this.alertId;
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

    public DescribeProcessTasksRequest setEntityUuid(String entityUuid) {
        this.entityUuid = entityUuid;
        return this;
    }
    public String getEntityUuid() {
        return this.entityUuid;
    }

    public DescribeProcessTasksRequest setEventUuid(String eventUuid) {
        this.eventUuid = eventUuid;
        return this;
    }
    public String getEventUuid() {
        return this.eventUuid;
    }

    public DescribeProcessTasksRequest setExecuteUuid(String executeUuid) {
        this.executeUuid = executeUuid;
        return this;
    }
    public String getExecuteUuid() {
        return this.executeUuid;
    }

    public DescribeProcessTasksRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public DescribeProcessTasksRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
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

    public DescribeProcessTasksRequest setReqUuid(String reqUuid) {
        this.reqUuid = reqUuid;
        return this;
    }
    public String getReqUuid() {
        return this.reqUuid;
    }

    public DescribeProcessTasksRequest setResponseRuleId(String responseRuleId) {
        this.responseRuleId = responseRuleId;
        return this;
    }
    public String getResponseRuleId() {
        return this.responseRuleId;
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

    public DescribeProcessTasksRequest setTriggerSource(String triggerSource) {
        this.triggerSource = triggerSource;
        return this;
    }
    public String getTriggerSource() {
        return this.triggerSource;
    }

    public DescribeProcessTasksRequest setYunCode(String yunCode) {
        this.yunCode = yunCode;
        return this;
    }
    public String getYunCode() {
        return this.yunCode;
    }

}
