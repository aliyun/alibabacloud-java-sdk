// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetFluencyDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("DataList")
    @Validation(required = true)
    public GetFluencyDataResponseDataList dataList;

    @NameInMap("Labels")
    @Validation(required = true)
    public GetFluencyDataResponseLabels labels;

    public static GetFluencyDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFluencyDataResponse self = new GetFluencyDataResponse();
        return TeaModel.build(map, self);
    }

    public GetFluencyDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFluencyDataResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetFluencyDataResponse setDataList(GetFluencyDataResponseDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetFluencyDataResponseDataList getDataList() {
        return this.dataList;
    }

    public GetFluencyDataResponse setLabels(GetFluencyDataResponseLabels labels) {
        this.labels = labels;
        return this;
    }
    public GetFluencyDataResponseLabels getLabels() {
        return this.labels;
    }

    public static class GetFluencyDataResponseDataListUsageDataValues extends TeaModel {
        // Values
        @NameInMap("Values")
        @Validation(required = true)
        public java.util.List<String> values;

        public static GetFluencyDataResponseDataListUsageDataValues build(java.util.Map<String, ?> map) throws Exception {
            GetFluencyDataResponseDataListUsageDataValues self = new GetFluencyDataResponseDataListUsageDataValues();
            return TeaModel.build(map, self);
        }

        public GetFluencyDataResponseDataListUsageDataValues setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetFluencyDataResponseDataListUsageData extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("Values")
        @Validation(required = true)
        public GetFluencyDataResponseDataListUsageDataValues values;

        public static GetFluencyDataResponseDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetFluencyDataResponseDataListUsageData self = new GetFluencyDataResponseDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetFluencyDataResponseDataListUsageData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetFluencyDataResponseDataListUsageData setValues(GetFluencyDataResponseDataListUsageDataValues values) {
            this.values = values;
            return this;
        }
        public GetFluencyDataResponseDataListUsageDataValues getValues() {
            return this.values;
        }

    }

    public static class GetFluencyDataResponseDataList extends TeaModel {
        @NameInMap("UsageData")
        @Validation(required = true)
        public java.util.List<GetFluencyDataResponseDataListUsageData> usageData;

        public static GetFluencyDataResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            GetFluencyDataResponseDataList self = new GetFluencyDataResponseDataList();
            return TeaModel.build(map, self);
        }

        public GetFluencyDataResponseDataList setUsageData(java.util.List<GetFluencyDataResponseDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetFluencyDataResponseDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

    public static class GetFluencyDataResponseLabels extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public java.util.List<String> label;

        public static GetFluencyDataResponseLabels build(java.util.Map<String, ?> map) throws Exception {
            GetFluencyDataResponseLabels self = new GetFluencyDataResponseLabels();
            return TeaModel.build(map, self);
        }

        public GetFluencyDataResponseLabels setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

    }

}
