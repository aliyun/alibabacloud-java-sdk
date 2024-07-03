// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class AddMTInterveneWordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>parameterError</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>46E6B40D-2B6C-571B-AC41-86207DE288A5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WordId")
    public Long wordId;

    public static AddMTInterveneWordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMTInterveneWordResponseBody self = new AddMTInterveneWordResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMTInterveneWordResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddMTInterveneWordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddMTInterveneWordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMTInterveneWordResponseBody setWordId(Long wordId) {
        this.wordId = wordId;
        return this;
    }
    public Long getWordId() {
        return this.wordId;
    }

}
