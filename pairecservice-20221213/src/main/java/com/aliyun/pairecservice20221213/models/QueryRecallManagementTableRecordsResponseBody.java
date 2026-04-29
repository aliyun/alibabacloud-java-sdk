// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class QueryRecallManagementTableRecordsResponseBody extends TeaModel {
    @NameInMap("Records")
    public java.util.List<java.util.Map<String, ?>> records;

    /**
     * <strong>example:</strong>
     * <p>7D59453C-48AA-5FC5-8848-2D373BD1A17F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryRecallManagementTableRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRecallManagementTableRecordsResponseBody self = new QueryRecallManagementTableRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRecallManagementTableRecordsResponseBody setRecords(java.util.List<java.util.Map<String, ?>> records) {
        this.records = records;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getRecords() {
        return this.records;
    }

    public QueryRecallManagementTableRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
