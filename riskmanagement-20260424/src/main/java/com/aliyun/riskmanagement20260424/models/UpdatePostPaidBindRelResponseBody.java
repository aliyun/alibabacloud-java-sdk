// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class UpdatePostPaidBindRelResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdatePostPaidBindRelResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdatePostPaidBindRelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePostPaidBindRelResponseBody self = new UpdatePostPaidBindRelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePostPaidBindRelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdatePostPaidBindRelResponseBody setData(UpdatePostPaidBindRelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdatePostPaidBindRelResponseBodyData getData() {
        return this.data;
    }

    public UpdatePostPaidBindRelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdatePostPaidBindRelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePostPaidBindRelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdatePostPaidBindRelResponseBodyDataBody extends TeaModel {
        @NameInMap("BindCount")
        public Long bindCount;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultCode")
        public Integer resultCode;

        public static UpdatePostPaidBindRelResponseBodyDataBody build(java.util.Map<String, ?> map) throws Exception {
            UpdatePostPaidBindRelResponseBodyDataBody self = new UpdatePostPaidBindRelResponseBodyDataBody();
            return TeaModel.build(map, self);
        }

        public UpdatePostPaidBindRelResponseBodyDataBody setBindCount(Long bindCount) {
            this.bindCount = bindCount;
            return this;
        }
        public Long getBindCount() {
            return this.bindCount;
        }

        public UpdatePostPaidBindRelResponseBodyDataBody setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public UpdatePostPaidBindRelResponseBodyDataBody setResultCode(Integer resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public Integer getResultCode() {
            return this.resultCode;
        }

    }

    public static class UpdatePostPaidBindRelResponseBodyData extends TeaModel {
        @NameInMap("Body")
        public UpdatePostPaidBindRelResponseBodyDataBody body;

        public static UpdatePostPaidBindRelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdatePostPaidBindRelResponseBodyData self = new UpdatePostPaidBindRelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdatePostPaidBindRelResponseBodyData setBody(UpdatePostPaidBindRelResponseBodyDataBody body) {
            this.body = body;
            return this;
        }
        public UpdatePostPaidBindRelResponseBodyDataBody getBody() {
            return this.body;
        }

    }

}
