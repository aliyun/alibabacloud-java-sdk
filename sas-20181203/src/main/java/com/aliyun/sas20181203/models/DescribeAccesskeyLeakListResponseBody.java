// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAccesskeyLeakListResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details about AccessKey pair leaks.</p>
     */
    @NameInMap("AccessKeyLeakList")
    public java.util.List<DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList> accessKeyLeakList;

    /**
     * <p>The number of AccessKey pair leaks that are unhandled.</p>
     */
    @NameInMap("AkLeakCount")
    public Integer akLeakCount;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("GmtLast")
    public Long gmtLast;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of AccessKey pair leaks.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAccesskeyLeakListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccesskeyLeakListResponseBody self = new DescribeAccesskeyLeakListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccesskeyLeakListResponseBody setAccessKeyLeakList(java.util.List<DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList> accessKeyLeakList) {
        this.accessKeyLeakList = accessKeyLeakList;
        return this;
    }
    public java.util.List<DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList> getAccessKeyLeakList() {
        return this.accessKeyLeakList;
    }

    public DescribeAccesskeyLeakListResponseBody setAkLeakCount(Integer akLeakCount) {
        this.akLeakCount = akLeakCount;
        return this;
    }
    public Integer getAkLeakCount() {
        return this.akLeakCount;
    }

    public DescribeAccesskeyLeakListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAccesskeyLeakListResponseBody setGmtLast(Long gmtLast) {
        this.gmtLast = gmtLast;
        return this;
    }
    public Long getGmtLast() {
        return this.gmtLast;
    }

    public DescribeAccesskeyLeakListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccesskeyLeakListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccesskeyLeakListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList extends TeaModel {
        /**
         * <p>The ID of the AccessKey pair that is leaked.</p>
         */
        @NameInMap("AccesskeyId")
        public String accesskeyId;

        /**
         * <p>The name of the Alibaba Cloud account that is affected.</p>
         */
        @NameInMap("AliUserName")
        public String aliUserName;

        /**
         * <p>The platform to which the asset belongs. The value is fixed as **Cloud platform**.</p>
         */
        @NameInMap("Asset")
        public String asset;

        /**
         * <p>The time when the AccessKey pair leak is handled.</p>
         */
        @NameInMap("DealTime")
        public String dealTime;

        /**
         * <p>The method to handle the AccessKey pair leak. Valid values:</p>
         * <br>
         * <p>*   **pending**: The AccessKey pair leak is unhandled.</p>
         * <p>*   **manual**: The AccessKey pair leak is manually handled.</p>
         * <p>*   **disable**: The AccessKey pair leak is disabled.</p>
         * <p>*   **add-whitelist**: The AccessKey pair leak is added to the whitelist.</p>
         */
        @NameInMap("DealType")
        public String dealType;

        /**
         * <p>The time when the AccessKey pair leak is first detected. The value of this parameter is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The primary key ID of the database.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the AccessKey pair leak is handled. Valid values:</p>
         * <br>
         * <p>*   **pending**: unhandled</p>
         * <p>*   **dealed**: handled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the leak. The value is fixed as **AccessKey**.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL of the platform on which the AccessKey pair leak is detected.</p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The type of the account to which the leaked AccessKey pair belongs. Valid values:</p>
         * <br>
         * <p>*   **master**: Alibaba Cloud account</p>
         * <p>*   **ram**: RAM user</p>
         */
        @NameInMap("UserType")
        public String userType;

        public static DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList self = new DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList();
            return TeaModel.build(map, self);
        }

        public DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList setAccesskeyId(String accesskeyId) {
            this.accesskeyId = accesskeyId;
            return this;
        }
        public String getAccesskeyId() {
            return this.accesskeyId;
        }

        public DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList setAliUserName(String aliUserName) {
            this.aliUserName = aliUserName;
            return this;
        }
        public String getAliUserName() {
            return this.aliUserName;
        }

        public DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList setAsset(String asset) {
            this.asset = asset;
            return this;
        }
        public String getAsset() {
            return this.asset;
        }

        public DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList setDealTime(String dealTime) {
            this.dealTime = dealTime;
            return this;
        }
        public String getDealTime() {
            return this.dealTime;
        }

        public DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList setDealType(String dealType) {
            this.dealType = dealType;
            return this;
        }
        public String getDealType() {
            return this.dealType;
        }

        public DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
