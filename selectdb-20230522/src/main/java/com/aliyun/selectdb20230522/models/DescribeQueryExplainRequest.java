// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeQueryExplainRequest extends TeaModel {
    /**
     * <p>The database instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213cjv****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The Explain mode.</p>
     * 
     * <strong>example:</strong>
     * <p>BASIC</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The query ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40e8a568-d2a2-4f7e-a3f8-cec554ce5143</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeQueryExplainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQueryExplainRequest self = new DescribeQueryExplainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQueryExplainRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeQueryExplainRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public DescribeQueryExplainRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public DescribeQueryExplainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
