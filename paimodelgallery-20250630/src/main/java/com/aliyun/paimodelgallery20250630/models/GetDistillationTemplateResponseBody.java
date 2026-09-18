// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class GetDistillationTemplateResponseBody extends TeaModel {
    /**
     * <p>The distillation template details.</p>
     */
    @NameInMap("DistillationTemplate")
    public DistillationTemplate distillationTemplate;

    /**
     * <p><strong>Request ID</strong></p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDistillationTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDistillationTemplateResponseBody self = new GetDistillationTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDistillationTemplateResponseBody setDistillationTemplate(DistillationTemplate distillationTemplate) {
        this.distillationTemplate = distillationTemplate;
        return this;
    }
    public DistillationTemplate getDistillationTemplate() {
        return this.distillationTemplate;
    }

    public GetDistillationTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
