// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVodTemplateRequest extends TeaModel {
    /**
     * <p>Indicates whether the template is the default one. Valid values:</p>
     * <br>
     * <p>*   **Default**: The template is the default one.</p>
     * <p>*   **NotDefault**: The template is not the default one.</p>
     */
    @NameInMap("VodTemplateId")
    public String vodTemplateId;

    public static GetVodTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVodTemplateRequest self = new GetVodTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetVodTemplateRequest setVodTemplateId(String vodTemplateId) {
        this.vodTemplateId = vodTemplateId;
        return this;
    }
    public String getVodTemplateId() {
        return this.vodTemplateId;
    }

}
