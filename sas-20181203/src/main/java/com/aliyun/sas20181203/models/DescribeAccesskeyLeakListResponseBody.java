// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAccesskeyLeakListResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GmtLast")
    public Long gmtLast;

    @NameInMap("AkLeakCount")
    public Integer akLeakCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("AccessKeyLeakList")
    public java.util.List<DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList> accessKeyLeakList;

    public static DescribeAccesskeyLeakListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccesskeyLeakListResponseBody self = new DescribeAccesskeyLeakListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccesskeyLeakListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAccesskeyLeakListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccesskeyLeakListResponseBody setGmtLast(Long gmtLast) {
        this.gmtLast = gmtLast;
        return this;
    }
    public Long getGmtLast() {
        return this.gmtLast;
    }

    public DescribeAccesskeyLeakListResponseBody setAkLeakCount(Integer akLeakCount) {
        this.akLeakCount = akLeakCount;
        return this;
    }
    public Integer getAkLeakCount() {
        return this.akLeakCount;
    }

    public DescribeAccesskeyLeakListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccesskeyLeakListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAccesskeyLeakListResponseBody setAccessKeyLeakList(java.util.List<DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList> accessKeyLeakList) {
        this.accessKeyLeakList = accessKeyLeakList;
        return this;
    }
    public java.util.List<DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList> getAccessKeyLeakList() {
        return this.accessKeyLeakList;
    }

    public static class DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList extends TeaModel {
        @NameInMap("DealTime")
        public String dealTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("UserType")
        public String userType;

        @NameInMap("AccesskeyId")
        public String accesskeyId;

        @NameInMap("AliUserName")
        public String aliUserName;

        @NameInMap("DealType")
        public String dealType;

        @NameInMap("Url")
        public String url;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Asset")
        public String asset;

        @NameInMap("Id")
        public Long id;

        public static DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList self = new DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList();
            return TeaModel.build(map, self);
        }

        public DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList setDealTime(String dealTime) {
            this.dealTime = dealTime;
            return this;
        }
        public String getDealTime() {
            return this.dealTime;
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

        public DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
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

        public DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList setDealType(String dealType) {
            this.dealType = dealType;
            return this;
        }
        public String getDealType() {
            return this.dealType;
        }

        public DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList setAsset(String asset) {
            this.asset = asset;
            return this;
        }
        public String getAsset() {
            return this.asset;
        }

        public DescribeAccesskeyLeakListResponseBodyAccessKeyLeakList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
