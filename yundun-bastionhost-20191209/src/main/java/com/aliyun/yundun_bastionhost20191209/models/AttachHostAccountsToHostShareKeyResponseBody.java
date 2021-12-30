// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostAccountsToHostShareKeyResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<AttachHostAccountsToHostShareKeyResponseBodyResults> results;

    public static AttachHostAccountsToHostShareKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachHostAccountsToHostShareKeyResponseBody self = new AttachHostAccountsToHostShareKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachHostAccountsToHostShareKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachHostAccountsToHostShareKeyResponseBody setResults(java.util.List<AttachHostAccountsToHostShareKeyResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AttachHostAccountsToHostShareKeyResponseBodyResults> getResults() {
        return this.results;
    }

    public static class AttachHostAccountsToHostShareKeyResponseBodyResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("HostAccountId")
        public String hostAccountId;

        @NameInMap("HostShareKeyId")
        public String hostShareKeyId;

        @NameInMap("Message")
        public String message;

        public static AttachHostAccountsToHostShareKeyResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AttachHostAccountsToHostShareKeyResponseBodyResults self = new AttachHostAccountsToHostShareKeyResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AttachHostAccountsToHostShareKeyResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachHostAccountsToHostShareKeyResponseBodyResults setHostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }
        public String getHostAccountId() {
            return this.hostAccountId;
        }

        public AttachHostAccountsToHostShareKeyResponseBodyResults setHostShareKeyId(String hostShareKeyId) {
            this.hostShareKeyId = hostShareKeyId;
            return this;
        }
        public String getHostShareKeyId() {
            return this.hostShareKeyId;
        }

        public AttachHostAccountsToHostShareKeyResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
