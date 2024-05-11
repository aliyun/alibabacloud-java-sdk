// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class UpdateMetricRequest extends TeaModel {
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
    @NameInMap("Name")
    public String name;

    @NameInMap("SourceTableMetaId")
    public String sourceTableMetaId;

    public static UpdateMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetricRequest self = new UpdateMetricRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetricRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public UpdateMetricRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMetricRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMetricRequest setSourceTableMetaId(String sourceTableMetaId) {
        this.sourceTableMetaId = sourceTableMetaId;
        return this;
    }
    public String getSourceTableMetaId() {
        return this.sourceTableMetaId;
    }

}
