// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class TransferResourceRequest extends TeaModel {
    @NameInMap("ActionCode")
    public String actionCode;

    @NameInMap("Content")
    public String content;

    public static TransferResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferResourceRequest self = new TransferResourceRequest();
        return TeaModel.build(map, self);
    }

    public TransferResourceRequest setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public TransferResourceRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
