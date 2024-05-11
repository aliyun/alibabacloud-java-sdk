// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class CreateMetricRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Definition")
    public String definition;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MetricGroupId")
    public String metricGroupId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceTableMetaId")
    public String sourceTableMetaId;

    public static CreateMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMetricRequest self = new CreateMetricRequest();
        return TeaModel.build(map, self);
    }

    public CreateMetricRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public CreateMetricRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMetricRequest setMetricGroupId(String metricGroupId) {
        this.metricGroupId = metricGroupId;
        return this;
    }
    public String getMetricGroupId() {
        return this.metricGroupId;
    }

    public CreateMetricRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMetricRequest setSourceTableMetaId(String sourceTableMetaId) {
        this.sourceTableMetaId = sourceTableMetaId;
        return this;
    }
    public String getSourceTableMetaId() {
        return this.sourceTableMetaId;
    }

}
