// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutWebapicreatedeploymentunitRequest extends TeaModel {
    @NameInMap("CreateDeploymentUnitRequestJsonStr")
    public String createDeploymentUnitRequestJsonStr;

    @NameInMap("TenantPath")
    public String tenantPath;

    public static CreateLinkeBahamutWebapicreatedeploymentunitRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutWebapicreatedeploymentunitRequest self = new CreateLinkeBahamutWebapicreatedeploymentunitRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutWebapicreatedeploymentunitRequest setCreateDeploymentUnitRequestJsonStr(String createDeploymentUnitRequestJsonStr) {
        this.createDeploymentUnitRequestJsonStr = createDeploymentUnitRequestJsonStr;
        return this;
    }
    public String getCreateDeploymentUnitRequestJsonStr() {
        return this.createDeploymentUnitRequestJsonStr;
    }

    public CreateLinkeBahamutWebapicreatedeploymentunitRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
