// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppStreamingOutTemplateResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>30D41049-D02D-1C21-86AE-B3E5FD805C27</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
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
