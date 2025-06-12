// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedResponseBody extends TeaModel {
    /**
     * <p>The details of the time when the AccessKey pair was used for the last time.</p>
     */
    @NameInMap("AccessKeyLastUsed")
    public GetAccessKeyLastUsedResponseBodyAccessKeyLastUsed accessKeyLastUsed;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5CCE804C-6450-49A7-B1DB-2460F7A97416</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAccessKeyLastUsedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedResponseBody self = new GetAccessKeyLastUsedResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedResponseBody setAccessKeyLastUsed(GetAccessKeyLastUsedResponseBodyAccessKeyLastUsed accessKeyLastUsed) {
        this.accessKeyLastUsed = accessKeyLastUsed;
        return this;
    }
    public GetAccessKeyLastUsedResponseBodyAccessKeyLastUsed getAccessKeyLastUsed() {
        return this.accessKeyLastUsed;
    }

    public GetAccessKeyLastUsedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAccessKeyLastUsedResponseBodyAccessKeyLastUsed extends TeaModel {
        /**
         * <p>The time when the AccessKey pair was used for the last time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-21T06:37:40Z</p>
         */
        @NameInMap("LastUsedDate")
        public String lastUsedDate;

        public static GetAccessKeyLastUsedResponseBodyAccessKeyLastUsed build(java.util.Map<String, ?> map) throws Exception {
            GetAccessKeyLastUsedResponseBodyAccessKeyLastUsed self = new GetAccessKeyLastUsedResponseBodyAccessKeyLastUsed();
            return TeaModel.build(map, self);
        }

        public GetAccessKeyLastUsedResponseBodyAccessKeyLastUsed setLastUsedDate(String lastUsedDate) {
            this.lastUsedDate = lastUsedDate;
            return this;
        }
        public String getLastUsedDate() {
            return this.lastUsedDate;
        }

    }

}
