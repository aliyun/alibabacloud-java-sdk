// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class UpdateExperimentMetaRequest extends TeaModel {
    // 工作空间内可见性 PUBLIC; PRIVATE 默认PUBLIC
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Description")
    public String description;

    @NameInMap("FolderId")
    public String folderId;

    @NameInMap("Name")
    public String name;

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
