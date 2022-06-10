// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListPublicIpAddressPoolCidrBlocksResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PublicIpPoolCidrBlockList")
    public java.util.List<ListPublicIpAddressPoolCidrBlocksResponseBodyPublicIpPoolCidrBlockList> publicIpPoolCidrBlockList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPublicIpAddressPoolCidrBlocksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublicIpAddressPoolCidrBlocksResponseBody self = new ListPublicIpAddressPoolCidrBlocksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublicIpAddressPoolCidrBlocksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPublicIpAddressPoolCidrBlocksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicIpAddressPoolCidrBlocksResponseBody setPublicIpPoolCidrBlockList(java.util.List<ListPublicIpAddressPoolCidrBlocksResponseBodyPublicIpPoolCidrBlockList> publicIpPoolCidrBlockList) {
        this.publicIpPoolCidrBlockList = publicIpPoolCidrBlockList;
        return this;
    }
    public java.util.List<ListPublicIpAddressPoolCidrBlocksResponseBodyPublicIpPoolCidrBlockList> getPublicIpPoolCidrBlockList() {
        return this.publicIpPoolCidrBlockList;
    }

    public ListPublicIpAddressPoolCidrBlocksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPublicIpAddressPoolCidrBlocksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPublicIpAddressPoolCidrBlocksResponseBodyPublicIpPoolCidrBlockList extends TeaModel {
        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("PublicIpAddressPoolId")
        public String publicIpAddressPoolId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalIpNum")
        public Integer totalIpNum;

        @NameInMap("UsedIpNum")
        public Integer usedIpNum;

        public static ListPublicIpAddressPoolCidrBlocksResponseBodyPublicIpPoolCidrBlockList build(java.util.Map<String, ?> map) throws Exception {
            ListPublicIpAddressPoolCidrBlocksResponseBodyPublicIpPoolCidrBlockList self = new ListPublicIpAddressPoolCidrBlocksResponseBodyPublicIpPoolCidrBlockList();
            return TeaModel.build(map, self);
        }

        public ListPublicIpAddressPoolCidrBlocksResponseBodyPublicIpPoolCidrBlockList setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public ListPublicIpAddressPoolCidrBlocksResponseBodyPublicIpPoolCidrBlockList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListPublicIpAddressPoolCidrBlocksResponseBodyPublicIpPoolCidrBlockList setPublicIpAddressPoolId(String publicIpAddressPoolId) {
            this.publicIpAddressPoolId = publicIpAddressPoolId;
            return this;
        }
        public String getPublicIpAddressPoolId() {
            return this.publicIpAddressPoolId;
        }

        public ListPublicIpAddressPoolCidrBlocksResponseBodyPublicIpPoolCidrBlockList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPublicIpAddressPoolCidrBlocksResponseBodyPublicIpPoolCidrBlockList setTotalIpNum(Integer totalIpNum) {
            this.totalIpNum = totalIpNum;
            return this;
        }
        public Integer getTotalIpNum() {
            return this.totalIpNum;
        }

        public ListPublicIpAddressPoolCidrBlocksResponseBodyPublicIpPoolCidrBlockList setUsedIpNum(Integer usedIpNum) {
            this.usedIpNum = usedIpNum;
            return this;
        }
        public Integer getUsedIpNum() {
            return this.usedIpNum;
        }

    }

}
