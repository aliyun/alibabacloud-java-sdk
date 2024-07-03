// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class AddMTInterveneWordRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PackageId")
    public String packageId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("SourceText")
    public String sourceText;

    @NameInMap("TargetText")
    public String targetText;

    public static AddMTInterveneWordRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMTInterveneWordRequest self = new AddMTInterveneWordRequest();
        return TeaModel.build(map, self);
    }

    public AddMTInterveneWordRequest setPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }
    public String getPackageId() {
        return this.packageId;
    }

    public AddMTInterveneWordRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
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

}
