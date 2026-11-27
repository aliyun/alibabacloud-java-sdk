// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeUsageOverallDataResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The usage overview data list.</p>
     */
    @NameInMap("UsageOverallData")
    public java.util.List<DescribeUsageOverallDataResponseBodyUsageOverallData> usageOverallData;

    public static DescribeUsageOverallDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageOverallDataResponseBody self = new DescribeUsageOverallDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUsageOverallDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUsageOverallDataResponseBody setUsageOverallData(java.util.List<DescribeUsageOverallDataResponseBodyUsageOverallData> usageOverallData) {
        this.usageOverallData = usageOverallData;
        return this;
    }
    public java.util.List<DescribeUsageOverallDataResponseBodyUsageOverallData> getUsageOverallData() {
        return this.usageOverallData;
    }

    public static class DescribeUsageOverallDataResponseBodyUsageOverallDataNodes extends TeaModel {
        /**
         * <p>The x-axis coordinate in the metric trends chart.</p>
         * 
         * <strong>example:</strong>
         * <p>1615824000</p>
         */
        @NameInMap("X")
        public String x;

        /**
         * <p>The y-axis coordinate in the metric trends chart.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Y")
        public String y;

        public static DescribeUsageOverallDataResponseBodyUsageOverallDataNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsageOverallDataResponseBodyUsageOverallDataNodes self = new DescribeUsageOverallDataResponseBodyUsageOverallDataNodes();
            return TeaModel.build(map, self);
        }

        public DescribeUsageOverallDataResponseBodyUsageOverallDataNodes setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public DescribeUsageOverallDataResponseBodyUsageOverallDataNodes setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

    }

    public static class DescribeUsageOverallDataResponseBodyUsageOverallData extends TeaModel {
        /**
         * <p>The list of coordinate points for the metric trends chart.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<DescribeUsageOverallDataResponseBodyUsageOverallDataNodes> nodes;

        /**
         * <p>The queried metric type.</p>
         * 
         * <strong>example:</strong>
         * <p>ONLINE_USER_PEAK</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeUsageOverallDataResponseBodyUsageOverallData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsageOverallDataResponseBodyUsageOverallData self = new DescribeUsageOverallDataResponseBodyUsageOverallData();
            return TeaModel.build(map, self);
        }

        public DescribeUsageOverallDataResponseBodyUsageOverallData setNodes(java.util.List<DescribeUsageOverallDataResponseBodyUsageOverallDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeUsageOverallDataResponseBodyUsageOverallDataNodes> getNodes() {
            return this.nodes;
        }

        public DescribeUsageOverallDataResponseBodyUsageOverallData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
