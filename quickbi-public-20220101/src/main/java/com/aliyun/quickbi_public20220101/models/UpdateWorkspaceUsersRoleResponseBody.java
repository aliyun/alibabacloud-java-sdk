// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceUsersRoleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7AAB95D7-2E11-4FE2-94BC-858E4FC0C976</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The execution result of the operation.</p>
     */
    @NameInMap("Result")
    public UpdateWorkspaceUsersRoleResponseBodyResult result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request is successful. Some members may be updated successfully while others fail. For the failure reasons, refer to FailureDetail in the response.</li>
     * <li>false: The request fails and no data is persisted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateWorkspaceUsersRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceUsersRoleResponseBody self = new UpdateWorkspaceUsersRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceUsersRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWorkspaceUsersRoleResponseBody setResult(UpdateWorkspaceUsersRoleResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateWorkspaceUsersRoleResponseBodyResult getResult() {
        return this.result;
    }

    public UpdateWorkspaceUsersRoleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateWorkspaceUsersRoleResponseBodyResult extends TeaModel {
        /**
         * <p>The number of users whose roles failed to be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Failure")
        public Integer failure;

        /**
         * <p>The reasons for the update failures.</p>
         */
        @NameInMap("FailureDetail")
        public java.util.Map<String, ?> failureDetail;

        /**
         * <p>The number of users whose roles were successfully updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Success")
        public Integer success;

        /**
         * <p>The total number of users to be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static UpdateWorkspaceUsersRoleResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceUsersRoleResponseBodyResult self = new UpdateWorkspaceUsersRoleResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceUsersRoleResponseBodyResult setFailure(Integer failure) {
            this.failure = failure;
            return this;
        }
        public Integer getFailure() {
            return this.failure;
        }

        public UpdateWorkspaceUsersRoleResponseBodyResult setFailureDetail(java.util.Map<String, ?> failureDetail) {
            this.failureDetail = failureDetail;
            return this;
        }
        public java.util.Map<String, ?> getFailureDetail() {
            return this.failureDetail;
        }

        public UpdateWorkspaceUsersRoleResponseBodyResult setSuccess(Integer success) {
            this.success = success;
            return this;
        }
        public Integer getSuccess() {
            return this.success;
        }

        public UpdateWorkspaceUsersRoleResponseBodyResult setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
