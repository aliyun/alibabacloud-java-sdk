// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoListResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the information about image repositories.</p>
     */
    @NameInMap("AddTargetCount")
    public Integer addTargetCount;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("AllTargetCount")
    public Integer allTargetCount;

    /**
     * <p>The condition by which the feature is applied. Valid values:</p>
     * <br>
     * <p>*   **image_repo**: the ID of the image repository</p>
     */
    @NameInMap("DelTargetCount")
    public Integer delTargetCount;

    /**
     * <p>DescribeImageRepoList</p>
     */
    @NameInMap("ImageRepoList")
    public java.util.List<DescribeImageRepoListResponseBodyImageRepoList> imageRepoList;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageInfo")
    public DescribeImageRepoListResponseBodyPageInfo pageInfo;

    /**
     * <p>The number of image repositories that are added to Security Center.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageRepoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageRepoListResponseBody self = new DescribeImageRepoListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageRepoListResponseBody setAddTargetCount(Integer addTargetCount) {
        this.addTargetCount = addTargetCount;
        return this;
    }
    public Integer getAddTargetCount() {
        return this.addTargetCount;
    }

    public DescribeImageRepoListResponseBody setAllTargetCount(Integer allTargetCount) {
        this.allTargetCount = allTargetCount;
        return this;
    }
    public Integer getAllTargetCount() {
        return this.allTargetCount;
    }

    public DescribeImageRepoListResponseBody setDelTargetCount(Integer delTargetCount) {
        this.delTargetCount = delTargetCount;
        return this;
    }
    public Integer getDelTargetCount() {
        return this.delTargetCount;
    }

    public DescribeImageRepoListResponseBody setImageRepoList(java.util.List<DescribeImageRepoListResponseBodyImageRepoList> imageRepoList) {
        this.imageRepoList = imageRepoList;
        return this;
    }
    public java.util.List<DescribeImageRepoListResponseBodyImageRepoList> getImageRepoList() {
        return this.imageRepoList;
    }

    public DescribeImageRepoListResponseBody setPageInfo(DescribeImageRepoListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeImageRepoListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeImageRepoListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageRepoListResponseBodyImageRepoList extends TeaModel {
        @NameInMap("Flag")
        public String flag;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("RepoNamespace")
        public String repoNamespace;

        public static DescribeImageRepoListResponseBodyImageRepoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageRepoListResponseBodyImageRepoList self = new DescribeImageRepoListResponseBodyImageRepoList();
            return TeaModel.build(map, self);
        }

        public DescribeImageRepoListResponseBodyImageRepoList setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public DescribeImageRepoListResponseBodyImageRepoList setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public DescribeImageRepoListResponseBodyImageRepoList setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

    }

    public static class DescribeImageRepoListResponseBodyPageInfo extends TeaModel {
        /**
         * <p>Queries the statistics and configurations of the feature that protects images.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The namespace to which the image repository belongs.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The name of the image repository.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeImageRepoListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageRepoListResponseBodyPageInfo self = new DescribeImageRepoListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageRepoListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeImageRepoListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeImageRepoListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeImageRepoListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
