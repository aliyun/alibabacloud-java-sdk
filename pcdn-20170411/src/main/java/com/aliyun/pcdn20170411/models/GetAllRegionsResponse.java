// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAllRegionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("DataList")
    @Validation(required = true)
    public GetAllRegionsResponseDataList dataList;

    public static GetAllRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllRegionsResponse self = new GetAllRegionsResponse();
        return TeaModel.build(map, self);
    }

    public GetAllRegionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllRegionsResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAllRegionsResponse setDataList(GetAllRegionsResponseDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetAllRegionsResponseDataList getDataList() {
        return this.dataList;
    }

    public static class GetAllRegionsResponseDataListUsageData extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static GetAllRegionsResponseDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetAllRegionsResponseDataListUsageData self = new GetAllRegionsResponseDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetAllRegionsResponseDataListUsageData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetAllRegionsResponseDataListUsageData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAllRegionsResponseDataList extends TeaModel {
        @NameInMap("UsageData")
        @Validation(required = true)
        public java.util.List<GetAllRegionsResponseDataListUsageData> usageData;

        public static GetAllRegionsResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAllRegionsResponseDataList self = new GetAllRegionsResponseDataList();
            return TeaModel.build(map, self);
        }

        public GetAllRegionsResponseDataList setUsageData(java.util.List<GetAllRegionsResponseDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetAllRegionsResponseDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

}
