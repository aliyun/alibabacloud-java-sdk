// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListFaceAlgorithmResultsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListFaceAlgorithmResultsResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static ListFaceAlgorithmResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFaceAlgorithmResultsResponseBody self = new ListFaceAlgorithmResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFaceAlgorithmResultsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFaceAlgorithmResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFaceAlgorithmResultsResponseBody setData(ListFaceAlgorithmResultsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFaceAlgorithmResultsResponseBodyData getData() {
        return this.data;
    }

    public ListFaceAlgorithmResultsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListFaceAlgorithmResultsResponseBodyDataRecords extends TeaModel {
        @NameInMap("RightBottomY")
        public Float rightBottomY;

        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("PicUrlPath")
        public String picUrlPath;

        @NameInMap("FaceId")
        public String faceId;

        @NameInMap("RightBottomX")
        public Float rightBottomX;

        @NameInMap("SourceId")
        public String sourceId;

        @NameInMap("MaxAge")
        public String maxAge;

        @NameInMap("TargetPicUrlPath")
        public String targetPicUrlPath;

        @NameInMap("HairStyle")
        public String hairStyle;

        @NameInMap("LeftTopY")
        public Float leftTopY;

        @NameInMap("MinAge")
        public String minAge;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("ShotTime")
        public String shotTime;

        @NameInMap("GenderCode")
        public String genderCode;

        @NameInMap("CapStyle")
        public String capStyle;

        @NameInMap("LeftTopX")
        public Float leftTopX;

        public static ListFaceAlgorithmResultsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListFaceAlgorithmResultsResponseBodyDataRecords self = new ListFaceAlgorithmResultsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListFaceAlgorithmResultsResponseBodyDataRecords setRightBottomY(Float rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public Float getRightBottomY() {
            return this.rightBottomY;
        }

        public ListFaceAlgorithmResultsResponseBodyDataRecords setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListFaceAlgorithmResultsResponseBodyDataRecords setPicUrlPath(String picUrlPath) {
            this.picUrlPath = picUrlPath;
            return this;
        }
        public String getPicUrlPath() {
            return this.picUrlPath;
        }

        public ListFaceAlgorithmResultsResponseBodyDataRecords setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public ListFaceAlgorithmResultsResponseBodyDataRecords setRightBottomX(Float rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public Float getRightBottomX() {
            return this.rightBottomX;
        }

        public ListFaceAlgorithmResultsResponseBodyDataRecords setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListFaceAlgorithmResultsResponseBodyDataRecords setMaxAge(String maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public String getMaxAge() {
            return this.maxAge;
        }

        public ListFaceAlgorithmResultsResponseBodyDataRecords setTargetPicUrlPath(String targetPicUrlPath) {
            this.targetPicUrlPath = targetPicUrlPath;
            return this;
        }
        public String getTargetPicUrlPath() {
            return this.targetPicUrlPath;
        }

        public ListFaceAlgorithmResultsResponseBodyDataRecords setHairStyle(String hairStyle) {
            this.hairStyle = hairStyle;
            return this;
        }
        public String getHairStyle() {
            return this.hairStyle;
        }

        public ListFaceAlgorithmResultsResponseBodyDataRecords setLeftTopY(Float leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Float getLeftTopY() {
            return this.leftTopY;
        }

        public ListFaceAlgorithmResultsResponseBodyDataRecords setMinAge(String minAge) {
            this.minAge = minAge;
            return this;
        }
        public String getMinAge() {
            return this.minAge;
        }

        public ListFaceAlgorithmResultsResponseBodyDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListFaceAlgorithmResultsResponseBodyDataRecords setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public ListFaceAlgorithmResultsResponseBodyDataRecords setGenderCode(String genderCode) {
            this.genderCode = genderCode;
            return this;
        }
        public String getGenderCode() {
            return this.genderCode;
        }

        public ListFaceAlgorithmResultsResponseBodyDataRecords setCapStyle(String capStyle) {
            this.capStyle = capStyle;
            return this;
        }
        public String getCapStyle() {
            return this.capStyle;
        }

        public ListFaceAlgorithmResultsResponseBodyDataRecords setLeftTopX(Float leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Float getLeftTopX() {
            return this.leftTopX;
        }

    }

    public static class ListFaceAlgorithmResultsResponseBodyData extends TeaModel {
        @NameInMap("Records")
        public java.util.List<ListFaceAlgorithmResultsResponseBodyDataRecords> records;

        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListFaceAlgorithmResultsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFaceAlgorithmResultsResponseBodyData self = new ListFaceAlgorithmResultsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFaceAlgorithmResultsResponseBodyData setRecords(java.util.List<ListFaceAlgorithmResultsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListFaceAlgorithmResultsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListFaceAlgorithmResultsResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public ListFaceAlgorithmResultsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListFaceAlgorithmResultsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFaceAlgorithmResultsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
