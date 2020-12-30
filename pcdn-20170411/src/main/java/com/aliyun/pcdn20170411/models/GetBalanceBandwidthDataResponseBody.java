// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetBalanceBandwidthDataResponseBody extends TeaModel {
    @NameInMap("DataList")
    public GetBalanceBandwidthDataResponseBodyDataList dataList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Labels")
    public GetBalanceBandwidthDataResponseBodyLabels labels;

    @NameInMap("Code")
    public Integer code;

    public static GetBalanceBandwidthDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBalanceBandwidthDataResponseBody self = new GetBalanceBandwidthDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBalanceBandwidthDataResponseBody setDataList(GetBalanceBandwidthDataResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetBalanceBandwidthDataResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GetBalanceBandwidthDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBalanceBandwidthDataResponseBody setLabels(GetBalanceBandwidthDataResponseBodyLabels labels) {
        this.labels = labels;
        return this;
    }
    public GetBalanceBandwidthDataResponseBodyLabels getLabels() {
        return this.labels;
    }

    public GetBalanceBandwidthDataResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetBalanceBandwidthDataResponseBodyDataListUsageDataValues extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetBalanceBandwidthDataResponseBodyDataListUsageDataValues build(java.util.Map<String, ?> map) throws Exception {
            GetBalanceBandwidthDataResponseBodyDataListUsageDataValues self = new GetBalanceBandwidthDataResponseBodyDataListUsageDataValues();
            return TeaModel.build(map, self);
        }

        public GetBalanceBandwidthDataResponseBodyDataListUsageDataValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetBalanceBandwidthDataResponseBodyDataListUsageData extends TeaModel {
        @NameInMap("Values")
        public GetBalanceBandwidthDataResponseBodyDataListUsageDataValues values;

        @NameInMap("Date")
        public String date;

        public static GetBalanceBandwidthDataResponseBodyDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetBalanceBandwidthDataResponseBodyDataListUsageData self = new GetBalanceBandwidthDataResponseBodyDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetBalanceBandwidthDataResponseBodyDataListUsageData setValues(GetBalanceBandwidthDataResponseBodyDataListUsageDataValues values) {
            this.values = values;
            return this;
        }
        public GetBalanceBandwidthDataResponseBodyDataListUsageDataValues getValues() {
            return this.values;
        }

        public GetBalanceBandwidthDataResponseBodyDataListUsageData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

    }

    public static class GetBalanceBandwidthDataResponseBodyDataList extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<GetBalanceBandwidthDataResponseBodyDataListUsageData> usageData;

        public static GetBalanceBandwidthDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetBalanceBandwidthDataResponseBodyDataList self = new GetBalanceBandwidthDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetBalanceBandwidthDataResponseBodyDataList setUsageData(java.util.List<GetBalanceBandwidthDataResponseBodyDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetBalanceBandwidthDataResponseBodyDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

    public static class GetBalanceBandwidthDataResponseBodyLabels extends TeaModel {
        @NameInMap("Label")
        public java.util.List<String> label;

        public static GetBalanceBandwidthDataResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            GetBalanceBandwidthDataResponseBodyLabels self = new GetBalanceBandwidthDataResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public GetBalanceBandwidthDataResponseBodyLabels setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

    }

}
