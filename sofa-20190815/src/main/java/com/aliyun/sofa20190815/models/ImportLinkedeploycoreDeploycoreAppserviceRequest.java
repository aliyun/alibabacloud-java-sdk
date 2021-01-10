// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportLinkedeploycoreDeploycoreAppserviceRequest extends TeaModel {
    @NameInMap("ApplyOwner")
    public String applyOwner;

    @NameInMap("AppServicesRepeatList")
    public java.util.List<String> appServicesRepeatList;

    @NameInMap("EnvName")
    public String envName;

    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("TenantName")
    public String tenantName;

    public static ImportLinkedeploycoreDeploycoreAppserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportLinkedeploycoreDeploycoreAppserviceRequest self = new ImportLinkedeploycoreDeploycoreAppserviceRequest();
        return TeaModel.build(map, self);
    }

    public ImportLinkedeploycoreDeploycoreAppserviceRequest setApplyOwner(String applyOwner) {
        this.applyOwner = applyOwner;
        return this;
    }
    public String getApplyOwner() {
        return this.applyOwner;
    }

    public ImportLinkedeploycoreDeploycoreAppserviceRequest setAppServicesRepeatList(java.util.List<String> appServicesRepeatList) {
        this.appServicesRepeatList = appServicesRepeatList;
        return this;
    }
    public java.util.List<String> getAppServicesRepeatList() {
        return this.appServicesRepeatList;
    }

    public ImportLinkedeploycoreDeploycoreAppserviceRequest setEnvName(String envName) {
        this.envName = envName;
        return this;
    }
    public String getEnvName() {
        return this.envName;
    }

    public ImportLinkedeploycoreDeploycoreAppserviceRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public ImportLinkedeploycoreDeploycoreAppserviceRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
