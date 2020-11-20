// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class SaveHotspotConfigRequest extends TeaModel {
    @NameInMap("ParamTag")
    public String paramTag;

    @NameInMap("PreviewToken")
    public String previewToken;

    public static SaveHotspotConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveHotspotConfigRequest self = new SaveHotspotConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveHotspotConfigRequest setParamTag(String paramTag) {
        this.paramTag = paramTag;
        return this;
    }
    public String getParamTag() {
        return this.paramTag;
    }

    public SaveHotspotConfigRequest setPreviewToken(String previewToken) {
        this.previewToken = previewToken;
        return this;
    }
    public String getPreviewToken() {
        return this.previewToken;
    }

}
