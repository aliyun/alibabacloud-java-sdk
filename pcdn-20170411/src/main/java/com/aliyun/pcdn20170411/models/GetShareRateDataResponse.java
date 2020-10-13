// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetShareRateDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("DataList")
    @Validation(required = true)
    public GetShareRateDataResponseDataList dataList;

    @NameInMap("Labels")
    @Validation(required = true)
    public GetShareRateDataResponseLabels labels;

    public static GetShareRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetShareRateDataResponse self = new GetShareRateDataResponse();
        return TeaModel.build(map, self);
    }

    public GetShareRateDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetShareRateDataResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetShareRateDataResponse setDataList(GetShareRateDataResponseDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetShareRateDataResponseDataList getDataList() {
        return this.dataList;
    }

    public GetShareRateDataResponse setLabels(GetShareRateDataResponseLabels labels) {
        this.labels = labels;
        return this;
    }
    public GetShareRateDataResponseLabels getLabels() {
        return this.labels;
    }

    public static class GetShareRateDataResponseDataListUsageDataValues extends TeaModel {
        // Values
        @NameInMap("Values")
        @Validation(required = true)
        public java.util.List<String> values;

        public static GetShareRateDataResponseDataListUsageDataValues build(java.util.Map<String, ?> map) throws Exception {
            GetShareRateDataResponseDataListUsageDataValues self = new GetShareRateDataResponseDataListUsageDataValues();
            return TeaModel.build(map, self);
        }

        public GetShareRateDataResponseDataListUsageDataValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetShareRateDataResponseDataListUsageData extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("Values")
        @Validation(required = true)
        public GetShareRateDataResponseDataListUsageDataValues values;

        public static GetShareRateDataResponseDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetShareRateDataResponseDataListUsageData self = new GetShareRateDataResponseDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetShareRateDataResponseDataListUsageData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetShareRateDataResponseDataListUsageData setValues(GetShareRateDataResponseDataListUsageDataValues values) {
            this.values = values;
            return this;
        }
        public GetShareRateDataResponseDataListUsageDataValues getValues() {
            return this.values;
        }

    }

    public static class GetShareRateDataResponseDataList extends TeaModel {
        @NameInMap("UsageData")
        @Validation(required = true)
        public java.util.List<GetShareRateDataResponseDataListUsageData> usageData;

        public static GetShareRateDataResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            GetShareRateDataResponseDataList self = new GetShareRateDataResponseDataList();
            return TeaModel.build(map, self);
        }

        public GetShareRateDataResponseDataList setUsageData(java.util.List<GetShareRateDataResponseDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetShareRateDataResponseDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

    public static class GetShareRateDataResponseLabels extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public java.util.List<String> label;

        public static GetShareRateDataResponseLabels build(java.util.Map<String, ?> map) throws Exception {
            GetShareRateDataResponseLabels self = new GetShareRateDataResponseLabels();
            return TeaModel.build(map, self);
        }

        public GetShareRateDataResponseLabels setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

    }

}
