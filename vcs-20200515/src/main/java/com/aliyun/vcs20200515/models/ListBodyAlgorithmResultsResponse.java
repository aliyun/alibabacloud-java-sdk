// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListBodyAlgorithmResultsResponse extends TeaModel {
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
    public ListBodyAlgorithmResultsResponseData data;

    public static ListBodyAlgorithmResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBodyAlgorithmResultsResponse self = new ListBodyAlgorithmResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListBodyAlgorithmResultsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBodyAlgorithmResultsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBodyAlgorithmResultsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBodyAlgorithmResultsResponse setData(ListBodyAlgorithmResultsResponseData data) {
        this.data = data;
        return this;
    }
    public ListBodyAlgorithmResultsResponseData getData() {
        return this.data;
    }

    public static class ListBodyAlgorithmResultsResponseDataRecords extends TeaModel {
        @NameInMap("CapStyle")
        @Validation(required = true)
        public String capStyle;

        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        @NameInMap("DataSourceId")
        @Validation(required = true)
        public String dataSourceId;

        @NameInMap("PersonId")
        @Validation(required = true)
        public String personId;

        @NameInMap("GenderCode")
        @Validation(required = true)
        public String genderCode;

        @NameInMap("HairStyle")
        @Validation(required = true)
        public String hairStyle;

        @NameInMap("LeftTopX")
        @Validation(required = true)
        public Float leftTopX;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public Float leftTopY;

        @NameInMap("MaxAge")
        @Validation(required = true)
        public String maxAge;

        @NameInMap("MinAge")
        @Validation(required = true)
        public String minAge;

        @NameInMap("PicUrlPath")
        @Validation(required = true)
        public String picUrlPath;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public Float rightBottomX;

        @NameInMap("RightBottomY")
        @Validation(required = true)
        public Float rightBottomY;

        @NameInMap("ShotTime")
        @Validation(required = true)
        public String shotTime;

        @NameInMap("TargetPicUrlPath")
        @Validation(required = true)
        public String targetPicUrlPath;

        @NameInMap("CoatLength")
        @Validation(required = true)
        public String coatLength;

        @NameInMap("CoatStyle")
        @Validation(required = true)
        public String coatStyle;

        @NameInMap("TrousersLength")
        @Validation(required = true)
        public String trousersLength;

        @NameInMap("TrousersStyle")
        @Validation(required = true)
        public String trousersStyle;

        @NameInMap("CoatColor")
        @Validation(required = true)
        public String coatColor;

        @NameInMap("TrousersColor")
        @Validation(required = true)
        public String trousersColor;

        @NameInMap("SourceId")
        @Validation(required = true)
        public String sourceId;

        public static ListBodyAlgorithmResultsResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListBodyAlgorithmResultsResponseDataRecords self = new ListBodyAlgorithmResultsResponseDataRecords();
            return TeaModel.build(map, self);
        }

        public ListBodyAlgorithmResultsResponseDataRecords setCapStyle(String capStyle) {
            this.capStyle = capStyle;
            return this;
        }
        public String getCapStyle() {
            return this.capStyle;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setGenderCode(String genderCode) {
            this.genderCode = genderCode;
            return this;
        }
        public String getGenderCode() {
            return this.genderCode;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setHairStyle(String hairStyle) {
            this.hairStyle = hairStyle;
            return this;
        }
        public String getHairStyle() {
            return this.hairStyle;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setLeftTopX(Float leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Float getLeftTopX() {
            return this.leftTopX;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setLeftTopY(Float leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Float getLeftTopY() {
            return this.leftTopY;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setMaxAge(String maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public String getMaxAge() {
            return this.maxAge;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setMinAge(String minAge) {
            this.minAge = minAge;
            return this;
        }
        public String getMinAge() {
            return this.minAge;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setPicUrlPath(String picUrlPath) {
            this.picUrlPath = picUrlPath;
            return this;
        }
        public String getPicUrlPath() {
            return this.picUrlPath;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setRightBottomX(Float rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public Float getRightBottomX() {
            return this.rightBottomX;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setRightBottomY(Float rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public Float getRightBottomY() {
            return this.rightBottomY;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setTargetPicUrlPath(String targetPicUrlPath) {
            this.targetPicUrlPath = targetPicUrlPath;
            return this;
        }
        public String getTargetPicUrlPath() {
            return this.targetPicUrlPath;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setCoatLength(String coatLength) {
            this.coatLength = coatLength;
            return this;
        }
        public String getCoatLength() {
            return this.coatLength;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setCoatStyle(String coatStyle) {
            this.coatStyle = coatStyle;
            return this;
        }
        public String getCoatStyle() {
            return this.coatStyle;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setTrousersLength(String trousersLength) {
            this.trousersLength = trousersLength;
            return this;
        }
        public String getTrousersLength() {
            return this.trousersLength;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setTrousersStyle(String trousersStyle) {
            this.trousersStyle = trousersStyle;
            return this;
        }
        public String getTrousersStyle() {
            return this.trousersStyle;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setCoatColor(String coatColor) {
            this.coatColor = coatColor;
            return this;
        }
        public String getCoatColor() {
            return this.coatColor;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setTrousersColor(String trousersColor) {
            this.trousersColor = trousersColor;
            return this;
        }
        public String getTrousersColor() {
            return this.trousersColor;
        }

        public ListBodyAlgorithmResultsResponseDataRecords setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

    }

    public static class ListBodyAlgorithmResultsResponseData extends TeaModel {
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
        public java.util.List<ListBodyAlgorithmResultsResponseDataRecords> records;

        public static ListBodyAlgorithmResultsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListBodyAlgorithmResultsResponseData self = new ListBodyAlgorithmResultsResponseData();
            return TeaModel.build(map, self);
        }

        public ListBodyAlgorithmResultsResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListBodyAlgorithmResultsResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListBodyAlgorithmResultsResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListBodyAlgorithmResultsResponseData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public ListBodyAlgorithmResultsResponseData setRecords(java.util.List<ListBodyAlgorithmResultsResponseDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListBodyAlgorithmResultsResponseDataRecords> getRecords() {
            return this.records;
        }

    }

}
