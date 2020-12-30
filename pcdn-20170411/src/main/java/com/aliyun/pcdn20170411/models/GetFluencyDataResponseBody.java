// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetFluencyDataResponseBody extends TeaModel {
    @NameInMap("DataList")
    public GetFluencyDataResponseBodyDataList dataList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Labels")
    public GetFluencyDataResponseBodyLabels labels;

    @NameInMap("Code")
    public Integer code;

    public static GetFluencyDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFluencyDataResponseBody self = new GetFluencyDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFluencyDataResponseBody setDataList(GetFluencyDataResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetFluencyDataResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GetFluencyDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFluencyDataResponseBody setLabels(GetFluencyDataResponseBodyLabels labels) {
        this.labels = labels;
        return this;
    }
    public GetFluencyDataResponseBodyLabels getLabels() {
        return this.labels;
    }

    public GetFluencyDataResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetFluencyDataResponseBodyDataListUsageDataValues extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetFluencyDataResponseBodyDataListUsageDataValues build(java.util.Map<String, ?> map) throws Exception {
            GetFluencyDataResponseBodyDataListUsageDataValues self = new GetFluencyDataResponseBodyDataListUsageDataValues();
            return TeaModel.build(map, self);
        }

        public GetFluencyDataResponseBodyDataListUsageDataValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetFluencyDataResponseBodyDataListUsageData extends TeaModel {
        @NameInMap("Values")
        public GetFluencyDataResponseBodyDataListUsageDataValues values;

        @NameInMap("Date")
        public String date;

        public static GetFluencyDataResponseBodyDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetFluencyDataResponseBodyDataListUsageData self = new GetFluencyDataResponseBodyDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetFluencyDataResponseBodyDataListUsageData setValues(GetFluencyDataResponseBodyDataListUsageDataValues values) {
            this.values = values;
            return this;
        }
        public GetFluencyDataResponseBodyDataListUsageDataValues getValues() {
            return this.values;
        }

        public GetFluencyDataResponseBodyDataListUsageData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

    }

    public static class GetFluencyDataResponseBodyDataList extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<GetFluencyDataResponseBodyDataListUsageData> usageData;

        public static GetFluencyDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetFluencyDataResponseBodyDataList self = new GetFluencyDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetFluencyDataResponseBodyDataList setUsageData(java.util.List<GetFluencyDataResponseBodyDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetFluencyDataResponseBodyDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

    public static class GetFluencyDataResponseBodyLabels extends TeaModel {
        @NameInMap("Label")
        public java.util.List<String> label;

        public static GetFluencyDataResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            GetFluencyDataResponseBodyLabels self = new GetFluencyDataResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public GetFluencyDataResponseBodyLabels setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

    }

}
