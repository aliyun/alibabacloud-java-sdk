// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetAgentListResponseBody extends TeaModel {
    @NameInMap("AgentList")
    public java.util.List<GetAgentListResponseBodyAgentList> agentList;

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

    public static class GetAgentListResponseBodyAgentList extends TeaModel {
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentOs")
        public String agentOs;

        @NameInMap("AgentPort")
        public String agentPort;

        @NameInMap("AgentStatus")
        public Integer agentStatus;

        @NameInMap("AgentVersion")
        public String agentVersion;

        @NameInMap("EcsId")
        public String ecsId;

        @NameInMap("FirstLoginTime")
        public String firstLoginTime;

        @NameInMap("LastActiveTime")
        public String lastActiveTime;

        @NameInMap("PktLoss")
        public Integer pktLoss;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("PublicIp")
        public String publicIp;

        @NameInMap("RmagentCpu")
        public Integer rmagentCpu;

        @NameInMap("RmagentMem")
        public Integer rmagentMem;

        @NameInMap("SendByteCount")
        public Long sendByteCount;

        @NameInMap("SendBytes")
        public Long sendBytes;

        @NameInMap("SendPacketCount")
        public Long sendPacketCount;

        @NameInMap("SendPackets")
        public Long sendPackets;

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

        public GetAgentListResponseBodyAgentList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
