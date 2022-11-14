// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteEntriesResponseBody extends TeaModel {
    @NameInMap("FailedCount")
    public Integer failedCount;

    @NameInMap("FailedRouteEntries")
    public java.util.List<CreateRouteEntriesResponseBodyFailedRouteEntries> failedRouteEntries;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RouteEntryIds")
    public java.util.List<String> routeEntryIds;

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
        @NameInMap("DstCidrBlock")
        public String dstCidrBlock;

        @NameInMap("FailedCode")
        public String failedCode;

        @NameInMap("FailedMessage")
        public String failedMessage;

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
