// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class QueryMotionShopVideoDetectResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryMotionShopVideoDetectResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryMotionShopVideoDetectResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMotionShopVideoDetectResultResponseBody self = new QueryMotionShopVideoDetectResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMotionShopVideoDetectResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMotionShopVideoDetectResultResponseBody setData(QueryMotionShopVideoDetectResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMotionShopVideoDetectResultResponseBodyData getData() {
        return this.data;
    }

    public QueryMotionShopVideoDetectResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMotionShopVideoDetectResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMotionShopVideoDetectResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMotionShopVideoDetectResultResponseBodyDataDetectResult extends TeaModel {
        @NameInMap("Box")
        public java.util.List<Double> box;

        @NameInMap("Code")
        public Integer code;

        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("Message")
        public String message;

        @NameInMap("SelectedFrameIndex")
        public Integer selectedFrameIndex;

        public static QueryMotionShopVideoDetectResultResponseBodyDataDetectResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMotionShopVideoDetectResultResponseBodyDataDetectResult self = new QueryMotionShopVideoDetectResultResponseBodyDataDetectResult();
            return TeaModel.build(map, self);
        }

        public QueryMotionShopVideoDetectResultResponseBodyDataDetectResult setBox(java.util.List<Double> box) {
            this.box = box;
            return this;
        }
        public java.util.List<Double> getBox() {
            return this.box;
        }

        public QueryMotionShopVideoDetectResultResponseBodyDataDetectResult setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public QueryMotionShopVideoDetectResultResponseBodyDataDetectResult setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public QueryMotionShopVideoDetectResultResponseBodyDataDetectResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryMotionShopVideoDetectResultResponseBodyDataDetectResult setSelectedFrameIndex(Integer selectedFrameIndex) {
            this.selectedFrameIndex = selectedFrameIndex;
            return this;
        }
        public Integer getSelectedFrameIndex() {
            return this.selectedFrameIndex;
        }

    }

    public static class QueryMotionShopVideoDetectResultResponseBodyData extends TeaModel {
        @NameInMap("DetectResult")
        public QueryMotionShopVideoDetectResultResponseBodyDataDetectResult detectResult;

        @NameInMap("Status")
        public String status;

        @NameInMap("VideoId")
        public String videoId;

        public static QueryMotionShopVideoDetectResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMotionShopVideoDetectResultResponseBodyData self = new QueryMotionShopVideoDetectResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMotionShopVideoDetectResultResponseBodyData setDetectResult(QueryMotionShopVideoDetectResultResponseBodyDataDetectResult detectResult) {
            this.detectResult = detectResult;
            return this;
        }
        public QueryMotionShopVideoDetectResultResponseBodyDataDetectResult getDetectResult() {
            return this.detectResult;
        }

        public QueryMotionShopVideoDetectResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryMotionShopVideoDetectResultResponseBodyData setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

}
