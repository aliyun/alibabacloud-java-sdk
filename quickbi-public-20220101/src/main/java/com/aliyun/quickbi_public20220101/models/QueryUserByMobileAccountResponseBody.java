// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserByMobileAccountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>46e53***********270</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryUserByMobileAccountResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryUserByMobileAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserByMobileAccountResponseBody self = new QueryUserByMobileAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserByMobileAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserByMobileAccountResponseBody setResult(QueryUserByMobileAccountResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryUserByMobileAccountResponseBodyResult getResult() {
        return this.result;
    }

    public QueryUserByMobileAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryUserByMobileAccountResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("BoundUserId")
        public String boundUserId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ThirdAccountName")
        public String thirdAccountName;

        public static QueryUserByMobileAccountResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryUserByMobileAccountResponseBodyResult self = new QueryUserByMobileAccountResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryUserByMobileAccountResponseBodyResult setBoundUserId(String boundUserId) {
            this.boundUserId = boundUserId;
            return this;
        }
        public String getBoundUserId() {
            return this.boundUserId;
        }

        public QueryUserByMobileAccountResponseBodyResult setThirdAccountName(String thirdAccountName) {
            this.thirdAccountName = thirdAccountName;
            return this;
        }
        public String getThirdAccountName() {
            return this.thirdAccountName;
        }

    }

}
