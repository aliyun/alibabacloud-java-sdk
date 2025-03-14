// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckItemWarningMachineResponseBody extends TeaModel {
    /**
     * <p>The servers on which the alerts are generated.</p>
     */
    @NameInMap("List")
    public java.util.List<ListCheckItemWarningMachineResponseBodyList> list;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListCheckItemWarningMachineResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>22B5615F-700E-575A-A6D5-DC8D7741****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCheckItemWarningMachineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCheckItemWarningMachineResponseBody self = new ListCheckItemWarningMachineResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCheckItemWarningMachineResponseBody setList(java.util.List<ListCheckItemWarningMachineResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListCheckItemWarningMachineResponseBodyList> getList() {
        return this.list;
    }

    public ListCheckItemWarningMachineResponseBody setPageInfo(ListCheckItemWarningMachineResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListCheckItemWarningMachineResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListCheckItemWarningMachineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCheckItemWarningMachineResponseBodyListFixList extends TeaModel {
        /**
         * <p>The ID of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("RiskId")
        public Long riskId;

        /**
         * <p>The name of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud Linux/Aliyun Linux 2 Baseline for China classified protection of cybersecurity-Level II</p>
         */
        @NameInMap("RiskName")
        public String riskName;

        public static ListCheckItemWarningMachineResponseBodyListFixList build(java.util.Map<String, ?> map) throws Exception {
            ListCheckItemWarningMachineResponseBodyListFixList self = new ListCheckItemWarningMachineResponseBodyListFixList();
            return TeaModel.build(map, self);
        }

        public ListCheckItemWarningMachineResponseBodyListFixList setRiskId(Long riskId) {
            this.riskId = riskId;
            return this;
        }
        public Long getRiskId() {
            return this.riskId;
        }

        public ListCheckItemWarningMachineResponseBodyListFixList setRiskName(String riskName) {
            this.riskName = riskName;
            return this;
        }
        public String getRiskName() {
            return this.riskName;
        }

    }

    public static class ListCheckItemWarningMachineResponseBodyListWarningRiskList extends TeaModel {
        /**
         * <p>The ID of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("RiskId")
        @Deprecated
        public Long riskId;

        /**
         * <p>The name of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud Linux/Aliyun Linux 2 Baseline for China classified protection of cybersecurity-Level II</p>
         */
        @NameInMap("RiskName")
        @Deprecated
        public String riskName;

        public static ListCheckItemWarningMachineResponseBodyListWarningRiskList build(java.util.Map<String, ?> map) throws Exception {
            ListCheckItemWarningMachineResponseBodyListWarningRiskList self = new ListCheckItemWarningMachineResponseBodyListWarningRiskList();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public ListCheckItemWarningMachineResponseBodyListWarningRiskList setRiskId(Long riskId) {
            this.riskId = riskId;
            return this;
        }
        public Long getRiskId() {
            return this.riskId;
        }

        @Deprecated
        public ListCheckItemWarningMachineResponseBodyListWarningRiskList setRiskName(String riskName) {
            this.riskName = riskName;
            return this;
        }
        public String getRiskName() {
            return this.riskName;
        }

    }

    public static class ListCheckItemWarningMachineResponseBodyList extends TeaModel {
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
         * <p>3</p>
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
         * <p>The ID of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>48a6d9a92435a13ad573372c3f3c63b7e04d106458141df9f9215570********</p>
         */
        @NameInMap("ContainerId")
        public String containerId;

        /**
         * <p>The name of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>step-build-ui-build</p>
         */
        @NameInMap("ContainerName")
        public String containerName;

        /**
         * <p>The details of the baselines for which the risk item can be fixed.</p>
         */
        @NameInMap("FixList")
        public java.util.List<ListCheckItemWarningMachineResponseBodyListFixList> fixList;

        /**
         * <p>Whether the repair is supported. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Supported</li>
         * <li><strong>1</strong>: Not Supported</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FixStatus")
        public Integer fixStatus;

        /**
         * <p>The instance ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1a69mvjujbakxu****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>sql-test-0****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the affected asset.</p>
         * 
         * <strong>example:</strong>
         * <p>8.210.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the affected asset.</p>
         * 
         * <strong>example:</strong>
         * <p>172.25.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The timestamp of the latest processing of the check item risk of the machine. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1694692471000</p>
         */
        @NameInMap("LastHandleTime")
        public Long lastHandleTime;

        /**
         * <p>The timestamp generated when the last scan was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1694692471000</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

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
         * <p>The prompt for the risk item.</p>
         * 
         * <strong>example:</strong>
         * <p>There is a weak password (username/password): root/he*****34</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <p>The region ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the check item. Valid values:</p>
         * <ul>
         * <li>1: failed</li>
         * <li>2: verifying</li>
         * <li>3: passed</li>
         * <li>6: ignored</li>
         * <li>7: fixing</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the asset that is scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>30****</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the asset on which the malicious image sample is detected.</p>
         * 
         * <strong>example:</strong>
         * <p>jenkins****</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The type of the asset. Valid values:</p>
         * <ul>
         * <li><strong>ECS_SNAPSHOT</strong></li>
         * <li><strong>ECS_IMAGE</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS_IMAGE</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>49e25e0f-bb51-4a5a-a1b3-13a4ddaa****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The information about the baselines on which the risk item is detected.</p>
         */
        @NameInMap("WarningRiskList")
        @Deprecated
        public java.util.List<ListCheckItemWarningMachineResponseBodyListWarningRiskList> warningRiskList;

        public static ListCheckItemWarningMachineResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListCheckItemWarningMachineResponseBodyList self = new ListCheckItemWarningMachineResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListCheckItemWarningMachineResponseBodyList setAuthVersion(Integer authVersion) {
            this.authVersion = authVersion;
            return this;
        }
        public Integer getAuthVersion() {
            return this.authVersion;
        }

        public ListCheckItemWarningMachineResponseBodyList setBind(Boolean bind) {
            this.bind = bind;
            return this;
        }
        public Boolean getBind() {
            return this.bind;
        }

        public ListCheckItemWarningMachineResponseBodyList setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public ListCheckItemWarningMachineResponseBodyList setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public ListCheckItemWarningMachineResponseBodyList setFixList(java.util.List<ListCheckItemWarningMachineResponseBodyListFixList> fixList) {
            this.fixList = fixList;
            return this;
        }
        public java.util.List<ListCheckItemWarningMachineResponseBodyListFixList> getFixList() {
            return this.fixList;
        }

        public ListCheckItemWarningMachineResponseBodyList setFixStatus(Integer fixStatus) {
            this.fixStatus = fixStatus;
            return this;
        }
        public Integer getFixStatus() {
            return this.fixStatus;
        }

        public ListCheckItemWarningMachineResponseBodyList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCheckItemWarningMachineResponseBodyList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListCheckItemWarningMachineResponseBodyList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListCheckItemWarningMachineResponseBodyList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ListCheckItemWarningMachineResponseBodyList setLastHandleTime(Long lastHandleTime) {
            this.lastHandleTime = lastHandleTime;
            return this;
        }
        public Long getLastHandleTime() {
            return this.lastHandleTime;
        }

        public ListCheckItemWarningMachineResponseBodyList setLastScanTime(Long lastScanTime) {
            this.lastScanTime = lastScanTime;
            return this;
        }
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        public ListCheckItemWarningMachineResponseBodyList setPortOpen(Boolean portOpen) {
            this.portOpen = portOpen;
            return this;
        }
        public Boolean getPortOpen() {
            return this.portOpen;
        }

        public ListCheckItemWarningMachineResponseBodyList setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public ListCheckItemWarningMachineResponseBodyList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListCheckItemWarningMachineResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListCheckItemWarningMachineResponseBodyList setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListCheckItemWarningMachineResponseBodyList setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ListCheckItemWarningMachineResponseBodyList setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListCheckItemWarningMachineResponseBodyList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        @Deprecated
        public ListCheckItemWarningMachineResponseBodyList setWarningRiskList(java.util.List<ListCheckItemWarningMachineResponseBodyListWarningRiskList> warningRiskList) {
            this.warningRiskList = warningRiskList;
            return this;
        }
        public java.util.List<ListCheckItemWarningMachineResponseBodyListWarningRiskList> getWarningRiskList() {
            return this.warningRiskList;
        }

    }

    public static class ListCheckItemWarningMachineResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of affected assets returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of affected assets.</p>
         * 
         * <strong>example:</strong>
         * <p>107</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCheckItemWarningMachineResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCheckItemWarningMachineResponseBodyPageInfo self = new ListCheckItemWarningMachineResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListCheckItemWarningMachineResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListCheckItemWarningMachineResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListCheckItemWarningMachineResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCheckItemWarningMachineResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
