// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeStacksResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Stacks")
    public DescribeStacksResponseBodyStacks stacks;

    @NameInMap("Code")
    public String code;

    public static DescribeStacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStacksResponseBody self = new DescribeStacksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStacksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeStacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStacksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeStacksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStacksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStacksResponseBody setStacks(DescribeStacksResponseBodyStacks stacks) {
        this.stacks = stacks;
        return this;
    }
    public DescribeStacksResponseBodyStacks getStacks() {
        return this.stacks;
    }

    public DescribeStacksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeStacksResponseBodyStacksStack extends TeaModel {
        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("StackId")
        public String stackId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("RecommendedStack")
        public Boolean recommendedStack;

        @NameInMap("StackName")
        public String stackName;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("VersionCode")
        public Integer versionCode;

        @NameInMap("LatestStack")
        public Boolean latestStack;

        public static DescribeStacksResponseBodyStacksStack build(java.util.Map<String, ?> map) throws Exception {
            DescribeStacksResponseBodyStacksStack self = new DescribeStacksResponseBodyStacksStack();
            return TeaModel.build(map, self);
        }

        public DescribeStacksResponseBodyStacksStack setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeStacksResponseBodyStacksStack setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public DescribeStacksResponseBodyStacksStack setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeStacksResponseBodyStacksStack setRecommendedStack(Boolean recommendedStack) {
            this.recommendedStack = recommendedStack;
            return this;
        }
        public Boolean getRecommendedStack() {
            return this.recommendedStack;
        }

        public DescribeStacksResponseBodyStacksStack setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public DescribeStacksResponseBodyStacksStack setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeStacksResponseBodyStacksStack setVersionCode(Integer versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public Integer getVersionCode() {
            return this.versionCode;
        }

        public DescribeStacksResponseBodyStacksStack setLatestStack(Boolean latestStack) {
            this.latestStack = latestStack;
            return this;
        }
        public Boolean getLatestStack() {
            return this.latestStack;
        }

    }

    public static class DescribeStacksResponseBodyStacks extends TeaModel {
        @NameInMap("Stack")
        public java.util.List<DescribeStacksResponseBodyStacksStack> stack;

        public static DescribeStacksResponseBodyStacks build(java.util.Map<String, ?> map) throws Exception {
            DescribeStacksResponseBodyStacks self = new DescribeStacksResponseBodyStacks();
            return TeaModel.build(map, self);
        }

        public DescribeStacksResponseBodyStacks setStack(java.util.List<DescribeStacksResponseBodyStacksStack> stack) {
            this.stack = stack;
            return this;
        }
        public java.util.List<DescribeStacksResponseBodyStacksStack> getStack() {
            return this.stack;
        }

    }

}
