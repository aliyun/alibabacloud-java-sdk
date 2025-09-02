// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpcGrantRulesToEcrResponseBody extends TeaModel {
    @NameInMap("GrantRuleModels")
    public java.util.List<DescribeVpcGrantRulesToEcrResponseBodyGrantRuleModels> grantRuleModels;

    /**
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>66342E8E-5E87-5FF9-80C7-C3E3571A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeVpcGrantRulesToEcrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcGrantRulesToEcrResponseBody self = new DescribeVpcGrantRulesToEcrResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcGrantRulesToEcrResponseBody setGrantRuleModels(java.util.List<DescribeVpcGrantRulesToEcrResponseBodyGrantRuleModels> grantRuleModels) {
        this.grantRuleModels = grantRuleModels;
        return this;
    }
    public java.util.List<DescribeVpcGrantRulesToEcrResponseBodyGrantRuleModels> getGrantRuleModels() {
        return this.grantRuleModels;
    }

    public DescribeVpcGrantRulesToEcrResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeVpcGrantRulesToEcrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcGrantRulesToEcrResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVpcGrantRulesToEcrResponseBodyGrantRuleModels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-09-09T02:14:51Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>ecr-tz7w3chlaptxr2****</p>
         */
        @NameInMap("EcrId")
        public String ecrId;

        /**
         * <strong>example:</strong>
         * <p>192732132151****</p>
         */
        @NameInMap("EcrOwnerId")
        public Long ecrOwnerId;

        /**
         * <strong>example:</strong>
         * <p>vpc-wz9ek66wd7tl5xqpy****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>192745367151****</p>
         */
        @NameInMap("InstanceUid")
        public Long instanceUid;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeVpcGrantRulesToEcrResponseBodyGrantRuleModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcGrantRulesToEcrResponseBodyGrantRuleModels self = new DescribeVpcGrantRulesToEcrResponseBodyGrantRuleModels();
            return TeaModel.build(map, self);
        }

        public DescribeVpcGrantRulesToEcrResponseBodyGrantRuleModels setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeVpcGrantRulesToEcrResponseBodyGrantRuleModels setEcrId(String ecrId) {
            this.ecrId = ecrId;
            return this;
        }
        public String getEcrId() {
            return this.ecrId;
        }

        public DescribeVpcGrantRulesToEcrResponseBodyGrantRuleModels setEcrOwnerId(Long ecrOwnerId) {
            this.ecrOwnerId = ecrOwnerId;
            return this;
        }
        public Long getEcrOwnerId() {
            return this.ecrOwnerId;
        }

        public DescribeVpcGrantRulesToEcrResponseBodyGrantRuleModels setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeVpcGrantRulesToEcrResponseBodyGrantRuleModels setInstanceUid(Long instanceUid) {
            this.instanceUid = instanceUid;
            return this;
        }
        public Long getInstanceUid() {
            return this.instanceUid;
        }

        public DescribeVpcGrantRulesToEcrResponseBodyGrantRuleModels setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeVpcGrantRulesToEcrResponseBodyGrantRuleModels setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
