// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClientConfStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TargetList")
    public java.util.List<DescribeClientConfStrategyResponseBodyTargetList> targetList;

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
