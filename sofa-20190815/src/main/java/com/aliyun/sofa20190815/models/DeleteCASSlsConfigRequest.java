// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteCASSlsConfigRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SlsRegionId")
    public String slsRegionId;

    @NameInMap("TenantId")
    public String tenantId;

    public static DeleteCASSlsConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCASSlsConfigRequest self = new DeleteCASSlsConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCASSlsConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteCASSlsConfigRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DeleteCASSlsConfigRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public DeleteCASSlsConfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
