// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAllPlatformTypesResponseBody extends TeaModel {
    @NameInMap("DataList")
    public GetAllPlatformTypesResponseBodyDataList dataList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    public static GetAllPlatformTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllPlatformTypesResponseBody self = new GetAllPlatformTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAllPlatformTypesResponseBody setDataList(GetAllPlatformTypesResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetAllPlatformTypesResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GetAllPlatformTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllPlatformTypesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetAllPlatformTypesResponseBodyDataListUsageData extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Name")
        public String name;

        public static GetAllPlatformTypesResponseBodyDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetAllPlatformTypesResponseBodyDataListUsageData self = new GetAllPlatformTypesResponseBodyDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetAllPlatformTypesResponseBodyDataListUsageData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public GetAllPlatformTypesResponseBodyDataListUsageData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAllPlatformTypesResponseBodyDataList extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<GetAllPlatformTypesResponseBodyDataListUsageData> usageData;

        public static GetAllPlatformTypesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAllPlatformTypesResponseBodyDataList self = new GetAllPlatformTypesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetAllPlatformTypesResponseBodyDataList setUsageData(java.util.List<GetAllPlatformTypesResponseBodyDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetAllPlatformTypesResponseBodyDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

}
