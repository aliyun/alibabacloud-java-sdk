// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetClientsRatioResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("DataList")
    @Validation(required = true)
    public GetClientsRatioResponseDataList dataList;

    public static GetClientsRatioResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClientsRatioResponse self = new GetClientsRatioResponse();
        return TeaModel.build(map, self);
    }

    public GetClientsRatioResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClientsRatioResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetClientsRatioResponse setDataList(GetClientsRatioResponseDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetClientsRatioResponseDataList getDataList() {
        return this.dataList;
    }

    public static class GetClientsRatioResponseDataListUsageData extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Rate")
        @Validation(required = true)
        public String rate;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static GetClientsRatioResponseDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetClientsRatioResponseDataListUsageData self = new GetClientsRatioResponseDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetClientsRatioResponseDataListUsageData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClientsRatioResponseDataListUsageData setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public GetClientsRatioResponseDataListUsageData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetClientsRatioResponseDataList extends TeaModel {
        @NameInMap("UsageData")
        @Validation(required = true)
        public java.util.List<GetClientsRatioResponseDataListUsageData> usageData;

        public static GetClientsRatioResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            GetClientsRatioResponseDataList self = new GetClientsRatioResponseDataList();
            return TeaModel.build(map, self);
        }

        public GetClientsRatioResponseDataList setUsageData(java.util.List<GetClientsRatioResponseDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetClientsRatioResponseDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

}
