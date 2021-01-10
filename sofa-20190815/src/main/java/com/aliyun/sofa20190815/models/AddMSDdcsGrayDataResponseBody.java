// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMSDdcsGrayDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PushResult")
    public java.util.List<AddMSDdcsGrayDataResponseBodyPushResult> pushResult;

    public static AddMSDdcsGrayDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMSDdcsGrayDataResponseBody self = new AddMSDdcsGrayDataResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMSDdcsGrayDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMSDdcsGrayDataResponseBody setPushResult(java.util.List<AddMSDdcsGrayDataResponseBodyPushResult> pushResult) {
        this.pushResult = pushResult;
        return this;
    }
    public java.util.List<AddMSDdcsGrayDataResponseBodyPushResult> getPushResult() {
        return this.pushResult;
    }

    public static class AddMSDdcsGrayDataResponseBodyPushResult extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Success")
        public Boolean success;

        public static AddMSDdcsGrayDataResponseBodyPushResult build(java.util.Map<String, ?> map) throws Exception {
            AddMSDdcsGrayDataResponseBodyPushResult self = new AddMSDdcsGrayDataResponseBodyPushResult();
            return TeaModel.build(map, self);
        }

        public AddMSDdcsGrayDataResponseBodyPushResult setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public AddMSDdcsGrayDataResponseBodyPushResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
