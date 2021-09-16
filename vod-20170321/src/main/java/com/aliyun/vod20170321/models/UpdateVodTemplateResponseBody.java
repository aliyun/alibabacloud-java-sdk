// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVodTemplateResponseBody extends TeaModel {
    @NameInMap("VodTemplateId")
    public String vodTemplateId;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateVodTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVodTemplateResponseBody self = new UpdateVodTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVodTemplateResponseBody setVodTemplateId(String vodTemplateId) {
        this.vodTemplateId = vodTemplateId;
        return this;
    }
    public String getVodTemplateId() {
        return this.vodTemplateId;
    }

    public UpdateVodTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
