// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultVodTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VodTemplateId")
    public String vodTemplateId;

    public static SetDefaultVodTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultVodTemplateResponseBody self = new SetDefaultVodTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDefaultVodTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDefaultVodTemplateResponseBody setVodTemplateId(String vodTemplateId) {
        this.vodTemplateId = vodTemplateId;
        return this;
    }
    public String getVodTemplateId() {
        return this.vodTemplateId;
    }

}
