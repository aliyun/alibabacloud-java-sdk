// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveContactBlockListResponseBody extends TeaModel {
    @NameInMap("AffectedRows")
    public Integer affectedRows;

    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SaveContactBlockListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveContactBlockListResponseBody self = new SaveContactBlockListResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveContactBlockListResponseBody setAffectedRows(Integer affectedRows) {
        this.affectedRows = affectedRows;
        return this;
    }
    public Integer getAffectedRows() {
        return this.affectedRows;
    }

    public SaveContactBlockListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveContactBlockListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SaveContactBlockListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveContactBlockListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveContactBlockListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
