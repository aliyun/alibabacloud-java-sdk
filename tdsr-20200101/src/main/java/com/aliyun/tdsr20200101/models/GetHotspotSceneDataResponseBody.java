// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetHotspotSceneDataResponseBody extends TeaModel {
    // 返回码
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetHotspotSceneDataResponseBodyData data;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否请求成功
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
        // 模型token（sgm token）
        @NameInMap("ModelToken")
        public String modelToken;

        // html转译后的预览数据，包含图片、子场景ID等信息
        @NameInMap("PreviewData")
        public String previewData;

        // 预览token
        @NameInMap("PreviewToken")
        public String previewToken;

        // 3D模型：MODEL_3D 全景图片：PIC 全景视频：VIDEO
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
