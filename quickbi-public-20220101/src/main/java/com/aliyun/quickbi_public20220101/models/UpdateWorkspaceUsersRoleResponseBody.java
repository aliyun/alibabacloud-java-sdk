// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceUsersRoleResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7AAB95D7-2E11-4FE2-94BC-858E4FC0C976</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns the result of the interface execution.</p>
     */
    @NameInMap("Result")
    public UpdateWorkspaceUsersRoleResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Value range:</p>
     * <ul>
     * <li>true: The request was successful, some members may have been updated successfully while others failed, refer to FailureDetail in the response for reasons of failure</li>
     * <li>false: The request failed, no data will be persisted</li>
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
         * <p>Number of users that failed to update.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Failure")
        public Integer failure;

        /**
         * <p>Reasons for the update failures.</p>
         */
        @NameInMap("FailureDetail")
        public java.util.Map<String, ?> failureDetail;

        /**
         * <p>Number of users that were updated successfully.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Success")
        public Integer success;

        /**
         * <p>Modify the total number of users.</p>
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
