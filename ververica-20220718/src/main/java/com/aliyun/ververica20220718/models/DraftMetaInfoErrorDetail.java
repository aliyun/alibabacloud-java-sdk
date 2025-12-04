// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DraftMetaInfoErrorDetail extends TeaModel {
    @NameInMap("message")
    public String message;

    @NameInMap("reason")
    public String reason;

    public static DraftMetaInfoErrorDetail build(java.util.Map<String, ?> map) throws Exception {
        DraftMetaInfoErrorDetail self = new DraftMetaInfoErrorDetail();
        return TeaModel.build(map, self);
    }

    public DraftMetaInfoErrorDetail setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DraftMetaInfoErrorDetail setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
