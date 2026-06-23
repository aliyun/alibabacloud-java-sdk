// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpcGrantRulesToEcrResponseBody extends TeaModel {
    /**
     * <p>A list of authorization rules.</p>
     */
    @NameInMap("GrantRuleModels")
    public java.util.List<DescribeVpcGrantRulesToEcrResponseBodyGrantRuleModels> grantRuleModels;

    /**
     * <p>The pagination token for the next page of results. A non-empty value indicates that more results are available. If this parameter is not returned or is empty, all results have been retrieved.</p>
     * <ul>
     * <li><p>If <strong>NextToken</strong> is empty, there are no more queries.</p>
     * </li>
     * <li><p>If <strong>NextToken</strong> has a value, the value is the token to start the next query.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>66342E8E-5E87-5FF9-80C7-C3E3571A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries. Note: When you perform a paged query by using the <code>MaxResults</code> and <code>NextToken</code> parameters, the value of this parameter is for reference only.</p>
     * 
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
         * <p>The time when the authorization was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-09T02:14:51Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the Express Connect Router.</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-tz7w3chlaptxr2****</p>
         */
        @NameInMap("EcrId")
        public String ecrId;

        /**
         * <p>The ID of the Alibaba Cloud account (main account) that owns the Express Connect Router.</p>
         * 
         * <strong>example:</strong>
         * <p>192732132151****</p>
         */
        @NameInMap("EcrOwnerId")
        public Long ecrOwnerId;

        /**
         * <p>The ID of the network instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9ek66wd7tl5xqpy****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the Alibaba Cloud account (main account) that owns the network instance.</p>
         * 
         * <strong>example:</strong>
         * <p>192745367151****</p>
         */
        @NameInMap("InstanceUid")
        public Long instanceUid;

        /**
         * <p>The ID of the region where the network instance is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The type of the network instance. Valid values:</p>
         * <ul>
         * <li><p><strong>VBR</strong>: virtual border router</p>
         * </li>
         * <li><p><strong>VPC</strong>: Virtual Private Cloud</p>
         * </li>
         * </ul>
         * 
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
