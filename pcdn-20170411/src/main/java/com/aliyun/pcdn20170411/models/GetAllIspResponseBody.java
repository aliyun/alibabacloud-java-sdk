// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAllIspResponseBody extends TeaModel {
    @NameInMap("DataList")
    public GetAllIspResponseBodyDataList dataList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    public static GetAllIspResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllIspResponseBody self = new GetAllIspResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAllIspResponseBody setDataList(GetAllIspResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetAllIspResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GetAllIspResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllIspResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetAllIspResponseBodyDataListUsageData extends TeaModel {
        @NameInMap("NameEn")
        public String nameEn;

        @NameInMap("NameCn")
        public String nameCn;

        @NameInMap("ResourceId")
        public String resourceId;

        public static GetAllIspResponseBodyDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetAllIspResponseBodyDataListUsageData self = new GetAllIspResponseBodyDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetAllIspResponseBodyDataListUsageData setNameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }
        public String getNameEn() {
            return this.nameEn;
        }

        public GetAllIspResponseBodyDataListUsageData setNameCn(String nameCn) {
            this.nameCn = nameCn;
            return this;
        }
        public String getNameCn() {
            return this.nameCn;
        }

        public GetAllIspResponseBodyDataListUsageData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

    public static class GetAllIspResponseBodyDataList extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<GetAllIspResponseBodyDataListUsageData> usageData;

        public static GetAllIspResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAllIspResponseBodyDataList self = new GetAllIspResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetAllIspResponseBodyDataList setUsageData(java.util.List<GetAllIspResponseBodyDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetAllIspResponseBodyDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

}
