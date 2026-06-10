// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteBeebotIntentLgfResponseBody extends TeaModel {
    /**
     * <p>Internal request ID</p>
     * 
     * <strong>example:</strong>
     * <p>0B219FCB-EC71-1F08-BB1B-0E87C20158C8</p>
     */
    @NameInMap("BeebotRequestId")
    public String beebotRequestId;

    /**
     * <p>API status code</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Utterance Template ID</p>
     * 
     * <strong>example:</strong>
     * <p>5666117</p>
     */
    @NameInMap("LgfId")
    public Long lgfId;

    /**
     * <p>API message</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Is successful</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteBeebotIntentLgfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBeebotIntentLgfResponseBody self = new DeleteBeebotIntentLgfResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBeebotIntentLgfResponseBody setBeebotRequestId(String beebotRequestId) {
        this.beebotRequestId = beebotRequestId;
        return this;
    }
    public String getBeebotRequestId() {
        return this.beebotRequestId;
    }

    public DeleteBeebotIntentLgfResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteBeebotIntentLgfResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteBeebotIntentLgfResponseBody setLgfId(Long lgfId) {
        this.lgfId = lgfId;
        return this;
    }
    public Long getLgfId() {
        return this.lgfId;
    }

    public DeleteBeebotIntentLgfResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteBeebotIntentLgfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteBeebotIntentLgfResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
