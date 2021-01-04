// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeChangeLogsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ChangeLogs")
    public DescribeChangeLogsResponseBodyChangeLogs changeLogs;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("TotalItems")
    public Integer totalItems;

    public static DescribeChangeLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChangeLogsResponseBody self = new DescribeChangeLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChangeLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeChangeLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChangeLogsResponseBody setChangeLogs(DescribeChangeLogsResponseBodyChangeLogs changeLogs) {
        this.changeLogs = changeLogs;
        return this;
    }
    public DescribeChangeLogsResponseBodyChangeLogs getChangeLogs() {
        return this.changeLogs;
    }

    public DescribeChangeLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeChangeLogsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeChangeLogsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public static class DescribeChangeLogsResponseBodyChangeLogsChangeLog extends TeaModel {
        @NameInMap("OperTimestamp")
        public Long operTimestamp;

        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("OperObject")
        public String operObject;

        @NameInMap("OperTime")
        public String operTime;

        @NameInMap("OperIp")
        public String operIp;

        @NameInMap("OperAction")
        public String operAction;

        @NameInMap("Content")
        public String content;

        @NameInMap("EntityName")
        public String entityName;

        @NameInMap("Id")
        public Long id;

        public static DescribeChangeLogsResponseBodyChangeLogsChangeLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeChangeLogsResponseBodyChangeLogsChangeLog self = new DescribeChangeLogsResponseBodyChangeLogsChangeLog();
            return TeaModel.build(map, self);
        }

        public DescribeChangeLogsResponseBodyChangeLogsChangeLog setOperTimestamp(Long operTimestamp) {
            this.operTimestamp = operTimestamp;
            return this;
        }
        public Long getOperTimestamp() {
            return this.operTimestamp;
        }

        public DescribeChangeLogsResponseBodyChangeLogsChangeLog setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public DescribeChangeLogsResponseBodyChangeLogsChangeLog setOperObject(String operObject) {
            this.operObject = operObject;
            return this;
        }
        public String getOperObject() {
            return this.operObject;
        }

        public DescribeChangeLogsResponseBodyChangeLogsChangeLog setOperTime(String operTime) {
            this.operTime = operTime;
            return this;
        }
        public String getOperTime() {
            return this.operTime;
        }

        public DescribeChangeLogsResponseBodyChangeLogsChangeLog setOperIp(String operIp) {
            this.operIp = operIp;
            return this;
        }
        public String getOperIp() {
            return this.operIp;
        }

        public DescribeChangeLogsResponseBodyChangeLogsChangeLog setOperAction(String operAction) {
            this.operAction = operAction;
            return this;
        }
        public String getOperAction() {
            return this.operAction;
        }

        public DescribeChangeLogsResponseBodyChangeLogsChangeLog setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeChangeLogsResponseBodyChangeLogsChangeLog setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public DescribeChangeLogsResponseBodyChangeLogsChangeLog setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class DescribeChangeLogsResponseBodyChangeLogs extends TeaModel {
        @NameInMap("ChangeLog")
        public java.util.List<DescribeChangeLogsResponseBodyChangeLogsChangeLog> changeLog;

        public static DescribeChangeLogsResponseBodyChangeLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeChangeLogsResponseBodyChangeLogs self = new DescribeChangeLogsResponseBodyChangeLogs();
            return TeaModel.build(map, self);
        }

        public DescribeChangeLogsResponseBodyChangeLogs setChangeLog(java.util.List<DescribeChangeLogsResponseBodyChangeLogsChangeLog> changeLog) {
            this.changeLog = changeLog;
            return this;
        }
        public java.util.List<DescribeChangeLogsResponseBodyChangeLogsChangeLog> getChangeLog() {
            return this.changeLog;
        }

    }

}
