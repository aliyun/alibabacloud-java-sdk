// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetFirstFrameDelayDataResponseBody extends TeaModel {
    @NameInMap("DataList")
    public GetFirstFrameDelayDataResponseBodyDataList dataList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Labels")
    public GetFirstFrameDelayDataResponseBodyLabels labels;

    @NameInMap("Code")
    public Integer code;

    public static GetFirstFrameDelayDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFirstFrameDelayDataResponseBody self = new GetFirstFrameDelayDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFirstFrameDelayDataResponseBody setDataList(GetFirstFrameDelayDataResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetFirstFrameDelayDataResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GetFirstFrameDelayDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFirstFrameDelayDataResponseBody setLabels(GetFirstFrameDelayDataResponseBodyLabels labels) {
        this.labels = labels;
        return this;
    }
    public GetFirstFrameDelayDataResponseBodyLabels getLabels() {
        return this.labels;
    }

    public GetFirstFrameDelayDataResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetFirstFrameDelayDataResponseBodyDataListUsageDataValues extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetFirstFrameDelayDataResponseBodyDataListUsageDataValues build(java.util.Map<String, ?> map) throws Exception {
            GetFirstFrameDelayDataResponseBodyDataListUsageDataValues self = new GetFirstFrameDelayDataResponseBodyDataListUsageDataValues();
            return TeaModel.build(map, self);
        }

        public GetFirstFrameDelayDataResponseBodyDataListUsageDataValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetFirstFrameDelayDataResponseBodyDataListUsageData extends TeaModel {
        @NameInMap("Values")
        public GetFirstFrameDelayDataResponseBodyDataListUsageDataValues values;

        @NameInMap("Date")
        public String date;

        public static GetFirstFrameDelayDataResponseBodyDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetFirstFrameDelayDataResponseBodyDataListUsageData self = new GetFirstFrameDelayDataResponseBodyDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetFirstFrameDelayDataResponseBodyDataListUsageData setValues(GetFirstFrameDelayDataResponseBodyDataListUsageDataValues values) {
            this.values = values;
            return this;
        }
        public GetFirstFrameDelayDataResponseBodyDataListUsageDataValues getValues() {
            return this.values;
        }

        public GetFirstFrameDelayDataResponseBodyDataListUsageData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

    }

    public static class GetFirstFrameDelayDataResponseBodyDataList extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<GetFirstFrameDelayDataResponseBodyDataListUsageData> usageData;

        public static GetFirstFrameDelayDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetFirstFrameDelayDataResponseBodyDataList self = new GetFirstFrameDelayDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetFirstFrameDelayDataResponseBodyDataList setUsageData(java.util.List<GetFirstFrameDelayDataResponseBodyDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetFirstFrameDelayDataResponseBodyDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

    public static class GetFirstFrameDelayDataResponseBodyLabels extends TeaModel {
        @NameInMap("Label")
        public java.util.List<String> label;

        public static GetFirstFrameDelayDataResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            GetFirstFrameDelayDataResponseBodyLabels self = new GetFirstFrameDelayDataResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public GetFirstFrameDelayDataResponseBodyLabels setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

    }

}
