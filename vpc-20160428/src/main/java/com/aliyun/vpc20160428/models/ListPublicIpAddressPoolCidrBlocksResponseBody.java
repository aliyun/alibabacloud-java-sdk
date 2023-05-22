// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListPublicIpAddressPoolCidrBlocksResponseBody extends TeaModel {
    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** was not returned, it indicates that no additional results exist.</p>
     * <p>*   If **NextToken** is returned, the value is the token that is used for the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("PublicIpPoolCidrBlockList")
    public java.util.List<ListPublicIpAddressPoolCidrBlocksResponseBodyPublicIpPoolCidrBlockList> publicIpPoolCidrBlockList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The maximum number of entries returned. Valid values: **10** to **100**. Default value: **10**.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPublicIpAddressPoolCidrBlocksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublicIpAddressPoolCidrBlocksResponseBody self = new ListPublicIpAddressPoolCidrBlocksResponseBody();
        return TeaModel.build(map, self);
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
        /**
         * <p>The ID of the IP address pool.</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The CIDR blocks.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The information about the CIDR blocks.</p>
         */
        @NameInMap("PublicIpAddressPoolId")
        public String publicIpAddressPoolId;

        /**
         * <p>The time when the CIDR block was created. The time is displayed in `YYYY-MM-DDThh:mm:ssZ` format.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The total number of available IP addresses in the CIDR block.</p>
         */
        @NameInMap("TotalIpNum")
        public Integer totalIpNum;

        /**
         * <p>The status of the CIDR block in the IP address pool. Valid values:</p>
         * <br>
         * <p>*   **Created**: available</p>
         * <p>*   **Deleting**: being deleted</p>
         * <p>*   **Modifying**: being modified</p>
         */
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
