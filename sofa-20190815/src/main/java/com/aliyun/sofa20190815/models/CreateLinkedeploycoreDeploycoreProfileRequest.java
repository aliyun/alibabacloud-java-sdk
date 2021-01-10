// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkedeploycoreDeploycoreProfileRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Detail")
    public String detail;

    @NameInMap("ParentId")
    public Long parentId;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("TenantName")
    public String tenantName;

    public static CreateLinkedeploycoreDeploycoreProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkedeploycoreDeploycoreProfileRequest self = new CreateLinkedeploycoreDeploycoreProfileRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkedeploycoreDeploycoreProfileRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateLinkedeploycoreDeploycoreProfileRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public CreateLinkedeploycoreDeploycoreProfileRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public CreateLinkedeploycoreDeploycoreProfileRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateLinkedeploycoreDeploycoreProfileRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
