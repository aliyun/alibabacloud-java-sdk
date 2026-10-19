// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class ChangeMessageVisibilityResponseBody extends TeaModel {
    /**
     * <p>The time when the message can be consumed again (millisecond-level timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1250700979348</p>
     */
    @NameInMap("NextVisibleTime")
    public Long nextVisibleTime;

    /**
     * <p>The new temporary handle. Use this new handle for subsequent delete or modification operations. This handle is valid before NextVisibleTime.</p>
     * 
     * <strong>example:</strong>
     * <p>TbZj6wDWli+9CEauMZc8ZRv37sIW2iJKq3M9Mx/TS1</p>
     */
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
