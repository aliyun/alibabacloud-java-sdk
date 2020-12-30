// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAccessDataResponseBody extends TeaModel {
    @NameInMap("DataList")
    public GetAccessDataResponseBodyDataList dataList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Labels")
    public GetAccessDataResponseBodyLabels labels;

    @NameInMap("Code")
    public Integer code;

    public static GetAccessDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccessDataResponseBody self = new GetAccessDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccessDataResponseBody setDataList(GetAccessDataResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetAccessDataResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GetAccessDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccessDataResponseBody setLabels(GetAccessDataResponseBodyLabels labels) {
        this.labels = labels;
        return this;
    }
    public GetAccessDataResponseBodyLabels getLabels() {
        return this.labels;
    }

    public GetAccessDataResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetAccessDataResponseBodyDataListUsageDataValues extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetAccessDataResponseBodyDataListUsageDataValues build(java.util.Map<String, ?> map) throws Exception {
            GetAccessDataResponseBodyDataListUsageDataValues self = new GetAccessDataResponseBodyDataListUsageDataValues();
            return TeaModel.build(map, self);
        }

        public GetAccessDataResponseBodyDataListUsageDataValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetAccessDataResponseBodyDataListUsageData extends TeaModel {
        @NameInMap("Values")
        public GetAccessDataResponseBodyDataListUsageDataValues values;

        @NameInMap("Date")
        public String date;

        public static GetAccessDataResponseBodyDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetAccessDataResponseBodyDataListUsageData self = new GetAccessDataResponseBodyDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetAccessDataResponseBodyDataListUsageData setValues(GetAccessDataResponseBodyDataListUsageDataValues values) {
            this.values = values;
            return this;
        }
        public GetAccessDataResponseBodyDataListUsageDataValues getValues() {
            return this.values;
        }

        public GetAccessDataResponseBodyDataListUsageData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

    }

    public static class GetAccessDataResponseBodyDataList extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<GetAccessDataResponseBodyDataListUsageData> usageData;

        public static GetAccessDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAccessDataResponseBodyDataList self = new GetAccessDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetAccessDataResponseBodyDataList setUsageData(java.util.List<GetAccessDataResponseBodyDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetAccessDataResponseBodyDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

    public static class GetAccessDataResponseBodyLabels extends TeaModel {
        @NameInMap("Label")
        public java.util.List<String> label;

        public static GetAccessDataResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            GetAccessDataResponseBodyLabels self = new GetAccessDataResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public GetAccessDataResponseBodyLabels setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

    }

}
