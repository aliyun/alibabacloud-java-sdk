// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodTemplateResponseBody extends TeaModel {
    @NameInMap("VodTemplateId")
    public String vodTemplateId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVodTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodTemplateResponseBody self = new DeleteVodTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVodTemplateResponseBody setVodTemplateId(String vodTemplateId) {
        this.vodTemplateId = vodTemplateId;
        return this;
    }
    public String getVodTemplateId() {
        return this.vodTemplateId;
    }

    public DeleteVodTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
