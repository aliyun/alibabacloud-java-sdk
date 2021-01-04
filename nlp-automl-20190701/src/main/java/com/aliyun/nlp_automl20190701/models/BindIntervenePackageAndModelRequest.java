// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class BindIntervenePackageAndModelRequest extends TeaModel {
    @NameInMap("PackageId")
    public Long packageId;

    @NameInMap("ModelId")
    public Long modelId;

    @NameInMap("ModelVersion")
    public String modelVersion;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Product")
    public String product;

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

    public BindIntervenePackageAndModelRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public BindIntervenePackageAndModelRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
