// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockProcessListResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>An array that consists of details about the process.</p>
     */
    @NameInMap("List")
    public java.util.List<DescribeWebLockProcessListResponseBodyList> list;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of processes.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeWebLockProcessListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockProcessListResponseBody self = new DescribeWebLockProcessListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockProcessListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWebLockProcessListResponseBody setList(java.util.List<DescribeWebLockProcessListResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeWebLockProcessListResponseBodyList> getList() {
        return this.list;
    }

    public DescribeWebLockProcessListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWebLockProcessListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebLockProcessListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeWebLockProcessListResponseBodyList extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The name of the server.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The name of the process.</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        /**
         * <p>The path to the process.</p>
         */
        @NameInMap("ProcessPath")
        public String processPath;

        /**
         * <p>Indicates whether the process is added to the process whitelist. Valid values:</p>
         * <br>
         * <p>*   **1**: The process is added to the process whitelist.</p>
         * <p>*   **0**: The process is not added to the process whitelist.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The UUID of the server.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeWebLockProcessListResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebLockProcessListResponseBodyList self = new DescribeWebLockProcessListResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeWebLockProcessListResponseBodyList setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public DescribeWebLockProcessListResponseBodyList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeWebLockProcessListResponseBodyList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeWebLockProcessListResponseBodyList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeWebLockProcessListResponseBodyList setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public DescribeWebLockProcessListResponseBodyList setProcessPath(String processPath) {
            this.processPath = processPath;
            return this;
        }
        public String getProcessPath() {
            return this.processPath;
        }

        public DescribeWebLockProcessListResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeWebLockProcessListResponseBodyList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
