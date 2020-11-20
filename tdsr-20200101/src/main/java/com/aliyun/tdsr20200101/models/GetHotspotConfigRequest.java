// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetHotspotConfigRequest extends TeaModel {
    @NameInMap("PreviewToken")
    public String previewToken;

    public static GetHotspotConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotConfigRequest self = new GetHotspotConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetHotspotConfigRequest setPreviewToken(String previewToken) {
        this.previewToken = previewToken;
        return this;
    }
    public String getPreviewToken() {
        return this.previewToken;
    }

}
