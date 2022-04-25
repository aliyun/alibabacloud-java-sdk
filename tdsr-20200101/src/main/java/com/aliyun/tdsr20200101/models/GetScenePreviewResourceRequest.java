// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetScenePreviewResourceRequest extends TeaModel {
    // 预览token
    @NameInMap("PreviewToken")
    public String previewToken;

    public static GetScenePreviewResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScenePreviewResourceRequest self = new GetScenePreviewResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetScenePreviewResourceRequest setPreviewToken(String previewToken) {
        this.previewToken = previewToken;
        return this;
    }
    public String getPreviewToken() {
        return this.previewToken;
    }

}
