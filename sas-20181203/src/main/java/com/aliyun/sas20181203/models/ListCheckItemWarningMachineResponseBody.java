// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckItemWarningMachineResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<ListCheckItemWarningMachineResponseBodyList> list;

    @NameInMap("PageInfo")
    public ListCheckItemWarningMachineResponseBodyPageInfo pageInfo;

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
        @NameInMap("RiskId")
        public Long riskId;

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
        @NameInMap("RiskId")
        public Long riskId;

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
        @NameInMap("AuthVersion")
        public Integer authVersion;

        @NameInMap("Bind")
        public Boolean bind;

        @NameInMap("ContainerId")
        public String containerId;

        @NameInMap("ContainerName")
        public String containerName;

        @NameInMap("FixList")
        public java.util.List<ListCheckItemWarningMachineResponseBodyListFixList> fixList;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("PortOpen")
        public Boolean portOpen;

        @NameInMap("Prompt")
        public String prompt;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Uuid")
        public String uuid;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
