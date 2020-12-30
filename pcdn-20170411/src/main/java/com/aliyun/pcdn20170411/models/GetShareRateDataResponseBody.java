// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetShareRateDataResponseBody extends TeaModel {
    @NameInMap("DataList")
    public GetShareRateDataResponseBodyDataList dataList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Labels")
    public GetShareRateDataResponseBodyLabels labels;

    @NameInMap("Code")
    public Integer code;

    public static GetShareRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetShareRateDataResponseBody self = new GetShareRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetShareRateDataResponseBody setDataList(GetShareRateDataResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetShareRateDataResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GetShareRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetShareRateDataResponseBody setLabels(GetShareRateDataResponseBodyLabels labels) {
        this.labels = labels;
        return this;
    }
    public GetShareRateDataResponseBodyLabels getLabels() {
        return this.labels;
    }

    public GetShareRateDataResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetShareRateDataResponseBodyDataListUsageDataValues extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetShareRateDataResponseBodyDataListUsageDataValues build(java.util.Map<String, ?> map) throws Exception {
            GetShareRateDataResponseBodyDataListUsageDataValues self = new GetShareRateDataResponseBodyDataListUsageDataValues();
            return TeaModel.build(map, self);
        }

        public GetShareRateDataResponseBodyDataListUsageDataValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetShareRateDataResponseBodyDataListUsageData extends TeaModel {
        @NameInMap("Values")
        public GetShareRateDataResponseBodyDataListUsageDataValues values;

        @NameInMap("Date")
        public String date;

        public static GetShareRateDataResponseBodyDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetShareRateDataResponseBodyDataListUsageData self = new GetShareRateDataResponseBodyDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetShareRateDataResponseBodyDataListUsageData setValues(GetShareRateDataResponseBodyDataListUsageDataValues values) {
            this.values = values;
            return this;
        }
        public GetShareRateDataResponseBodyDataListUsageDataValues getValues() {
            return this.values;
        }

        public GetShareRateDataResponseBodyDataListUsageData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

    }

    public static class GetShareRateDataResponseBodyDataList extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<GetShareRateDataResponseBodyDataListUsageData> usageData;

        public static GetShareRateDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetShareRateDataResponseBodyDataList self = new GetShareRateDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetShareRateDataResponseBodyDataList setUsageData(java.util.List<GetShareRateDataResponseBodyDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetShareRateDataResponseBodyDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

    public static class GetShareRateDataResponseBodyLabels extends TeaModel {
        @NameInMap("Label")
        public java.util.List<String> label;

        public static GetShareRateDataResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            GetShareRateDataResponseBodyLabels self = new GetShareRateDataResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public GetShareRateDataResponseBodyLabels setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

    }

}
