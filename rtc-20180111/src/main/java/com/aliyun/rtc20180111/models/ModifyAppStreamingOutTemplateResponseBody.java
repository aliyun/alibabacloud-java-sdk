// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppStreamingOutTemplateResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateId")
    public String templateId;

    public static ModifyAppStreamingOutTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppStreamingOutTemplateResponseBody self = new ModifyAppStreamingOutTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppStreamingOutTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAppStreamingOutTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
