// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class AddMTInterveneWordRequest extends TeaModel {
    @NameInMap("SourceText")
    @Validation(required = true)
    public String sourceText;

    @NameInMap("TargetText")
    public String targetText;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public String projectId;

    @NameInMap("PackageId")
    public String packageId;

    public static AddMTInterveneWordRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMTInterveneWordRequest self = new AddMTInterveneWordRequest();
        return TeaModel.build(map, self);
    }

    public AddMTInterveneWordRequest setSourceText(String sourceText) {
        this.sourceText = sourceText;
        return this;
    }
    public String getSourceText() {
        return this.sourceText;
    }

    public AddMTInterveneWordRequest setTargetText(String targetText) {
        this.targetText = targetText;
        return this;
    }
    public String getTargetText() {
        return this.targetText;
    }

    public AddMTInterveneWordRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AddMTInterveneWordRequest setPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }
    public String getPackageId() {
        return this.packageId;
    }

}
