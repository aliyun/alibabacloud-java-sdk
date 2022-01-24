// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceSharesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceShares")
    public java.util.List<ListResourceSharesResponseBodyResourceShares> resourceShares;

    public static ListResourceSharesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceSharesResponseBody self = new ListResourceSharesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceSharesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceSharesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceSharesResponseBody setResourceShares(java.util.List<ListResourceSharesResponseBodyResourceShares> resourceShares) {
        this.resourceShares = resourceShares;
        return this;
    }
    public java.util.List<ListResourceSharesResponseBodyResourceShares> getResourceShares() {
        return this.resourceShares;
    }

    public static class ListResourceSharesResponseBodyResourceShares extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ResourceShareId")
        public String resourceShareId;

        @NameInMap("ResourceShareName")
        public String resourceShareName;

        @NameInMap("ResourceShareOwner")
        public String resourceShareOwner;

        @NameInMap("ResourceShareStatus")
        public String resourceShareStatus;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListResourceSharesResponseBodyResourceShares build(java.util.Map<String, ?> map) throws Exception {
            ListResourceSharesResponseBodyResourceShares self = new ListResourceSharesResponseBodyResourceShares();
            return TeaModel.build(map, self);
        }

        public ListResourceSharesResponseBodyResourceShares setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourceSharesResponseBodyResourceShares setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public ListResourceSharesResponseBodyResourceShares setResourceShareName(String resourceShareName) {
            this.resourceShareName = resourceShareName;
            return this;
        }
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        public ListResourceSharesResponseBodyResourceShares setResourceShareOwner(String resourceShareOwner) {
            this.resourceShareOwner = resourceShareOwner;
            return this;
        }
        public String getResourceShareOwner() {
            return this.resourceShareOwner;
        }

        public ListResourceSharesResponseBodyResourceShares setResourceShareStatus(String resourceShareStatus) {
            this.resourceShareStatus = resourceShareStatus;
            return this;
        }
        public String getResourceShareStatus() {
            return this.resourceShareStatus;
        }

        public ListResourceSharesResponseBodyResourceShares setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
