// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpnAttachmentResponseBody extends TeaModel {
    /**
     * <p>The status code returned for the operation. A value of **200** indicates that the operation is performed.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information returned for the operation.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is performed.</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteVpnAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpnAttachmentResponseBody self = new DeleteVpnAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVpnAttachmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteVpnAttachmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteVpnAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteVpnAttachmentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
