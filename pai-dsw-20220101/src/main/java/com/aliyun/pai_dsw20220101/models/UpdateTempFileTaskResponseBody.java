// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class UpdateTempFileTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;200&quot;</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;XXX&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>task-05cexxxxxxxxx</p>
     */
    @NameInMap("TempFileTaskId")
    public String tempFileTaskId;

    public static UpdateTempFileTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTempFileTaskResponseBody self = new UpdateTempFileTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTempFileTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateTempFileTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateTempFileTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateTempFileTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTempFileTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateTempFileTaskResponseBody setTempFileTaskId(String tempFileTaskId) {
        this.tempFileTaskId = tempFileTaskId;
        return this;
    }
    public String getTempFileTaskId() {
        return this.tempFileTaskId;
    }

}
