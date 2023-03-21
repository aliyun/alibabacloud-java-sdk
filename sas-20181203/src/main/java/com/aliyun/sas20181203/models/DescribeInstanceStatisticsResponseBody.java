// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatisticsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeInstanceStatisticsResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStatisticsResponseBody self = new DescribeInstanceStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStatisticsResponseBody setData(java.util.List<DescribeInstanceStatisticsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeInstanceStatisticsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeInstanceStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceStatisticsResponseBodyData extends TeaModel {
        @NameInMap("Account")
        public Integer account;

        @NameInMap("AgentlessAll")
        public Integer agentlessAll;

        @NameInMap("AgentlessBaseline")
        public Integer agentlessBaseline;

        @NameInMap("AgentlessMalicious")
        public Integer agentlessMalicious;

        @NameInMap("AgentlessVulCve")
        public Integer agentlessVulCve;

        @NameInMap("AgentlessVulSca")
        public Integer agentlessVulSca;

        @NameInMap("AppNum")
        public Integer appNum;

        @NameInMap("CmsNum")
        public Integer cmsNum;

        @NameInMap("CspmNum")
        public Integer cspmNum;

        @NameInMap("CveNum")
        public Integer cveNum;

        @NameInMap("EmgNum")
        public Integer emgNum;

        @NameInMap("Health")
        public Integer health;

        @NameInMap("ScaNum")
        public Integer scaNum;

        @NameInMap("Suspicious")
        public Integer suspicious;

        @NameInMap("SysNum")
        public Integer sysNum;

        @NameInMap("Trojan")
        public Integer trojan;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("Vul")
        public Integer vul;

        @NameInMap("WeakPWNum")
        public Integer weakPWNum;

        public static DescribeInstanceStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceStatisticsResponseBodyData self = new DescribeInstanceStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceStatisticsResponseBodyData setAccount(Integer account) {
            this.account = account;
            return this;
        }
        public Integer getAccount() {
            return this.account;
        }

        public DescribeInstanceStatisticsResponseBodyData setAgentlessAll(Integer agentlessAll) {
            this.agentlessAll = agentlessAll;
            return this;
        }
        public Integer getAgentlessAll() {
            return this.agentlessAll;
        }

        public DescribeInstanceStatisticsResponseBodyData setAgentlessBaseline(Integer agentlessBaseline) {
            this.agentlessBaseline = agentlessBaseline;
            return this;
        }
        public Integer getAgentlessBaseline() {
            return this.agentlessBaseline;
        }

        public DescribeInstanceStatisticsResponseBodyData setAgentlessMalicious(Integer agentlessMalicious) {
            this.agentlessMalicious = agentlessMalicious;
            return this;
        }
        public Integer getAgentlessMalicious() {
            return this.agentlessMalicious;
        }

        public DescribeInstanceStatisticsResponseBodyData setAgentlessVulCve(Integer agentlessVulCve) {
            this.agentlessVulCve = agentlessVulCve;
            return this;
        }
        public Integer getAgentlessVulCve() {
            return this.agentlessVulCve;
        }

        public DescribeInstanceStatisticsResponseBodyData setAgentlessVulSca(Integer agentlessVulSca) {
            this.agentlessVulSca = agentlessVulSca;
            return this;
        }
        public Integer getAgentlessVulSca() {
            return this.agentlessVulSca;
        }

        public DescribeInstanceStatisticsResponseBodyData setAppNum(Integer appNum) {
            this.appNum = appNum;
            return this;
        }
        public Integer getAppNum() {
            return this.appNum;
        }

        public DescribeInstanceStatisticsResponseBodyData setCmsNum(Integer cmsNum) {
            this.cmsNum = cmsNum;
            return this;
        }
        public Integer getCmsNum() {
            return this.cmsNum;
        }

        public DescribeInstanceStatisticsResponseBodyData setCspmNum(Integer cspmNum) {
            this.cspmNum = cspmNum;
            return this;
        }
        public Integer getCspmNum() {
            return this.cspmNum;
        }

        public DescribeInstanceStatisticsResponseBodyData setCveNum(Integer cveNum) {
            this.cveNum = cveNum;
            return this;
        }
        public Integer getCveNum() {
            return this.cveNum;
        }

        public DescribeInstanceStatisticsResponseBodyData setEmgNum(Integer emgNum) {
            this.emgNum = emgNum;
            return this;
        }
        public Integer getEmgNum() {
            return this.emgNum;
        }

        public DescribeInstanceStatisticsResponseBodyData setHealth(Integer health) {
            this.health = health;
            return this;
        }
        public Integer getHealth() {
            return this.health;
        }

        public DescribeInstanceStatisticsResponseBodyData setScaNum(Integer scaNum) {
            this.scaNum = scaNum;
            return this;
        }
        public Integer getScaNum() {
            return this.scaNum;
        }

        public DescribeInstanceStatisticsResponseBodyData setSuspicious(Integer suspicious) {
            this.suspicious = suspicious;
            return this;
        }
        public Integer getSuspicious() {
            return this.suspicious;
        }

        public DescribeInstanceStatisticsResponseBodyData setSysNum(Integer sysNum) {
            this.sysNum = sysNum;
            return this;
        }
        public Integer getSysNum() {
            return this.sysNum;
        }

        public DescribeInstanceStatisticsResponseBodyData setTrojan(Integer trojan) {
            this.trojan = trojan;
            return this;
        }
        public Integer getTrojan() {
            return this.trojan;
        }

        public DescribeInstanceStatisticsResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeInstanceStatisticsResponseBodyData setVul(Integer vul) {
            this.vul = vul;
            return this;
        }
        public Integer getVul() {
            return this.vul;
        }

        public DescribeInstanceStatisticsResponseBodyData setWeakPWNum(Integer weakPWNum) {
            this.weakPWNum = weakPWNum;
            return this;
        }
        public Integer getWeakPWNum() {
            return this.weakPWNum;
        }

    }

}
