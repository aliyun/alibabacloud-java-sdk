// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicTemplateStatus extends TeaModel {
    @NameInMap("finishedAt")
    public String finishedAt;

    @NameInMap("reason")
    public PublicTemplateStatusReason reason;

    @NameInMap("state")
    public String state;

    public static PublicTemplateStatus build(java.util.Map<String, ?> map) throws Exception {
        PublicTemplateStatus self = new PublicTemplateStatus();
        return TeaModel.build(map, self);
    }

    public PublicTemplateStatus setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public PublicTemplateStatus setReason(PublicTemplateStatusReason reason) {
        this.reason = reason;
        return this;
    }
    public PublicTemplateStatusReason getReason() {
        return this.reason;
    }

    public PublicTemplateStatus setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
