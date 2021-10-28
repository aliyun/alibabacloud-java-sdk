// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class QueryNameListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RiskNameLists")
    public QueryNameListResponseBodyRiskNameLists riskNameLists;

    public static QueryNameListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryNameListResponseBody self = new QueryNameListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryNameListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryNameListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryNameListResponseBody setRiskNameLists(QueryNameListResponseBodyRiskNameLists riskNameLists) {
        this.riskNameLists = riskNameLists;
        return this;
    }
    public QueryNameListResponseBodyRiskNameLists getRiskNameLists() {
        return this.riskNameLists;
    }

    public static class QueryNameListResponseBodyRiskNameListsRiskName extends TeaModel {
        @NameInMap("DataType")
        public String dataType;

        @NameInMap("DataValue")
        public String dataValue;

        @NameInMap("Type")
        public String type;

        public static QueryNameListResponseBodyRiskNameListsRiskName build(java.util.Map<String, ?> map) throws Exception {
            QueryNameListResponseBodyRiskNameListsRiskName self = new QueryNameListResponseBodyRiskNameListsRiskName();
            return TeaModel.build(map, self);
        }

        public QueryNameListResponseBodyRiskNameListsRiskName setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public QueryNameListResponseBodyRiskNameListsRiskName setDataValue(String dataValue) {
            this.dataValue = dataValue;
            return this;
        }
        public String getDataValue() {
            return this.dataValue;
        }

        public QueryNameListResponseBodyRiskNameListsRiskName setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryNameListResponseBodyRiskNameLists extends TeaModel {
        @NameInMap("RiskName")
        public java.util.List<QueryNameListResponseBodyRiskNameListsRiskName> riskName;

        public static QueryNameListResponseBodyRiskNameLists build(java.util.Map<String, ?> map) throws Exception {
            QueryNameListResponseBodyRiskNameLists self = new QueryNameListResponseBodyRiskNameLists();
            return TeaModel.build(map, self);
        }

        public QueryNameListResponseBodyRiskNameLists setRiskName(java.util.List<QueryNameListResponseBodyRiskNameListsRiskName> riskName) {
            this.riskName = riskName;
            return this;
        }
        public java.util.List<QueryNameListResponseBodyRiskNameListsRiskName> getRiskName() {
            return this.riskName;
        }

    }

}
