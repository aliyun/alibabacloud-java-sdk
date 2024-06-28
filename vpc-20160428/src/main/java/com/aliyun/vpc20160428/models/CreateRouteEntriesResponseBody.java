// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteEntriesResponseBody extends TeaModel {
    /**
     * <p>The number of custom route entries that failed to be added.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FailedCount")
    public Integer failedCount;

    /**
     * <p>The details about the custom route entry that failed to be added.</p>
     */
    @NameInMap("FailedRouteEntries")
    public java.util.List<CreateRouteEntriesResponseBodyFailedRouteEntries> failedRouteEntries;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the ID of the custom route entry that was successfully added.</p>
     */
    @NameInMap("RouteEntryIds")
    public java.util.List<String> routeEntryIds;

    /**
     * <p>The number of custom route entries that were successfully added.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SuccessCount")
    public Integer successCount;

    public static CreateRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteEntriesResponseBody self = new CreateRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRouteEntriesResponseBody setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Integer getFailedCount() {
        return this.failedCount;
    }

    public CreateRouteEntriesResponseBody setFailedRouteEntries(java.util.List<CreateRouteEntriesResponseBodyFailedRouteEntries> failedRouteEntries) {
        this.failedRouteEntries = failedRouteEntries;
        return this;
    }
    public java.util.List<CreateRouteEntriesResponseBodyFailedRouteEntries> getFailedRouteEntries() {
        return this.failedRouteEntries;
    }

    public CreateRouteEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRouteEntriesResponseBody setRouteEntryIds(java.util.List<String> routeEntryIds) {
        this.routeEntryIds = routeEntryIds;
        return this;
    }
    public java.util.List<String> getRouteEntryIds() {
        return this.routeEntryIds;
    }

    public CreateRouteEntriesResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public static class CreateRouteEntriesResponseBodyFailedRouteEntries extends TeaModel {
        /**
         * <p>The destination CIDR block of the custom route entry that failed to be added.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/24</p>
         */
        @NameInMap("DstCidrBlock")
        public String dstCidrBlock;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC_ROUTE_ENTRY_CIDR_BLOCK_DUPLICATE</p>
         */
        @NameInMap("FailedCode")
        public String failedCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Specified CIDR block is already exists, entry.cidrBlock=xxxx</p>
         */
        @NameInMap("FailedMessage")
        public String failedMessage;

        /**
         * <p>The ID of the next hop of the custom route entry that failed to be added.</p>
         * 
         * <strong>example:</strong>
         * <p>i-j6c2fp57q8rr4jlu****</p>
         */
        @NameInMap("NextHop")
        public String nextHop;

        public static CreateRouteEntriesResponseBodyFailedRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            CreateRouteEntriesResponseBodyFailedRouteEntries self = new CreateRouteEntriesResponseBodyFailedRouteEntries();
            return TeaModel.build(map, self);
        }

        public CreateRouteEntriesResponseBodyFailedRouteEntries setDstCidrBlock(String dstCidrBlock) {
            this.dstCidrBlock = dstCidrBlock;
            return this;
        }
        public String getDstCidrBlock() {
            return this.dstCidrBlock;
        }

        public CreateRouteEntriesResponseBodyFailedRouteEntries setFailedCode(String failedCode) {
            this.failedCode = failedCode;
            return this;
        }
        public String getFailedCode() {
            return this.failedCode;
        }

        public CreateRouteEntriesResponseBodyFailedRouteEntries setFailedMessage(String failedMessage) {
            this.failedMessage = failedMessage;
            return this;
        }
        public String getFailedMessage() {
            return this.failedMessage;
        }

        public CreateRouteEntriesResponseBodyFailedRouteEntries setNextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public String getNextHop() {
            return this.nextHop;
        }

    }

}
