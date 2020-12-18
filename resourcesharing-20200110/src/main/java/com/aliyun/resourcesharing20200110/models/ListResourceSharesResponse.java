// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceSharesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("ResourceShares")
    @Validation(required = true)
    public java.util.List<ListResourceSharesResponseResourceShares> resourceShares;

    public static ListResourceSharesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceSharesResponse self = new ListResourceSharesResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceSharesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceSharesResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceSharesResponse setResourceShares(java.util.List<ListResourceSharesResponseResourceShares> resourceShares) {
        this.resourceShares = resourceShares;
        return this;
    }
    public java.util.List<ListResourceSharesResponseResourceShares> getResourceShares() {
        return this.resourceShares;
    }

    public static class ListResourceSharesResponseResourceShares extends TeaModel {
        @NameInMap("ResourceShareId")
        @Validation(required = true)
        public String resourceShareId;

        @NameInMap("ResourceShareName")
        @Validation(required = true)
        public String resourceShareName;

        @NameInMap("ResourceShareOwner")
        @Validation(required = true)
        public String resourceShareOwner;

        @NameInMap("ResourceShareStatus")
        @Validation(required = true)
        public String resourceShareStatus;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        public static ListResourceSharesResponseResourceShares build(java.util.Map<String, ?> map) throws Exception {
            ListResourceSharesResponseResourceShares self = new ListResourceSharesResponseResourceShares();
            return TeaModel.build(map, self);
        }

        public ListResourceSharesResponseResourceShares setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public ListResourceSharesResponseResourceShares setResourceShareName(String resourceShareName) {
            this.resourceShareName = resourceShareName;
            return this;
        }
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        public ListResourceSharesResponseResourceShares setResourceShareOwner(String resourceShareOwner) {
            this.resourceShareOwner = resourceShareOwner;
            return this;
        }
        public String getResourceShareOwner() {
            return this.resourceShareOwner;
        }

        public ListResourceSharesResponseResourceShares setResourceShareStatus(String resourceShareStatus) {
            this.resourceShareStatus = resourceShareStatus;
            return this;
        }
        public String getResourceShareStatus() {
            return this.resourceShareStatus;
        }

        public ListResourceSharesResponseResourceShares setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourceSharesResponseResourceShares setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
