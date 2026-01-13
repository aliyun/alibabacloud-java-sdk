// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class ListVpcInfoByInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>mkdd-test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>44FDC379-4443-560E-B652-9F7476D8854F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("VpcInfos")
    public java.util.List<ListVpcInfoByInstanceResponseBodyVpcInfos> vpcInfos;

    public static ListVpcInfoByInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcInfoByInstanceResponseBody self = new ListVpcInfoByInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcInfoByInstanceResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListVpcInfoByInstanceResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListVpcInfoByInstanceResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVpcInfoByInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcInfoByInstanceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListVpcInfoByInstanceResponseBody setVpcInfos(java.util.List<ListVpcInfoByInstanceResponseBodyVpcInfos> vpcInfos) {
        this.vpcInfos = vpcInfos;
        return this;
    }
    public java.util.List<ListVpcInfoByInstanceResponseBodyVpcInfos> getVpcInfos() {
        return this.vpcInfos;
    }

    public static class ListVpcInfoByInstanceResponseBodyVpcInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://xu6666-mkdd-test.cn-hangzhou.vpc.ots.aliyuncs.com">http://xu6666-mkdd-test.cn-hangzhou.vpc.ots.aliyuncs.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p><a href="http://172.**.***.34:80/">http://172.**.***.34:80/</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <strong>example:</strong>
         * <p>xu6666</p>
         */
        @NameInMap("InstanceVpcName")
        public String instanceVpcName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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

        public static ListVpcInfoByInstanceResponseBodyVpcInfos build(java.util.Map<String, ?> map) throws Exception {
            ListVpcInfoByInstanceResponseBodyVpcInfos self = new ListVpcInfoByInstanceResponseBodyVpcInfos();
            return TeaModel.build(map, self);
        }

        public ListVpcInfoByInstanceResponseBodyVpcInfos setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListVpcInfoByInstanceResponseBodyVpcInfos setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListVpcInfoByInstanceResponseBodyVpcInfos setInstanceVpcName(String instanceVpcName) {
            this.instanceVpcName = instanceVpcName;
            return this;
        }
        public String getInstanceVpcName() {
            return this.instanceVpcName;
        }

        public ListVpcInfoByInstanceResponseBodyVpcInfos setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public ListVpcInfoByInstanceResponseBodyVpcInfos setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
