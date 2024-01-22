// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningsResponseBody extends TeaModel {
    /**
     * <p>The information about the check item.</p>
     */
    @NameInMap("CheckWarnings")
    public java.util.List<DescribeCheckWarningsResponseBodyCheckWarnings> checkWarnings;

    /**
     * <p>The number of entries returned on the current page.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries returned per page. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCheckWarningsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningsResponseBody self = new DescribeCheckWarningsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningsResponseBody setCheckWarnings(java.util.List<DescribeCheckWarningsResponseBodyCheckWarnings> checkWarnings) {
        this.checkWarnings = checkWarnings;
        return this;
    }
    public java.util.List<DescribeCheckWarningsResponseBodyCheckWarnings> getCheckWarnings() {
        return this.checkWarnings;
    }

    public DescribeCheckWarningsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeCheckWarningsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCheckWarningsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCheckWarningsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCheckWarningsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCheckWarningsResponseBodyCheckWarnings extends TeaModel {
        /**
         * <p>The ID of the check item.</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The ID of the alert that is triggered by the check item.</p>
         */
        @NameInMap("CheckWarningId")
        public Long checkWarningId;

        /**
         * <p>The ID of the container.</p>
         */
        @NameInMap("ContainerId")
        public String containerId;

        /**
         * <p>The name of the container.</p>
         */
        @NameInMap("ContainerName")
        public String containerName;

        /**
         * <p>The error message in the check result.</p>
         */
        @NameInMap("ExecErrorMessage")
        public String execErrorMessage;

        /**
         * <p>Indicates whether the fix is supported. Valid values:</p>
         * <br>
         * <p>*   **0**: The fix is not supported.</p>
         * <p>*   **1**: The fix is supported.</p>
         */
        @NameInMap("FixStatus")
        public Integer fixStatus;

        /**
         * <p>The name of the check item.</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>The timestamp of the latest processing of the check item risk of the machine. Unit: milliseconds.</p>
         */
        @NameInMap("LastHandleTime")
        public Long lastHandleTime;

        /**
         * <p>The severity level of a risk item. Valid values:</p>
         * <br>
         * <p>*   **high**</p>
         * <p>*   **medium**</p>
         * <p>*   **low**</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The remarks.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The status of the check item. Valid values:</p>
         * <br>
         * <p>*   **1**: failed</p>
         * <p>*   **2**: verifying</p>
         * <p>*   **3**: passed</p>
         * <p>*   **5**: expired</p>
         * <p>*   **6**: ignored</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The type of the check item.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The UUID of the server on which the baseline check is performed.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeCheckWarningsResponseBodyCheckWarnings build(java.util.Map<String, ?> map) throws Exception {
            DescribeCheckWarningsResponseBodyCheckWarnings self = new DescribeCheckWarningsResponseBodyCheckWarnings();
            return TeaModel.build(map, self);
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setCheckWarningId(Long checkWarningId) {
            this.checkWarningId = checkWarningId;
            return this;
        }
        public Long getCheckWarningId() {
            return this.checkWarningId;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setExecErrorMessage(String execErrorMessage) {
            this.execErrorMessage = execErrorMessage;
            return this;
        }
        public String getExecErrorMessage() {
            return this.execErrorMessage;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setFixStatus(Integer fixStatus) {
            this.fixStatus = fixStatus;
            return this;
        }
        public Integer getFixStatus() {
            return this.fixStatus;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setLastHandleTime(Long lastHandleTime) {
            this.lastHandleTime = lastHandleTime;
            return this;
        }
        public Long getLastHandleTime() {
            return this.lastHandleTime;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
