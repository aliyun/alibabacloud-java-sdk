// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetTrafficDataResponseBody extends TeaModel {
    @NameInMap("DataList")
    public GetTrafficDataResponseBodyDataList dataList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Labels")
    public GetTrafficDataResponseBodyLabels labels;

    @NameInMap("Code")
    public Integer code;

    public static GetTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrafficDataResponseBody self = new GetTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrafficDataResponseBody setDataList(GetTrafficDataResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetTrafficDataResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GetTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrafficDataResponseBody setLabels(GetTrafficDataResponseBodyLabels labels) {
        this.labels = labels;
        return this;
    }
    public GetTrafficDataResponseBodyLabels getLabels() {
        return this.labels;
    }

    public GetTrafficDataResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetTrafficDataResponseBodyDataListUsageDataValues extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetTrafficDataResponseBodyDataListUsageDataValues build(java.util.Map<String, ?> map) throws Exception {
            GetTrafficDataResponseBodyDataListUsageDataValues self = new GetTrafficDataResponseBodyDataListUsageDataValues();
            return TeaModel.build(map, self);
        }

        public GetTrafficDataResponseBodyDataListUsageDataValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetTrafficDataResponseBodyDataListUsageData extends TeaModel {
        @NameInMap("Values")
        public GetTrafficDataResponseBodyDataListUsageDataValues values;

        @NameInMap("Date")
        public String date;

        public static GetTrafficDataResponseBodyDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetTrafficDataResponseBodyDataListUsageData self = new GetTrafficDataResponseBodyDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetTrafficDataResponseBodyDataListUsageData setValues(GetTrafficDataResponseBodyDataListUsageDataValues values) {
            this.values = values;
            return this;
        }
        public GetTrafficDataResponseBodyDataListUsageDataValues getValues() {
            return this.values;
        }

        public GetTrafficDataResponseBodyDataListUsageData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

    }

    public static class GetTrafficDataResponseBodyDataList extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<GetTrafficDataResponseBodyDataListUsageData> usageData;

        public static GetTrafficDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetTrafficDataResponseBodyDataList self = new GetTrafficDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetTrafficDataResponseBodyDataList setUsageData(java.util.List<GetTrafficDataResponseBodyDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetTrafficDataResponseBodyDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

    public static class GetTrafficDataResponseBodyLabels extends TeaModel {
        @NameInMap("Label")
        public java.util.List<String> label;

        public static GetTrafficDataResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            GetTrafficDataResponseBodyLabels self = new GetTrafficDataResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public GetTrafficDataResponseBodyLabels setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

    }

}
