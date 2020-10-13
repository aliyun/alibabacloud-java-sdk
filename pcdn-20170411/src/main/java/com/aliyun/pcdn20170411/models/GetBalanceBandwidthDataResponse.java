// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetBalanceBandwidthDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("DataList")
    @Validation(required = true)
    public GetBalanceBandwidthDataResponseDataList dataList;

    @NameInMap("Labels")
    @Validation(required = true)
    public GetBalanceBandwidthDataResponseLabels labels;

    public static GetBalanceBandwidthDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBalanceBandwidthDataResponse self = new GetBalanceBandwidthDataResponse();
        return TeaModel.build(map, self);
    }

    public GetBalanceBandwidthDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBalanceBandwidthDataResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetBalanceBandwidthDataResponse setDataList(GetBalanceBandwidthDataResponseDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetBalanceBandwidthDataResponseDataList getDataList() {
        return this.dataList;
    }

    public GetBalanceBandwidthDataResponse setLabels(GetBalanceBandwidthDataResponseLabels labels) {
        this.labels = labels;
        return this;
    }
    public GetBalanceBandwidthDataResponseLabels getLabels() {
        return this.labels;
    }

    public static class GetBalanceBandwidthDataResponseDataListUsageDataValues extends TeaModel {
        // Values
        @NameInMap("Values")
        @Validation(required = true)
        public java.util.List<String> values;

        public static GetBalanceBandwidthDataResponseDataListUsageDataValues build(java.util.Map<String, ?> map) throws Exception {
            GetBalanceBandwidthDataResponseDataListUsageDataValues self = new GetBalanceBandwidthDataResponseDataListUsageDataValues();
            return TeaModel.build(map, self);
        }

        public GetBalanceBandwidthDataResponseDataListUsageDataValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetBalanceBandwidthDataResponseDataListUsageData extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("Values")
        @Validation(required = true)
        public GetBalanceBandwidthDataResponseDataListUsageDataValues values;

        public static GetBalanceBandwidthDataResponseDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetBalanceBandwidthDataResponseDataListUsageData self = new GetBalanceBandwidthDataResponseDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetBalanceBandwidthDataResponseDataListUsageData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetBalanceBandwidthDataResponseDataListUsageData setValues(GetBalanceBandwidthDataResponseDataListUsageDataValues values) {
            this.values = values;
            return this;
        }
        public GetBalanceBandwidthDataResponseDataListUsageDataValues getValues() {
            return this.values;
        }

    }

    public static class GetBalanceBandwidthDataResponseDataList extends TeaModel {
        @NameInMap("UsageData")
        @Validation(required = true)
        public java.util.List<GetBalanceBandwidthDataResponseDataListUsageData> usageData;

        public static GetBalanceBandwidthDataResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            GetBalanceBandwidthDataResponseDataList self = new GetBalanceBandwidthDataResponseDataList();
            return TeaModel.build(map, self);
        }

        public GetBalanceBandwidthDataResponseDataList setUsageData(java.util.List<GetBalanceBandwidthDataResponseDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetBalanceBandwidthDataResponseDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

    public static class GetBalanceBandwidthDataResponseLabels extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public java.util.List<String> label;

        public static GetBalanceBandwidthDataResponseLabels build(java.util.Map<String, ?> map) throws Exception {
            GetBalanceBandwidthDataResponseLabels self = new GetBalanceBandwidthDataResponseLabels();
            return TeaModel.build(map, self);
        }

        public GetBalanceBandwidthDataResponseLabels setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

    }

}
