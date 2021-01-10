// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushMsConfigDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static PushMsConfigDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushMsConfigDataResponseBody self = new PushMsConfigDataResponseBody();
        return TeaModel.build(map, self);
    }

    public PushMsConfigDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushMsConfigDataResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushMsConfigDataResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class GrayPushMsConfigDataResponseBodyPushResult extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Success")
        public Boolean success;

        public static GrayPushMsConfigDataResponseBodyPushResult build(java.util.Map<String, ?> map) throws Exception {
            GrayPushMsConfigDataResponseBodyPushResult self = new GrayPushMsConfigDataResponseBodyPushResult();
            return TeaModel.build(map, self);
        }

        public GrayPushMsConfigDataResponseBodyPushResult setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GrayPushMsConfigDataResponseBodyPushResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
