// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListMarkerResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListMarkerResponseBodyData data;

    public static ListMarkerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMarkerResponseBody self = new ListMarkerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMarkerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMarkerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMarkerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMarkerResponseBody setData(ListMarkerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMarkerResponseBodyData getData() {
        return this.data;
    }

    public static class ListMarkerResponseBodyDataList extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("AlgorithmId")
        public String algorithmId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("LabelId")
        public String labelId;

        @NameInMap("LabelName")
        public String labelName;

        @NameInMap("SampleId")
        public String sampleId;

        @NameInMap("Content")
        public String content;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        public static ListMarkerResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListMarkerResponseBodyDataList self = new ListMarkerResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListMarkerResponseBodyDataList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMarkerResponseBodyDataList setAlgorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }
        public String getAlgorithmId() {
            return this.algorithmId;
        }

        public ListMarkerResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListMarkerResponseBodyDataList setLabelId(String labelId) {
            this.labelId = labelId;
            return this;
        }
        public String getLabelId() {
            return this.labelId;
        }

        public ListMarkerResponseBodyDataList setLabelName(String labelName) {
            this.labelName = labelName;
            return this;
        }
        public String getLabelName() {
            return this.labelName;
        }

        public ListMarkerResponseBodyDataList setSampleId(String sampleId) {
            this.sampleId = sampleId;
            return this;
        }
        public String getSampleId() {
            return this.sampleId;
        }

        public ListMarkerResponseBodyDataList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListMarkerResponseBodyDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMarkerResponseBodyDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

    public static class ListMarkerResponseBodyData extends TeaModel {
        @NameInMap("Total")
        public Long total;

        @NameInMap("List")
        public java.util.List<ListMarkerResponseBodyDataList> list;

        public static ListMarkerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMarkerResponseBodyData self = new ListMarkerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMarkerResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListMarkerResponseBodyData setList(java.util.List<ListMarkerResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListMarkerResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
