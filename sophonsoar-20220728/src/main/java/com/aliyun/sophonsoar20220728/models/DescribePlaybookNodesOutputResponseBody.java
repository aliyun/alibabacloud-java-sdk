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
     * 
     * <strong>example:</strong>
     * <p>A491170C-FE1F-520E-83D4-72ED205B72ED</p>
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
         * 
         * <strong>example:</strong>
         * <p>DataFormat_1</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The historical output data of the component node. The value is in the JSON string format. If no data is found, the parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;datalist&quot;: [
         *         {
         *             &quot;score&quot;: &quot;10&quot;,
         *             &quot;ip&quot;: &quot;1.1.1.1&quot;
         *         }
         *     ],
         *     &quot;total_data_successful&quot;: 1,
         *     &quot;filter_total_data&quot;: 1,
         *     &quot;total_data&quot;: 1,
         *     &quot;total_exe_successful&quot;: 1,
         *     &quot;total_exe&quot;: 1,
         *     &quot;total_data_with_dup&quot;: 1,
         *     &quot;filter_total_data_successful&quot;: 1,
         *     &quot;status&quot;: true
         * }</p>
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
