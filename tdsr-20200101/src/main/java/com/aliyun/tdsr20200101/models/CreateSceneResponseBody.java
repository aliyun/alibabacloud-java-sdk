// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CreateSceneResponseBody extends TeaModel {
    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("PreviewToken")
    public String previewToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SceneId")
    public Long sceneId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSceneResponseBody self = new CreateSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSceneResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateSceneResponseBody setPreviewToken(String previewToken) {
        this.previewToken = previewToken;
        return this;
    }
    public String getPreviewToken() {
        return this.previewToken;
    }

    public CreateSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSceneResponseBody setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public CreateSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
