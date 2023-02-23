// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateWorkflowRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("MaxConcurrency")
    public Integer maxConcurrency;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NamespaceSource")
    public String namespaceSource;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TimeExpression")
    public String timeExpression;

    @NameInMap("TimeType")
    public Integer timeType;

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
