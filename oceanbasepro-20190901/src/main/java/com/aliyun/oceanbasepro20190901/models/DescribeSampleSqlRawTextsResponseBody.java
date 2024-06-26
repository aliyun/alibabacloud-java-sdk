// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSampleSqlRawTextsResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeSampleSqlRawTextsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSampleSqlRawTextsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleSqlRawTextsResponseBody self = new DescribeSampleSqlRawTextsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSampleSqlRawTextsResponseBody setData(DescribeSampleSqlRawTextsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSampleSqlRawTextsResponseBodyData getData() {
        return this.data;
    }

    public DescribeSampleSqlRawTextsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSampleSqlRawTextsResponseBodyData extends TeaModel {
        @NameInMap("SqlText")
        public java.util.List<String> sqlText;

        public static DescribeSampleSqlRawTextsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSampleSqlRawTextsResponseBodyData self = new DescribeSampleSqlRawTextsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSampleSqlRawTextsResponseBodyData setSqlText(java.util.List<String> sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public java.util.List<String> getSqlText() {
            return this.sqlText;
        }

    }

}
