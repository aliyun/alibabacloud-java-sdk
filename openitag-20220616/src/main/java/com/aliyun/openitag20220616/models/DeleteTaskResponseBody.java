// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class DeleteTaskResponseBody extends TeaModel {
    /**
     * <p>Total number of data entries under the conditions of this request. This parameter is optional and is not returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Details</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Details")
    public String details;

    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Response message of the request</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>90ABA848-AD74-1F6E-84BC-4182A7F1F29E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskResponseBody self = new DeleteTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTaskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteTaskResponseBody setDetails(String details) {
        this.details = details;
        return this;
    }
    public String getDetails() {
        return this.details;
    }

    public DeleteTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
