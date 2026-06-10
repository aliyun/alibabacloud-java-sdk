// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeDialogueNodeStatisticsResponseBody extends TeaModel {
    /**
     * <p>API status code</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Task group ID</p>
     * 
     * <strong>example:</strong>
     * <p>f06f7c9f-2895-4b30-a8c2-6ecccb9c9f89</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Hang-up nodes</p>
     */
    @NameInMap("HangUpDialogueNodes")
    public java.util.List<DescribeDialogueNodeStatisticsResponseBodyHangUpDialogueNodes> hangUpDialogueNodes;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>e5035654-1745-484a-8c5b-165f7c7bcd79</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>API message</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>No-answer nodes</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("NoAnswerDialogueNodes")
    public java.util.List<DescribeDialogueNodeStatisticsResponseBodyNoAnswerDialogueNodes> noAnswerDialogueNodes;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates success</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Number of completed tasks in the task group</p>
     * 
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("TotalCompleted")
    public Integer totalCompleted;

    public static DescribeDialogueNodeStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDialogueNodeStatisticsResponseBody self = new DescribeDialogueNodeStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDialogueNodeStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDialogueNodeStatisticsResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDialogueNodeStatisticsResponseBody setHangUpDialogueNodes(java.util.List<DescribeDialogueNodeStatisticsResponseBodyHangUpDialogueNodes> hangUpDialogueNodes) {
        this.hangUpDialogueNodes = hangUpDialogueNodes;
        return this;
    }
    public java.util.List<DescribeDialogueNodeStatisticsResponseBodyHangUpDialogueNodes> getHangUpDialogueNodes() {
        return this.hangUpDialogueNodes;
    }

    public DescribeDialogueNodeStatisticsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDialogueNodeStatisticsResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDialogueNodeStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDialogueNodeStatisticsResponseBody setNoAnswerDialogueNodes(java.util.List<DescribeDialogueNodeStatisticsResponseBodyNoAnswerDialogueNodes> noAnswerDialogueNodes) {
        this.noAnswerDialogueNodes = noAnswerDialogueNodes;
        return this;
    }
    public java.util.List<DescribeDialogueNodeStatisticsResponseBodyNoAnswerDialogueNodes> getNoAnswerDialogueNodes() {
        return this.noAnswerDialogueNodes;
    }

    public DescribeDialogueNodeStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDialogueNodeStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDialogueNodeStatisticsResponseBody setTotalCompleted(Integer totalCompleted) {
        this.totalCompleted = totalCompleted;
        return this;
    }
    public Integer getTotalCompleted() {
        return this.totalCompleted;
    }

    public static class DescribeDialogueNodeStatisticsResponseBodyHangUpDialogueNodes extends TeaModel {
        /**
         * <p>Number of hang-ups</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HangUpNum")
        public Integer hangUpNum;

        /**
         * <p>Node ID</p>
         * 
         * <strong>example:</strong>
         * <p>e5035654-1745-484a-8c5b-165f7c7bcd79</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Node name</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>Proportion of quantity</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("RateDisplay")
        public String rateDisplay;

        public static DescribeDialogueNodeStatisticsResponseBodyHangUpDialogueNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDialogueNodeStatisticsResponseBodyHangUpDialogueNodes self = new DescribeDialogueNodeStatisticsResponseBodyHangUpDialogueNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDialogueNodeStatisticsResponseBodyHangUpDialogueNodes setHangUpNum(Integer hangUpNum) {
            this.hangUpNum = hangUpNum;
            return this;
        }
        public Integer getHangUpNum() {
            return this.hangUpNum;
        }

        public DescribeDialogueNodeStatisticsResponseBodyHangUpDialogueNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeDialogueNodeStatisticsResponseBodyHangUpDialogueNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeDialogueNodeStatisticsResponseBodyHangUpDialogueNodes setRateDisplay(String rateDisplay) {
            this.rateDisplay = rateDisplay;
            return this;
        }
        public String getRateDisplay() {
            return this.rateDisplay;
        }

    }

    public static class DescribeDialogueNodeStatisticsResponseBodyNoAnswerDialogueNodes extends TeaModel {
        /**
         * <p>Task group ID</p>
         * 
         * <strong>example:</strong>
         * <p>f06f7c9f-2895-4b30-a8c2-6ecccb9c9f89</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>Number of hang-ups</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HangUpNum")
        public Integer hangUpNum;

        /**
         * <p>Number of hits</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("HitNum")
        public Integer hitNum;

        /**
         * <p>ID, unique identifier</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>e5035654-1745-484a-8c5b-165f7c7bcd79</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Number of no-answers</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NoAnswerNum")
        public Integer noAnswerNum;

        /**
         * <p>Node ID</p>
         * 
         * <strong>example:</strong>
         * <p>e5035654-1745-484a-8c5b-165f7c7bcd79</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Node name</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        public static DescribeDialogueNodeStatisticsResponseBodyNoAnswerDialogueNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDialogueNodeStatisticsResponseBodyNoAnswerDialogueNodes self = new DescribeDialogueNodeStatisticsResponseBodyNoAnswerDialogueNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDialogueNodeStatisticsResponseBodyNoAnswerDialogueNodes setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDialogueNodeStatisticsResponseBodyNoAnswerDialogueNodes setHangUpNum(Integer hangUpNum) {
            this.hangUpNum = hangUpNum;
            return this;
        }
        public Integer getHangUpNum() {
            return this.hangUpNum;
        }

        public DescribeDialogueNodeStatisticsResponseBodyNoAnswerDialogueNodes setHitNum(Integer hitNum) {
            this.hitNum = hitNum;
            return this;
        }
        public Integer getHitNum() {
            return this.hitNum;
        }

        public DescribeDialogueNodeStatisticsResponseBodyNoAnswerDialogueNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDialogueNodeStatisticsResponseBodyNoAnswerDialogueNodes setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDialogueNodeStatisticsResponseBodyNoAnswerDialogueNodes setNoAnswerNum(Integer noAnswerNum) {
            this.noAnswerNum = noAnswerNum;
            return this;
        }
        public Integer getNoAnswerNum() {
            return this.noAnswerNum;
        }

        public DescribeDialogueNodeStatisticsResponseBodyNoAnswerDialogueNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeDialogueNodeStatisticsResponseBodyNoAnswerDialogueNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

}
