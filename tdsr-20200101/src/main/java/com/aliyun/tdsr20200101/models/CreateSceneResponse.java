// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CreateSceneResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SceneId")
    @Validation(required = true)
    public Long sceneId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrMessage")
    @Validation(required = true)
    public String errMessage;

    @NameInMap("PreviewToken")
    @Validation(required = true)
    public String previewToken;

    public static CreateSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSceneResponse self = new CreateSceneResponse();
        return TeaModel.build(map, self);
    }

}
