// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class AddMTInterveneWordResponseBody extends TeaModel {
    @NameInMap("WordId")
    public String wordId;

    @NameInMap("Message")
    public Integer message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    public static AddMTInterveneWordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMTInterveneWordResponseBody self = new AddMTInterveneWordResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMTInterveneWordResponseBody setWordId(String wordId) {
        this.wordId = wordId;
        return this;
    }
    public String getWordId() {
        return this.wordId;
    }

    public AddMTInterveneWordResponseBody setMessage(Integer message) {
        this.message = message;
        return this;
    }
    public Integer getMessage() {
        return this.message;
    }

    public AddMTInterveneWordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMTInterveneWordResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

}
