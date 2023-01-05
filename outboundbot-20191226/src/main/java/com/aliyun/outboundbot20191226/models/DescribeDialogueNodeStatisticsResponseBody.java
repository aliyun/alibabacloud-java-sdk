// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeDialogueNodeStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Message")
    public String message;

    @NameInMap("NoAnswerDialogueNodes")
    public java.util.List<DescribeDialogueNodeStatisticsResponseBodyNoAnswerDialogueNodes> noAnswerDialogueNodes;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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

    public static class DescribeDialogueNodeStatisticsResponseBodyNoAnswerDialogueNodes extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("HangUpNum")
        public Integer hangUpNum;

        @NameInMap("HitNum")
        public Integer hitNum;

        // id
        @NameInMap("Id")
        public String id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("NoAnswerNum")
        public Integer noAnswerNum;

        @NameInMap("NodeId")
        public String nodeId;

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
