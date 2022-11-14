// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteRouteEntriesResponseBody extends TeaModel {
    @NameInMap("FailedCount")
    public Integer failedCount;

    @NameInMap("FailedRouteEntries")
    public java.util.List<DeleteRouteEntriesResponseBodyFailedRouteEntries> failedRouteEntries;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DstCidrBlock")
        public String dstCidrBlock;

        @NameInMap("FailedCode")
        public String failedCode;

        @NameInMap("FailedMessage")
        public String failedMessage;

        @NameInMap("NextHop")
        public String nextHop;

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
