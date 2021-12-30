// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachHostAccountsFromHostShareKeyResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<DetachHostAccountsFromHostShareKeyResponseBodyResults> results;

    public static DetachHostAccountsFromHostShareKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachHostAccountsFromHostShareKeyResponseBody self = new DetachHostAccountsFromHostShareKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachHostAccountsFromHostShareKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetachHostAccountsFromHostShareKeyResponseBody setResults(java.util.List<DetachHostAccountsFromHostShareKeyResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<DetachHostAccountsFromHostShareKeyResponseBodyResults> getResults() {
        return this.results;
    }

    public static class DetachHostAccountsFromHostShareKeyResponseBodyResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("HostAccountId")
        public String hostAccountId;

        @NameInMap("HostShareKeyId")
        public String hostShareKeyId;

        @NameInMap("Message")
        public String message;

        public static DetachHostAccountsFromHostShareKeyResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            DetachHostAccountsFromHostShareKeyResponseBodyResults self = new DetachHostAccountsFromHostShareKeyResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public DetachHostAccountsFromHostShareKeyResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachHostAccountsFromHostShareKeyResponseBodyResults setHostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }
        public String getHostAccountId() {
            return this.hostAccountId;
        }

        public DetachHostAccountsFromHostShareKeyResponseBodyResults setHostShareKeyId(String hostShareKeyId) {
            this.hostShareKeyId = hostShareKeyId;
            return this;
        }
        public String getHostShareKeyId() {
            return this.hostShareKeyId;
        }

        public DetachHostAccountsFromHostShareKeyResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
