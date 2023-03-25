// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotProbeResponseBody extends TeaModel {
    /**
     * <p>The status code that is returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>An array that consists of the details about the probe.</p>
     */
    @NameInMap("List")
    public java.util.List<ListHoneypotProbeResponseBodyList> list;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListHoneypotProbeResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
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
        /**
         * <p>The ID of the Elastic Compute Service (ECS) instance.</p>
         */
        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The name of the node.</p>
         */
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
        /**
         * <p>The information about the management node.</p>
         */
        @NameInMap("ControlNode")
        public ListHoneypotProbeResponseBodyListControlNode controlNode;

        /**
         * <p>The time when the probe was deployed.</p>
         */
        @NameInMap("DeployTime")
        public Long deployTime;

        /**
         * <p>The name of the probe.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The IP address of the server on which the probe is installed.</p>
         */
        @NameInMap("HostIp")
        public String hostIp;

        /**
         * <p>The operating system of the server on which the probe is deployed. Valid values:</p>
         * <br>
         * <p>*   windows</p>
         * <p>*   linux</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The ID of the probe.</p>
         */
        @NameInMap("ProbeId")
        public String probeId;

        /**
         * <p>The type of the probe. Valid values:</p>
         * <br>
         * <p>*   **host_probe**: host probe</p>
         * <p>*   **vpc_black_hole_probe**: VPC probe</p>
         */
        @NameInMap("ProbeType")
        public String probeType;

        /**
         * <p>The version of the probe.</p>
         */
        @NameInMap("ProbeVersion")
        public String probeVersion;

        /**
         * <p>The status of the probe. Valid values:</p>
         * <br>
         * <p>*   **installed**: installed</p>
         * <p>*   **install_failed**: installation failed</p>
         * <p>*   **online**: online</p>
         * <p>*   **offline**: offline</p>
         * <p>*   **unnormal**: abnormal</p>
         * <p>*   **unprobe**: unauthorized</p>
         * <p>*   **uninstalling**: being uninstalled</p>
         * <p>*   **uninstalled**: uninstalled</p>
         * <p>*   **uninstall_failed**: uninstallation failed</p>
         * <p>*   **not_exist**: not installed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The UUID of the server to which the host probe is deployed.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The ID of the VPC in which the VPC probe is deployed.</p>
         */
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
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: **20**.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
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
