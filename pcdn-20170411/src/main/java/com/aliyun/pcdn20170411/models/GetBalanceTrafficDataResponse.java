// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetBalanceTrafficDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("DataList")
    @Validation(required = true)
    public GetBalanceTrafficDataResponseDataList dataList;

    @NameInMap("Labels")
    @Validation(required = true)
    public GetBalanceTrafficDataResponseLabels labels;

    public static GetBalanceTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBalanceTrafficDataResponse self = new GetBalanceTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public GetBalanceTrafficDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBalanceTrafficDataResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetBalanceTrafficDataResponse setDataList(GetBalanceTrafficDataResponseDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetBalanceTrafficDataResponseDataList getDataList() {
        return this.dataList;
    }

    public GetBalanceTrafficDataResponse setLabels(GetBalanceTrafficDataResponseLabels labels) {
        this.labels = labels;
        return this;
    }
    public GetBalanceTrafficDataResponseLabels getLabels() {
        return this.labels;
    }

    public static class GetBalanceTrafficDataResponseDataListUsageDataValues extends TeaModel {
        // Values
        @NameInMap("Values")
        @Validation(required = true)
        public java.util.List<String> values;

        public static GetBalanceTrafficDataResponseDataListUsageDataValues build(java.util.Map<String, ?> map) throws Exception {
            GetBalanceTrafficDataResponseDataListUsageDataValues self = new GetBalanceTrafficDataResponseDataListUsageDataValues();
            return TeaModel.build(map, self);
        }

        public GetBalanceTrafficDataResponseDataListUsageDataValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetBalanceTrafficDataResponseDataListUsageData extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("Values")
        @Validation(required = true)
        public GetBalanceTrafficDataResponseDataListUsageDataValues values;

        public static GetBalanceTrafficDataResponseDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetBalanceTrafficDataResponseDataListUsageData self = new GetBalanceTrafficDataResponseDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetBalanceTrafficDataResponseDataListUsageData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetBalanceTrafficDataResponseDataListUsageData setValues(GetBalanceTrafficDataResponseDataListUsageDataValues values) {
            this.values = values;
            return this;
        }
        public GetBalanceTrafficDataResponseDataListUsageDataValues getValues() {
            return this.values;
        }

    }

    public static class GetBalanceTrafficDataResponseDataList extends TeaModel {
        @NameInMap("UsageData")
        @Validation(required = true)
        public java.util.List<GetBalanceTrafficDataResponseDataListUsageData> usageData;

        public static GetBalanceTrafficDataResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            GetBalanceTrafficDataResponseDataList self = new GetBalanceTrafficDataResponseDataList();
            return TeaModel.build(map, self);
        }

        public GetBalanceTrafficDataResponseDataList setUsageData(java.util.List<GetBalanceTrafficDataResponseDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetBalanceTrafficDataResponseDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

    public static class GetBalanceTrafficDataResponseLabels extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public java.util.List<String> label;

        public static GetBalanceTrafficDataResponseLabels build(java.util.Map<String, ?> map) throws Exception {
            GetBalanceTrafficDataResponseLabels self = new GetBalanceTrafficDataResponseLabels();
            return TeaModel.build(map, self);
        }

        public GetBalanceTrafficDataResponseLabels setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

    }

}
