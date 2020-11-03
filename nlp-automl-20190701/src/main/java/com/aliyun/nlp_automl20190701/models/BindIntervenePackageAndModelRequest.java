// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class BindIntervenePackageAndModelRequest extends TeaModel {
    @NameInMap("PackageId")
    @Validation(required = true)
    public Long packageId;

    @NameInMap("ModelId")
    @Validation(required = true)
    public Long modelId;

    @NameInMap("ModelVersion")
    public String modelVersion;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    public static BindIntervenePackageAndModelRequest build(java.util.Map<String, ?> map) throws Exception {
        BindIntervenePackageAndModelRequest self = new BindIntervenePackageAndModelRequest();
        return TeaModel.build(map, self);
    }

    public BindIntervenePackageAndModelRequest setPackageId(Long packageId) {
        this.packageId = packageId;
        return this;
    }
    public Long getPackageId() {
        return this.packageId;
    }

    public BindIntervenePackageAndModelRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public BindIntervenePackageAndModelRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public BindIntervenePackageAndModelRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
