// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListFaceAlgorithmResultsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListFaceAlgorithmResultsResponseData data;

    public static ListFaceAlgorithmResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFaceAlgorithmResultsResponse self = new ListFaceAlgorithmResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListFaceAlgorithmResultsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFaceAlgorithmResultsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFaceAlgorithmResultsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFaceAlgorithmResultsResponse setData(ListFaceAlgorithmResultsResponseData data) {
        this.data = data;
        return this;
    }
    public ListFaceAlgorithmResultsResponseData getData() {
        return this.data;
    }

    public static class ListFaceAlgorithmResultsResponseDataRecords extends TeaModel {
        @NameInMap("FaceId")
        @Validation(required = true)
        public String faceId;

        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        @NameInMap("DataSourceId")
        @Validation(required = true)
        public String dataSourceId;

        @NameInMap("ShotTime")
        @Validation(required = true)
        public String shotTime;

        @NameInMap("GenderCode")
        @Validation(required = true)
        public String genderCode;

        @NameInMap("MinAge")
        @Validation(required = true)
        public String minAge;

        @NameInMap("MaxAge")
        @Validation(required = true)
        public String maxAge;

        @NameInMap("CapStyle")
        @Validation(required = true)
        public String capStyle;

        @NameInMap("HairStyle")
        @Validation(required = true)
        public String hairStyle;

        @NameInMap("LeftTopX")
        @Validation(required = true)
        public Float leftTopX;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public Float leftTopY;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public Float rightBottomX;

        @NameInMap("RightBottomY")
        @Validation(required = true)
        public Float rightBottomY;

        @NameInMap("PicUrlPath")
        @Validation(required = true)
        public String picUrlPath;

        @NameInMap("TargetPicUrlPath")
        @Validation(required = true)
        public String targetPicUrlPath;

        @NameInMap("SourceId")
        @Validation(required = true)
        public String sourceId;

        public static ListFaceAlgorithmResultsResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListFaceAlgorithmResultsResponseDataRecords self = new ListFaceAlgorithmResultsResponseDataRecords();
            return TeaModel.build(map, self);
        }

        public ListFaceAlgorithmResultsResponseDataRecords setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public ListFaceAlgorithmResultsResponseDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListFaceAlgorithmResultsResponseDataRecords setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListFaceAlgorithmResultsResponseDataRecords setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public ListFaceAlgorithmResultsResponseDataRecords setGenderCode(String genderCode) {
            this.genderCode = genderCode;
            return this;
        }
        public String getGenderCode() {
            return this.genderCode;
        }

        public ListFaceAlgorithmResultsResponseDataRecords setMinAge(String minAge) {
            this.minAge = minAge;
            return this;
        }
        public String getMinAge() {
            return this.minAge;
        }

        public ListFaceAlgorithmResultsResponseDataRecords setMaxAge(String maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public String getMaxAge() {
            return this.maxAge;
        }

        public ListFaceAlgorithmResultsResponseDataRecords setCapStyle(String capStyle) {
            this.capStyle = capStyle;
            return this;
        }
        public String getCapStyle() {
            return this.capStyle;
        }

        public ListFaceAlgorithmResultsResponseDataRecords setHairStyle(String hairStyle) {
            this.hairStyle = hairStyle;
            return this;
        }
        public String getHairStyle() {
            return this.hairStyle;
        }

        public ListFaceAlgorithmResultsResponseDataRecords setLeftTopX(Float leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Float getLeftTopX() {
            return this.leftTopX;
        }

        public ListFaceAlgorithmResultsResponseDataRecords setLeftTopY(Float leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Float getLeftTopY() {
            return this.leftTopY;
        }

        public ListFaceAlgorithmResultsResponseDataRecords setRightBottomX(Float rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public Float getRightBottomX() {
            return this.rightBottomX;
        }

        public ListFaceAlgorithmResultsResponseDataRecords setRightBottomY(Float rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public Float getRightBottomY() {
            return this.rightBottomY;
        }

        public ListFaceAlgorithmResultsResponseDataRecords setPicUrlPath(String picUrlPath) {
            this.picUrlPath = picUrlPath;
            return this;
        }
        public String getPicUrlPath() {
            return this.picUrlPath;
        }

        public ListFaceAlgorithmResultsResponseDataRecords setTargetPicUrlPath(String targetPicUrlPath) {
            this.targetPicUrlPath = targetPicUrlPath;
            return this;
        }
        public String getTargetPicUrlPath() {
            return this.targetPicUrlPath;
        }

        public ListFaceAlgorithmResultsResponseDataRecords setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

    }

    public static class ListFaceAlgorithmResultsResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("TotalPage")
        @Validation(required = true)
        public Integer totalPage;

        @NameInMap("Records")
        @Validation(required = true)
        public java.util.List<ListFaceAlgorithmResultsResponseDataRecords> records;

        public static ListFaceAlgorithmResultsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListFaceAlgorithmResultsResponseData self = new ListFaceAlgorithmResultsResponseData();
            return TeaModel.build(map, self);
        }

        public ListFaceAlgorithmResultsResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListFaceAlgorithmResultsResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFaceAlgorithmResultsResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListFaceAlgorithmResultsResponseData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public ListFaceAlgorithmResultsResponseData setRecords(java.util.List<ListFaceAlgorithmResultsResponseDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListFaceAlgorithmResultsResponseDataRecords> getRecords() {
            return this.records;
        }

    }

}
