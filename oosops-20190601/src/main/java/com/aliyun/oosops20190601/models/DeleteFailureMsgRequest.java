// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class DeleteFailureMsgRequest extends TeaModel {
    @NameInMap("Operation")
    public String operation;

    @NameInMap("RequestFingerprint")
    public String requestFingerprint;

    public static DeleteFailureMsgRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFailureMsgRequest self = new DeleteFailureMsgRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFailureMsgRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public DeleteFailureMsgRequest setRequestFingerprint(String requestFingerprint) {
        this.requestFingerprint = requestFingerprint;
        return this;
    }
    public String getRequestFingerprint() {
        return this.requestFingerprint;
    }

}
