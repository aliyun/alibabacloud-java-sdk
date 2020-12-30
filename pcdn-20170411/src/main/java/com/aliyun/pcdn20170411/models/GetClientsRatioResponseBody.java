// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetClientsRatioResponseBody extends TeaModel {
    @NameInMap("DataList")
    public GetClientsRatioResponseBodyDataList dataList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    public static GetClientsRatioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClientsRatioResponseBody self = new GetClientsRatioResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClientsRatioResponseBody setDataList(GetClientsRatioResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetClientsRatioResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GetClientsRatioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClientsRatioResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetClientsRatioResponseBodyDataListUsageData extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        @NameInMap("Rate")
        public String rate;

        public static GetClientsRatioResponseBodyDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetClientsRatioResponseBodyDataListUsageData self = new GetClientsRatioResponseBodyDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetClientsRatioResponseBodyDataListUsageData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetClientsRatioResponseBodyDataListUsageData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClientsRatioResponseBodyDataListUsageData setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

    }

    public static class GetClientsRatioResponseBodyDataList extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<GetClientsRatioResponseBodyDataListUsageData> usageData;

        public static GetClientsRatioResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetClientsRatioResponseBodyDataList self = new GetClientsRatioResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetClientsRatioResponseBodyDataList setUsageData(java.util.List<GetClientsRatioResponseBodyDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetClientsRatioResponseBodyDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

}
