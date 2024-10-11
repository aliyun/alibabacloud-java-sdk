// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class SubmitSparkSQLRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>set spark.driver.resourceSpec=medium;set spark.executor.instances=5;  set spark.executor.resourceSpec=medium;  set spark.app.name=sparksqltest;  show databases;</p>
     */
    @NameInMap("Sql")
    public String sql;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySparkCluster</p>
     */
    @NameInMap("VcName")
    public String vcName;

    public static SubmitSparkSQLRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSparkSQLRequest self = new SubmitSparkSQLRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSparkSQLRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public SubmitSparkSQLRequest setVcName(String vcName) {
        this.vcName = vcName;
        return this;
    }
    public String getVcName() {
        return this.vcName;
    }

}
