// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetScenePreviewResourceResponseBody extends TeaModel {
    // 返回码
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetScenePreviewResourceResponseBodyData data;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    public static GetScenePreviewResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScenePreviewResourceResponseBody self = new GetScenePreviewResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScenePreviewResourceResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetScenePreviewResourceResponseBody setData(GetScenePreviewResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetScenePreviewResourceResponseBodyData getData() {
        return this.data;
    }

    public GetScenePreviewResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScenePreviewResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScenePreviewResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetScenePreviewResourceResponseBodyDataResourceDirectory extends TeaModel {
        @NameInMap("ModelConfig")
        public String modelConfig;

        @NameInMap("OrthomapConfig")
        public String orthomapConfig;

        @NameInMap("RootPath")
        public String rootPath;

        public static GetScenePreviewResourceResponseBodyDataResourceDirectory build(java.util.Map<String, ?> map) throws Exception {
            GetScenePreviewResourceResponseBodyDataResourceDirectory self = new GetScenePreviewResourceResponseBodyDataResourceDirectory();
            return TeaModel.build(map, self);
        }

        public GetScenePreviewResourceResponseBodyDataResourceDirectory setModelConfig(String modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }
        public String getModelConfig() {
            return this.modelConfig;
        }

        public GetScenePreviewResourceResponseBodyDataResourceDirectory setOrthomapConfig(String orthomapConfig) {
            this.orthomapConfig = orthomapConfig;
            return this;
        }
        public String getOrthomapConfig() {
            return this.orthomapConfig;
        }

        public GetScenePreviewResourceResponseBodyDataResourceDirectory setRootPath(String rootPath) {
            this.rootPath = rootPath;
            return this;
        }
        public String getRootPath() {
            return this.rootPath;
        }

    }

    public static class GetScenePreviewResourceResponseBodyData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("ResourceDirectory")
        public GetScenePreviewResourceResponseBodyDataResourceDirectory resourceDirectory;

        @NameInMap("Version")
        public String version;

        public static GetScenePreviewResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScenePreviewResourceResponseBodyData self = new GetScenePreviewResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScenePreviewResourceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetScenePreviewResourceResponseBodyData setResourceDirectory(GetScenePreviewResourceResponseBodyDataResourceDirectory resourceDirectory) {
            this.resourceDirectory = resourceDirectory;
            return this;
        }
        public GetScenePreviewResourceResponseBodyDataResourceDirectory getResourceDirectory() {
            return this.resourceDirectory;
        }

        public GetScenePreviewResourceResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
