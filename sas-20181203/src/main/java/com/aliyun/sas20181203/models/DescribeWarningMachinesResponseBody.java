// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWarningMachinesResponseBody extends TeaModel {
    /**
     * <p>The verification status of the risk item after the risk item is fixed. Valid values:</p>
     * <br>
     * <p>*   **1**: complete</p>
     * <p>*   **2**: verifying</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The name of the server on which the baseline check is performed.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return on each page. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>An array that consists of the servers.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The value of the field that is used to search for the container.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The ID of the container cluster.</p>
     * <br>
     * <p>>  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.</p>
     */
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
        @NameInMap("AuthVersion")
        public Integer authVersion;

        @NameInMap("Bind")
        public Boolean bind;

        @NameInMap("ContainerId")
        public String containerId;

        @NameInMap("ContainerName")
        public String containerName;

        /**
         * <p>The public IP address of the server.</p>
         */
        @NameInMap("HighWarningCount")
        public Integer highWarningCount;

        /**
         * <p>The number of entries returned per page. Default value: **10**.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The UUID of the server on which the baseline check is performed. Separate multiple UUIDs with commas (,).</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>Queries information about servers on which a baseline check is performed. The information includes the IDs of the servers, the statistics of a risk item, and the status of the risk item.</p>
         */
        @NameInMap("LowWarningCount")
        public Integer lowWarningCount;

        @NameInMap("MediumWarningCount")
        public Integer mediumWarningCount;

        @NameInMap("PassCount")
        public Integer passCount;

        /**
         * <p>DescribeWarningMachines</p>
         */
        @NameInMap("PortOpen")
        public Boolean portOpen;

        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Indicates whether Security Center is authorized to protect the asset. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("Status")
        public Integer status;

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

        public DescribeWarningMachinesResponseBodyWarningMachines setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public DescribeWarningMachinesResponseBodyWarningMachines setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
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
