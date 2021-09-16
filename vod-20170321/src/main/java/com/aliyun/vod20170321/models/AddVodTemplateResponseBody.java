// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodTemplateResponseBody extends TeaModel {
    @NameInMap("VodTemplateId")
    public String vodTemplateId;

    @NameInMap("RequestId")
    public String requestId;

    public static AddVodTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddVodTemplateResponseBody self = new AddVodTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddVodTemplateResponseBody setVodTemplateId(String vodTemplateId) {
        this.vodTemplateId = vodTemplateId;
        return this;
    }
    public String getVodTemplateId() {
        return this.vodTemplateId;
    }

    public AddVodTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
