// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotEventFlowsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HoneypotEventFlows")
    public java.util.List<ListHoneypotEventFlowsResponseBodyHoneypotEventFlows> honeypotEventFlows;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageInfo")
    public ListHoneypotEventFlowsResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListHoneypotEventFlowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotEventFlowsResponseBody self = new ListHoneypotEventFlowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHoneypotEventFlowsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHoneypotEventFlowsResponseBody setHoneypotEventFlows(java.util.List<ListHoneypotEventFlowsResponseBodyHoneypotEventFlows> honeypotEventFlows) {
        this.honeypotEventFlows = honeypotEventFlows;
        return this;
    }
    public java.util.List<ListHoneypotEventFlowsResponseBodyHoneypotEventFlows> getHoneypotEventFlows() {
        return this.honeypotEventFlows;
    }

    public ListHoneypotEventFlowsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListHoneypotEventFlowsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHoneypotEventFlowsResponseBody setPageInfo(ListHoneypotEventFlowsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListHoneypotEventFlowsResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListHoneypotEventFlowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHoneypotEventFlowsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListHoneypotEventFlowsResponseBodyHoneypotEventFlows extends TeaModel {
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("DockerId")
        public String dockerId;

        @NameInMap("DstIp")
        public String dstIp;

        @NameInMap("DstPort")
        public Integer dstPort;

        @NameInMap("EventConnection")
        public String eventConnection;

        @NameInMap("Extra")
        public String extra;

        @NameInMap("Extra1")
        public String extra1;

        @NameInMap("FileOssUrl")
        public String fileOssUrl;

        @NameInMap("FirstTime")
        public Long firstTime;

        @NameInMap("HoneypotEventId")
        public String honeypotEventId;

        @NameInMap("HoneypotId")
        public String honeypotId;

        @NameInMap("HoneypotName")
        public String honeypotName;

        @NameInMap("LastTime")
        public Long lastTime;

        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("SecurityEventId")
        public Long securityEventId;

        @NameInMap("SrcIp")
        public String srcIp;

        @NameInMap("SrcMac")
        public String srcMac;

        @NameInMap("SrcPort")
        public Integer srcPort;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TypeId")
        public String typeId;

        @NameInMap("Uid")
        public String uid;

        public static ListHoneypotEventFlowsResponseBodyHoneypotEventFlows build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotEventFlowsResponseBodyHoneypotEventFlows self = new ListHoneypotEventFlowsResponseBodyHoneypotEventFlows();
            return TeaModel.build(map, self);
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setDockerId(String dockerId) {
            this.dockerId = dockerId;
            return this;
        }
        public String getDockerId() {
            return this.dockerId;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setDstIp(String dstIp) {
            this.dstIp = dstIp;
            return this;
        }
        public String getDstIp() {
            return this.dstIp;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setDstPort(Integer dstPort) {
            this.dstPort = dstPort;
            return this;
        }
        public Integer getDstPort() {
            return this.dstPort;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setEventConnection(String eventConnection) {
            this.eventConnection = eventConnection;
            return this;
        }
        public String getEventConnection() {
            return this.eventConnection;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setExtra1(String extra1) {
            this.extra1 = extra1;
            return this;
        }
        public String getExtra1() {
            return this.extra1;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setFileOssUrl(String fileOssUrl) {
            this.fileOssUrl = fileOssUrl;
            return this;
        }
        public String getFileOssUrl() {
            return this.fileOssUrl;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setHoneypotEventId(String honeypotEventId) {
            this.honeypotEventId = honeypotEventId;
            return this;
        }
        public String getHoneypotEventId() {
            return this.honeypotEventId;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setHoneypotId(String honeypotId) {
            this.honeypotId = honeypotId;
            return this;
        }
        public String getHoneypotId() {
            return this.honeypotId;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setHoneypotName(String honeypotName) {
            this.honeypotName = honeypotName;
            return this;
        }
        public String getHoneypotName() {
            return this.honeypotName;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setSecurityEventId(Long securityEventId) {
            this.securityEventId = securityEventId;
            return this;
        }
        public Long getSecurityEventId() {
            return this.securityEventId;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setSrcIp(String srcIp) {
            this.srcIp = srcIp;
            return this;
        }
        public String getSrcIp() {
            return this.srcIp;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setSrcMac(String srcMac) {
            this.srcMac = srcMac;
            return this;
        }
        public String getSrcMac() {
            return this.srcMac;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setSrcPort(Integer srcPort) {
            this.srcPort = srcPort;
            return this;
        }
        public Integer getSrcPort() {
            return this.srcPort;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setTypeId(String typeId) {
            this.typeId = typeId;
            return this;
        }
        public String getTypeId() {
            return this.typeId;
        }

        public ListHoneypotEventFlowsResponseBodyHoneypotEventFlows setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class ListHoneypotEventFlowsResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListHoneypotEventFlowsResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotEventFlowsResponseBodyPageInfo self = new ListHoneypotEventFlowsResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListHoneypotEventFlowsResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListHoneypotEventFlowsResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListHoneypotEventFlowsResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHoneypotEventFlowsResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
