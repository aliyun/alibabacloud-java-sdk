// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetMaterializedViewResponseBody extends TeaModel {
    @NameInMap("aggIntervalMins")
    public Integer aggIntervalMins;

    @NameInMap("enabled")
    public Boolean enabled;

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

    public static GetMaterializedViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMaterializedViewResponseBody self = new GetMaterializedViewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMaterializedViewResponseBody setAggIntervalMins(Integer aggIntervalMins) {
        this.aggIntervalMins = aggIntervalMins;
        return this;
    }
    public Integer getAggIntervalMins() {
        return this.aggIntervalMins;
    }

    public GetMaterializedViewResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetMaterializedViewResponseBody setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public GetMaterializedViewResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetMaterializedViewResponseBody setOriginalSql(String originalSql) {
        this.originalSql = originalSql;
        return this;
    }
    public String getOriginalSql() {
        return this.originalSql;
    }

    public GetMaterializedViewResponseBody setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public GetMaterializedViewResponseBody setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
