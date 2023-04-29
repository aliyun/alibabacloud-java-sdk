// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotProbeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("List")
    public java.util.List<ListHoneypotProbeResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageInfo")
    public ListHoneypotProbeResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListHoneypotProbeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotProbeResponseBody self = new ListHoneypotProbeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHoneypotProbeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHoneypotProbeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListHoneypotProbeResponseBody setList(java.util.List<ListHoneypotProbeResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListHoneypotProbeResponseBodyList> getList() {
        return this.list;
    }

    public ListHoneypotProbeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHoneypotProbeResponseBody setPageInfo(ListHoneypotProbeResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListHoneypotProbeResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListHoneypotProbeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHoneypotProbeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListHoneypotProbeResponseBodyListControlNode extends TeaModel {
        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        public static ListHoneypotProbeResponseBodyListControlNode build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotProbeResponseBodyListControlNode self = new ListHoneypotProbeResponseBodyListControlNode();
            return TeaModel.build(map, self);
        }

        public ListHoneypotProbeResponseBodyListControlNode setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public ListHoneypotProbeResponseBodyListControlNode setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListHoneypotProbeResponseBodyListControlNode setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

    public static class ListHoneypotProbeResponseBodyList extends TeaModel {
        @NameInMap("ControlNode")
        public ListHoneypotProbeResponseBodyListControlNode controlNode;

        @NameInMap("DeployTime")
        public Long deployTime;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("HostIp")
        public String hostIp;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("ProbeId")
        public String probeId;

        @NameInMap("ProbeType")
        public String probeType;

        @NameInMap("ProbeVersion")
        public String probeVersion;

        @NameInMap("Status")
        public String status;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("VpcId")
        public String vpcId;

        public static ListHoneypotProbeResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotProbeResponseBodyList self = new ListHoneypotProbeResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListHoneypotProbeResponseBodyList setControlNode(ListHoneypotProbeResponseBodyListControlNode controlNode) {
            this.controlNode = controlNode;
            return this;
        }
        public ListHoneypotProbeResponseBodyListControlNode getControlNode() {
            return this.controlNode;
        }

        public ListHoneypotProbeResponseBodyList setDeployTime(Long deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public Long getDeployTime() {
            return this.deployTime;
        }

        public ListHoneypotProbeResponseBodyList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListHoneypotProbeResponseBodyList setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public ListHoneypotProbeResponseBodyList setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListHoneypotProbeResponseBodyList setProbeId(String probeId) {
            this.probeId = probeId;
            return this;
        }
        public String getProbeId() {
            return this.probeId;
        }

        public ListHoneypotProbeResponseBodyList setProbeType(String probeType) {
            this.probeType = probeType;
            return this;
        }
        public String getProbeType() {
            return this.probeType;
        }

        public ListHoneypotProbeResponseBodyList setProbeVersion(String probeVersion) {
            this.probeVersion = probeVersion;
            return this;
        }
        public String getProbeVersion() {
            return this.probeVersion;
        }

        public ListHoneypotProbeResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListHoneypotProbeResponseBodyList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ListHoneypotProbeResponseBodyList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListHoneypotProbeResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListHoneypotProbeResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotProbeResponseBodyPageInfo self = new ListHoneypotProbeResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListHoneypotProbeResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListHoneypotProbeResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListHoneypotProbeResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHoneypotProbeResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
