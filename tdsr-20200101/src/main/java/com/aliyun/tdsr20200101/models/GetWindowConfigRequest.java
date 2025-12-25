// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetWindowConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5dc5c2dd927e45039dadb312384b****</p>
     */
    @NameInMap("PreviewToken")
    public String previewToken;

    public static GetWindowConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWindowConfigRequest self = new GetWindowConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetWindowConfigRequest setPreviewToken(String previewToken) {
        this.previewToken = previewToken;
        return this;
    }
    public String getPreviewToken() {
        return this.previewToken;
    }

}
