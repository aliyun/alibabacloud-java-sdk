// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCASSlsConfigRequest extends TeaModel {
    @NameInMap("ConfigJsonStr")
    public String configJsonStr;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SlsRegionId")
    public String slsRegionId;

    @NameInMap("TenantId")
    public String tenantId;

    public static CreateCASSlsConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCASSlsConfigRequest self = new CreateCASSlsConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateCASSlsConfigRequest setConfigJsonStr(String configJsonStr) {
        this.configJsonStr = configJsonStr;
        return this;
    }
    public String getConfigJsonStr() {
        return this.configJsonStr;
    }

    public CreateCASSlsConfigRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateCASSlsConfigRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public CreateCASSlsConfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
