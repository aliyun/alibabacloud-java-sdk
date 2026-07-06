// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class ListVpcInfoByAgentStorageResponseBody extends TeaModel {
    /**
     * <p>The agent storage name.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-test</p>
     */
    @NameInMap("AgentStorageName")
    public String agentStorageName;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID, which can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>39871ED2-62C0-578F-A32E-B88072D5582F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of VPCs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The VPC details.</p>
     */
    @NameInMap("VpcInfos")
    public java.util.List<ListVpcInfoByAgentStorageResponseBodyVpcInfos> vpcInfos;

    public static ListVpcInfoByAgentStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcInfoByAgentStorageResponseBody self = new ListVpcInfoByAgentStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcInfoByAgentStorageResponseBody setAgentStorageName(String agentStorageName) {
        this.agentStorageName = agentStorageName;
        return this;
    }
    public String getAgentStorageName() {
        return this.agentStorageName;
    }

    public ListVpcInfoByAgentStorageResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListVpcInfoByAgentStorageResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVpcInfoByAgentStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcInfoByAgentStorageResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListVpcInfoByAgentStorageResponseBody setVpcInfos(java.util.List<ListVpcInfoByAgentStorageResponseBodyVpcInfos> vpcInfos) {
        this.vpcInfos = vpcInfos;
        return this;
    }
    public java.util.List<ListVpcInfoByAgentStorageResponseBodyVpcInfos> getVpcInfos() {
        return this.vpcInfos;
    }

    public static class ListVpcInfoByAgentStorageResponseBodyVpcInfos extends TeaModel {
        /**
         * <p>The VPC name.</p>
         * 
         * <strong>example:</strong>
         * <p>remua</p>
         */
        @NameInMap("AgentStorageVpcName")
        public String agentStorageVpcName;

        /**
         * <p>The VPC access address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://remua-agent-test.cn-beijing.vpc.ots.aliyuncs.com">http://remua-agent-test.cn-beijing.vpc.ots.aliyuncs.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The endpoint of the agent storage.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://172.**.***.34:80/">http://172.**.***.34:80/</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2z***********n7w3dl</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListVpcInfoByAgentStorageResponseBodyVpcInfos build(java.util.Map<String, ?> map) throws Exception {
            ListVpcInfoByAgentStorageResponseBodyVpcInfos self = new ListVpcInfoByAgentStorageResponseBodyVpcInfos();
            return TeaModel.build(map, self);
        }

        public ListVpcInfoByAgentStorageResponseBodyVpcInfos setAgentStorageVpcName(String agentStorageVpcName) {
            this.agentStorageVpcName = agentStorageVpcName;
            return this;
        }
        public String getAgentStorageVpcName() {
            return this.agentStorageVpcName;
        }

        public ListVpcInfoByAgentStorageResponseBodyVpcInfos setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListVpcInfoByAgentStorageResponseBodyVpcInfos setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListVpcInfoByAgentStorageResponseBodyVpcInfos setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public ListVpcInfoByAgentStorageResponseBodyVpcInfos setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
