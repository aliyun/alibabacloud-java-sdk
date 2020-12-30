// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAllMarketsResponseBody extends TeaModel {
    @NameInMap("DataList")
    public GetAllMarketsResponseBodyDataList dataList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    public static GetAllMarketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllMarketsResponseBody self = new GetAllMarketsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAllMarketsResponseBody setDataList(GetAllMarketsResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetAllMarketsResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GetAllMarketsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllMarketsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetAllMarketsResponseBodyDataListUsageData extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("MarketCode")
        public String marketCode;

        @NameInMap("MarketName")
        public String marketName;

        public static GetAllMarketsResponseBodyDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetAllMarketsResponseBodyDataListUsageData self = new GetAllMarketsResponseBodyDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetAllMarketsResponseBodyDataListUsageData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public GetAllMarketsResponseBodyDataListUsageData setMarketCode(String marketCode) {
            this.marketCode = marketCode;
            return this;
        }
        public String getMarketCode() {
            return this.marketCode;
        }

        public GetAllMarketsResponseBodyDataListUsageData setMarketName(String marketName) {
            this.marketName = marketName;
            return this;
        }
        public String getMarketName() {
            return this.marketName;
        }

    }

    public static class GetAllMarketsResponseBodyDataList extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<GetAllMarketsResponseBodyDataListUsageData> usageData;

        public static GetAllMarketsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAllMarketsResponseBodyDataList self = new GetAllMarketsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetAllMarketsResponseBodyDataList setUsageData(java.util.List<GetAllMarketsResponseBodyDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetAllMarketsResponseBodyDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

}
