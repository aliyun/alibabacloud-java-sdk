// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetBandwidthDataResponseBody extends TeaModel {
    @NameInMap("DataList")
    public GetBandwidthDataResponseBodyDataList dataList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Labels")
    public GetBandwidthDataResponseBodyLabels labels;

    @NameInMap("Code")
    public Integer code;

    public static GetBandwidthDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBandwidthDataResponseBody self = new GetBandwidthDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBandwidthDataResponseBody setDataList(GetBandwidthDataResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetBandwidthDataResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GetBandwidthDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBandwidthDataResponseBody setLabels(GetBandwidthDataResponseBodyLabels labels) {
        this.labels = labels;
        return this;
    }
    public GetBandwidthDataResponseBodyLabels getLabels() {
        return this.labels;
    }

    public GetBandwidthDataResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetBandwidthDataResponseBodyDataListUsageDataValues extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetBandwidthDataResponseBodyDataListUsageDataValues build(java.util.Map<String, ?> map) throws Exception {
            GetBandwidthDataResponseBodyDataListUsageDataValues self = new GetBandwidthDataResponseBodyDataListUsageDataValues();
            return TeaModel.build(map, self);
        }

        public GetBandwidthDataResponseBodyDataListUsageDataValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetBandwidthDataResponseBodyDataListUsageData extends TeaModel {
        @NameInMap("Values")
        public GetBandwidthDataResponseBodyDataListUsageDataValues values;

        @NameInMap("Date")
        public String date;

        public static GetBandwidthDataResponseBodyDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetBandwidthDataResponseBodyDataListUsageData self = new GetBandwidthDataResponseBodyDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetBandwidthDataResponseBodyDataListUsageData setValues(GetBandwidthDataResponseBodyDataListUsageDataValues values) {
            this.values = values;
            return this;
        }
        public GetBandwidthDataResponseBodyDataListUsageDataValues getValues() {
            return this.values;
        }

        public GetBandwidthDataResponseBodyDataListUsageData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

    }

    public static class GetBandwidthDataResponseBodyDataList extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<GetBandwidthDataResponseBodyDataListUsageData> usageData;

        public static GetBandwidthDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetBandwidthDataResponseBodyDataList self = new GetBandwidthDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetBandwidthDataResponseBodyDataList setUsageData(java.util.List<GetBandwidthDataResponseBodyDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetBandwidthDataResponseBodyDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

    public static class GetBandwidthDataResponseBodyLabels extends TeaModel {
        @NameInMap("Label")
        public java.util.List<String> label;

        public static GetBandwidthDataResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            GetBandwidthDataResponseBodyLabels self = new GetBandwidthDataResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public GetBandwidthDataResponseBodyLabels setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

    }

}
