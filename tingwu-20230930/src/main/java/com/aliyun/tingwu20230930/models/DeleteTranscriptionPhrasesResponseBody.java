// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class DeleteTranscriptionPhrasesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>SUCCEEDED</p>
     */
    @NameInMap("Status")
    public String status;

    public static DeleteTranscriptionPhrasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTranscriptionPhrasesResponseBody self = new DeleteTranscriptionPhrasesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTranscriptionPhrasesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteTranscriptionPhrasesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteTranscriptionPhrasesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
