// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSQLSamplesRequest extends TeaModel {
    /**
     * <p>The database name.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The end time of querying the slow query execution.</p>
     * <p>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>SQL ID.</p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    /**
     * <p>The start time of querying the slow query execution.</p>
     * <p>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The tenant ID.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeSQLSamplesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLSamplesRequest self = new DescribeSQLSamplesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSQLSamplesRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeSQLSamplesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSQLSamplesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSQLSamplesRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

    public DescribeSQLSamplesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSQLSamplesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
