// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWarningMachinesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries returned per page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6E4CBE87-E887-5AF1-86D2-78EB4AA3E771</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The information about the servers.</p>
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
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <p>The edition of Security Center that is authorized to protect the asset. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Basic edition</li>
         * <li><strong>6</strong>: Anti-virus edition</li>
         * <li><strong>5</strong>: Advanced edition</li>
         * <li><strong>3</strong>: Enterprise edition</li>
         * <li><strong>7</strong>: Ultimate edition</li>
         * <li><strong>10</strong>: Value-added Plan edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("AuthVersion")
        public Integer authVersion;

        /**
         * <p>Indicates whether Security Center is authorized to protect the asset. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Bind")
        public Boolean bind;

        /**
         * <p>The container ID.</p>
         * 
         * <strong>example:</strong>
         * <p>48a6d9a92435a13ad573372c3f3c63b7e04d106458141df9f92155709d******</p>
         */
        @NameInMap("ContainerId")
        public String containerId;

        /**
         * <p>The name of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>redis</p>
         */
        @NameInMap("ContainerName")
        public String containerName;

        /**
         * <p>The number of <strong>high-risk</strong> items on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("HighWarningCount")
        public Integer highWarningCount;

        /**
         * <p>The server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-m5ee8b9nr3h30mhb****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>oracle-win-00****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The number of <strong>low-risk</strong> items on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("LowWarningCount")
        public Integer lowWarningCount;

        /**
         * <p>The number of <strong>medium-risk</strong> items on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MediumWarningCount")
        public Integer mediumWarningCount;

        /**
         * <p>Indicates whether the agent is online. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>The number of the check items that passed the baseline check on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PassCount")
        public Integer passCount;

        /**
         * <p>Indicates whether a port on the server is accessible over the Internet. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PortOpen")
        public Boolean portOpen;

        /**
         * <p>The ID of the region in which the server is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The verification status of the risk item after the risk item is fixed. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: complete</li>
         * <li><strong>2</strong>: verifying</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The UUID of the server on which the baseline check is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>9888955c-0076-49da-bd9c-34f5492b****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeWarningMachinesResponseBodyWarningMachines build(java.util.Map<String, ?> map) throws Exception {
            DescribeWarningMachinesResponseBodyWarningMachines self = new DescribeWarningMachinesResponseBodyWarningMachines();
            return TeaModel.build(map, self);
        }

        public DescribeWarningMachinesResponseBodyWarningMachines setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
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

        public DescribeWarningMachinesResponseBodyWarningMachines setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
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
