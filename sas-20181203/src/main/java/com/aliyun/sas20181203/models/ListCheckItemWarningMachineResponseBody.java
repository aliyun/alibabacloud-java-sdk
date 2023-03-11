// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckItemWarningMachineResponseBody extends TeaModel {
    /**
     * <p>An array consisting of the servers on which the alerts are generated.</p>
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
         */
        @NameInMap("RiskId")
        public Long riskId;

        /**
         * <p>The name of the baseline.</p>
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
         */
        @NameInMap("RiskId")
        public Long riskId;

        /**
         * <p>The name of the baseline.</p>
         */
        @NameInMap("RiskName")
        public String riskName;

        public static ListCheckItemWarningMachineResponseBodyListWarningRiskList build(java.util.Map<String, ?> map) throws Exception {
            ListCheckItemWarningMachineResponseBodyListWarningRiskList self = new ListCheckItemWarningMachineResponseBodyListWarningRiskList();
            return TeaModel.build(map, self);
        }

        public ListCheckItemWarningMachineResponseBodyListWarningRiskList setRiskId(Long riskId) {
            this.riskId = riskId;
            return this;
        }
        public Long getRiskId() {
            return this.riskId;
        }

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
         * <br>
         * <p>*   **1**: Basic edition (Unauthorized)</p>
         * <p>*   **6**: Anti-virus edition</p>
         * <p>*   **5**: Advanced edition</p>
         * <p>*   **3**: Enterprise edition</p>
         * <p>*   **7**: Ultimate edition</p>
         * <p>*   **10**: Value-added Plan edition</p>
         */
        @NameInMap("AuthVersion")
        public Integer authVersion;

        /**
         * <p>Indicates whether Security Center is authorized to scan the asset. Valid values:</p>
         * <br>
         * <p>*   **true**: Security Center is authorized to scan the asset.</p>
         * <p>*   **false**: Security Center is not authorized to scan the asset.</p>
         */
        @NameInMap("Bind")
        public Boolean bind;

        /**
         * <p>An array consisting of the details about the baselines for which the risk item can be fixed.</p>
         */
        @NameInMap("FixList")
        public java.util.List<ListCheckItemWarningMachineResponseBodyListFixList> fixList;

        /**
         * <p>The ID of the server.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the affected asset.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the affected asset.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>Indicates whether a port on the server is accessible over the Internet. Valid values:</p>
         * <br>
         * <p>*   **true**: A port on the server is accessible over the Internet.</p>
         * <p>*   **false**: No ports on the server are accessible over the Internet.</p>
         */
        @NameInMap("PortOpen")
        public Boolean portOpen;

        /**
         * <p>The prompt for the risk item.</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <p>The region ID of the asset.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the check item.</p>
         * <br>
         * <p>> Valid values:</p>
         * <br>
         * <p>*   1: failed</p>
         * <br>
         * <p>*   2: verifying</p>
         * <br>
         * <p>*   3: passed</p>
         * <br>
         * <p>*   6: ignored</p>
         * <br>
         * <p>*   7: fixing</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The UUID of the server.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>An array consisting of the details about the baselines based on which the risk item is detected.</p>
         */
        @NameInMap("WarningRiskList")
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

        public ListCheckItemWarningMachineResponseBodyList setFixList(java.util.List<ListCheckItemWarningMachineResponseBodyListFixList> fixList) {
            this.fixList = fixList;
            return this;
        }
        public java.util.List<ListCheckItemWarningMachineResponseBodyListFixList> getFixList() {
            return this.fixList;
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

        public ListCheckItemWarningMachineResponseBodyList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

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
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of affected assets.</p>
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
