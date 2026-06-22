// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class BatchDeleteMessageRequest extends TeaModel {
    @NameInMap("ReceiptHandles")
    public java.util.List<String> receiptHandles;

    public static BatchDeleteMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteMessageRequest self = new BatchDeleteMessageRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteMessageRequest setReceiptHandles(java.util.List<String> receiptHandles) {
        this.receiptHandles = receiptHandles;
        return this;
    }
    public java.util.List<String> getReceiptHandles() {
        return this.receiptHandles;
    }

}
