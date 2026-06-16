// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetDisposalToolStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDisposalToolStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDisposalToolStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDisposalToolStatusResponseBody self = new GetDisposalToolStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDisposalToolStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDisposalToolStatusResponseBody setData(GetDisposalToolStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDisposalToolStatusResponseBodyData getData() {
        return this.data;
    }

    public GetDisposalToolStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDisposalToolStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDisposalToolStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDisposalToolStatusResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public Boolean status;

        public static GetDisposalToolStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDisposalToolStatusResponseBodyData self = new GetDisposalToolStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDisposalToolStatusResponseBodyData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

}
