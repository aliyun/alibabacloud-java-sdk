// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAllMarketsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("DataList")
    @Validation(required = true)
    public GetAllMarketsResponseDataList dataList;

    public static GetAllMarketsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllMarketsResponse self = new GetAllMarketsResponse();
        return TeaModel.build(map, self);
    }

    public GetAllMarketsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllMarketsResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAllMarketsResponse setDataList(GetAllMarketsResponseDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetAllMarketsResponseDataList getDataList() {
        return this.dataList;
    }

    public static class GetAllMarketsResponseDataListUsageData extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public Integer code;

        @NameInMap("MarketCode")
        @Validation(required = true)
        public String marketCode;

        @NameInMap("MarketName")
        @Validation(required = true)
        public String marketName;

        public static GetAllMarketsResponseDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetAllMarketsResponseDataListUsageData self = new GetAllMarketsResponseDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetAllMarketsResponseDataListUsageData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public GetAllMarketsResponseDataListUsageData setMarketCode(String marketCode) {
            this.marketCode = marketCode;
            return this;
        }
        public String getMarketCode() {
            return this.marketCode;
        }

        public GetAllMarketsResponseDataListUsageData setMarketName(String marketName) {
            this.marketName = marketName;
            return this;
        }
        public String getMarketName() {
            return this.marketName;
        }

    }

    public static class GetAllMarketsResponseDataList extends TeaModel {
        @NameInMap("UsageData")
        @Validation(required = true)
        public java.util.List<GetAllMarketsResponseDataListUsageData> usageData;

        public static GetAllMarketsResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAllMarketsResponseDataList self = new GetAllMarketsResponseDataList();
            return TeaModel.build(map, self);
        }

        public GetAllMarketsResponseDataList setUsageData(java.util.List<GetAllMarketsResponseDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetAllMarketsResponseDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

}
