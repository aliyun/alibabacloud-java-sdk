// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicTemplateStatusReason extends TeaModel {
    @NameInMap("message")
    public String message;

    @NameInMap("step")
    public String step;

    public static PublicTemplateStatusReason build(java.util.Map<String, ?> map) throws Exception {
        PublicTemplateStatusReason self = new PublicTemplateStatusReason();
        return TeaModel.build(map, self);
    }

    public PublicTemplateStatusReason setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PublicTemplateStatusReason setStep(String step) {
        this.step = step;
        return this;
    }
    public String getStep() {
        return this.step;
    }

}
