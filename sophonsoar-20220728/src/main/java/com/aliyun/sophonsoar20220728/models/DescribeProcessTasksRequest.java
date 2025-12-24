// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeProcessTasksRequest extends TeaModel {
    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><strong>desc</strong> (default).</li>
     * <li><strong>asc</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The name of the handling entity.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("EntityName")
    public String entityName;

    /**
     * <p>The type of the handling entity. Valid values:</p>
     * <ul>
     * <li><strong>ip</strong>.</li>
     * <li><strong>file</strong>.</li>
     * <li><strong>process</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The UUID of the handling entity.</p>
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

    /**
     * <p>The field that you use to sort the result.</p>
     * <blockquote>
     * <p> You can obtain the field from the response result.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gmtCreate</p>
     */
    @NameInMap("OrderField")
    public String orderField;

    /**
     * <p>The page number. Default value: 1. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. If you do not specify the PageSize parameter, 10 entries are returned by default.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The handling entity, handling scenario, or handling parameter that is used for fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>12.x.x.x</p>
     */
    @NameInMap("ParamContent")
    public String paramContent;

    /**
     * <p>The end of the time range for a handling task. The value is a 13-digit timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1700031183572</p>
     */
    @NameInMap("ProcessActionEnd")
    public Long processActionEnd;

    /**
     * <p>The beginning of the time range for a handling task. The value is a 13-digit timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1700031183572</p>
     */
    @NameInMap("ProcessActionStart")
    public Long processActionStart;

    /**
     * <p>The end of the time range for an unblocking task. The value is a 13-digit timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1700031183572</p>
     */
    @NameInMap("ProcessRemoveEnd")
    public Long processRemoveEnd;

    /**
     * <p>The beginning of the time range for an unblocking task. The value is a 13-digit timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1700031183572</p>
     */
    @NameInMap("ProcessRemoveStart")
    public Long processRemoveStart;

    /**
     * <p>The UUID of the handling policy.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2584440.html">ListDisposeStrategy</a> operation to query the UUID of the handling policy.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>92af3c79-1754-4646-9366-9ddbd1e45536_xxxx</p>
     */
    @NameInMap("ProcessStrategyUuid")
    public String processStrategyUuid;

    @NameInMap("ReqUuid")
    public String reqUuid;

    /**
     * <p>The scenario code of the handling task.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeEnumItems~~">DescribeEnumItems</a> operation to query the scenario code of the handling task. This parameter is available when you set <strong>EnumType</strong> to <strong>process</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>event_xxx_whole_process</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>The ID of the Alibaba Cloud account that is specified in the handling task.</p>
     * 
     * <strong>example:</strong>
     * <p>125xxxxx9870</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The triggering source of the handling task. The value is a string array. Valid values:</p>
     * <ul>
     * <li><strong>system</strong>: triggered when you manually handle an event.</li>
     * <li><strong>custom</strong>: triggered by an event based on an automatic response rule.</li>
     * <li><strong>custom_alert</strong>: triggered by an alert based on an automatic response rule.</li>
     * <li><strong>soar-manual</strong>: triggered when you use SOAR to manually run a playbook.</li>
     * <li><strong>soar-mdr</strong>: triggered by Managed Security Service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;system&quot;]</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The unique identifier of the handling task.</p>
     * <blockquote>
     * <p> This parameter is used to query a specific task. You can obtain the value from the response result.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>150xxxxxxxxx95066</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The status of the handling task. The value is a string. Valid values:</p>
     * <ul>
     * <li><strong>11</strong>: being handled.</li>
     * <li><strong>21</strong>: being blocked.</li>
     * <li><strong>22</strong>: being quarantined.</li>
     * <li><strong>23</strong>: completed.</li>
     * <li><strong>24</strong>: added to the whitelist.</li>
     * <li><strong>20</strong>: successful.</li>
     * <li><strong>90</strong>: failed.</li>
     * <li><strong>91</strong>: unblocking failed.</li>
     * <li><strong>92</strong>: restoring quarantined files failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;11&quot;,&quot;21&quot;]</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <p>The triggering source of the handling task. Valid values:</p>
     * <ul>
     * <li><strong>system</strong>: triggered when you manually handle an event.</li>
     * <li><strong>custom</strong>: triggered by an event based on an automatic response rule.</li>
     * <li><strong>custom_alert</strong>: triggered by an alert based on an automatic response rule.</li>
     * <li><strong>soar-manual</strong>: triggered when you use SOAR to manually run a playbook.</li>
     * <li><strong>soar-mdr</strong>: triggered by Managed Security Service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("TriggerSource")
    public String triggerSource;

    /**
     * <p>The cloud service that is associated with the handling task. The value is a string. Valid values:</p>
     * <ul>
     * <li><strong>WAF</strong>: Web Application Firewall (WAF).</li>
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
