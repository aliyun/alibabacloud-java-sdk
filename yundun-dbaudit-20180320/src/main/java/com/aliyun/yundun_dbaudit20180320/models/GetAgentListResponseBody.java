// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetAgentListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AgentList")
    public java.util.List<GetAgentListResponseBodyAgentList> agentList;

    public static GetAgentListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentListResponseBody self = new GetAgentListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentListResponseBody setAgentList(java.util.List<GetAgentListResponseBodyAgentList> agentList) {
        this.agentList = agentList;
        return this;
    }
    public java.util.List<GetAgentListResponseBodyAgentList> getAgentList() {
        return this.agentList;
    }

    public static class GetAgentListResponseBodyAgentList extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("RmagentMem")
        public Integer rmagentMem;

        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("RmagentCpu")
        public Integer rmagentCpu;

        @NameInMap("FirstLoginTime")
        public String firstLoginTime;

        @NameInMap("AgentOs")
        public String agentOs;

        @NameInMap("AgentStatus")
        public Integer agentStatus;

        @NameInMap("AgentPort")
        public String agentPort;

        @NameInMap("AgentVersion")
        public String agentVersion;

        @NameInMap("SendPackets")
        public Long sendPackets;

        @NameInMap("SendBytes")
        public Long sendBytes;

        @NameInMap("LastActiveTime")
        public String lastActiveTime;

        @NameInMap("SendPacketCount")
        public Long sendPacketCount;

        @NameInMap("EcsId")
        public String ecsId;

        @NameInMap("PublicIp")
        public String publicIp;

        @NameInMap("SendByteCount")
        public Long sendByteCount;

        public static GetAgentListResponseBodyAgentList build(java.util.Map<String, ?> map) throws Exception {
            GetAgentListResponseBodyAgentList self = new GetAgentListResponseBodyAgentList();
            return TeaModel.build(map, self);
        }

        public GetAgentListResponseBodyAgentList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetAgentListResponseBodyAgentList setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public GetAgentListResponseBodyAgentList setRmagentMem(Integer rmagentMem) {
            this.rmagentMem = rmagentMem;
            return this;
        }
        public Integer getRmagentMem() {
            return this.rmagentMem;
        }

        public GetAgentListResponseBodyAgentList setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetAgentListResponseBodyAgentList setRmagentCpu(Integer rmagentCpu) {
            this.rmagentCpu = rmagentCpu;
            return this;
        }
        public Integer getRmagentCpu() {
            return this.rmagentCpu;
        }

        public GetAgentListResponseBodyAgentList setFirstLoginTime(String firstLoginTime) {
            this.firstLoginTime = firstLoginTime;
            return this;
        }
        public String getFirstLoginTime() {
            return this.firstLoginTime;
        }

        public GetAgentListResponseBodyAgentList setAgentOs(String agentOs) {
            this.agentOs = agentOs;
            return this;
        }
        public String getAgentOs() {
            return this.agentOs;
        }

        public GetAgentListResponseBodyAgentList setAgentStatus(Integer agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public Integer getAgentStatus() {
            return this.agentStatus;
        }

        public GetAgentListResponseBodyAgentList setAgentPort(String agentPort) {
            this.agentPort = agentPort;
            return this;
        }
        public String getAgentPort() {
            return this.agentPort;
        }

        public GetAgentListResponseBodyAgentList setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public GetAgentListResponseBodyAgentList setSendPackets(Long sendPackets) {
            this.sendPackets = sendPackets;
            return this;
        }
        public Long getSendPackets() {
            return this.sendPackets;
        }

        public GetAgentListResponseBodyAgentList setSendBytes(Long sendBytes) {
            this.sendBytes = sendBytes;
            return this;
        }
        public Long getSendBytes() {
            return this.sendBytes;
        }

        public GetAgentListResponseBodyAgentList setLastActiveTime(String lastActiveTime) {
            this.lastActiveTime = lastActiveTime;
            return this;
        }
        public String getLastActiveTime() {
            return this.lastActiveTime;
        }

        public GetAgentListResponseBodyAgentList setSendPacketCount(Long sendPacketCount) {
            this.sendPacketCount = sendPacketCount;
            return this;
        }
        public Long getSendPacketCount() {
            return this.sendPacketCount;
        }

        public GetAgentListResponseBodyAgentList setEcsId(String ecsId) {
            this.ecsId = ecsId;
            return this;
        }
        public String getEcsId() {
            return this.ecsId;
        }

        public GetAgentListResponseBodyAgentList setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public GetAgentListResponseBodyAgentList setSendByteCount(Long sendByteCount) {
            this.sendByteCount = sendByteCount;
            return this;
        }
        public Long getSendByteCount() {
            return this.sendByteCount;
        }

    }

}
