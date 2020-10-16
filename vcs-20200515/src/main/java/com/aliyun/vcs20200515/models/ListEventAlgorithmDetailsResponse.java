// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListEventAlgorithmDetailsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListEventAlgorithmDetailsResponseData> data;

    public static ListEventAlgorithmDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventAlgorithmDetailsResponse self = new ListEventAlgorithmDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListEventAlgorithmDetailsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEventAlgorithmDetailsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEventAlgorithmDetailsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEventAlgorithmDetailsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEventAlgorithmDetailsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEventAlgorithmDetailsResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListEventAlgorithmDetailsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListEventAlgorithmDetailsResponse setData(java.util.List<ListEventAlgorithmDetailsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEventAlgorithmDetailsResponseData> getData() {
        return this.data;
    }

    public static class ListEventAlgorithmDetailsResponseData extends TeaModel {
        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        @NameInMap("DataSourceId")
        @Validation(required = true)
        public String dataSourceId;

        @NameInMap("EventType")
        @Validation(required = true)
        public String eventType;

        @NameInMap("EventValue")
        @Validation(required = true)
        public String eventValue;

        @NameInMap("ExtendValue")
        @Validation(required = true)
        public String extendValue;

        @NameInMap("ExtraExtendValue")
        @Validation(required = true)
        public String extraExtendValue;

        @NameInMap("FaceCount")
        @Validation(required = true)
        public String faceCount;

        @NameInMap("LeftTopX")
        @Validation(required = true)
        public String leftTopX;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public String leftTopY;

        @NameInMap("PicUrlPath")
        @Validation(required = true)
        public String picUrlPath;

        @NameInMap("PointX")
        @Validation(required = true)
        public String pointX;

        @NameInMap("PointY")
        @Validation(required = true)
        public String pointY;

        @NameInMap("RecordId")
        @Validation(required = true)
        public String recordId;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public String rightBottomX;

        @NameInMap("RightBottomY")
        @Validation(required = true)
        public String rightBottomY;

        @NameInMap("ShotTime")
        @Validation(required = true)
        public String shotTime;

        @NameInMap("SourceId")
        @Validation(required = true)
        public String sourceId;

        @NameInMap("TargetPicUrlPath")
        @Validation(required = true)
        public String targetPicUrlPath;

        public static ListEventAlgorithmDetailsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListEventAlgorithmDetailsResponseData self = new ListEventAlgorithmDetailsResponseData();
            return TeaModel.build(map, self);
        }

        public ListEventAlgorithmDetailsResponseData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListEventAlgorithmDetailsResponseData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListEventAlgorithmDetailsResponseData setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public ListEventAlgorithmDetailsResponseData setEventValue(String eventValue) {
            this.eventValue = eventValue;
            return this;
        }
        public String getEventValue() {
            return this.eventValue;
        }

        public ListEventAlgorithmDetailsResponseData setExtendValue(String extendValue) {
            this.extendValue = extendValue;
            return this;
        }
        public String getExtendValue() {
            return this.extendValue;
        }

        public ListEventAlgorithmDetailsResponseData setExtraExtendValue(String extraExtendValue) {
            this.extraExtendValue = extraExtendValue;
            return this;
        }
        public String getExtraExtendValue() {
            return this.extraExtendValue;
        }

        public ListEventAlgorithmDetailsResponseData setFaceCount(String faceCount) {
            this.faceCount = faceCount;
            return this;
        }
        public String getFaceCount() {
            return this.faceCount;
        }

        public ListEventAlgorithmDetailsResponseData setLeftTopX(String leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public String getLeftTopX() {
            return this.leftTopX;
        }

        public ListEventAlgorithmDetailsResponseData setLeftTopY(String leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public String getLeftTopY() {
            return this.leftTopY;
        }

        public ListEventAlgorithmDetailsResponseData setPicUrlPath(String picUrlPath) {
            this.picUrlPath = picUrlPath;
            return this;
        }
        public String getPicUrlPath() {
            return this.picUrlPath;
        }

        public ListEventAlgorithmDetailsResponseData setPointX(String pointX) {
            this.pointX = pointX;
            return this;
        }
        public String getPointX() {
            return this.pointX;
        }

        public ListEventAlgorithmDetailsResponseData setPointY(String pointY) {
            this.pointY = pointY;
            return this;
        }
        public String getPointY() {
            return this.pointY;
        }

        public ListEventAlgorithmDetailsResponseData setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public ListEventAlgorithmDetailsResponseData setRightBottomX(String rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public String getRightBottomX() {
            return this.rightBottomX;
        }

        public ListEventAlgorithmDetailsResponseData setRightBottomY(String rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public String getRightBottomY() {
            return this.rightBottomY;
        }

        public ListEventAlgorithmDetailsResponseData setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public ListEventAlgorithmDetailsResponseData setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListEventAlgorithmDetailsResponseData setTargetPicUrlPath(String targetPicUrlPath) {
            this.targetPicUrlPath = targetPicUrlPath;
            return this;
        }
        public String getTargetPicUrlPath() {
            return this.targetPicUrlPath;
        }

    }

}
