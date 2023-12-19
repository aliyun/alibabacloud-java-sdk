// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopObjectRetrievalResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<PopObjectRetrievalResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PopObjectRetrievalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopObjectRetrievalResponseBody self = new PopObjectRetrievalResponseBody();
        return TeaModel.build(map, self);
    }

    public PopObjectRetrievalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopObjectRetrievalResponseBody setData(java.util.List<PopObjectRetrievalResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PopObjectRetrievalResponseBodyData> getData() {
        return this.data;
    }

    public PopObjectRetrievalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopObjectRetrievalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopObjectRetrievalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PopObjectRetrievalResponseBodyData extends TeaModel {
        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("GlbUrl")
        public String glbUrl;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModelUrl")
        public String modelUrl;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        @NameInMap("Title")
        public String title;

        public static PopObjectRetrievalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopObjectRetrievalResponseBodyData self = new PopObjectRetrievalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopObjectRetrievalResponseBodyData setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopObjectRetrievalResponseBodyData setGlbUrl(String glbUrl) {
            this.glbUrl = glbUrl;
            return this;
        }
        public String getGlbUrl() {
            return this.glbUrl;
        }

        public PopObjectRetrievalResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopObjectRetrievalResponseBodyData setModelUrl(String modelUrl) {
            this.modelUrl = modelUrl;
            return this;
        }
        public String getModelUrl() {
            return this.modelUrl;
        }

        public PopObjectRetrievalResponseBodyData setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public PopObjectRetrievalResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
