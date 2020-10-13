// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAccessDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("DataList")
    @Validation(required = true)
    public GetAccessDataResponseDataList dataList;

    @NameInMap("Labels")
    @Validation(required = true)
    public GetAccessDataResponseLabels labels;

    public static GetAccessDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessDataResponse self = new GetAccessDataResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccessDataResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAccessDataResponse setDataList(GetAccessDataResponseDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetAccessDataResponseDataList getDataList() {
        return this.dataList;
    }

    public GetAccessDataResponse setLabels(GetAccessDataResponseLabels labels) {
        this.labels = labels;
        return this;
    }
    public GetAccessDataResponseLabels getLabels() {
        return this.labels;
    }

    public static class GetAccessDataResponseDataListUsageDataValues extends TeaModel {
        // Values
        @NameInMap("Values")
        @Validation(required = true)
        public java.util.List<String> values;

        public static GetAccessDataResponseDataListUsageDataValues build(java.util.Map<String, ?> map) throws Exception {
            GetAccessDataResponseDataListUsageDataValues self = new GetAccessDataResponseDataListUsageDataValues();
            return TeaModel.build(map, self);
        }

        public GetAccessDataResponseDataListUsageDataValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetAccessDataResponseDataListUsageData extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("Values")
        @Validation(required = true)
        public GetAccessDataResponseDataListUsageDataValues values;

        public static GetAccessDataResponseDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetAccessDataResponseDataListUsageData self = new GetAccessDataResponseDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetAccessDataResponseDataListUsageData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetAccessDataResponseDataListUsageData setValues(GetAccessDataResponseDataListUsageDataValues values) {
            this.values = values;
            return this;
        }
        public GetAccessDataResponseDataListUsageDataValues getValues() {
            return this.values;
        }

    }

    public static class GetAccessDataResponseDataList extends TeaModel {
        @NameInMap("UsageData")
        @Validation(required = true)
        public java.util.List<GetAccessDataResponseDataListUsageData> usageData;

        public static GetAccessDataResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAccessDataResponseDataList self = new GetAccessDataResponseDataList();
            return TeaModel.build(map, self);
        }

        public GetAccessDataResponseDataList setUsageData(java.util.List<GetAccessDataResponseDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetAccessDataResponseDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

    public static class GetAccessDataResponseLabels extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public java.util.List<String> label;

        public static GetAccessDataResponseLabels build(java.util.Map<String, ?> map) throws Exception {
            GetAccessDataResponseLabels self = new GetAccessDataResponseLabels();
            return TeaModel.build(map, self);
        }

        public GetAccessDataResponseLabels setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

    }

}
