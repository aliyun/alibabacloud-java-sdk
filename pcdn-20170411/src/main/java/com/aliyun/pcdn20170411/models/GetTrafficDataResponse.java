// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetTrafficDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("DataList")
    @Validation(required = true)
    public GetTrafficDataResponseDataList dataList;

    @NameInMap("Labels")
    @Validation(required = true)
    public GetTrafficDataResponseLabels labels;

    public static GetTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrafficDataResponse self = new GetTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public GetTrafficDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrafficDataResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTrafficDataResponse setDataList(GetTrafficDataResponseDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetTrafficDataResponseDataList getDataList() {
        return this.dataList;
    }

    public GetTrafficDataResponse setLabels(GetTrafficDataResponseLabels labels) {
        this.labels = labels;
        return this;
    }
    public GetTrafficDataResponseLabels getLabels() {
        return this.labels;
    }

    public static class GetTrafficDataResponseDataListUsageDataValues extends TeaModel {
        // Values
        @NameInMap("Values")
        @Validation(required = true)
        public java.util.List<String> values;

        public static GetTrafficDataResponseDataListUsageDataValues build(java.util.Map<String, ?> map) throws Exception {
            GetTrafficDataResponseDataListUsageDataValues self = new GetTrafficDataResponseDataListUsageDataValues();
            return TeaModel.build(map, self);
        }

        public GetTrafficDataResponseDataListUsageDataValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetTrafficDataResponseDataListUsageData extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("Values")
        @Validation(required = true)
        public GetTrafficDataResponseDataListUsageDataValues values;

        public static GetTrafficDataResponseDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetTrafficDataResponseDataListUsageData self = new GetTrafficDataResponseDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetTrafficDataResponseDataListUsageData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetTrafficDataResponseDataListUsageData setValues(GetTrafficDataResponseDataListUsageDataValues values) {
            this.values = values;
            return this;
        }
        public GetTrafficDataResponseDataListUsageDataValues getValues() {
            return this.values;
        }

    }

    public static class GetTrafficDataResponseDataList extends TeaModel {
        @NameInMap("UsageData")
        @Validation(required = true)
        public java.util.List<GetTrafficDataResponseDataListUsageData> usageData;

        public static GetTrafficDataResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            GetTrafficDataResponseDataList self = new GetTrafficDataResponseDataList();
            return TeaModel.build(map, self);
        }

        public GetTrafficDataResponseDataList setUsageData(java.util.List<GetTrafficDataResponseDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetTrafficDataResponseDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

    public static class GetTrafficDataResponseLabels extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public java.util.List<String> label;

        public static GetTrafficDataResponseLabels build(java.util.Map<String, ?> map) throws Exception {
            GetTrafficDataResponseLabels self = new GetTrafficDataResponseLabels();
            return TeaModel.build(map, self);
        }

        public GetTrafficDataResponseLabels setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

    }

}
