// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppViewTemplateResponseBody extends TeaModel {
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

    public static ModifyAppViewTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppViewTemplateResponseBody self = new ModifyAppViewTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppViewTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAppViewTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
