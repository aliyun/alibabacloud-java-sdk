// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAccesskeyLeakListResponseBody extends TeaModel {
    // An array that consists of the details about AccessKey pair leaks.
    @NameInMap("AccessKeyLeakList")
    public java.util.List<DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList> accessKeyLeakList;

    // The number of AccessKey pair leaks that are unhandled.
    @NameInMap("AkLeakCount")
    public Integer akLeakCount;

    // The page number of the returned page.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // This parameter is deprecated.
    @NameInMap("GmtLast")
    public Long gmtLast;

    // The number of entries returned on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of AccessKey pair leaks.
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
        // The ID of the AccessKey pair that is leaked.
        @NameInMap("AccesskeyId")
        public String accesskeyId;

        // The name of the Alibaba Cloud account that is affected.
        @NameInMap("AliUserName")
        public String aliUserName;

        // The platform to which the asset belongs. The value is fixed as **Cloud platform**.
        @NameInMap("Asset")
        public String asset;

        // The time when the AccessKey pair leak is handled.
        @NameInMap("DealTime")
        public String dealTime;

        // The method to handle the AccessKey pair leak. Valid values:
        // 
        // *   **pending**: The AccessKey pair leak is unhandled.
        // *   **manual**: The AccessKey pair leak is manually handled.
        // *   **disable**: The AccessKey pair leak is disabled.
        // *   **add-whitelist**: The AccessKey pair leak is added to the whitelist.
        @NameInMap("DealType")
        public String dealType;

        // The time when the AccessKey pair leak is first detected. The value of this parameter is a UNIX timestamp. Unit: milliseconds.
        @NameInMap("GmtModified")
        public Long gmtModified;

        // The primary key ID of the database.
        @NameInMap("Id")
        public Long id;

        // Indicates whether the AccessKey pair leak is handled. Valid values:
        // 
        // *   **pending**: unhandled
        // *   **dealed**: handled
        @NameInMap("Status")
        public String status;

        // The type of the leak. The value is fixed as **AccessKey**.
        @NameInMap("Type")
        public String type;

        // The URL of the platform on which the AccessKey pair leak is detected.
        @NameInMap("Url")
        public String url;

        // The type of the account to which the leaked AccessKey pair belongs. Valid values:
        // 
        // *   **master**: Alibaba Cloud account
        // *   **ram**: RAM user
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
