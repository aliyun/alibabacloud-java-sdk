// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class DeleteMessageRequest extends TeaModel {
    @NameInMap("ReceiptHandle")
    public String receiptHandle;

    public static DeleteMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessageRequest self = new DeleteMessageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMessageRequest setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
        return this;
    }
    public String getReceiptHandle() {
        return this.receiptHandle;
    }

}
