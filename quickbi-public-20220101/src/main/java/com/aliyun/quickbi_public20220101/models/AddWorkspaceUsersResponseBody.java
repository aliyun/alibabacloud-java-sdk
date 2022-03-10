// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddWorkspaceUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public AddWorkspaceUsersResponseBodyResult result;

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
        @NameInMap("Failure")
        public Integer failure;

        @NameInMap("FailureDetail")
        public java.util.Map<String, ?> failureDetail;

        @NameInMap("Success")
        public Integer success;

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
