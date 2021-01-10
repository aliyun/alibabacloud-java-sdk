// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCASSlsLogstoreRequest extends TeaModel {
    @NameInMap("LogstoreName")
    public String logstoreName;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ShardCount")
    public Long shardCount;

    @NameInMap("SlsRegionId")
    public String slsRegionId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Ttl")
    public Long ttl;

    public static CreateCASSlsLogstoreRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCASSlsLogstoreRequest self = new CreateCASSlsLogstoreRequest();
        return TeaModel.build(map, self);
    }

    public CreateCASSlsLogstoreRequest setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public CreateCASSlsLogstoreRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateCASSlsLogstoreRequest setShardCount(Long shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Long getShardCount() {
        return this.shardCount;
    }

    public CreateCASSlsLogstoreRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public CreateCASSlsLogstoreRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateCASSlsLogstoreRequest setTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }
    public Long getTtl() {
        return this.ttl;
    }

}
