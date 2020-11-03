// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class AddMTInterveneWordResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Message")
    @Validation(required = true)
    public Integer message;

    @NameInMap("WordId")
    @Validation(required = true)
    public String wordId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddMTInterveneWordResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMTInterveneWordResponse self = new AddMTInterveneWordResponse();
        return TeaModel.build(map, self);
    }

    public AddMTInterveneWordResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddMTInterveneWordResponse setMessage(Integer message) {
        this.message = message;
        return this;
    }
    public Integer getMessage() {
        return this.message;
    }

    public AddMTInterveneWordResponse setWordId(String wordId) {
        this.wordId = wordId;
        return this;
    }
    public String getWordId() {
        return this.wordId;
    }

    public AddMTInterveneWordResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
