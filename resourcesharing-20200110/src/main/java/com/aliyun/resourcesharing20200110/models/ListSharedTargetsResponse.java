// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListSharedTargetsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("SharedTargets")
    @Validation(required = true)
    public java.util.List<ListSharedTargetsResponseSharedTargets> sharedTargets;

    public static ListSharedTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSharedTargetsResponse self = new ListSharedTargetsResponse();
        return TeaModel.build(map, self);
    }

    public ListSharedTargetsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSharedTargetsResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSharedTargetsResponse setSharedTargets(java.util.List<ListSharedTargetsResponseSharedTargets> sharedTargets) {
        this.sharedTargets = sharedTargets;
        return this;
    }
    public java.util.List<ListSharedTargetsResponseSharedTargets> getSharedTargets() {
        return this.sharedTargets;
    }

    public static class ListSharedTargetsResponseSharedTargets extends TeaModel {
        @NameInMap("ResourceShareId")
        @Validation(required = true)
        public String resourceShareId;

        @NameInMap("TargetId")
        @Validation(required = true)
        public String targetId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        public static ListSharedTargetsResponseSharedTargets build(java.util.Map<String, ?> map) throws Exception {
            ListSharedTargetsResponseSharedTargets self = new ListSharedTargetsResponseSharedTargets();
            return TeaModel.build(map, self);
        }

        public ListSharedTargetsResponseSharedTargets setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public ListSharedTargetsResponseSharedTargets setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListSharedTargetsResponseSharedTargets setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSharedTargetsResponseSharedTargets setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
