// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListPublicIpAddressPoolCidrBlocksResponseBody extends TeaModel {
    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> was not returned, it indicates that no additional results exist.</li>
     * <li>If <strong>NextToken</strong> is returned, the value is the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
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
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The maximum number of entries returned. Valid values: <strong>10</strong> to <strong>100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
         * 
         * <strong>example:</strong>
         * <p>47.0.XX.XX/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The CIDR blocks.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-10T01:37:38Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The information about the CIDR blocks.</p>
         * 
         * <strong>example:</strong>
         * <p>pippool-6wetvn6fumkgycssx****</p>
         */
        @NameInMap("PublicIpAddressPoolId")
        public String publicIpAddressPoolId;

        /**
         * <p>The time when the CIDR block was created. The time is displayed in <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The total number of available IP addresses in the CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalIpNum")
        public Integer totalIpNum;

        /**
         * <p>The status of the CIDR block in the IP address pool. Valid values:</p>
         * <ul>
         * <li><strong>Created</strong>: available</li>
         * <li><strong>Deleting</strong>: being deleted</li>
         * <li><strong>Modifying</strong>: being modified</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
