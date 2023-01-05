// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateScriptWaveformResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScriptWaveformId")
    public String scriptWaveformId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateScriptWaveformResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScriptWaveformResponseBody self = new CreateScriptWaveformResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScriptWaveformResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateScriptWaveformResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateScriptWaveformResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateScriptWaveformResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScriptWaveformResponseBody setScriptWaveformId(String scriptWaveformId) {
        this.scriptWaveformId = scriptWaveformId;
        return this;
    }
    public String getScriptWaveformId() {
        return this.scriptWaveformId;
    }

    public CreateScriptWaveformResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
