// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetAccountDeletionStatusResponseBody extends TeaModel {
    /**
     * <p>The deletion status of the member.</p>
     */
    @NameInMap("RdAccountDeletionStatus")
    public GetAccountDeletionStatusResponseBodyRdAccountDeletionStatus rdAccountDeletionStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8AA43293-7C8F-5730-8F2D-7F864EC092C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAccountDeletionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountDeletionStatusResponseBody self = new GetAccountDeletionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountDeletionStatusResponseBody setRdAccountDeletionStatus(GetAccountDeletionStatusResponseBodyRdAccountDeletionStatus rdAccountDeletionStatus) {
        this.rdAccountDeletionStatus = rdAccountDeletionStatus;
        return this;
    }
    public GetAccountDeletionStatusResponseBodyRdAccountDeletionStatus getRdAccountDeletionStatus() {
        return this.rdAccountDeletionStatus;
    }

    public GetAccountDeletionStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAccountDeletionStatusResponseBodyRdAccountDeletionStatusFailReasonList extends TeaModel {
        /**
         * <p>The description of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>This account has a payer account. Please release the financial relationship of this account first.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the cloud service to which the check item belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Others</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetAccountDeletionStatusResponseBodyRdAccountDeletionStatusFailReasonList build(java.util.Map<String, ?> map) throws Exception {
            GetAccountDeletionStatusResponseBodyRdAccountDeletionStatusFailReasonList self = new GetAccountDeletionStatusResponseBodyRdAccountDeletionStatusFailReasonList();
            return TeaModel.build(map, self);
        }

        public GetAccountDeletionStatusResponseBodyRdAccountDeletionStatusFailReasonList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAccountDeletionStatusResponseBodyRdAccountDeletionStatusFailReasonList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAccountDeletionStatusResponseBodyRdAccountDeletionStatus extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>169946124551****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The start time of the deletion.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-23T17:05:30+08:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The end time of the deletion.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-23T17:06:01+08:00</p>
         */
        @NameInMap("DeletionTime")
        public String deletionTime;

        /**
         * <p>The type of the deletion. Valid values:</p>
         * <ul>
         * <li>0: direct deletion. If the member does not have pay-as-you-go resources that are purchased within the previous 30 days, the system directly deletes the member.</li>
         * <li>1: deletion with a silence period. If the member has pay-as-you-go resources that are purchased within the previous 30 days, the member enters a silence period. The system starts to delete the member until the silence period ends. For more information about the silence period, see <a href="https://help.aliyun.com/document_detail/446079.html">What is the silence period for member deletion?</a></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeletionType")
        public String deletionType;

        /**
         * <p>The reasons why the member fails to be deleted.</p>
         */
        @NameInMap("FailReasonList")
        public java.util.List<GetAccountDeletionStatusResponseBodyRdAccountDeletionStatusFailReasonList> failReasonList;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>Success: The member is deleted.</li>
         * <li>Checking: A deletion check is being performed for the member.</li>
         * <li>Deleting: The member is being deleted.</li>
         * <li>CheckFailed: The deletion check for the member fails.</li>
         * <li>DeleteFailed: The member fails to be deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetAccountDeletionStatusResponseBodyRdAccountDeletionStatus build(java.util.Map<String, ?> map) throws Exception {
            GetAccountDeletionStatusResponseBodyRdAccountDeletionStatus self = new GetAccountDeletionStatusResponseBodyRdAccountDeletionStatus();
            return TeaModel.build(map, self);
        }

        public GetAccountDeletionStatusResponseBodyRdAccountDeletionStatus setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetAccountDeletionStatusResponseBodyRdAccountDeletionStatus setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAccountDeletionStatusResponseBodyRdAccountDeletionStatus setDeletionTime(String deletionTime) {
            this.deletionTime = deletionTime;
            return this;
        }
        public String getDeletionTime() {
            return this.deletionTime;
        }

        public GetAccountDeletionStatusResponseBodyRdAccountDeletionStatus setDeletionType(String deletionType) {
            this.deletionType = deletionType;
            return this;
        }
        public String getDeletionType() {
            return this.deletionType;
        }

        public GetAccountDeletionStatusResponseBodyRdAccountDeletionStatus setFailReasonList(java.util.List<GetAccountDeletionStatusResponseBodyRdAccountDeletionStatusFailReasonList> failReasonList) {
            this.failReasonList = failReasonList;
            return this;
        }
        public java.util.List<GetAccountDeletionStatusResponseBodyRdAccountDeletionStatusFailReasonList> getFailReasonList() {
            return this.failReasonList;
        }

        public GetAccountDeletionStatusResponseBodyRdAccountDeletionStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
