// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateCASSlsConfigRequest extends TeaModel {
    @NameInMap("ConfigJsonStr")
    public String configJsonStr;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SlsRegionId")
    public String slsRegionId;

    @NameInMap("TenantId")
    public String tenantId;

    public static UpdateCASSlsConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCASSlsConfigRequest self = new UpdateCASSlsConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCASSlsConfigRequest setConfigJsonStr(String configJsonStr) {
        this.configJsonStr = configJsonStr;
        return this;
    }
    public String getConfigJsonStr() {
        return this.configJsonStr;
    }

    public UpdateCASSlsConfigRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UpdateCASSlsConfigRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public UpdateCASSlsConfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
