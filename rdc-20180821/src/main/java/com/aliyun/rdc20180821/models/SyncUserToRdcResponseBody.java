// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class SyncUserToRdcResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SyncUserToRdcResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static SyncUserToRdcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncUserToRdcResponseBody self = new SyncUserToRdcResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncUserToRdcResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SyncUserToRdcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncUserToRdcResponseBody setData(SyncUserToRdcResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SyncUserToRdcResponseBodyData getData() {
        return this.data;
    }

    public SyncUserToRdcResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SyncUserToRdcResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SyncUserToRdcResponseBodyData extends TeaModel {
        @NameInMap("IsValid")
        public Boolean isValid;

        public static SyncUserToRdcResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SyncUserToRdcResponseBodyData self = new SyncUserToRdcResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SyncUserToRdcResponseBodyData setIsValid(Boolean isValid) {
            this.isValid = isValid;
            return this;
        }
        public Boolean getIsValid() {
            return this.isValid;
        }

    }

}
