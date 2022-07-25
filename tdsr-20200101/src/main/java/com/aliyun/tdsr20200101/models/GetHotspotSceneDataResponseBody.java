// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetHotspotSceneDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetHotspotSceneDataResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetHotspotSceneDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotSceneDataResponseBody self = new GetHotspotSceneDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotspotSceneDataResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetHotspotSceneDataResponseBody setData(GetHotspotSceneDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHotspotSceneDataResponseBodyData getData() {
        return this.data;
    }

    public GetHotspotSceneDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotspotSceneDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotspotSceneDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHotspotSceneDataResponseBodyData extends TeaModel {
        @NameInMap("ModelToken")
        public String modelToken;

        @NameInMap("PreviewData")
        public String previewData;

        @NameInMap("PreviewToken")
        public String previewToken;

        @NameInMap("SceneType")
        public String sceneType;

        public static GetHotspotSceneDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotspotSceneDataResponseBodyData self = new GetHotspotSceneDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotspotSceneDataResponseBodyData setModelToken(String modelToken) {
            this.modelToken = modelToken;
            return this;
        }
        public String getModelToken() {
            return this.modelToken;
        }

        public GetHotspotSceneDataResponseBodyData setPreviewData(String previewData) {
            this.previewData = previewData;
            return this;
        }
        public String getPreviewData() {
            return this.previewData;
        }

        public GetHotspotSceneDataResponseBodyData setPreviewToken(String previewToken) {
            this.previewToken = previewToken;
            return this;
        }
        public String getPreviewToken() {
            return this.previewToken;
        }

        public GetHotspotSceneDataResponseBodyData setSceneType(String sceneType) {
            this.sceneType = sceneType;
            return this;
        }
        public String getSceneType() {
            return this.sceneType;
        }

    }

}
