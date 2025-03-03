// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetAccountDeletionCheckResultResponseBody extends TeaModel {
    /**
     * <p>The result of the deletion check for the member.</p>
     */
    @NameInMap("AccountDeletionCheckResultInfo")
    public GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfo accountDeletionCheckResultInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>54AC391D-4F7F-5F08-B8D3-0AECDE6EC5BD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAccountDeletionCheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountDeletionCheckResultResponseBody self = new GetAccountDeletionCheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountDeletionCheckResultResponseBody setAccountDeletionCheckResultInfo(GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfo accountDeletionCheckResultInfo) {
        this.accountDeletionCheckResultInfo = accountDeletionCheckResultInfo;
        return this;
    }
    public GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfo getAccountDeletionCheckResultInfo() {
        return this.accountDeletionCheckResultInfo;
    }

    public GetAccountDeletionCheckResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfoAbandonableChecks extends TeaModel {
        /**
         * <p>The ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>NON_SP_cs</p>
         */
        @NameInMap("CheckId")
        public String checkId;

        /**
         * <p>The name of the cloud service to which the check item belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Container Service for Kubernetes</p>
         */
        @NameInMap("CheckName")
        public String checkName;

        /**
         * <p>The description of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>An instance of a cloud service is running within the member. Submit a ticket to contact Alibaba Cloud technical support.</p>
         */
        @NameInMap("Description")
        public String description;

        public static GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfoAbandonableChecks build(java.util.Map<String, ?> map) throws Exception {
            GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfoAbandonableChecks self = new GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfoAbandonableChecks();
            return TeaModel.build(map, self);
        }

        public GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfoAbandonableChecks setCheckId(String checkId) {
            this.checkId = checkId;
            return this;
        }
        public String getCheckId() {
            return this.checkId;
        }

        public GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfoAbandonableChecks setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfoAbandonableChecks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfoNotAllowReason extends TeaModel {
        /**
         * <p>The ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>NON_SP_efc</p>
         */
        @NameInMap("CheckId")
        public String checkId;

        /**
         * <p>The name of the cloud service to which the check item belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Enterprise finance</p>
         */
        @NameInMap("CheckName")
        public String checkName;

        /**
         * <p>The description of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>This account is an Enterprise Finance associated account. Please remove the financial association of this account before deleting it.</p>
         */
        @NameInMap("Description")
        public String description;

        public static GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfoNotAllowReason build(java.util.Map<String, ?> map) throws Exception {
            GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfoNotAllowReason self = new GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfoNotAllowReason();
            return TeaModel.build(map, self);
        }

        public GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfoNotAllowReason setCheckId(String checkId) {
            this.checkId = checkId;
            return this;
        }
        public String getCheckId() {
            return this.checkId;
        }

        public GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfoNotAllowReason setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfoNotAllowReason setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfo extends TeaModel {
        /**
         * <p>The check items that you can choose to ignore for the member deletion.</p>
         * <blockquote>
         * <p> This parameter may be returned if the value of AllowDelete is true.</p>
         * </blockquote>
         */
        @NameInMap("AbandonableChecks")
        public java.util.List<GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfoAbandonableChecks> abandonableChecks;

        /**
         * <p>Indicates whether the member can be deleted. Valid values:</p>
         * <ul>
         * <li>true: The member can be deleted.</li>
         * <li>false: The member cannot be deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowDelete")
        public String allowDelete;

        /**
         * <p>The reasons why the member cannot be deleted.</p>
         * <blockquote>
         * <p> This parameter is returned only if the value of AllowDelete is false.</p>
         * </blockquote>
         */
        @NameInMap("NotAllowReason")
        public java.util.List<GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfoNotAllowReason> notAllowReason;

        /**
         * <p>The status of the check. Valid values:</p>
         * <ul>
         * <li>PreCheckComplete: The check is complete.</li>
         * <li>PreChecking: The check is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PreCheckComplete</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfo self = new GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfo();
            return TeaModel.build(map, self);
        }

        public GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfo setAbandonableChecks(java.util.List<GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfoAbandonableChecks> abandonableChecks) {
            this.abandonableChecks = abandonableChecks;
            return this;
        }
        public java.util.List<GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfoAbandonableChecks> getAbandonableChecks() {
            return this.abandonableChecks;
        }

        public GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfo setAllowDelete(String allowDelete) {
            this.allowDelete = allowDelete;
            return this;
        }
        public String getAllowDelete() {
            return this.allowDelete;
        }

        public GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfo setNotAllowReason(java.util.List<GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfoNotAllowReason> notAllowReason) {
            this.notAllowReason = notAllowReason;
            return this;
        }
        public java.util.List<GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfoNotAllowReason> getNotAllowReason() {
            return this.notAllowReason;
        }

        public GetAccountDeletionCheckResultResponseBodyAccountDeletionCheckResultInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
