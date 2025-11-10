// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoListResponseBody extends TeaModel {
    /**
     * <p>The number of image repositories that are added to Security Center.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("AddTargetCount")
    public Integer addTargetCount;

    /**
     * <p>The total number of image repositories.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("AllTargetCount")
    public Integer allTargetCount;

    /**
     * <p>The number of excluded image repositories.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DelTargetCount")
    public Integer delTargetCount;

    /**
     * <p>An array that consists of the information about image repositories.</p>
     */
    @NameInMap("ImageRepoList")
    public java.util.List<DescribeImageRepoListResponseBodyImageRepoList> imageRepoList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeImageRepoListResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB3936FA7</p>
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
        /**
         * <p>Indicates whether the feature takes effect on the image repository. Valid values:</p>
         * <ul>
         * <li><strong>add</strong>: yes</li>
         * <li><strong>del</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Flag")
        public String flag;

        @NameInMap("ImageCount")
        public Integer imageCount;

        /**
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>zeus</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The namespace to which the image repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-script</p>
         */
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

        public DescribeImageRepoListResponseBodyImageRepoList setImageCount(Integer imageCount) {
            this.imageCount = imageCount;
            return this;
        }
        public Integer getImageCount() {
            return this.imageCount;
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
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of image repositories.</p>
         * 
         * <strong>example:</strong>
         * <p>83</p>
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
