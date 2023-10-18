// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVodTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the snapshot template.</p>
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
