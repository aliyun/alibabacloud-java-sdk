// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeChangeLogsResponseBody extends TeaModel {
    /**
     * <p>The operation logs.</p>
     */
    @NameInMap("ChangeLogs")
    public DescribeChangeLogsResponseBodyChangeLogs changeLogs;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F0FCB52A-D512-41A0-8595-40234EDCFD8B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeChangeLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChangeLogsResponseBody self = new DescribeChangeLogsResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeChangeLogsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeChangeLogsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeChangeLogsResponseBodyChangeLogsChangeLog extends TeaModel {
        /**
         * <p>The details of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>add test-api.com</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The operator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13270376</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The subtype of the operator. Valid values:</p>
         * <ul>
         * <li>CUSTOMER: Alibaba Cloud account</li>
         * <li>SUB: RAM user</li>
         * <li>STS: assumed role that obtains the Security Token Service (STS) token of a RAM role</li>
         * <li>OTHER: other types</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUB</p>
         */
        @NameInMap("CreatorSubType")
        public String creatorSubType;

        /**
         * <p>The operator type. No value or <strong>USER</strong> is returned for this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("CreatorType")
        public String creatorType;

        /**
         * <p>The ID of the object on which the operation was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>CAgICA1OA_58</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The name of the object on which the operation was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>test-api.com</p>
         */
        @NameInMap("EntityName")
        public String entityName;

        /**
         * <p>The log ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6726</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The operation type.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("OperAction")
        public String operAction;

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("OperIp")
        public String operIp;

        /**
         * <p>The type of the object on which the operation is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>PV_ZONE</p>
         */
        @NameInMap("OperObject")
        public String operObject;

        /**
         * <p>The time when the operation is performed. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-24T07:35Z</p>
         */
        @NameInMap("OperTime")
        public String operTime;

        /**
         * <p>The time when the operation was performed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1516779348000</p>
         */
        @NameInMap("OperTimestamp")
        public Long operTimestamp;

        public static DescribeChangeLogsResponseBodyChangeLogsChangeLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeChangeLogsResponseBodyChangeLogsChangeLog self = new DescribeChangeLogsResponseBodyChangeLogsChangeLog();
            return TeaModel.build(map, self);
        }

        public DescribeChangeLogsResponseBodyChangeLogsChangeLog setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeChangeLogsResponseBodyChangeLogsChangeLog setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public DescribeChangeLogsResponseBodyChangeLogsChangeLog setCreatorSubType(String creatorSubType) {
            this.creatorSubType = creatorSubType;
            return this;
        }
        public String getCreatorSubType() {
            return this.creatorSubType;
        }

        public DescribeChangeLogsResponseBodyChangeLogsChangeLog setCreatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }
        public String getCreatorType() {
            return this.creatorType;
        }

        public DescribeChangeLogsResponseBodyChangeLogsChangeLog setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
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

        public DescribeChangeLogsResponseBodyChangeLogsChangeLog setOperAction(String operAction) {
            this.operAction = operAction;
            return this;
        }
        public String getOperAction() {
            return this.operAction;
        }

        public DescribeChangeLogsResponseBodyChangeLogsChangeLog setOperIp(String operIp) {
            this.operIp = operIp;
            return this;
        }
        public String getOperIp() {
            return this.operIp;
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

        public DescribeChangeLogsResponseBodyChangeLogsChangeLog setOperTimestamp(Long operTimestamp) {
            this.operTimestamp = operTimestamp;
            return this;
        }
        public Long getOperTimestamp() {
            return this.operTimestamp;
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
