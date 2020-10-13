// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAllAppVersionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("DataList")
    @Validation(required = true)
    public GetAllAppVersionsResponseDataList dataList;

    public static GetAllAppVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllAppVersionsResponse self = new GetAllAppVersionsResponse();
        return TeaModel.build(map, self);
    }

    public GetAllAppVersionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllAppVersionsResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAllAppVersionsResponse setDataList(GetAllAppVersionsResponseDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetAllAppVersionsResponseDataList getDataList() {
        return this.dataList;
    }

    public static class GetAllAppVersionsResponseDataListUsageData extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public Integer code;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static GetAllAppVersionsResponseDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetAllAppVersionsResponseDataListUsageData self = new GetAllAppVersionsResponseDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetAllAppVersionsResponseDataListUsageData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public GetAllAppVersionsResponseDataListUsageData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAllAppVersionsResponseDataList extends TeaModel {
        @NameInMap("UsageData")
        @Validation(required = true)
        public java.util.List<GetAllAppVersionsResponseDataListUsageData> usageData;

        public static GetAllAppVersionsResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAllAppVersionsResponseDataList self = new GetAllAppVersionsResponseDataList();
            return TeaModel.build(map, self);
        }

        public GetAllAppVersionsResponseDataList setUsageData(java.util.List<GetAllAppVersionsResponseDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetAllAppVersionsResponseDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

}
