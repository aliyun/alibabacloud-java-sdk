// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateMaterializedViewRequest extends TeaModel {
    @NameInMap("aggIntervalMins")
    public Integer aggIntervalMins;

    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("originalSql")
    public String originalSql;

    @NameInMap("ttl")
    public Integer ttl;

    public static UpdateMaterializedViewRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMaterializedViewRequest self = new UpdateMaterializedViewRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMaterializedViewRequest setAggIntervalMins(Integer aggIntervalMins) {
        this.aggIntervalMins = aggIntervalMins;
        return this;
    }
    public Integer getAggIntervalMins() {
        return this.aggIntervalMins;
    }

    public UpdateMaterializedViewRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateMaterializedViewRequest setOriginalSql(String originalSql) {
        this.originalSql = originalSql;
        return this;
    }
    public String getOriginalSql() {
        return this.originalSql;
    }

    public UpdateMaterializedViewRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
