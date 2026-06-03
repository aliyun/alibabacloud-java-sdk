// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetAgentListResponseBody extends TeaModel {
    @NameInMap("AgentList")
    public java.util.List<GetAgentListResponseBodyAgentList> agentList;

    /**
     * <strong>example:</strong>
     * <p>1B217656-2267-4FBF-B26C-CDD201BDC3B8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAgentListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentListResponseBody self = new GetAgentListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentListResponseBody setAgentList(java.util.List<GetAgentListResponseBodyAgentList> agentList) {
        this.agentList = agentList;
        return this;
    }
    public java.util.List<GetAgentListResponseBodyAgentList> getAgentList() {
        return this.agentList;
    }

    public GetAgentListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAgentListResponseBodyAgentListTags extends TeaModel {
        @NameInMap("TagId")
        public Long tagId;

        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static GetAgentListResponseBodyAgentListTags build(java.util.Map<String, ?> map) throws Exception {
            GetAgentListResponseBodyAgentListTags self = new GetAgentListResponseBodyAgentListTags();
            return TeaModel.build(map, self);
        }

        public GetAgentListResponseBodyAgentListTags setTagId(Long tagId) {
            this.tagId = tagId;
            return this;
        }
        public Long getTagId() {
            return this.tagId;
        }

        public GetAgentListResponseBodyAgentListTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetAgentListResponseBodyAgentListTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetAgentListResponseBodyAgentList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>rmagent_2ze68o4fden9o1s****</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("AgentOs")
        public String agentOs;

        /**
         * <strong>example:</strong>
         * <p>49046</p>
         */
        @NameInMap("AgentPort")
        public String agentPort;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentStatus")
        public Integer agentStatus;

        /**
         * <strong>example:</strong>
         * <p>3.2.5.3-1</p>
         */
        @NameInMap("AgentVersion")
        public String agentVersion;

        /**
         * <strong>example:</strong>
         * <p>i-2zel0147166****</p>
         */
        @NameInMap("EcsId")
        public String ecsId;

        /**
         * <strong>example:</strong>
         * <p>2020-09-29 11:05:22</p>
         */
        @NameInMap("FirstLoginTime")
        public String firstLoginTime;

        /**
         * <strong>example:</strong>
         * <p>2020-09-29 15:50:22</p>
         */
        @NameInMap("LastActiveTime")
        public String lastActiveTime;

        @NameInMap("OsCpu")
        public Integer osCpu;

        @NameInMap("OsMem")
        public Integer osMem;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("PktLoss")
        public Integer pktLoss;

        /**
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("PrivateIp")
        public String privateIp;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PublicIp")
        public String publicIp;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RmagentCpu")
        public Integer rmagentCpu;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RmagentMem")
        public Integer rmagentMem;

        /**
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("SendByteCount")
        public Long sendByteCount;

        /**
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("SendBytes")
        public Long sendBytes;

        /**
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("SendPacketCount")
        public Long sendPacketCount;

        /**
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("SendPackets")
        public Long sendPackets;

        @NameInMap("SysConfig")
        public String sysConfig;

        @NameInMap("Tags")
        public java.util.List<GetAgentListResponseBodyAgentListTags> tags;

        /**
         * <strong>example:</strong>
         * <p>v-asd2rrddgs****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetAgentListResponseBodyAgentList build(java.util.Map<String, ?> map) throws Exception {
            GetAgentListResponseBodyAgentList self = new GetAgentListResponseBodyAgentList();
            return TeaModel.build(map, self);
        }

        public GetAgentListResponseBodyAgentList setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetAgentListResponseBodyAgentList setAgentOs(String agentOs) {
            this.agentOs = agentOs;
            return this;
        }
        public String getAgentOs() {
            return this.agentOs;
        }

        public GetAgentListResponseBodyAgentList setAgentPort(String agentPort) {
            this.agentPort = agentPort;
            return this;
        }
        public String getAgentPort() {
            return this.agentPort;
        }

        public GetAgentListResponseBodyAgentList setAgentStatus(Integer agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public Integer getAgentStatus() {
            return this.agentStatus;
        }

        public GetAgentListResponseBodyAgentList setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public GetAgentListResponseBodyAgentList setEcsId(String ecsId) {
            this.ecsId = ecsId;
            return this;
        }
        public String getEcsId() {
            return this.ecsId;
        }

        public GetAgentListResponseBodyAgentList setFirstLoginTime(String firstLoginTime) {
            this.firstLoginTime = firstLoginTime;
            return this;
        }
        public String getFirstLoginTime() {
            return this.firstLoginTime;
        }

        public GetAgentListResponseBodyAgentList setLastActiveTime(String lastActiveTime) {
            this.lastActiveTime = lastActiveTime;
            return this;
        }
        public String getLastActiveTime() {
            return this.lastActiveTime;
        }

        public GetAgentListResponseBodyAgentList setOsCpu(Integer osCpu) {
            this.osCpu = osCpu;
            return this;
        }
        public Integer getOsCpu() {
            return this.osCpu;
        }

        public GetAgentListResponseBodyAgentList setOsMem(Integer osMem) {
            this.osMem = osMem;
            return this;
        }
        public Integer getOsMem() {
            return this.osMem;
        }

        public GetAgentListResponseBodyAgentList setPktLoss(Integer pktLoss) {
            this.pktLoss = pktLoss;
            return this;
        }
        public Integer getPktLoss() {
            return this.pktLoss;
        }

        public GetAgentListResponseBodyAgentList setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public GetAgentListResponseBodyAgentList setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public GetAgentListResponseBodyAgentList setRmagentCpu(Integer rmagentCpu) {
            this.rmagentCpu = rmagentCpu;
            return this;
        }
        public Integer getRmagentCpu() {
            return this.rmagentCpu;
        }

        public GetAgentListResponseBodyAgentList setRmagentMem(Integer rmagentMem) {
            this.rmagentMem = rmagentMem;
            return this;
        }
        public Integer getRmagentMem() {
            return this.rmagentMem;
        }

        public GetAgentListResponseBodyAgentList setSendByteCount(Long sendByteCount) {
            this.sendByteCount = sendByteCount;
            return this;
        }
        public Long getSendByteCount() {
            return this.sendByteCount;
        }

        public GetAgentListResponseBodyAgentList setSendBytes(Long sendBytes) {
            this.sendBytes = sendBytes;
            return this;
        }
        public Long getSendBytes() {
            return this.sendBytes;
        }

        public GetAgentListResponseBodyAgentList setSendPacketCount(Long sendPacketCount) {
            this.sendPacketCount = sendPacketCount;
            return this;
        }
        public Long getSendPacketCount() {
            return this.sendPacketCount;
        }

        public GetAgentListResponseBodyAgentList setSendPackets(Long sendPackets) {
            this.sendPackets = sendPackets;
            return this;
        }
        public Long getSendPackets() {
            return this.sendPackets;
        }

        public GetAgentListResponseBodyAgentList setSysConfig(String sysConfig) {
            this.sysConfig = sysConfig;
            return this;
        }
        public String getSysConfig() {
            return this.sysConfig;
        }

        public GetAgentListResponseBodyAgentList setTags(java.util.List<GetAgentListResponseBodyAgentListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetAgentListResponseBodyAgentListTags> getTags() {
            return this.tags;
        }

        public GetAgentListResponseBodyAgentList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
