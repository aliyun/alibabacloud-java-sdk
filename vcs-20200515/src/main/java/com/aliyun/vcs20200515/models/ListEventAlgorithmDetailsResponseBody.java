// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListEventAlgorithmDetailsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListEventAlgorithmDetailsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEventAlgorithmDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventAlgorithmDetailsResponseBody self = new ListEventAlgorithmDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventAlgorithmDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEventAlgorithmDetailsResponseBody setData(java.util.List<ListEventAlgorithmDetailsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEventAlgorithmDetailsResponseBodyData> getData() {
        return this.data;
    }

    public ListEventAlgorithmDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEventAlgorithmDetailsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEventAlgorithmDetailsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEventAlgorithmDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEventAlgorithmDetailsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListEventAlgorithmDetailsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEventAlgorithmDetailsResponseBodyData extends TeaModel {
        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("EventValue")
        public String eventValue;

        @NameInMap("ExtendValue")
        public String extendValue;

        @NameInMap("ExtraExtendValue")
        public String extraExtendValue;

        @NameInMap("FaceCount")
        public String faceCount;

        @NameInMap("LeftTopX")
        public String leftTopX;

        @NameInMap("LeftTopY")
        public String leftTopY;

        @NameInMap("PicUrlPath")
        public String picUrlPath;

        @NameInMap("PointX")
        public String pointX;

        @NameInMap("PointY")
        public String pointY;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("RightBottomX")
        public String rightBottomX;

        @NameInMap("RightBottomY")
        public String rightBottomY;

        @NameInMap("ShotTime")
        public String shotTime;

        @NameInMap("SourceId")
        public String sourceId;

        @NameInMap("TagCode")
        public String tagCode;

        @NameInMap("TagCodeReliability")
        public String tagCodeReliability;

        @NameInMap("TargetPicUrlPath")
        public String targetPicUrlPath;

        @NameInMap("UuidCode")
        public String uuidCode;

        public static ListEventAlgorithmDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEventAlgorithmDetailsResponseBodyData self = new ListEventAlgorithmDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEventAlgorithmDetailsResponseBodyData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListEventAlgorithmDetailsResponseBodyData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListEventAlgorithmDetailsResponseBodyData setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public ListEventAlgorithmDetailsResponseBodyData setEventValue(String eventValue) {
            this.eventValue = eventValue;
            return this;
        }
        public String getEventValue() {
            return this.eventValue;
        }

        public ListEventAlgorithmDetailsResponseBodyData setExtendValue(String extendValue) {
            this.extendValue = extendValue;
            return this;
        }
        public String getExtendValue() {
            return this.extendValue;
        }

        public ListEventAlgorithmDetailsResponseBodyData setExtraExtendValue(String extraExtendValue) {
            this.extraExtendValue = extraExtendValue;
            return this;
        }
        public String getExtraExtendValue() {
            return this.extraExtendValue;
        }

        public ListEventAlgorithmDetailsResponseBodyData setFaceCount(String faceCount) {
            this.faceCount = faceCount;
            return this;
        }
        public String getFaceCount() {
            return this.faceCount;
        }

        public ListEventAlgorithmDetailsResponseBodyData setLeftTopX(String leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public String getLeftTopX() {
            return this.leftTopX;
        }

        public ListEventAlgorithmDetailsResponseBodyData setLeftTopY(String leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public String getLeftTopY() {
            return this.leftTopY;
        }

        public ListEventAlgorithmDetailsResponseBodyData setPicUrlPath(String picUrlPath) {
            this.picUrlPath = picUrlPath;
            return this;
        }
        public String getPicUrlPath() {
            return this.picUrlPath;
        }

        public ListEventAlgorithmDetailsResponseBodyData setPointX(String pointX) {
            this.pointX = pointX;
            return this;
        }
        public String getPointX() {
            return this.pointX;
        }

        public ListEventAlgorithmDetailsResponseBodyData setPointY(String pointY) {
            this.pointY = pointY;
            return this;
        }
        public String getPointY() {
            return this.pointY;
        }

        public ListEventAlgorithmDetailsResponseBodyData setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public ListEventAlgorithmDetailsResponseBodyData setRightBottomX(String rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public String getRightBottomX() {
            return this.rightBottomX;
        }

        public ListEventAlgorithmDetailsResponseBodyData setRightBottomY(String rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public String getRightBottomY() {
            return this.rightBottomY;
        }

        public ListEventAlgorithmDetailsResponseBodyData setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public ListEventAlgorithmDetailsResponseBodyData setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListEventAlgorithmDetailsResponseBodyData setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public ListEventAlgorithmDetailsResponseBodyData setTagCodeReliability(String tagCodeReliability) {
            this.tagCodeReliability = tagCodeReliability;
            return this;
        }
        public String getTagCodeReliability() {
            return this.tagCodeReliability;
        }

        public ListEventAlgorithmDetailsResponseBodyData setTargetPicUrlPath(String targetPicUrlPath) {
            this.targetPicUrlPath = targetPicUrlPath;
            return this;
        }
        public String getTargetPicUrlPath() {
            return this.targetPicUrlPath;
        }

        public ListEventAlgorithmDetailsResponseBodyData setUuidCode(String uuidCode) {
            this.uuidCode = uuidCode;
            return this;
        }
        public String getUuidCode() {
            return this.uuidCode;
        }

    }

}
