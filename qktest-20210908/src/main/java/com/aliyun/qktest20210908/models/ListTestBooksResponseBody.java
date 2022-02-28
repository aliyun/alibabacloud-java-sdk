// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qktest20210908.models;

import com.aliyun.tea.*;

public class ListTestBooksResponseBody extends TeaModel {
    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 数组，返回示例目录。
    @NameInMap("TestBooks")
    public java.util.List<ListTestBooksResponseBodyTestBooks> testBooks;

    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTestBooksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTestBooksResponseBody self = new ListTestBooksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTestBooksResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListTestBooksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTestBooksResponseBody setTestBooks(java.util.List<ListTestBooksResponseBodyTestBooks> testBooks) {
        this.testBooks = testBooks;
        return this;
    }
    public java.util.List<ListTestBooksResponseBodyTestBooks> getTestBooks() {
        return this.testBooks;
    }

    public ListTestBooksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTestBooksResponseBodyTestBooks extends TeaModel {
        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 资源组ID
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // 资源一级ID
        @NameInMap("TestBookId")
        public String testBookId;

        // 资源名称
        @NameInMap("TestBookName")
        public String testBookName;

        public static ListTestBooksResponseBodyTestBooks build(java.util.Map<String, ?> map) throws Exception {
            ListTestBooksResponseBodyTestBooks self = new ListTestBooksResponseBodyTestBooks();
            return TeaModel.build(map, self);
        }

        public ListTestBooksResponseBodyTestBooks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTestBooksResponseBodyTestBooks setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListTestBooksResponseBodyTestBooks setTestBookId(String testBookId) {
            this.testBookId = testBookId;
            return this;
        }
        public String getTestBookId() {
            return this.testBookId;
        }

        public ListTestBooksResponseBodyTestBooks setTestBookName(String testBookName) {
            this.testBookName = testBookName;
            return this;
        }
        public String getTestBookName() {
            return this.testBookName;
        }

    }

}
