// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeQueryExplainResponseBody extends TeaModel {
    /**
     * <p>The Explain result.</p>
     * 
     * <strong>example:</strong>
     * <p>+-----------------------------------------------------------------------+
     * | Explain String|
     * +-----------------------------------------------------------------------+
     * | PLAN FRAGMENT 0                                                       |
     * |OUTPUT EXPRS:                                                        |
     * |    name[#1]                                                           |
     * |    age[#2]                                                            |
     * |  PARTITION: UNPARTITIONED                                |
     * |                                                                        |
     * |  VRESULT SINK                                                         |
     * |                                                                        |
     * |  1:VEXCHANGE                                                          |
     * |     offset: 0                                                        |
     * |                                                                        |
     * | PLAN FRAGMENT 1                                                       |
     * |                                                                        |
     * |  PARTITION: HASH_PARTITIONED: id[#0]                                  |
     * |                                                                        |
     * |  STREAM DATA SINK                                                     |
     * |    EXCHANGE ID: 01|
     * |    UNPARTITIONED                                |
     * |                                                                        |
     * |  0:VOlapScanNode                                                      |
     * |     TABLE: example_db.example_tbl(example_tbl)                        |
     * |     PREAGGREGATION: ON                                                |
     * |     PREDICATES: (age[#2] &gt; 18)                                        |
     * |     cardinality=1, avgRowSize=20.0, numNodes=1                        |
     * |     tablet list: 10023, 10025, 10027                |
     * +-----------------------------------------------------------------------+</p>
     */
    @NameInMap("ExplainResult")
    public String explainResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8900A96-67F7-5274-A41B-7722E1ECF8C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The SQL statement for which the execution plan is retrieved. Excessively long SQL statements in audit logs may be truncated.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT * FROM example_db.example_tbl</p>
     */
    @NameInMap("Sql")
    public String sql;

    public static DescribeQueryExplainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQueryExplainResponseBody self = new DescribeQueryExplainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQueryExplainResponseBody setExplainResult(String explainResult) {
        this.explainResult = explainResult;
        return this;
    }
    public String getExplainResult() {
        return this.explainResult;
    }

    public DescribeQueryExplainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeQueryExplainResponseBody setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

}
