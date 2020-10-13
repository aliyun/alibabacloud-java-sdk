// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAllIspResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("DataList")
    @Validation(required = true)
    public GetAllIspResponseDataList dataList;

    public static GetAllIspResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllIspResponse self = new GetAllIspResponse();
        return TeaModel.build(map, self);
    }

    public GetAllIspResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllIspResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAllIspResponse setDataList(GetAllIspResponseDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetAllIspResponseDataList getDataList() {
        return this.dataList;
    }

    public static class GetAllIspResponseDataListUsageData extends TeaModel {
        @NameInMap("NameCn")
        @Validation(required = true)
        public String nameCn;

        @NameInMap("NameEn")
        @Validation(required = true)
        public String nameEn;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        public static GetAllIspResponseDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetAllIspResponseDataListUsageData self = new GetAllIspResponseDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetAllIspResponseDataListUsageData setNameCn(String nameCn) {
            this.nameCn = nameCn;
            return this;
        }
        public String getNameCn() {
            return this.nameCn;
        }

        public GetAllIspResponseDataListUsageData setNameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }
        public String getNameEn() {
            return this.nameEn;
        }

        public GetAllIspResponseDataListUsageData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

    public static class GetAllIspResponseDataList extends TeaModel {
        @NameInMap("UsageData")
        @Validation(required = true)
        public java.util.List<GetAllIspResponseDataListUsageData> usageData;

        public static GetAllIspResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAllIspResponseDataList self = new GetAllIspResponseDataList();
            return TeaModel.build(map, self);
        }

        public GetAllIspResponseDataList setUsageData(java.util.List<GetAllIspResponseDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetAllIspResponseDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

}
