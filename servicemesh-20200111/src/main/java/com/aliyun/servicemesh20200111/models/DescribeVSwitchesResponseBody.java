// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeVSwitchesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("VSwitches")
    public java.util.List<DescribeVSwitchesResponseBodyVSwitches> vSwitches;

    public static DescribeVSwitchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchesResponseBody self = new DescribeVSwitchesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVSwitchesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeVSwitchesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeVSwitchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVSwitchesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVSwitchesResponseBody setVSwitches(java.util.List<DescribeVSwitchesResponseBodyVSwitches> vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public java.util.List<DescribeVSwitchesResponseBodyVSwitches> getVSwitches() {
        return this.vSwitches;
    }

    public static class DescribeVSwitchesResponseBodyVSwitches extends TeaModel {
        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("Status")
        public String status;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VSwitchName")
        public String vSwitchName;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeVSwitchesResponseBodyVSwitches build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseBodyVSwitches self = new DescribeVSwitchesResponseBodyVSwitches();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchesResponseBodyVSwitches setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeVSwitchesResponseBodyVSwitches setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVSwitchesResponseBodyVSwitches setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeVSwitchesResponseBodyVSwitches setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        public DescribeVSwitchesResponseBodyVSwitches setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
