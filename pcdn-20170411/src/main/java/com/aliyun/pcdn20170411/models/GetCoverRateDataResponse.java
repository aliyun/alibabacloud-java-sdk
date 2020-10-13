// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetCoverRateDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("DataList")
    @Validation(required = true)
    public GetCoverRateDataResponseDataList dataList;

    @NameInMap("Labels")
    @Validation(required = true)
    public GetCoverRateDataResponseLabels labels;

    public static GetCoverRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCoverRateDataResponse self = new GetCoverRateDataResponse();
        return TeaModel.build(map, self);
    }

    public GetCoverRateDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCoverRateDataResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetCoverRateDataResponse setDataList(GetCoverRateDataResponseDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetCoverRateDataResponseDataList getDataList() {
        return this.dataList;
    }

    public GetCoverRateDataResponse setLabels(GetCoverRateDataResponseLabels labels) {
        this.labels = labels;
        return this;
    }
    public GetCoverRateDataResponseLabels getLabels() {
        return this.labels;
    }

    public static class GetCoverRateDataResponseDataListUsageDataValues extends TeaModel {
        // Values
        @NameInMap("Values")
        @Validation(required = true)
        public java.util.List<String> values;

        public static GetCoverRateDataResponseDataListUsageDataValues build(java.util.Map<String, ?> map) throws Exception {
            GetCoverRateDataResponseDataListUsageDataValues self = new GetCoverRateDataResponseDataListUsageDataValues();
            return TeaModel.build(map, self);
        }

        public GetCoverRateDataResponseDataListUsageDataValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetCoverRateDataResponseDataListUsageData extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("Values")
        @Validation(required = true)
        public GetCoverRateDataResponseDataListUsageDataValues values;

        public static GetCoverRateDataResponseDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetCoverRateDataResponseDataListUsageData self = new GetCoverRateDataResponseDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetCoverRateDataResponseDataListUsageData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetCoverRateDataResponseDataListUsageData setValues(GetCoverRateDataResponseDataListUsageDataValues values) {
            this.values = values;
            return this;
        }
        public GetCoverRateDataResponseDataListUsageDataValues getValues() {
            return this.values;
        }

    }

    public static class GetCoverRateDataResponseDataList extends TeaModel {
        @NameInMap("UsageData")
        @Validation(required = true)
        public java.util.List<GetCoverRateDataResponseDataListUsageData> usageData;

        public static GetCoverRateDataResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            GetCoverRateDataResponseDataList self = new GetCoverRateDataResponseDataList();
            return TeaModel.build(map, self);
        }

        public GetCoverRateDataResponseDataList setUsageData(java.util.List<GetCoverRateDataResponseDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetCoverRateDataResponseDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

    public static class GetCoverRateDataResponseLabels extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public java.util.List<String> label;

        public static GetCoverRateDataResponseLabels build(java.util.Map<String, ?> map) throws Exception {
            GetCoverRateDataResponseLabels self = new GetCoverRateDataResponseLabels();
            return TeaModel.build(map, self);
        }

        public GetCoverRateDataResponseLabels setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

    }

}
