// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClientConfStrategyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5BD95679-D63A-4151-97D0-188432F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the configurations.</p>
     */
    @NameInMap("TargetList")
    public java.util.List<DescribeClientConfStrategyResponseBodyTargetList> targetList;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeClientConfStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientConfStrategyResponseBody self = new DescribeClientConfStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClientConfStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClientConfStrategyResponseBody setTargetList(java.util.List<DescribeClientConfStrategyResponseBodyTargetList> targetList) {
        this.targetList = targetList;
        return this;
    }
    public java.util.List<DescribeClientConfStrategyResponseBodyTargetList> getTargetList() {
        return this.targetList;
    }

    public DescribeClientConfStrategyResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeClientConfStrategyResponseBodyTargetList extends TeaModel {
        /**
         * <p>The UUID of the Security Center agent.</p>
         * 
         * <strong>example:</strong>
         * <p>2b1753a6-04d9-448e-ad17-7abdf19f****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeClientConfStrategyResponseBodyTargetList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClientConfStrategyResponseBodyTargetList self = new DescribeClientConfStrategyResponseBodyTargetList();
            return TeaModel.build(map, self);
        }

        public DescribeClientConfStrategyResponseBodyTargetList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
