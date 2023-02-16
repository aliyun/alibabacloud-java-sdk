// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetAccountDeletionStatusResponseBody extends TeaModel {
    @NameInMap("RdAccountDeletionStatus")
    public GetAccountDeletionStatusResponseBodyRdAccountDeletionStatus rdAccountDeletionStatus;

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
        @NameInMap("Description")
        public String description;

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
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeletionTime")
        public String deletionTime;

        @NameInMap("DeletionType")
        public String deletionType;

        @NameInMap("FailReasonList")
        public java.util.List<GetAccountDeletionStatusResponseBodyRdAccountDeletionStatusFailReasonList> failReasonList;

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
