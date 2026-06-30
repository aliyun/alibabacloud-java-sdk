// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteAsrVocabResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <strong>200</strong> means success. Any other value means failure. Use this field to identify the cause of failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The hotword ID you specified as vocabId.</p>
     * 
     * <strong>example:</strong>
     * <p>71b1795ac8634bd8bdf4d3878480c7c2</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Details about the error if the request fails. If the request succeeds, the value is <strong>successful</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4987D326-83D9-4A42-B9A5-0B27F9B40539</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. Use this field to check the result:</p>
     * <ul>
     * <li><p><strong>true</strong> means success.</p>
     * </li>
     * <li><p>false or <strong>null</strong> means failure.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteAsrVocabResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAsrVocabResponseBody self = new DeleteAsrVocabResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAsrVocabResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteAsrVocabResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteAsrVocabResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAsrVocabResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAsrVocabResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
