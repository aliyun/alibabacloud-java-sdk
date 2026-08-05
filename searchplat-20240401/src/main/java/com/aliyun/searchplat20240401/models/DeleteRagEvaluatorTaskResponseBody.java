// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class DeleteRagEvaluatorTaskResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>not found</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;xx not found&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0B66A850-506C-56B7-B001-EA09411CCD69</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteRagEvaluatorTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRagEvaluatorTaskResponseBody self = new DeleteRagEvaluatorTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRagEvaluatorTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteRagEvaluatorTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteRagEvaluatorTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
