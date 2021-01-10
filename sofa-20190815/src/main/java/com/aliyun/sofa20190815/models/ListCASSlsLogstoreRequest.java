// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListCASSlsLogstoreRequest extends TeaModel {
    @NameInMap("LogstoreName")
    public String logstoreName;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SlsRegionId")
    public String slsRegionId;

    @NameInMap("TenantId")
    public String tenantId;

    public static ListCASSlsLogstoreRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCASSlsLogstoreRequest self = new ListCASSlsLogstoreRequest();
        return TeaModel.build(map, self);
    }

    public ListCASSlsLogstoreRequest setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public ListCASSlsLogstoreRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ListCASSlsLogstoreRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public ListCASSlsLogstoreRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
