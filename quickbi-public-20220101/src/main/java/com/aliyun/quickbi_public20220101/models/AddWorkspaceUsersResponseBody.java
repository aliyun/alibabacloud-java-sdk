// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddWorkspaceUsersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7AAB95D7-2E11-4FE2-94BC-858E4FC0C976</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public AddWorkspaceUsersResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddWorkspaceUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceUsersResponseBody self = new AddWorkspaceUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddWorkspaceUsersResponseBody setResult(AddWorkspaceUsersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddWorkspaceUsersResponseBodyResult getResult() {
        return this.result;
    }

    public AddWorkspaceUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddWorkspaceUsersResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Failure")
        public Integer failure;

        /**
         * <strong>example:</strong>
         * <p>{&quot;2046274934845893&quot; : &quot;AE0150010001: This user already exists.&quot;, &quot;1213444447906552&quot; : &quot;AE0150010001: This user already exists.&quot;}</p>
         */
        @NameInMap("FailureDetail")
        public java.util.Map<String, ?> failureDetail;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Integer success;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static AddWorkspaceUsersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddWorkspaceUsersResponseBodyResult self = new AddWorkspaceUsersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddWorkspaceUsersResponseBodyResult setFailure(Integer failure) {
            this.failure = failure;
            return this;
        }
        public Integer getFailure() {
            return this.failure;
        }

        public AddWorkspaceUsersResponseBodyResult setFailureDetail(java.util.Map<String, ?> failureDetail) {
            this.failureDetail = failureDetail;
            return this;
        }
        public java.util.Map<String, ?> getFailureDetail() {
            return this.failureDetail;
        }

        public AddWorkspaceUsersResponseBodyResult setSuccess(Integer success) {
            this.success = success;
            return this;
        }
        public Integer getSuccess() {
            return this.success;
        }

        public AddWorkspaceUsersResponseBodyResult setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
