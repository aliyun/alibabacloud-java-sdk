// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetFirstFrameDelayDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("DataList")
    @Validation(required = true)
    public GetFirstFrameDelayDataResponseDataList dataList;

    @NameInMap("Labels")
    @Validation(required = true)
    public GetFirstFrameDelayDataResponseLabels labels;

    public static GetFirstFrameDelayDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFirstFrameDelayDataResponse self = new GetFirstFrameDelayDataResponse();
        return TeaModel.build(map, self);
    }

    public GetFirstFrameDelayDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFirstFrameDelayDataResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetFirstFrameDelayDataResponse setDataList(GetFirstFrameDelayDataResponseDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetFirstFrameDelayDataResponseDataList getDataList() {
        return this.dataList;
    }

    public GetFirstFrameDelayDataResponse setLabels(GetFirstFrameDelayDataResponseLabels labels) {
        this.labels = labels;
        return this;
    }
    public GetFirstFrameDelayDataResponseLabels getLabels() {
        return this.labels;
    }

    public static class GetFirstFrameDelayDataResponseDataListUsageDataValues extends TeaModel {
        // Values
        @NameInMap("Values")
        @Validation(required = true)
        public java.util.List<String> values;

        public static GetFirstFrameDelayDataResponseDataListUsageDataValues build(java.util.Map<String, ?> map) throws Exception {
            GetFirstFrameDelayDataResponseDataListUsageDataValues self = new GetFirstFrameDelayDataResponseDataListUsageDataValues();
            return TeaModel.build(map, self);
        }

        public GetFirstFrameDelayDataResponseDataListUsageDataValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetFirstFrameDelayDataResponseDataListUsageData extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("Values")
        @Validation(required = true)
        public GetFirstFrameDelayDataResponseDataListUsageDataValues values;

        public static GetFirstFrameDelayDataResponseDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetFirstFrameDelayDataResponseDataListUsageData self = new GetFirstFrameDelayDataResponseDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetFirstFrameDelayDataResponseDataListUsageData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetFirstFrameDelayDataResponseDataListUsageData setValues(GetFirstFrameDelayDataResponseDataListUsageDataValues values) {
            this.values = values;
            return this;
        }
        public GetFirstFrameDelayDataResponseDataListUsageDataValues getValues() {
            return this.values;
        }

    }

    public static class GetFirstFrameDelayDataResponseDataList extends TeaModel {
        @NameInMap("UsageData")
        @Validation(required = true)
        public java.util.List<GetFirstFrameDelayDataResponseDataListUsageData> usageData;

        public static GetFirstFrameDelayDataResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            GetFirstFrameDelayDataResponseDataList self = new GetFirstFrameDelayDataResponseDataList();
            return TeaModel.build(map, self);
        }

        public GetFirstFrameDelayDataResponseDataList setUsageData(java.util.List<GetFirstFrameDelayDataResponseDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetFirstFrameDelayDataResponseDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

    public static class GetFirstFrameDelayDataResponseLabels extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public java.util.List<String> label;

        public static GetFirstFrameDelayDataResponseLabels build(java.util.Map<String, ?> map) throws Exception {
            GetFirstFrameDelayDataResponseLabels self = new GetFirstFrameDelayDataResponseLabels();
            return TeaModel.build(map, self);
        }

        public GetFirstFrameDelayDataResponseLabels setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

    }

}
