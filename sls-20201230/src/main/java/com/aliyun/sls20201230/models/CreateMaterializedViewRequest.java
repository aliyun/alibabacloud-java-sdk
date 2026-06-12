// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateMaterializedViewRequest extends TeaModel {
    /**
     * <p>The aggregation interval in minutes. The system creates aggregation tasks based on this interval.</p>
     */
    @NameInMap("aggIntervalMins")
    public Integer aggIntervalMins;

    /**
     * <p>The destination Logstore for the aggregated data from the materialized view.</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The name of the materialized view. The name must be unique within the project, 2 to 63 characters long, and contain only lowercase letters, digits, hyphens (-), and underscores (_). It must also start and end with a lowercase letter or a digit.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The query statement that defines the materialized view.</p>
     */
    @NameInMap("originalSql")
    public String originalSql;

    /**
     * <p>The time when the materialized view starts to aggregate data. Specify the time as a UNIX timestamp in seconds.</p>
     */
    @NameInMap("startTime")
    public Integer startTime;

    /**
     * <p>The time-to-live (TTL) of the data in the materialized view, in days. After this period, the data expires and is automatically deleted.</p>
     */
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
