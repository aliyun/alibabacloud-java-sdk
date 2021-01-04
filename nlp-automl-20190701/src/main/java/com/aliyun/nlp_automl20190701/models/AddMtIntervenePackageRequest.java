// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class AddMtIntervenePackageRequest extends TeaModel {
    @NameInMap("PackageName")
    public String packageName;

    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    @NameInMap("TargetLanguage")
    public String targetLanguage;

    @NameInMap("ProjectId")
    public Integer projectId;

    @NameInMap("TenantId")
    public Integer tenantId;

    @NameInMap("Product")
    public String product;

    @NameInMap("Category")
    public String category;

    @NameInMap("ProjectType")
    public String projectType;

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

    public AddMtIntervenePackageRequest setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Integer getTenantId() {
        return this.tenantId;
    }

    public AddMtIntervenePackageRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public AddMtIntervenePackageRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public AddMtIntervenePackageRequest setProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }
    public String getProjectType() {
        return this.projectType;
    }

    public AddMtIntervenePackageRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
