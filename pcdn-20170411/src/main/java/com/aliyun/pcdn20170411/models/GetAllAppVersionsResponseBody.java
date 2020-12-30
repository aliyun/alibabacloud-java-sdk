// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAllAppVersionsResponseBody extends TeaModel {
    @NameInMap("DataList")
    public GetAllAppVersionsResponseBodyDataList dataList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    public static GetAllAppVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllAppVersionsResponseBody self = new GetAllAppVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAllAppVersionsResponseBody setDataList(GetAllAppVersionsResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetAllAppVersionsResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GetAllAppVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllAppVersionsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetAllAppVersionsResponseBodyDataListUsageData extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Code")
        public Integer code;

        public static GetAllAppVersionsResponseBodyDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetAllAppVersionsResponseBodyDataListUsageData self = new GetAllAppVersionsResponseBodyDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetAllAppVersionsResponseBodyDataListUsageData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetAllAppVersionsResponseBodyDataListUsageData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

    }

    public static class GetAllAppVersionsResponseBodyDataList extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<GetAllAppVersionsResponseBodyDataListUsageData> usageData;

        public static GetAllAppVersionsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAllAppVersionsResponseBodyDataList self = new GetAllAppVersionsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetAllAppVersionsResponseBodyDataList setUsageData(java.util.List<GetAllAppVersionsResponseBodyDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetAllAppVersionsResponseBodyDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

}
