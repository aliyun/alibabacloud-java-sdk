// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateWorkflowRequest extends TeaModel {
    /**
     * <p>The description of the workflow.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The application group ID. You can obtain the ID on the Application Management page in the SchedulerX console.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The maximum number of workflow instances that can be run at the same time. Default value: 1. The value 1 indicates that only one workflow instance is allowed. In this case, if the triggered workflow instance is still ongoing, no more workflow instances can be triggered even the time to schedule the next workflow arrives.</p>
     */
    @NameInMap("MaxConcurrency")
    public Integer maxConcurrency;

    /**
     * <p>The name of the workflow.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace ID. You can obtain the namespace ID on the Namespace page in the SchedulerX console.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The source of the namespace. This parameter is required only for a special third party.</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The time expression. You can set the time expression based on the selected method that is used to specify time.</p>
     * <br>
     * <p>*   If you set the TimeType parameter to cron, you need to enter a standard cron expression. Online verification is supported.</p>
     * <p>*   If you set the TimeType parameter to api, no time expression is required.</p>
     */
    @NameInMap("TimeExpression")
    public String timeExpression;

    /**
     * <p>The method that is used to specify the time. Valid values:</p>
     * <br>
     * <p>*   1: cron</p>
     * <p>*   100: api</p>
     */
    @NameInMap("TimeType")
    public Integer timeType;

    /**
     * <p>The time zone.</p>
     */
    @NameInMap("Timezone")
    public String timezone;

    public static CreateWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowRequest self = new CreateWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWorkflowRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateWorkflowRequest setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public CreateWorkflowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWorkflowRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateWorkflowRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public CreateWorkflowRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateWorkflowRequest setTimeExpression(String timeExpression) {
        this.timeExpression = timeExpression;
        return this;
    }
    public String getTimeExpression() {
        return this.timeExpression;
    }

    public CreateWorkflowRequest setTimeType(Integer timeType) {
        this.timeType = timeType;
        return this;
    }
    public Integer getTimeType() {
        return this.timeType;
    }

    public CreateWorkflowRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

}
