// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetJoinCodeResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetJoinCodeResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static GetJoinCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJoinCodeResponseBody self = new GetJoinCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJoinCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJoinCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJoinCodeResponseBody setData(GetJoinCodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetJoinCodeResponseBodyData getData() {
        return this.data;
    }

    public GetJoinCodeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetJoinCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetJoinCodeResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        public static GetJoinCodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetJoinCodeResponseBodyData self = new GetJoinCodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetJoinCodeResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

}
