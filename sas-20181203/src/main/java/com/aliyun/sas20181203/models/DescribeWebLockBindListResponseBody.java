// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockBindListResponseBody extends TeaModel {
    /**
     * <p>116.30.XX.XX</p>
     */
    @NameInMap("BindList")
    public java.util.List<DescribeWebLockBindListResponseBodyBindList> bindList;

    /**
     * <p>The private IP address of the server.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of protected directories.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The operating system that the server runs.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the servers that have web tamper proofing enabled.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeWebLockBindListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockBindListResponseBody self = new DescribeWebLockBindListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockBindListResponseBody setBindList(java.util.List<DescribeWebLockBindListResponseBodyBindList> bindList) {
        this.bindList = bindList;
        return this;
    }
    public java.util.List<DescribeWebLockBindListResponseBodyBindList> getBindList() {
        return this.bindList;
    }

    public DescribeWebLockBindListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWebLockBindListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWebLockBindListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebLockBindListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeWebLockBindListResponseBodyBindList extends TeaModel {
        /**
         * <p>The starting progress percentage of web tamper proofing. Valid values: 0 to 100.</p>
         */
        @NameInMap("AuditCount")
        public String auditCount;

        /**
         * <p>Queries the information about the servers that have web tamper proofing enabled.</p>
         */
        @NameInMap("BlockCount")
        public String blockCount;

        /**
         * <p>The information about the servers that have web tamper proofing enabled.</p>
         */
        @NameInMap("DirCount")
        public String dirCount;

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The number of alerts.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The number of blocked tampering events.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>20</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The protection status of the server. Valid values:</p>
         * <br>
         * <p>*   **on**: protected</p>
         * <p>*   **off**: unprotected</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The number of entries returned per page. Default value: 20.</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        /**
         * <p>The protection status of the server that you want to query. Valid values:</p>
         * <br>
         * <p>*   **on**: protected</p>
         * <p>*   **off**: unprotected</p>
         */
        @NameInMap("ServiceDetail")
        public String serviceDetail;

        /**
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("ServiceStatus")
        public String serviceStatus;

        /**
         * <p>The string that allows you to search for servers in fuzzy match mode. You can enter a server name or IP address.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeWebLockBindListResponseBodyBindList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebLockBindListResponseBodyBindList self = new DescribeWebLockBindListResponseBodyBindList();
            return TeaModel.build(map, self);
        }

        public DescribeWebLockBindListResponseBodyBindList setAuditCount(String auditCount) {
            this.auditCount = auditCount;
            return this;
        }
        public String getAuditCount() {
            return this.auditCount;
        }

        public DescribeWebLockBindListResponseBodyBindList setBlockCount(String blockCount) {
            this.blockCount = blockCount;
            return this;
        }
        public String getBlockCount() {
            return this.blockCount;
        }

        public DescribeWebLockBindListResponseBodyBindList setDirCount(String dirCount) {
            this.dirCount = dirCount;
            return this;
        }
        public String getDirCount() {
            return this.dirCount;
        }

        public DescribeWebLockBindListResponseBodyBindList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeWebLockBindListResponseBodyBindList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeWebLockBindListResponseBodyBindList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeWebLockBindListResponseBodyBindList setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeWebLockBindListResponseBodyBindList setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public DescribeWebLockBindListResponseBodyBindList setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public DescribeWebLockBindListResponseBodyBindList setServiceDetail(String serviceDetail) {
            this.serviceDetail = serviceDetail;
            return this;
        }
        public String getServiceDetail() {
            return this.serviceDetail;
        }

        public DescribeWebLockBindListResponseBodyBindList setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public DescribeWebLockBindListResponseBodyBindList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeWebLockBindListResponseBodyBindList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
