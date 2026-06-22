// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class ChangeMessageVisibilityRequest extends TeaModel {
    @NameInMap("receiptHandle")
    public String receiptHandle;

    @NameInMap("visibilityTimeout")
    public Integer visibilityTimeout;

    public static ChangeMessageVisibilityRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeMessageVisibilityRequest self = new ChangeMessageVisibilityRequest();
        return TeaModel.build(map, self);
    }

    public ChangeMessageVisibilityRequest setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
        return this;
    }
    public String getReceiptHandle() {
        return this.receiptHandle;
    }

    public ChangeMessageVisibilityRequest setVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
        return this;
    }
    public Integer getVisibilityTimeout() {
        return this.visibilityTimeout;
    }

}
