// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class UpdateWorkflowRequest extends TeaModel {
    /**
     * <p>The description of the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The application group ID. You can obtain the application group ID on the Application Management page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testSchedulerx.defaultGroup</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>helloworld</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace ID. You can obtain the namespace ID on the Namespace page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The source of the namespace. This parameter is required only for a special third party.</p>
     * 
     * <strong>example:</strong>
     * <p>schedulerx</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The time expression. You can set the time expression based on the selected method that is used to specify time.</p>
     * <ul>
     * <li>If you set TimeType to cron, you need to enter a standard cron expression. Online verification is supported.</li>
     * <li>If you set TimeType to api, no time expression is required.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0 0/10 * * * ?</p>
     */
    @NameInMap("TimeExpression")
    public String timeExpression;

    /**
     * <p>The method that is used to specify the time. Valid values:</p>
     * <ul>
     * <li>1: cron</li>
     * <li>100: api</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TimeType")
    public Integer timeType;

    /**
     * <p>The workflow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("WorkflowId")
    public String workflowId;

    public static UpdateWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowRequest self = new UpdateWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWorkflowRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateWorkflowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateWorkflowRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateWorkflowRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public UpdateWorkflowRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateWorkflowRequest setTimeExpression(String timeExpression) {
        this.timeExpression = timeExpression;
        return this;
    }
    public String getTimeExpression() {
        return this.timeExpression;
    }

    public UpdateWorkflowRequest setTimeType(Integer timeType) {
        this.timeType = timeType;
        return this;
    }
    public Integer getTimeType() {
        return this.timeType;
    }

    public UpdateWorkflowRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
