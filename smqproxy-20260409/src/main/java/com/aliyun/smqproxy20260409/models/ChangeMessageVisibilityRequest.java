// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class ChangeMessageVisibilityRequest extends TeaModel {
    /**
     * <p>The temporary handle of the message returned after the last consumption.</p>
     * 
     * <strong>example:</strong>
     * <p>1-ODU4OTkzNDU5My0xNDMyNzI3ODI3LTItOA==</p>
     */
    @NameInMap("receiptHandle")
    public String receiptHandle;

    /**
     * <p>The countdown from the current moment until the message becomes Active again. Valid values: 1 to 43200. Unit: seconds (1 second to 12 hours).</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
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
