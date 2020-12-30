// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetBalanceTrafficDataResponseBody extends TeaModel {
    @NameInMap("DataList")
    public GetBalanceTrafficDataResponseBodyDataList dataList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Labels")
    public GetBalanceTrafficDataResponseBodyLabels labels;

    @NameInMap("Code")
    public Integer code;

    public static GetBalanceTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBalanceTrafficDataResponseBody self = new GetBalanceTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBalanceTrafficDataResponseBody setDataList(GetBalanceTrafficDataResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetBalanceTrafficDataResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GetBalanceTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBalanceTrafficDataResponseBody setLabels(GetBalanceTrafficDataResponseBodyLabels labels) {
        this.labels = labels;
        return this;
    }
    public GetBalanceTrafficDataResponseBodyLabels getLabels() {
        return this.labels;
    }

    public GetBalanceTrafficDataResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetBalanceTrafficDataResponseBodyDataListUsageDataValues extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetBalanceTrafficDataResponseBodyDataListUsageDataValues build(java.util.Map<String, ?> map) throws Exception {
            GetBalanceTrafficDataResponseBodyDataListUsageDataValues self = new GetBalanceTrafficDataResponseBodyDataListUsageDataValues();
            return TeaModel.build(map, self);
        }

        public GetBalanceTrafficDataResponseBodyDataListUsageDataValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetBalanceTrafficDataResponseBodyDataListUsageData extends TeaModel {
        @NameInMap("Values")
        public GetBalanceTrafficDataResponseBodyDataListUsageDataValues values;

        @NameInMap("Date")
        public String date;

        public static GetBalanceTrafficDataResponseBodyDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetBalanceTrafficDataResponseBodyDataListUsageData self = new GetBalanceTrafficDataResponseBodyDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetBalanceTrafficDataResponseBodyDataListUsageData setValues(GetBalanceTrafficDataResponseBodyDataListUsageDataValues values) {
            this.values = values;
            return this;
        }
        public GetBalanceTrafficDataResponseBodyDataListUsageDataValues getValues() {
            return this.values;
        }

        public GetBalanceTrafficDataResponseBodyDataListUsageData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

    }

    public static class GetBalanceTrafficDataResponseBodyDataList extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<GetBalanceTrafficDataResponseBodyDataListUsageData> usageData;

        public static GetBalanceTrafficDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetBalanceTrafficDataResponseBodyDataList self = new GetBalanceTrafficDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetBalanceTrafficDataResponseBodyDataList setUsageData(java.util.List<GetBalanceTrafficDataResponseBodyDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetBalanceTrafficDataResponseBodyDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

    public static class GetBalanceTrafficDataResponseBodyLabels extends TeaModel {
        @NameInMap("Label")
        public java.util.List<String> label;

        public static GetBalanceTrafficDataResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            GetBalanceTrafficDataResponseBodyLabels self = new GetBalanceTrafficDataResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public GetBalanceTrafficDataResponseBodyLabels setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

    }

}
