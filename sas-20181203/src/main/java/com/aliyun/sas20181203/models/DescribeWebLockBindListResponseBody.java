// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockBindListResponseBody extends TeaModel {
    // The information about the servers that have web tamper proofing enabled.
    @NameInMap("BindList")
    public java.util.List<DescribeWebLockBindListResponseBodyBindList> bindList;

    // The page number of the returned page. Pages start from page 1. Default value: 1.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The number of entries returned per page. Default value: 20.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of servers that have web tamper proofing enabled.
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
        // The number of alerts.
        @NameInMap("AuditCount")
        public String auditCount;

        // The number of blocked tampering events.
        @NameInMap("BlockCount")
        public String blockCount;

        // The number of protected directories.
        @NameInMap("DirCount")
        public String dirCount;

        // The name of the server.
        @NameInMap("InstanceName")
        public String instanceName;

        // The public IP address of the server.
        @NameInMap("InternetIp")
        public String internetIp;

        // The private IP address of the server.
        @NameInMap("IntranetIp")
        public String intranetIp;

        // The operating system that the server runs.
        @NameInMap("Os")
        public String os;

        // The starting progress percentage of web tamper proofing. Valid values: 0 to 100.
        @NameInMap("Percent")
        public Integer percent;

        // The error code for web tamper proofing. Valid values:
        // 
        // *   **2001**: The Security Center agent is offline.
        // *   **9999**: The connection timed out.
        @NameInMap("ServiceCode")
        public String serviceCode;

        // The error message for web tamper proofing. Valid values:
        // 
        // *   **client offline**: The Security Center agent is offline.
        // *   **timeout**: The connection timed out.
        @NameInMap("ServiceDetail")
        public String serviceDetail;

        // The status of web tamper proofing on the server. Valid values:
        // 
        // *   **stop**: Web tamper proofing is disabled.
        // *   **initializing**: Web tamper proofing is being enabled.
        // *   **exception**: Web tamper proofing is not running as expected.
        // *   **running**: Web tamper proofing is running.
        // *   **closing**: Web tamper proofing is being disabled.
        @NameInMap("ServiceStatus")
        public String serviceStatus;

        // The protection status of the server. Valid values:
        // 
        // *   **on**: protected
        // *   **off**: unprotected
        @NameInMap("Status")
        public String status;

        // The UUID of the server.
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
