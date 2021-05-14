// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockBindListResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("BindList")
    public java.util.List<DescribeWebLockBindListResponseBodyBindList> bindList;

    public static DescribeWebLockBindListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockBindListResponseBody self = new DescribeWebLockBindListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockBindListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWebLockBindListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebLockBindListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWebLockBindListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeWebLockBindListResponseBody setBindList(java.util.List<DescribeWebLockBindListResponseBodyBindList> bindList) {
        this.bindList = bindList;
        return this;
    }
    public java.util.List<DescribeWebLockBindListResponseBodyBindList> getBindList() {
        return this.bindList;
    }

    public static class DescribeWebLockBindListResponseBodyBindList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Percent")
        public Integer percent;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("ServiceDetail")
        public String serviceDetail;

        @NameInMap("Os")
        public String os;

        @NameInMap("ServiceStatus")
        public String serviceStatus;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("AuditCount")
        public String auditCount;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("ServiceCode")
        public String serviceCode;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("DirCount")
        public String dirCount;

        @NameInMap("BlockCount")
        public String blockCount;

        public static DescribeWebLockBindListResponseBodyBindList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebLockBindListResponseBodyBindList self = new DescribeWebLockBindListResponseBodyBindList();
            return TeaModel.build(map, self);
        }

        public DescribeWebLockBindListResponseBodyBindList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeWebLockBindListResponseBodyBindList setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public DescribeWebLockBindListResponseBodyBindList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeWebLockBindListResponseBodyBindList setServiceDetail(String serviceDetail) {
            this.serviceDetail = serviceDetail;
            return this;
        }
        public String getServiceDetail() {
            return this.serviceDetail;
        }

        public DescribeWebLockBindListResponseBodyBindList setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeWebLockBindListResponseBodyBindList setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public DescribeWebLockBindListResponseBodyBindList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeWebLockBindListResponseBodyBindList setAuditCount(String auditCount) {
            this.auditCount = auditCount;
            return this;
        }
        public String getAuditCount() {
            return this.auditCount;
        }

        public DescribeWebLockBindListResponseBodyBindList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeWebLockBindListResponseBodyBindList setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public DescribeWebLockBindListResponseBodyBindList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeWebLockBindListResponseBodyBindList setDirCount(String dirCount) {
            this.dirCount = dirCount;
            return this;
        }
        public String getDirCount() {
            return this.dirCount;
        }

        public DescribeWebLockBindListResponseBodyBindList setBlockCount(String blockCount) {
            this.blockCount = blockCount;
            return this;
        }
        public String getBlockCount() {
            return this.blockCount;
        }

    }

}
