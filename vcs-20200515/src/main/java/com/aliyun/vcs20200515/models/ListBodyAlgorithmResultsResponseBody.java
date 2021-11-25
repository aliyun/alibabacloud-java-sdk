// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListBodyAlgorithmResultsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListBodyAlgorithmResultsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListBodyAlgorithmResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBodyAlgorithmResultsResponseBody self = new ListBodyAlgorithmResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBodyAlgorithmResultsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBodyAlgorithmResultsResponseBody setData(ListBodyAlgorithmResultsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBodyAlgorithmResultsResponseBodyData getData() {
        return this.data;
    }

    public ListBodyAlgorithmResultsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBodyAlgorithmResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListBodyAlgorithmResultsResponseBodyDataRecords extends TeaModel {
        @NameInMap("CapStyle")
        public String capStyle;

        @NameInMap("CoatColor")
        public String coatColor;

        @NameInMap("CoatLength")
        public String coatLength;

        @NameInMap("CoatStyle")
        public String coatStyle;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("GenderCode")
        public String genderCode;

        @NameInMap("HairStyle")
        public String hairStyle;

        @NameInMap("LeftTopX")
        public Float leftTopX;

        @NameInMap("LeftTopY")
        public Float leftTopY;

        @NameInMap("MaxAge")
        public String maxAge;

        @NameInMap("MinAge")
        public String minAge;

        @NameInMap("PersonId")
        public String personId;

        @NameInMap("PicUrlPath")
        public String picUrlPath;

        @NameInMap("RightBottomX")
        public Float rightBottomX;

        @NameInMap("RightBottomY")
        public Float rightBottomY;

        @NameInMap("ShotTime")
        public String shotTime;

        @NameInMap("SourceId")
        public String sourceId;

        @NameInMap("TargetPicUrlPath")
        public String targetPicUrlPath;

        @NameInMap("TrousersColor")
        public String trousersColor;

        @NameInMap("TrousersLength")
        public String trousersLength;

        @NameInMap("TrousersStyle")
        public String trousersStyle;

        public static ListBodyAlgorithmResultsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListBodyAlgorithmResultsResponseBodyDataRecords self = new ListBodyAlgorithmResultsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setCapStyle(String capStyle) {
            this.capStyle = capStyle;
            return this;
        }
        public String getCapStyle() {
            return this.capStyle;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setCoatColor(String coatColor) {
            this.coatColor = coatColor;
            return this;
        }
        public String getCoatColor() {
            return this.coatColor;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setCoatLength(String coatLength) {
            this.coatLength = coatLength;
            return this;
        }
        public String getCoatLength() {
            return this.coatLength;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setCoatStyle(String coatStyle) {
            this.coatStyle = coatStyle;
            return this;
        }
        public String getCoatStyle() {
            return this.coatStyle;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setGenderCode(String genderCode) {
            this.genderCode = genderCode;
            return this;
        }
        public String getGenderCode() {
            return this.genderCode;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setHairStyle(String hairStyle) {
            this.hairStyle = hairStyle;
            return this;
        }
        public String getHairStyle() {
            return this.hairStyle;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setLeftTopX(Float leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Float getLeftTopX() {
            return this.leftTopX;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setLeftTopY(Float leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Float getLeftTopY() {
            return this.leftTopY;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setMaxAge(String maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public String getMaxAge() {
            return this.maxAge;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setMinAge(String minAge) {
            this.minAge = minAge;
            return this;
        }
        public String getMinAge() {
            return this.minAge;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setPicUrlPath(String picUrlPath) {
            this.picUrlPath = picUrlPath;
            return this;
        }
        public String getPicUrlPath() {
            return this.picUrlPath;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setRightBottomX(Float rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public Float getRightBottomX() {
            return this.rightBottomX;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setRightBottomY(Float rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public Float getRightBottomY() {
            return this.rightBottomY;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setTargetPicUrlPath(String targetPicUrlPath) {
            this.targetPicUrlPath = targetPicUrlPath;
            return this;
        }
        public String getTargetPicUrlPath() {
            return this.targetPicUrlPath;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setTrousersColor(String trousersColor) {
            this.trousersColor = trousersColor;
            return this;
        }
        public String getTrousersColor() {
            return this.trousersColor;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setTrousersLength(String trousersLength) {
            this.trousersLength = trousersLength;
            return this;
        }
        public String getTrousersLength() {
            return this.trousersLength;
        }

        public ListBodyAlgorithmResultsResponseBodyDataRecords setTrousersStyle(String trousersStyle) {
            this.trousersStyle = trousersStyle;
            return this;
        }
        public String getTrousersStyle() {
            return this.trousersStyle;
        }

    }

    public static class ListBodyAlgorithmResultsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Records")
        public java.util.List<ListBodyAlgorithmResultsResponseBodyDataRecords> records;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static ListBodyAlgorithmResultsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBodyAlgorithmResultsResponseBodyData self = new ListBodyAlgorithmResultsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBodyAlgorithmResultsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListBodyAlgorithmResultsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListBodyAlgorithmResultsResponseBodyData setRecords(java.util.List<ListBodyAlgorithmResultsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListBodyAlgorithmResultsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListBodyAlgorithmResultsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListBodyAlgorithmResultsResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
