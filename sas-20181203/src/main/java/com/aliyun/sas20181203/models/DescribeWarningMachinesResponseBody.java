// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWarningMachinesResponseBody extends TeaModel {
    // The number of entries returned on the current page.
    @NameInMap("Count")
    public Integer count;

    // The page number of the returned page.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The number of entries returned per page. Default value: **10**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    // An array that consists of the servers.
    @NameInMap("WarningMachines")
    public java.util.List<DescribeWarningMachinesResponseBodyWarningMachines> warningMachines;

    public static DescribeWarningMachinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWarningMachinesResponseBody self = new DescribeWarningMachinesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWarningMachinesResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeWarningMachinesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWarningMachinesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWarningMachinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWarningMachinesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeWarningMachinesResponseBody setWarningMachines(java.util.List<DescribeWarningMachinesResponseBodyWarningMachines> warningMachines) {
        this.warningMachines = warningMachines;
        return this;
    }
    public java.util.List<DescribeWarningMachinesResponseBodyWarningMachines> getWarningMachines() {
        return this.warningMachines;
    }

    public static class DescribeWarningMachinesResponseBodyWarningMachines extends TeaModel {
        // The edition of Security Center that is authorized to protect the asset. Valid values:
        // 
        // *   **1**: Basic edition
        // *   **6**: Anti-virus edition
        // *   **5**: Advanced edition
        // *   **3**: Enterprise edition
        // *   **7**: Ultimate edition
        // *   **10**: Value-added Plan edition
        @NameInMap("AuthVersion")
        public Integer authVersion;

        // Indicates whether Security Center is authorized to protect the asset. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("Bind")
        public Boolean bind;

        // The number of **high-risk** items on the server.
        @NameInMap("HighWarningCount")
        public Integer highWarningCount;

        // The ID of the server.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the server.
        @NameInMap("InstanceName")
        public String instanceName;

        // The public IP address of the server.
        @NameInMap("InternetIp")
        public String internetIp;

        // The private IP address of the server.
        @NameInMap("IntranetIp")
        public String intranetIp;

        // The number of **low-risk** items on the server.
        @NameInMap("LowWarningCount")
        public Integer lowWarningCount;

        // The number of **medium-risk** items on the server.
        @NameInMap("MediumWarningCount")
        public Integer mediumWarningCount;

        // The number of the check items that passed the baseline check on the server.
        @NameInMap("PassCount")
        public Integer passCount;

        // Indicates whether a port on the server is accessible over the Internet. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("PortOpen")
        public Boolean portOpen;

        // The ID of the region in which the server is deployed.
        @NameInMap("RegionId")
        public String regionId;

        // The verification status of the risk item after the risk item is fixed. Valid values:
        // 
        // *   **1**: complete
        // *   **2**: verifying
        @NameInMap("Status")
        public Integer status;

        // The UUID of the server on which the baseline check is performed.
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeWarningMachinesResponseBodyWarningMachines build(java.util.Map<String, ?> map) throws Exception {
            DescribeWarningMachinesResponseBodyWarningMachines self = new DescribeWarningMachinesResponseBodyWarningMachines();
            return TeaModel.build(map, self);
        }

        public DescribeWarningMachinesResponseBodyWarningMachines setAuthVersion(Integer authVersion) {
            this.authVersion = authVersion;
            return this;
        }
        public Integer getAuthVersion() {
            return this.authVersion;
        }

        public DescribeWarningMachinesResponseBodyWarningMachines setBind(Boolean bind) {
            this.bind = bind;
            return this;
        }
        public Boolean getBind() {
            return this.bind;
        }

        public DescribeWarningMachinesResponseBodyWarningMachines setHighWarningCount(Integer highWarningCount) {
            this.highWarningCount = highWarningCount;
            return this;
        }
        public Integer getHighWarningCount() {
            return this.highWarningCount;
        }

        public DescribeWarningMachinesResponseBodyWarningMachines setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeWarningMachinesResponseBodyWarningMachines setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeWarningMachinesResponseBodyWarningMachines setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeWarningMachinesResponseBodyWarningMachines setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeWarningMachinesResponseBodyWarningMachines setLowWarningCount(Integer lowWarningCount) {
            this.lowWarningCount = lowWarningCount;
            return this;
        }
        public Integer getLowWarningCount() {
            return this.lowWarningCount;
        }

        public DescribeWarningMachinesResponseBodyWarningMachines setMediumWarningCount(Integer mediumWarningCount) {
            this.mediumWarningCount = mediumWarningCount;
            return this;
        }
        public Integer getMediumWarningCount() {
            return this.mediumWarningCount;
        }

        public DescribeWarningMachinesResponseBodyWarningMachines setPassCount(Integer passCount) {
            this.passCount = passCount;
            return this;
        }
        public Integer getPassCount() {
            return this.passCount;
        }

        public DescribeWarningMachinesResponseBodyWarningMachines setPortOpen(Boolean portOpen) {
            this.portOpen = portOpen;
            return this;
        }
        public Boolean getPortOpen() {
            return this.portOpen;
        }

        public DescribeWarningMachinesResponseBodyWarningMachines setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeWarningMachinesResponseBodyWarningMachines setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeWarningMachinesResponseBodyWarningMachines setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
