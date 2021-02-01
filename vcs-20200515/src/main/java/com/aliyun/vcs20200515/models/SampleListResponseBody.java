// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SampleListResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public SampleListResponseBodyData data;

    public static SampleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SampleListResponseBody self = new SampleListResponseBody();
        return TeaModel.build(map, self);
    }

    public SampleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SampleListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SampleListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SampleListResponseBody setData(SampleListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SampleListResponseBodyData getData() {
        return this.data;
    }

    public static class SampleListResponseBodyDataList extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("AlgorithmId")
        public String algorithmId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Usages")
        public String usages;

        @NameInMap("Content")
        public String content;

        @NameInMap("Url")
        public String url;

        @NameInMap("MarkerCount")
        public Long markerCount;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        public static SampleListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            SampleListResponseBodyDataList self = new SampleListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public SampleListResponseBodyDataList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SampleListResponseBodyDataList setAlgorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }
        public String getAlgorithmId() {
            return this.algorithmId;
        }

        public SampleListResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SampleListResponseBodyDataList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SampleListResponseBodyDataList setUsages(String usages) {
            this.usages = usages;
            return this;
        }
        public String getUsages() {
            return this.usages;
        }

        public SampleListResponseBodyDataList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SampleListResponseBodyDataList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public SampleListResponseBodyDataList setMarkerCount(Long markerCount) {
            this.markerCount = markerCount;
            return this;
        }
        public Long getMarkerCount() {
            return this.markerCount;
        }

        public SampleListResponseBodyDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public SampleListResponseBodyDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

    public static class SampleListResponseBodyData extends TeaModel {
        @NameInMap("Total")
        public Long total;

        @NameInMap("List")
        public java.util.List<SampleListResponseBodyDataList> list;

        public static SampleListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SampleListResponseBodyData self = new SampleListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SampleListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public SampleListResponseBodyData setList(java.util.List<SampleListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<SampleListResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
