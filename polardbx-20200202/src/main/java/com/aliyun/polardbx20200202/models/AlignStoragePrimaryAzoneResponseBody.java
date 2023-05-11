// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class AlignStoragePrimaryAzoneResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AlignStoragePrimaryAzoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AlignStoragePrimaryAzoneResponseBody self = new AlignStoragePrimaryAzoneResponseBody();
        return TeaModel.build(map, self);
    }

    public AlignStoragePrimaryAzoneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AlignStoragePrimaryAzoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AlignStoragePrimaryAzoneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
