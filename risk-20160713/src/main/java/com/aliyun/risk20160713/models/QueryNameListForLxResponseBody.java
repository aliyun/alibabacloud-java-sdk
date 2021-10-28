// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class QueryNameListForLxResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RiskNameLists")
    public QueryNameListForLxResponseBodyRiskNameLists riskNameLists;

    public static QueryNameListForLxResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryNameListForLxResponseBody self = new QueryNameListForLxResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryNameListForLxResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryNameListForLxResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryNameListForLxResponseBody setRiskNameLists(QueryNameListForLxResponseBodyRiskNameLists riskNameLists) {
        this.riskNameLists = riskNameLists;
        return this;
    }
    public QueryNameListForLxResponseBodyRiskNameLists getRiskNameLists() {
        return this.riskNameLists;
    }

    public static class QueryNameListForLxResponseBodyRiskNameListsRiskName extends TeaModel {
        @NameInMap("DataType")
        public String dataType;

        @NameInMap("DataValue")
        public String dataValue;

        @NameInMap("Type")
        public String type;

        public static QueryNameListForLxResponseBodyRiskNameListsRiskName build(java.util.Map<String, ?> map) throws Exception {
            QueryNameListForLxResponseBodyRiskNameListsRiskName self = new QueryNameListForLxResponseBodyRiskNameListsRiskName();
            return TeaModel.build(map, self);
        }

        public QueryNameListForLxResponseBodyRiskNameListsRiskName setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public QueryNameListForLxResponseBodyRiskNameListsRiskName setDataValue(String dataValue) {
            this.dataValue = dataValue;
            return this;
        }
        public String getDataValue() {
            return this.dataValue;
        }

        public QueryNameListForLxResponseBodyRiskNameListsRiskName setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryNameListForLxResponseBodyRiskNameLists extends TeaModel {
        @NameInMap("RiskName")
        public java.util.List<QueryNameListForLxResponseBodyRiskNameListsRiskName> riskName;

        public static QueryNameListForLxResponseBodyRiskNameLists build(java.util.Map<String, ?> map) throws Exception {
            QueryNameListForLxResponseBodyRiskNameLists self = new QueryNameListForLxResponseBodyRiskNameLists();
            return TeaModel.build(map, self);
        }

        public QueryNameListForLxResponseBodyRiskNameLists setRiskName(java.util.List<QueryNameListForLxResponseBodyRiskNameListsRiskName> riskName) {
            this.riskName = riskName;
            return this;
        }
        public java.util.List<QueryNameListForLxResponseBodyRiskNameListsRiskName> getRiskName() {
            return this.riskName;
        }

    }

}
