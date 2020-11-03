// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class AddMtIntervenePackageRequest extends TeaModel {
    @NameInMap("PackageName")
    @Validation(required = true)
    public String packageName;

    @NameInMap("SourceLanguage")
    @Validation(required = true)
    public String sourceLanguage;

    @NameInMap("TargetLanguage")
    @Validation(required = true)
    public String targetLanguage;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public Integer projectId;

    @NameInMap("SourceType")
    public String sourceType;

    public static AddMtIntervenePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMtIntervenePackageRequest self = new AddMtIntervenePackageRequest();
        return TeaModel.build(map, self);
    }

    public AddMtIntervenePackageRequest setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public AddMtIntervenePackageRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public AddMtIntervenePackageRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public AddMtIntervenePackageRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

    public AddMtIntervenePackageRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
