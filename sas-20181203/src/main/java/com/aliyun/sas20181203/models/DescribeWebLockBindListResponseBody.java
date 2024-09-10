// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockBindListResponseBody extends TeaModel {
    /**
     * <p>The information about the servers that have web tamper proofing enabled.</p>
     */
    @NameInMap("BindList")
    public java.util.List<DescribeWebLockBindListResponseBodyBindList> bindList;

    /**
     * <p>The page number of the returned page. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries returned per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>D9354C1A-D709-4873-9AAE-41513327B247</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of servers that have web tamper proofing enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>11409</p>
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
         * <p>The number of alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AuditCount")
        public String auditCount;

        /**
         * <p>The number of blocked tampering events.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("BlockCount")
        public String blockCount;

        /**
         * <p>The number of protected directories.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DirCount")
        public String dirCount;

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>54.169.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The operating system that the server runs.</p>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The percentage of the starting progress of web tamper proofing. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The error code for web tamper proofing. Valid values:</p>
         * <ul>
         * <li><strong>2001</strong>: The Security Center agent is offline.</li>
         * <li><strong>9999</strong>: The connection timed out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2001</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        /**
         * <p>The exception details of web tamper proofing. Valid values:</p>
         * <ul>
         * <li><strong>client offline</strong>: The Security Center agent is offline.</li>
         * <li><strong>timeout</strong>: The connection timed out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>client offline</p>
         */
        @NameInMap("ServiceDetail")
        public String serviceDetail;

        /**
         * <p>The status of web tamper proofing on the server. Valid values:</p>
         * <ul>
         * <li><strong>stop</strong>: Web tamper proofing is disabled.</li>
         * <li><strong>initializing</strong>: Web tamper proofing is being enabled.</li>
         * <li><strong>exception</strong>: Web tamper proofing is not running as expected.</li>
         * <li><strong>running</strong>: Web tamper proofing is running.</li>
         * <li><strong>closing</strong>: Web tamper proofing is being disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>stop</p>
         */
        @NameInMap("ServiceStatus")
        public String serviceStatus;

        /**
         * <p>The protection status of the server. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: The server is protected.</li>
         * <li><strong>off</strong>: The server is not protected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>inet-12345****</p>
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
