// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetBandwidthDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("DataList")
    @Validation(required = true)
    public GetBandwidthDataResponseDataList dataList;

    @NameInMap("Labels")
    @Validation(required = true)
    public GetBandwidthDataResponseLabels labels;

    public static GetBandwidthDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBandwidthDataResponse self = new GetBandwidthDataResponse();
        return TeaModel.build(map, self);
    }

    public GetBandwidthDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBandwidthDataResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetBandwidthDataResponse setDataList(GetBandwidthDataResponseDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetBandwidthDataResponseDataList getDataList() {
        return this.dataList;
    }

    public GetBandwidthDataResponse setLabels(GetBandwidthDataResponseLabels labels) {
        this.labels = labels;
        return this;
    }
    public GetBandwidthDataResponseLabels getLabels() {
        return this.labels;
    }

    public static class GetBandwidthDataResponseDataListUsageDataValues extends TeaModel {
        // Values
        @NameInMap("Values")
        @Validation(required = true)
        public java.util.List<String> values;

        public static GetBandwidthDataResponseDataListUsageDataValues build(java.util.Map<String, ?> map) throws Exception {
            GetBandwidthDataResponseDataListUsageDataValues self = new GetBandwidthDataResponseDataListUsageDataValues();
            return TeaModel.build(map, self);
        }

        public GetBandwidthDataResponseDataListUsageDataValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetBandwidthDataResponseDataListUsageData extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("Values")
        @Validation(required = true)
        public GetBandwidthDataResponseDataListUsageDataValues values;

        public static GetBandwidthDataResponseDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetBandwidthDataResponseDataListUsageData self = new GetBandwidthDataResponseDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetBandwidthDataResponseDataListUsageData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetBandwidthDataResponseDataListUsageData setValues(GetBandwidthDataResponseDataListUsageDataValues values) {
            this.values = values;
            return this;
        }
        public GetBandwidthDataResponseDataListUsageDataValues getValues() {
            return this.values;
        }

    }

    public static class GetBandwidthDataResponseDataList extends TeaModel {
        @NameInMap("UsageData")
        @Validation(required = true)
        public java.util.List<GetBandwidthDataResponseDataListUsageData> usageData;

        public static GetBandwidthDataResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            GetBandwidthDataResponseDataList self = new GetBandwidthDataResponseDataList();
            return TeaModel.build(map, self);
        }

        public GetBandwidthDataResponseDataList setUsageData(java.util.List<GetBandwidthDataResponseDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetBandwidthDataResponseDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

    public static class GetBandwidthDataResponseLabels extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public java.util.List<String> label;

        public static GetBandwidthDataResponseLabels build(java.util.Map<String, ?> map) throws Exception {
            GetBandwidthDataResponseLabels self = new GetBandwidthDataResponseLabels();
            return TeaModel.build(map, self);
        }

        public GetBandwidthDataResponseLabels setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

    }

}
