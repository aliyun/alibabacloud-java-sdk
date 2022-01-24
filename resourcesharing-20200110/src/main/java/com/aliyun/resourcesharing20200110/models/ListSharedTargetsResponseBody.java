// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListSharedTargetsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SharedTargets")
    public java.util.List<ListSharedTargetsResponseBodySharedTargets> sharedTargets;

    public static ListSharedTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSharedTargetsResponseBody self = new ListSharedTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSharedTargetsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSharedTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSharedTargetsResponseBody setSharedTargets(java.util.List<ListSharedTargetsResponseBodySharedTargets> sharedTargets) {
        this.sharedTargets = sharedTargets;
        return this;
    }
    public java.util.List<ListSharedTargetsResponseBodySharedTargets> getSharedTargets() {
        return this.sharedTargets;
    }

    public static class ListSharedTargetsResponseBodySharedTargets extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ResourceShareId")
        public String resourceShareId;

        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListSharedTargetsResponseBodySharedTargets build(java.util.Map<String, ?> map) throws Exception {
            ListSharedTargetsResponseBodySharedTargets self = new ListSharedTargetsResponseBodySharedTargets();
            return TeaModel.build(map, self);
        }

        public ListSharedTargetsResponseBodySharedTargets setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSharedTargetsResponseBodySharedTargets setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public ListSharedTargetsResponseBodySharedTargets setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListSharedTargetsResponseBodySharedTargets setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
