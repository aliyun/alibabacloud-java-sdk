// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookNodesOutputResponseBody extends TeaModel {
    @NameInMap("PlaybookNodesOutput")
    public DescribePlaybookNodesOutputResponseBodyPlaybookNodesOutput playbookNodesOutput;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePlaybookNodesOutputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlaybookNodesOutputResponseBody self = new DescribePlaybookNodesOutputResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlaybookNodesOutputResponseBody setPlaybookNodesOutput(DescribePlaybookNodesOutputResponseBodyPlaybookNodesOutput playbookNodesOutput) {
        this.playbookNodesOutput = playbookNodesOutput;
        return this;
    }
    public DescribePlaybookNodesOutputResponseBodyPlaybookNodesOutput getPlaybookNodesOutput() {
        return this.playbookNodesOutput;
    }

    public DescribePlaybookNodesOutputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePlaybookNodesOutputResponseBodyPlaybookNodesOutput extends TeaModel {
        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("NodeOutput")
        public String nodeOutput;

        public static DescribePlaybookNodesOutputResponseBodyPlaybookNodesOutput build(java.util.Map<String, ?> map) throws Exception {
            DescribePlaybookNodesOutputResponseBodyPlaybookNodesOutput self = new DescribePlaybookNodesOutputResponseBodyPlaybookNodesOutput();
            return TeaModel.build(map, self);
        }

        public DescribePlaybookNodesOutputResponseBodyPlaybookNodesOutput setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribePlaybookNodesOutputResponseBodyPlaybookNodesOutput setNodeOutput(String nodeOutput) {
            this.nodeOutput = nodeOutput;
            return this;
        }
        public String getNodeOutput() {
            return this.nodeOutput;
        }

    }

}
