// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyAsrConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ModifyAsrConfigResponseBodyData data;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyAsrConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAsrConfigResponseBody self = new ModifyAsrConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAsrConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyAsrConfigResponseBody setData(ModifyAsrConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyAsrConfigResponseBodyData getData() {
        return this.data;
    }

    public ModifyAsrConfigResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ModifyAsrConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyAsrConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAsrConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyAsrConfigResponseBodyData extends TeaModel {
        @NameInMap("AffectedRows")
        public Integer affectedRows;

        public static ModifyAsrConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyAsrConfigResponseBodyData self = new ModifyAsrConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyAsrConfigResponseBodyData setAffectedRows(Integer affectedRows) {
            this.affectedRows = affectedRows;
            return this;
        }
        public Integer getAffectedRows() {
            return this.affectedRows;
        }

    }

}
