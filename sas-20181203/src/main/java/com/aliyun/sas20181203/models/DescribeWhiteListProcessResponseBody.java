// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWhiteListProcessResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The information about the processes.</p>
     */
    @NameInMap("Processes")
    public java.util.List<DescribeWhiteListProcessResponseBodyProcesses> processes;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D81DD78E-E006-5C65-A171-C8CB09XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>44</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeWhiteListProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListProcessResponseBody self = new DescribeWhiteListProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListProcessResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeWhiteListProcessResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWhiteListProcessResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWhiteListProcessResponseBody setProcesses(java.util.List<DescribeWhiteListProcessResponseBodyProcesses> processes) {
        this.processes = processes;
        return this;
    }
    public java.util.List<DescribeWhiteListProcessResponseBodyProcesses> getProcesses() {
        return this.processes;
    }

    public DescribeWhiteListProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWhiteListProcessResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeWhiteListProcessResponseBodyProcesses extends TeaModel {
        /**
         * <p>The path to the process startup file.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/bash1</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The primary key of the process information.</p>
         * 
         * <strong>example:</strong>
         * <p>2100019</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The trust score of the process.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("Level")
        public Integer level;

        /**
         * <p>The MD5 hash value of the process startup file.</p>
         * 
         * <strong>example:</strong>
         * <p>a28e8eba54ece1f3748d80e57dc89400</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The ID of the process.</p>
         * 
         * <strong>example:</strong>
         * <p>53090</p>
         */
        @NameInMap("ProcessId")
        public Integer processId;

        /**
         * <p>The name of the process.</p>
         * 
         * <strong>example:</strong>
         * <p>vim</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        /**
         * <p>The type of the process. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: trusted</li>
         * <li><strong>2</strong>: suspicious</li>
         * <li><strong>3</strong>: malicious</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProcessType")
        public Integer processType;

        /**
         * <p>Indicates whether the process is trusted. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: no</li>
         * <li><strong>2</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeWhiteListProcessResponseBodyProcesses build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhiteListProcessResponseBodyProcesses self = new DescribeWhiteListProcessResponseBodyProcesses();
            return TeaModel.build(map, self);
        }

        public DescribeWhiteListProcessResponseBodyProcesses setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public DescribeWhiteListProcessResponseBodyProcesses setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeWhiteListProcessResponseBodyProcesses setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public DescribeWhiteListProcessResponseBodyProcesses setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeWhiteListProcessResponseBodyProcesses setProcessId(Integer processId) {
            this.processId = processId;
            return this;
        }
        public Integer getProcessId() {
            return this.processId;
        }

        public DescribeWhiteListProcessResponseBodyProcesses setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public DescribeWhiteListProcessResponseBodyProcesses setProcessType(Integer processType) {
            this.processType = processType;
            return this;
        }
        public Integer getProcessType() {
            return this.processType;
        }

        public DescribeWhiteListProcessResponseBodyProcesses setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
