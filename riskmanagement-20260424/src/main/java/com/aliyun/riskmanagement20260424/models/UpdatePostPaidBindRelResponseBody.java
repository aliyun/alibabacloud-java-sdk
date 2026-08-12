// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class UpdatePostPaidBindRelResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public UpdatePostPaidBindRelResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6E20BFD0-AA91-594F-B5A7-32CED4777DA0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values: true: The call is successful. false: The call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The number of servers that are successfully bound.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BindCount")
        public Long bindCount;

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>62A7DCE2-7D9C-511B-919E-0F46A9D19AE6</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The result code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
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
        /**
         * <p>The message body.</p>
         */
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
