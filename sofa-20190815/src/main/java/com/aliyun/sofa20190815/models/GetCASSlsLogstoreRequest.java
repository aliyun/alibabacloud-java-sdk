// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCASSlsLogstoreRequest extends TeaModel {
    @NameInMap("LogstoreName")
    public String logstoreName;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SlsRegionId")
    public String slsRegionId;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetCASSlsLogstoreRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCASSlsLogstoreRequest self = new GetCASSlsLogstoreRequest();
        return TeaModel.build(map, self);
    }

    public GetCASSlsLogstoreRequest setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public GetCASSlsLogstoreRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetCASSlsLogstoreRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public GetCASSlsLogstoreRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
