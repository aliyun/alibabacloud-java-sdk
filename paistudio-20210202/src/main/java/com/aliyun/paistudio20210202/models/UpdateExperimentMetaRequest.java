// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class UpdateExperimentMetaRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <strong>example:</strong>
     * <p>Pipeline draft description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>folder-xfd782efd08wex</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <strong>example:</strong>
     * <p>Pipeline draft name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>{&quot;mlflow&quot;:{&quot;experimentId&quot;:&quot;exp-1&quot;}}</p>
     */
    @NameInMap("Options")
    public String options;

    public static UpdateExperimentMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentMetaRequest self = new UpdateExperimentMetaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentMetaRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public UpdateExperimentMetaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateExperimentMetaRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public UpdateExperimentMetaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateExperimentMetaRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

}
