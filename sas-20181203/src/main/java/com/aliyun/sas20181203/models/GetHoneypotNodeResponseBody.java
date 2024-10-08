// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotNodeResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the management node.</p>
     */
    @NameInMap("HoneypotNode")
    public GetHoneypotNodeResponseBodyHoneypotNode honeypotNode;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0A453658-070B-5554-B46C-867425BE4FD4</p>
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

    public static GetHoneypotNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotNodeResponseBody self = new GetHoneypotNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHoneypotNodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHoneypotNodeResponseBody setHoneypotNode(GetHoneypotNodeResponseBodyHoneypotNode honeypotNode) {
        this.honeypotNode = honeypotNode;
        return this;
    }
    public GetHoneypotNodeResponseBodyHoneypotNode getHoneypotNode() {
        return this.honeypotNode;
    }

    public GetHoneypotNodeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHoneypotNodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHoneypotNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHoneypotNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHoneypotNodeResponseBodyHoneypotNode extends TeaModel {
        /**
         * <p>Indicates whether a honeypot is allowed to access the Internet. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The honeypot is allowed to access the Internet.</li>
         * <li><strong>false</strong>: The honeypot is not allowed to access the Internet.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowHoneypotAccessInternet")
        public Boolean allowHoneypotAccessInternet;

        /**
         * <p>The time when the management node was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-02 17:13:43</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2vccskxjunf1ag6w****</p>
         */
        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        /**
         * <p>The maximum number of honeypots that can be deployed to the management node.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("HoneypotTotalCount")
        public Integer honeypotTotalCount;

        /**
         * <p>The number of honeypots that are deployed to the management node.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HoneypotUsedCount")
        public Integer honeypotUsedCount;

        /**
         * <p>The ID of the management node.</p>
         * 
         * <strong>example:</strong>
         * <p>a7409a58-bc60-41af-9d36-080d58ae****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The IP address of the management node.</p>
         * 
         * <strong>example:</strong>
         * <p>101.37.XX.XX</p>
         */
        @NameInMap("NodeIp")
        public String nodeIp;

        /**
         * <p>The name of the management node.</p>
         * 
         * <strong>example:</strong>
         * <p>gmmc</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The maximum number of probes that can be deployed for the management node.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ProbeTotalCount")
        public Integer probeTotalCount;

        /**
         * <p>The number of probes that are deployed for the management node.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("ProbeUsedCount")
        public Integer probeUsedCount;

        /**
         * <p>An array consisting of the CIDR blocks that are allowed to access the management node.</p>
         */
        @NameInMap("SecurityGroupProbeIpList")
        public java.util.List<String> securityGroupProbeIpList;

        /**
         * <p>The status of the management node. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: preparing</li>
         * <li><strong>1</strong>: normal</li>
         * <li><strong>2</strong>: abnormal</li>
         * <li><strong>4</strong>: starting</li>
         * <li><strong>5</strong>: upgrading</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalStatus")
        public Integer totalStatus;

        /**
         * <p>Indicates whether the management node can be upgraded. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UpgradeAvailable")
        public Boolean upgradeAvailable;

        public static GetHoneypotNodeResponseBodyHoneypotNode build(java.util.Map<String, ?> map) throws Exception {
            GetHoneypotNodeResponseBodyHoneypotNode self = new GetHoneypotNodeResponseBodyHoneypotNode();
            return TeaModel.build(map, self);
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setAllowHoneypotAccessInternet(Boolean allowHoneypotAccessInternet) {
            this.allowHoneypotAccessInternet = allowHoneypotAccessInternet;
            return this;
        }
        public Boolean getAllowHoneypotAccessInternet() {
            return this.allowHoneypotAccessInternet;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setHoneypotTotalCount(Integer honeypotTotalCount) {
            this.honeypotTotalCount = honeypotTotalCount;
            return this;
        }
        public Integer getHoneypotTotalCount() {
            return this.honeypotTotalCount;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setHoneypotUsedCount(Integer honeypotUsedCount) {
            this.honeypotUsedCount = honeypotUsedCount;
            return this;
        }
        public Integer getHoneypotUsedCount() {
            return this.honeypotUsedCount;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setNodeIp(String nodeIp) {
            this.nodeIp = nodeIp;
            return this;
        }
        public String getNodeIp() {
            return this.nodeIp;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setProbeTotalCount(Integer probeTotalCount) {
            this.probeTotalCount = probeTotalCount;
            return this;
        }
        public Integer getProbeTotalCount() {
            return this.probeTotalCount;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setProbeUsedCount(Integer probeUsedCount) {
            this.probeUsedCount = probeUsedCount;
            return this;
        }
        public Integer getProbeUsedCount() {
            return this.probeUsedCount;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setSecurityGroupProbeIpList(java.util.List<String> securityGroupProbeIpList) {
            this.securityGroupProbeIpList = securityGroupProbeIpList;
            return this;
        }
        public java.util.List<String> getSecurityGroupProbeIpList() {
            return this.securityGroupProbeIpList;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setTotalStatus(Integer totalStatus) {
            this.totalStatus = totalStatus;
            return this;
        }
        public Integer getTotalStatus() {
            return this.totalStatus;
        }

        public GetHoneypotNodeResponseBodyHoneypotNode setUpgradeAvailable(Boolean upgradeAvailable) {
            this.upgradeAvailable = upgradeAvailable;
            return this;
        }
        public Boolean getUpgradeAvailable() {
            return this.upgradeAvailable;
        }

    }

}
