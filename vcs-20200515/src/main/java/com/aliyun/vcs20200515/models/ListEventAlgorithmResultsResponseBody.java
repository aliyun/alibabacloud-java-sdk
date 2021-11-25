// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListEventAlgorithmResultsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListEventAlgorithmResultsResponseBodyData data;

    @NameInMap("ExtendValue")
    public String extendValue;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListEventAlgorithmResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventAlgorithmResultsResponseBody self = new ListEventAlgorithmResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventAlgorithmResultsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEventAlgorithmResultsResponseBody setData(ListEventAlgorithmResultsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEventAlgorithmResultsResponseBodyData getData() {
        return this.data;
    }

    public ListEventAlgorithmResultsResponseBody setExtendValue(String extendValue) {
        this.extendValue = extendValue;
        return this;
    }
    public String getExtendValue() {
        return this.extendValue;
    }

    public ListEventAlgorithmResultsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEventAlgorithmResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEventAlgorithmResultsResponseBodyDataRecords extends TeaModel {
        @NameInMap("CapStyle")
        public String capStyle;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("ExtendValue")
        public String extendValue;

        @NameInMap("ExtendValueThree")
        public String extendValueThree;

        @NameInMap("ExtendValueTwo")
        public String extendValueTwo;

        @NameInMap("FaceCount")
        public String faceCount;

        @NameInMap("PicUrlPath")
        public String picUrlPath;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("ShotTime")
        public String shotTime;

        @NameInMap("TagCode")
        public String tagCode;

        @NameInMap("TagCodeReliability")
        public String tagCodeReliability;

        @NameInMap("TargetPicUrlPath")
        public String targetPicUrlPath;

        @NameInMap("UuidCode")
        public String uuidCode;

        public static ListEventAlgorithmResultsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListEventAlgorithmResultsResponseBodyDataRecords self = new ListEventAlgorithmResultsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListEventAlgorithmResultsResponseBodyDataRecords setCapStyle(String capStyle) {
            this.capStyle = capStyle;
            return this;
        }
        public String getCapStyle() {
            return this.capStyle;
        }

        public ListEventAlgorithmResultsResponseBodyDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListEventAlgorithmResultsResponseBodyDataRecords setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListEventAlgorithmResultsResponseBodyDataRecords setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public ListEventAlgorithmResultsResponseBodyDataRecords setExtendValue(String extendValue) {
            this.extendValue = extendValue;
            return this;
        }
        public String getExtendValue() {
            return this.extendValue;
        }

        public ListEventAlgorithmResultsResponseBodyDataRecords setExtendValueThree(String extendValueThree) {
            this.extendValueThree = extendValueThree;
            return this;
        }
        public String getExtendValueThree() {
            return this.extendValueThree;
        }

        public ListEventAlgorithmResultsResponseBodyDataRecords setExtendValueTwo(String extendValueTwo) {
            this.extendValueTwo = extendValueTwo;
            return this;
        }
        public String getExtendValueTwo() {
            return this.extendValueTwo;
        }

        public ListEventAlgorithmResultsResponseBodyDataRecords setFaceCount(String faceCount) {
            this.faceCount = faceCount;
            return this;
        }
        public String getFaceCount() {
            return this.faceCount;
        }

        public ListEventAlgorithmResultsResponseBodyDataRecords setPicUrlPath(String picUrlPath) {
            this.picUrlPath = picUrlPath;
            return this;
        }
        public String getPicUrlPath() {
            return this.picUrlPath;
        }

        public ListEventAlgorithmResultsResponseBodyDataRecords setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public ListEventAlgorithmResultsResponseBodyDataRecords setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public ListEventAlgorithmResultsResponseBodyDataRecords setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public ListEventAlgorithmResultsResponseBodyDataRecords setTagCodeReliability(String tagCodeReliability) {
            this.tagCodeReliability = tagCodeReliability;
            return this;
        }
        public String getTagCodeReliability() {
            return this.tagCodeReliability;
        }

        public ListEventAlgorithmResultsResponseBodyDataRecords setTargetPicUrlPath(String targetPicUrlPath) {
            this.targetPicUrlPath = targetPicUrlPath;
            return this;
        }
        public String getTargetPicUrlPath() {
            return this.targetPicUrlPath;
        }

        public ListEventAlgorithmResultsResponseBodyDataRecords setUuidCode(String uuidCode) {
            this.uuidCode = uuidCode;
            return this;
        }
        public String getUuidCode() {
            return this.uuidCode;
        }

    }

    public static class ListEventAlgorithmResultsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Records")
        public java.util.List<ListEventAlgorithmResultsResponseBodyDataRecords> records;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static ListEventAlgorithmResultsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEventAlgorithmResultsResponseBodyData self = new ListEventAlgorithmResultsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEventAlgorithmResultsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListEventAlgorithmResultsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListEventAlgorithmResultsResponseBodyData setRecords(java.util.List<ListEventAlgorithmResultsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListEventAlgorithmResultsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListEventAlgorithmResultsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListEventAlgorithmResultsResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
