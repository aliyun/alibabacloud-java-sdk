// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAllRegionsResponseBody extends TeaModel {
    @NameInMap("DataList")
    public GetAllRegionsResponseBodyDataList dataList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    public static GetAllRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllRegionsResponseBody self = new GetAllRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAllRegionsResponseBody setDataList(GetAllRegionsResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetAllRegionsResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GetAllRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllRegionsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetAllRegionsResponseBodyDataListUsageData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static GetAllRegionsResponseBodyDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetAllRegionsResponseBodyDataListUsageData self = new GetAllRegionsResponseBodyDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetAllRegionsResponseBodyDataListUsageData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetAllRegionsResponseBodyDataListUsageData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAllRegionsResponseBodyDataList extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<GetAllRegionsResponseBodyDataListUsageData> usageData;

        public static GetAllRegionsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAllRegionsResponseBodyDataList self = new GetAllRegionsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetAllRegionsResponseBodyDataList setUsageData(java.util.List<GetAllRegionsResponseBodyDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetAllRegionsResponseBodyDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

}
