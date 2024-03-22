// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookNodesOutputResponseBody extends TeaModel {
    /**
     * <p>The output data of the component node.</p>
     */
    @NameInMap("PlaybookNodesOutput")
    public DescribePlaybookNodesOutputResponseBodyPlaybookNodesOutput playbookNodesOutput;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The name of the component node.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The historical output data of the component node. The value is in the JSON string format. If no data is found, the parameter is left empty.</p>
         */
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
