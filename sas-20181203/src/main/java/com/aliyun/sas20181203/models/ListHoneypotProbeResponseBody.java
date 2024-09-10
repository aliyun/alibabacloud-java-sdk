// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotProbeResponseBody extends TeaModel {
    /**
     * <p>The status code that is returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * 
     * <strong>example:</strong>
     * <p>successful</p>
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
     * 
     * <strong>example:</strong>
     * <p>4BC9E610-21BE-537F-82EF-144A60D5A970</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>i-uf6eq0rlvu1mkh0p****</p>
         */
        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>8ec9da17-c0e7-4642-aad6-defc9722****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>HoneypotNode1</p>
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
         * 
         * <strong>example:</strong>
         * <p>1669363825000</p>
         */
        @NameInMap("DeployTime")
        public Long deployTime;

        /**
         * <p>The name of the probe.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-pinpoint-hd1b</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The IP address of the server on which the probe is installed.</p>
         * 
         * <strong>example:</strong>
         * <p>33.53.XX.XX</p>
         */
        @NameInMap("HostIp")
        public String hostIp;

        /**
         * <p>The operating system of the server on which the probe is deployed. Valid values:</p>
         * <ul>
         * <li>windows</li>
         * <li>linux</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The ID of the probe.</p>
         * 
         * <strong>example:</strong>
         * <p>4d167bb3-dd09-4a6a-a179-d5d6a5b0****</p>
         */
        @NameInMap("ProbeId")
        public String probeId;

        /**
         * <p>The type of the probe. Valid values:</p>
         * <ul>
         * <li><strong>host_probe</strong>: host probe</li>
         * <li><strong>vpc_black_hole_probe</strong>: VPC probe</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>host_probe</p>
         */
        @NameInMap("ProbeType")
        public String probeType;

        /**
         * <p>The version of the probe.</p>
         * 
         * <strong>example:</strong>
         * <p>18060096</p>
         */
        @NameInMap("ProbeVersion")
        public String probeVersion;

        /**
         * <p>The status of the probe. Valid values:</p>
         * <ul>
         * <li><strong>installed</strong>: installed</li>
         * <li><strong>install_failed</strong>: installation failed</li>
         * <li><strong>online</strong>: online</li>
         * <li><strong>offline</strong>: offline</li>
         * <li><strong>unnormal</strong>: abnormal</li>
         * <li><strong>unprobe</strong>: unauthorized</li>
         * <li><strong>uninstalling</strong>: being uninstalled</li>
         * <li><strong>uninstalled</strong>: uninstalled</li>
         * <li><strong>uninstall_failed</strong>: uninstallation failed</li>
         * <li><strong>not_exist</strong>: not installed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The UUID of the server to which the host probe is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>49e25e0f-bb51-4a5a-a1b3-13a4ddaa****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The ID of the VPC in which the VPC probe is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-5gu8iu68w9b472jbb****</p>
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
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
         * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
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
