// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GrayPushMsConfigDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PushResult")
    public java.util.List<GrayPushMsConfigDataResponseBodyPushResult> pushResult;

    public static GrayPushMsConfigDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrayPushMsConfigDataResponseBody self = new GrayPushMsConfigDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GrayPushMsConfigDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GrayPushMsConfigDataResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GrayPushMsConfigDataResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GrayPushMsConfigDataResponseBody setPushResult(java.util.List<GrayPushMsConfigDataResponseBodyPushResult> pushResult) {
        this.pushResult = pushResult;
        return this;
    }
    public java.util.List<GrayPushMsConfigDataResponseBodyPushResult> getPushResult() {
        return this.pushResult;
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
