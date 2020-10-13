// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAllPlatformTypesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("DataList")
    @Validation(required = true)
    public GetAllPlatformTypesResponseDataList dataList;

    public static GetAllPlatformTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllPlatformTypesResponse self = new GetAllPlatformTypesResponse();
        return TeaModel.build(map, self);
    }

    public GetAllPlatformTypesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllPlatformTypesResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAllPlatformTypesResponse setDataList(GetAllPlatformTypesResponseDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetAllPlatformTypesResponseDataList getDataList() {
        return this.dataList;
    }

    public static class GetAllPlatformTypesResponseDataListUsageData extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public Integer code;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static GetAllPlatformTypesResponseDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetAllPlatformTypesResponseDataListUsageData self = new GetAllPlatformTypesResponseDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetAllPlatformTypesResponseDataListUsageData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public GetAllPlatformTypesResponseDataListUsageData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAllPlatformTypesResponseDataList extends TeaModel {
        @NameInMap("UsageData")
        @Validation(required = true)
        public java.util.List<GetAllPlatformTypesResponseDataListUsageData> usageData;

        public static GetAllPlatformTypesResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAllPlatformTypesResponseDataList self = new GetAllPlatformTypesResponseDataList();
            return TeaModel.build(map, self);
        }

        public GetAllPlatformTypesResponseDataList setUsageData(java.util.List<GetAllPlatformTypesResponseDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetAllPlatformTypesResponseDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

}
