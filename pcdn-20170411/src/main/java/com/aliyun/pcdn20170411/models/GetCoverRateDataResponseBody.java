// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetCoverRateDataResponseBody extends TeaModel {
    @NameInMap("DataList")
    public GetCoverRateDataResponseBodyDataList dataList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Labels")
    public GetCoverRateDataResponseBodyLabels labels;

    @NameInMap("Code")
    public Integer code;

    public static GetCoverRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCoverRateDataResponseBody self = new GetCoverRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCoverRateDataResponseBody setDataList(GetCoverRateDataResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetCoverRateDataResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GetCoverRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCoverRateDataResponseBody setLabels(GetCoverRateDataResponseBodyLabels labels) {
        this.labels = labels;
        return this;
    }
    public GetCoverRateDataResponseBodyLabels getLabels() {
        return this.labels;
    }

    public GetCoverRateDataResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetCoverRateDataResponseBodyDataListUsageDataValues extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetCoverRateDataResponseBodyDataListUsageDataValues build(java.util.Map<String, ?> map) throws Exception {
            GetCoverRateDataResponseBodyDataListUsageDataValues self = new GetCoverRateDataResponseBodyDataListUsageDataValues();
            return TeaModel.build(map, self);
        }

        public GetCoverRateDataResponseBodyDataListUsageDataValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetCoverRateDataResponseBodyDataListUsageData extends TeaModel {
        @NameInMap("Values")
        public GetCoverRateDataResponseBodyDataListUsageDataValues values;

        @NameInMap("Date")
        public String date;

        public static GetCoverRateDataResponseBodyDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetCoverRateDataResponseBodyDataListUsageData self = new GetCoverRateDataResponseBodyDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetCoverRateDataResponseBodyDataListUsageData setValues(GetCoverRateDataResponseBodyDataListUsageDataValues values) {
            this.values = values;
            return this;
        }
        public GetCoverRateDataResponseBodyDataListUsageDataValues getValues() {
            return this.values;
        }

        public GetCoverRateDataResponseBodyDataListUsageData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

    }

    public static class GetCoverRateDataResponseBodyDataList extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<GetCoverRateDataResponseBodyDataListUsageData> usageData;

        public static GetCoverRateDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetCoverRateDataResponseBodyDataList self = new GetCoverRateDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetCoverRateDataResponseBodyDataList setUsageData(java.util.List<GetCoverRateDataResponseBodyDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetCoverRateDataResponseBodyDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

    public static class GetCoverRateDataResponseBodyLabels extends TeaModel {
        @NameInMap("Label")
        public java.util.List<String> label;

        public static GetCoverRateDataResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            GetCoverRateDataResponseBodyLabels self = new GetCoverRateDataResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public GetCoverRateDataResponseBodyLabels setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

    }

}
