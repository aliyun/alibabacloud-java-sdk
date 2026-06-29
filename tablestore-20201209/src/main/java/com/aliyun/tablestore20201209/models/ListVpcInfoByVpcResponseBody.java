// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class ListVpcInfoByVpcResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4141784E-91FF-56E3-9371-FD011FF876F4</p>
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
     * <p>The ID of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1***********0mh8</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The details of the VPCs.</p>
     */
    @NameInMap("VpcInfos")
    public java.util.List<ListVpcInfoByVpcResponseBodyVpcInfos> vpcInfos;

    public static ListVpcInfoByVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcInfoByVpcResponseBody self = new ListVpcInfoByVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcInfoByVpcResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListVpcInfoByVpcResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVpcInfoByVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcInfoByVpcResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListVpcInfoByVpcResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ListVpcInfoByVpcResponseBody setVpcInfos(java.util.List<ListVpcInfoByVpcResponseBodyVpcInfos> vpcInfos) {
        this.vpcInfos = vpcInfos;
        return this;
    }
    public java.util.List<ListVpcInfoByVpcResponseBodyVpcInfos> getVpcInfos() {
        return this.vpcInfos;
    }

    public static class ListVpcInfoByVpcResponseBodyVpcInfos extends TeaModel {
        /**
         * <p>The VPC endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xu6666-mkdd-test.cn-hangzhou.vpc.ots.aliyuncs.com">http://xu6666-mkdd-test.cn-hangzhou.vpc.ots.aliyuncs.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://172.**.***.34:80/">http://172.**.***.34:80/</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mkdd-test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The name of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>xu6666</p>
         */
        @NameInMap("InstanceVpcName")
        public String instanceVpcName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        public static ListVpcInfoByVpcResponseBodyVpcInfos build(java.util.Map<String, ?> map) throws Exception {
            ListVpcInfoByVpcResponseBodyVpcInfos self = new ListVpcInfoByVpcResponseBodyVpcInfos();
            return TeaModel.build(map, self);
        }

        public ListVpcInfoByVpcResponseBodyVpcInfos setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListVpcInfoByVpcResponseBodyVpcInfos setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListVpcInfoByVpcResponseBodyVpcInfos setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListVpcInfoByVpcResponseBodyVpcInfos setInstanceVpcName(String instanceVpcName) {
            this.instanceVpcName = instanceVpcName;
            return this;
        }
        public String getInstanceVpcName() {
            return this.instanceVpcName;
        }

        public ListVpcInfoByVpcResponseBodyVpcInfos setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

    }

}
