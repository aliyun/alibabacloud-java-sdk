// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class AlignStoragePrimaryAzoneResponseBody extends TeaModel {
    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successs</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1A6D328C-84B8-40DC-BF49-6C73984D7494</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
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
