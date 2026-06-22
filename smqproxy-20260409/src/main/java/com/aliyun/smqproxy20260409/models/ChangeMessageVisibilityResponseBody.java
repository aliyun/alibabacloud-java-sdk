// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class ChangeMessageVisibilityResponseBody extends TeaModel {
    @NameInMap("NextVisibleTime")
    public Long nextVisibleTime;

    @NameInMap("ReceiptHandle")
    public String receiptHandle;

    public static ChangeMessageVisibilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeMessageVisibilityResponseBody self = new ChangeMessageVisibilityResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeMessageVisibilityResponseBody setNextVisibleTime(Long nextVisibleTime) {
        this.nextVisibleTime = nextVisibleTime;
        return this;
    }
    public Long getNextVisibleTime() {
        return this.nextVisibleTime;
    }

    public ChangeMessageVisibilityResponseBody setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
        return this;
    }
    public String getReceiptHandle() {
        return this.receiptHandle;
    }

}
