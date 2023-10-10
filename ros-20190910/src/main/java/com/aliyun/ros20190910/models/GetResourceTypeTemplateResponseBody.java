// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetResourceTypeTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The structure that contains the template body. The template body must be 1 to 51,200 bytes in length. For more information, see [Template syntax](~~28857~~).</p>
     * <br>
     * <p>> We recommend that use TemplateContent instead of TemplateBody.</p>
     */
    @NameInMap("TemplateBody")
    public java.util.Map<String, ?> templateBody;

    /**
     * <p>The JSON-formatted structure of the template body. For more information, see [Template syntax](~~28857~~).</p>
     */
    @NameInMap("TemplateContent")
    public String templateContent;

    public static GetResourceTypeTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypeTemplateResponseBody self = new GetResourceTypeTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceTypeTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceTypeTemplateResponseBody setTemplateBody(java.util.Map<String, ?> templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public java.util.Map<String, ?> getTemplateBody() {
        return this.templateBody;
    }

    public GetResourceTypeTemplateResponseBody setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

}
