// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListTrainLabelResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public ListTrainLabelResponseBodyData data;

    public static ListTrainLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrainLabelResponseBody self = new ListTrainLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrainLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrainLabelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTrainLabelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTrainLabelResponseBody setData(ListTrainLabelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTrainLabelResponseBodyData getData() {
        return this.data;
    }

    public static class ListTrainLabelResponseBodyDataList extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("LabelName")
        public String labelName;

        @NameInMap("AlgorithmId")
        public String algorithmId;

        @NameInMap("TrainMarkerCnt")
        public Long trainMarkerCnt;

        @NameInMap("TestMarkerCnt")
        public Long testMarkerCnt;

        @NameInMap("Deleted")
        public String deleted;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        public static ListTrainLabelResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListTrainLabelResponseBodyDataList self = new ListTrainLabelResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListTrainLabelResponseBodyDataList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListTrainLabelResponseBodyDataList setLabelName(String labelName) {
            this.labelName = labelName;
            return this;
        }
        public String getLabelName() {
            return this.labelName;
        }

        public ListTrainLabelResponseBodyDataList setAlgorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }
        public String getAlgorithmId() {
            return this.algorithmId;
        }

        public ListTrainLabelResponseBodyDataList setTrainMarkerCnt(Long trainMarkerCnt) {
            this.trainMarkerCnt = trainMarkerCnt;
            return this;
        }
        public Long getTrainMarkerCnt() {
            return this.trainMarkerCnt;
        }

        public ListTrainLabelResponseBodyDataList setTestMarkerCnt(Long testMarkerCnt) {
            this.testMarkerCnt = testMarkerCnt;
            return this;
        }
        public Long getTestMarkerCnt() {
            return this.testMarkerCnt;
        }

        public ListTrainLabelResponseBodyDataList setDeleted(String deleted) {
            this.deleted = deleted;
            return this;
        }
        public String getDeleted() {
            return this.deleted;
        }

        public ListTrainLabelResponseBodyDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListTrainLabelResponseBodyDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

    public static class ListTrainLabelResponseBodyData extends TeaModel {
        @NameInMap("Total")
        public Long total;

        @NameInMap("List")
        public java.util.List<ListTrainLabelResponseBodyDataList> list;

        public static ListTrainLabelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTrainLabelResponseBodyData self = new ListTrainLabelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTrainLabelResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListTrainLabelResponseBodyData setList(java.util.List<ListTrainLabelResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListTrainLabelResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
