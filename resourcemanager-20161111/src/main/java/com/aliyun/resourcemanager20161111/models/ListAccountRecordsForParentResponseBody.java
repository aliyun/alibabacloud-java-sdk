// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class ListAccountRecordsForParentResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Records")
    public ListAccountRecordsForParentResponseBodyRecords records;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAccountRecordsForParentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccountRecordsForParentResponseBody self = new ListAccountRecordsForParentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccountRecordsForParentResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAccountRecordsForParentResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAccountRecordsForParentResponseBody setRecords(ListAccountRecordsForParentResponseBodyRecords records) {
        this.records = records;
        return this;
    }
    public ListAccountRecordsForParentResponseBodyRecords getRecords() {
        return this.records;
    }

    public ListAccountRecordsForParentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccountRecordsForParentResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAccountRecordsForParentResponseBodyRecordsRecord extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("JoinMethod")
        public String joinMethod;

        @NameInMap("JoinTime")
        public String joinTime;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static ListAccountRecordsForParentResponseBodyRecordsRecord build(java.util.Map<String, ?> map) throws Exception {
            ListAccountRecordsForParentResponseBodyRecordsRecord self = new ListAccountRecordsForParentResponseBodyRecordsRecord();
            return TeaModel.build(map, self);
        }

        public ListAccountRecordsForParentResponseBodyRecordsRecord setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListAccountRecordsForParentResponseBodyRecordsRecord setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListAccountRecordsForParentResponseBodyRecordsRecord setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAccountRecordsForParentResponseBodyRecordsRecord setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListAccountRecordsForParentResponseBodyRecordsRecord setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public ListAccountRecordsForParentResponseBodyRecordsRecord setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public ListAccountRecordsForParentResponseBodyRecordsRecord setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListAccountRecordsForParentResponseBodyRecordsRecord setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public ListAccountRecordsForParentResponseBodyRecordsRecord setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public ListAccountRecordsForParentResponseBodyRecordsRecord setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAccountRecordsForParentResponseBodyRecordsRecord setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAccountRecordsForParentResponseBodyRecords extends TeaModel {
        @NameInMap("Record")
        public java.util.List<ListAccountRecordsForParentResponseBodyRecordsRecord> record;

        public static ListAccountRecordsForParentResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListAccountRecordsForParentResponseBodyRecords self = new ListAccountRecordsForParentResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListAccountRecordsForParentResponseBodyRecords setRecord(java.util.List<ListAccountRecordsForParentResponseBodyRecordsRecord> record) {
            this.record = record;
            return this;
        }
        public java.util.List<ListAccountRecordsForParentResponseBodyRecordsRecord> getRecord() {
            return this.record;
        }

    }

}
