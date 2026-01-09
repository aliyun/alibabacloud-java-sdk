// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateMaterializedViewRequest extends TeaModel {
    @NameInMap("aggIntervalMins")
    public Integer aggIntervalMins;

    @NameInMap("logstore")
    public String logstore;

    @NameInMap("name")
    public String name;

    @NameInMap("originalSql")
    public String originalSql;

    @NameInMap("startTime")
    public Integer startTime;

    @NameInMap("ttl")
    public Integer ttl;

    public static CreateMaterializedViewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMaterializedViewRequest self = new CreateMaterializedViewRequest();
        return TeaModel.build(map, self);
    }

    public CreateMaterializedViewRequest setAggIntervalMins(Integer aggIntervalMins) {
        this.aggIntervalMins = aggIntervalMins;
        return this;
    }
    public Integer getAggIntervalMins() {
        return this.aggIntervalMins;
    }

    public CreateMaterializedViewRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public CreateMaterializedViewRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMaterializedViewRequest setOriginalSql(String originalSql) {
        this.originalSql = originalSql;
        return this;
    }
    public String getOriginalSql() {
        return this.originalSql;
    }

    public CreateMaterializedViewRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public CreateMaterializedViewRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
