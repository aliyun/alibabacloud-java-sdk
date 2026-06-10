// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateBeebotIntentLgfResponseBody extends TeaModel {
    /**
     * <p>The internal request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>497CFAFF-48CC-161A-AD2C-252DED569037</p>
     */
    @NameInMap("BeebotRequestId")
    public String beebotRequestId;

    /**
     * <p>The status code of the API call.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the user utterance template.</p>
     * 
     * <strong>example:</strong>
     * <p>5666117</p>
     */
    @NameInMap("LgfId")
    public Long lgfId;

    /**
     * <p>The message returned for the API call.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateBeebotIntentLgfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBeebotIntentLgfResponseBody self = new CreateBeebotIntentLgfResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBeebotIntentLgfResponseBody setBeebotRequestId(String beebotRequestId) {
        this.beebotRequestId = beebotRequestId;
        return this;
    }
    public String getBeebotRequestId() {
        return this.beebotRequestId;
    }

    public CreateBeebotIntentLgfResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateBeebotIntentLgfResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateBeebotIntentLgfResponseBody setLgfId(Long lgfId) {
        this.lgfId = lgfId;
        return this;
    }
    public Long getLgfId() {
        return this.lgfId;
    }

    public CreateBeebotIntentLgfResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateBeebotIntentLgfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBeebotIntentLgfResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
