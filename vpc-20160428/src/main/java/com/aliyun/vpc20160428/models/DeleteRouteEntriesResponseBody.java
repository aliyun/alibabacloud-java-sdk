// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteRouteEntriesResponseBody extends TeaModel {
    /**
     * <p>The number of route entries that failed to be deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FailedCount")
    public Integer failedCount;

    /**
     * <p>The information about the route entry that failed to be deleted.</p>
     */
    @NameInMap("FailedRouteEntries")
    public java.util.List<DeleteRouteEntriesResponseBodyFailedRouteEntries> failedRouteEntries;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of route entries that were deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SuccessCount")
    public Integer successCount;

    public static DeleteRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteEntriesResponseBody self = new DeleteRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRouteEntriesResponseBody setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Integer getFailedCount() {
        return this.failedCount;
    }

    public DeleteRouteEntriesResponseBody setFailedRouteEntries(java.util.List<DeleteRouteEntriesResponseBodyFailedRouteEntries> failedRouteEntries) {
        this.failedRouteEntries = failedRouteEntries;
        return this;
    }
    public java.util.List<DeleteRouteEntriesResponseBodyFailedRouteEntries> getFailedRouteEntries() {
        return this.failedRouteEntries;
    }

    public DeleteRouteEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRouteEntriesResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public static class DeleteRouteEntriesResponseBodyFailedRouteEntries extends TeaModel {
        /**
         * <p>The destination CIDR block of the route entry that failed to be deleted. IPv4 and IPv6 CIDR blocks are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/24</p>
         */
        @NameInMap("DstCidrBlock")
        public String dstCidrBlock;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC_ROUTER_ENTRY_NOT_EXIST</p>
         */
        @NameInMap("FailedCode")
        public String failedCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>vRouterEntry not exists</p>
         */
        @NameInMap("FailedMessage")
        public String failedMessage;

        /**
         * <p>The ID of the next hop that failed to be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>i-j6c2fp57q8rr4jlu****</p>
         */
        @NameInMap("NextHop")
        public String nextHop;

        /**
         * <p>The ID of the route entry that failed to be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>rte-bp1mnnr2al0naomnpv****</p>
         */
        @NameInMap("RouteEntryId")
        public String routeEntryId;

        public static DeleteRouteEntriesResponseBodyFailedRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            DeleteRouteEntriesResponseBodyFailedRouteEntries self = new DeleteRouteEntriesResponseBodyFailedRouteEntries();
            return TeaModel.build(map, self);
        }

        public DeleteRouteEntriesResponseBodyFailedRouteEntries setDstCidrBlock(String dstCidrBlock) {
            this.dstCidrBlock = dstCidrBlock;
            return this;
        }
        public String getDstCidrBlock() {
            return this.dstCidrBlock;
        }

        public DeleteRouteEntriesResponseBodyFailedRouteEntries setFailedCode(String failedCode) {
            this.failedCode = failedCode;
            return this;
        }
        public String getFailedCode() {
            return this.failedCode;
        }

        public DeleteRouteEntriesResponseBodyFailedRouteEntries setFailedMessage(String failedMessage) {
            this.failedMessage = failedMessage;
            return this;
        }
        public String getFailedMessage() {
            return this.failedMessage;
        }

        public DeleteRouteEntriesResponseBodyFailedRouteEntries setNextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public String getNextHop() {
            return this.nextHop;
        }

        public DeleteRouteEntriesResponseBodyFailedRouteEntries setRouteEntryId(String routeEntryId) {
            this.routeEntryId = routeEntryId;
            return this;
        }
        public String getRouteEntryId() {
            return this.routeEntryId;
        }

    }

}
