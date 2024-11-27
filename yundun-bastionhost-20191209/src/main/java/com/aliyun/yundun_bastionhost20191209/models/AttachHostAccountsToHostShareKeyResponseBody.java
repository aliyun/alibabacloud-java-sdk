// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostAccountsToHostShareKeyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the call.</p>
     */
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
        /**
         * <p>The error code returned. If <strong>OK</strong> is returned, the association was successful. If another error code is returned, the association failed.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The ID of the host account.</p>
         * 
         * <strong>example:</strong>
         * <p>1201</p>
         */
        @NameInMap("HostAccountId")
        public String hostAccountId;

        /**
         * <p>The ID of the shared key.</p>
         * 
         * <strong>example:</strong>
         * <p>10267</p>
         */
        @NameInMap("HostShareKeyId")
        public String hostShareKeyId;

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The host account does not exist</p>
         */
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
