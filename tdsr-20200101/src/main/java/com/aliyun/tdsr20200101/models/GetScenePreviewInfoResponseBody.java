// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetScenePreviewInfoResponseBody extends TeaModel {
    // 返回码
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetScenePreviewInfoResponseBodyData data;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    public static GetScenePreviewInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScenePreviewInfoResponseBody self = new GetScenePreviewInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScenePreviewInfoResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetScenePreviewInfoResponseBody setData(GetScenePreviewInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetScenePreviewInfoResponseBodyData getData() {
        return this.data;
    }

    public GetScenePreviewInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScenePreviewInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScenePreviewInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetScenePreviewInfoResponseBodyData extends TeaModel {
        // 模型地址
        @NameInMap("ModelPath")
        public String modelPath;

        // html转译后的预览数据
        @NameInMap("PanoList")
        public String panoList;

        // 模型的贴图路径
        @NameInMap("TextureModelPath")
        public String textureModelPath;

        // 漫游后预览图片路径
        @NameInMap("TexturePanoPath")
        public String texturePanoPath;

        public static GetScenePreviewInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScenePreviewInfoResponseBodyData self = new GetScenePreviewInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScenePreviewInfoResponseBodyData setModelPath(String modelPath) {
            this.modelPath = modelPath;
            return this;
        }
        public String getModelPath() {
            return this.modelPath;
        }

        public GetScenePreviewInfoResponseBodyData setPanoList(String panoList) {
            this.panoList = panoList;
            return this;
        }
        public String getPanoList() {
            return this.panoList;
        }

        public GetScenePreviewInfoResponseBodyData setTextureModelPath(String textureModelPath) {
            this.textureModelPath = textureModelPath;
            return this;
        }
        public String getTextureModelPath() {
            return this.textureModelPath;
        }

        public GetScenePreviewInfoResponseBodyData setTexturePanoPath(String texturePanoPath) {
            this.texturePanoPath = texturePanoPath;
            return this;
        }
        public String getTexturePanoPath() {
            return this.texturePanoPath;
        }

    }

}
