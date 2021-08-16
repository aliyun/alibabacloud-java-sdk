// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniRecoverableListResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Database")
    public String database;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("RecoverableInfoList")
    public java.util.List<DescribeUniRecoverableListResponseBodyRecoverableInfoList> recoverableInfoList;

    public static DescribeUniRecoverableListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUniRecoverableListResponseBody self = new DescribeUniRecoverableListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUniRecoverableListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeUniRecoverableListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUniRecoverableListResponseBody setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeUniRecoverableListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUniRecoverableListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeUniRecoverableListResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeUniRecoverableListResponseBody setRecoverableInfoList(java.util.List<DescribeUniRecoverableListResponseBodyRecoverableInfoList> recoverableInfoList) {
        this.recoverableInfoList = recoverableInfoList;
        return this;
    }
    public java.util.List<DescribeUniRecoverableListResponseBodyRecoverableInfoList> getRecoverableInfoList() {
        return this.recoverableInfoList;
    }

    public static class DescribeUniRecoverableListResponseBodyRecoverableInfoList extends TeaModel {
        @NameInMap("LastTime")
        public Long lastTime;

        @NameInMap("ResetTime")
        public Long resetTime;

        @NameInMap("RestoreInfo")
        public java.util.Map<String, ?> restoreInfo;

        @NameInMap("FirstTime")
        public Long firstTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("ResetScn")
        public String resetScn;

        public static DescribeUniRecoverableListResponseBodyRecoverableInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUniRecoverableListResponseBodyRecoverableInfoList self = new DescribeUniRecoverableListResponseBodyRecoverableInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeUniRecoverableListResponseBodyRecoverableInfoList setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public DescribeUniRecoverableListResponseBodyRecoverableInfoList setResetTime(Long resetTime) {
            this.resetTime = resetTime;
            return this;
        }
        public Long getResetTime() {
            return this.resetTime;
        }

        public DescribeUniRecoverableListResponseBodyRecoverableInfoList setRestoreInfo(java.util.Map<String, ?> restoreInfo) {
            this.restoreInfo = restoreInfo;
            return this;
        }
        public java.util.Map<String, ?> getRestoreInfo() {
            return this.restoreInfo;
        }

        public DescribeUniRecoverableListResponseBodyRecoverableInfoList setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public DescribeUniRecoverableListResponseBodyRecoverableInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeUniRecoverableListResponseBodyRecoverableInfoList setResetScn(String resetScn) {
            this.resetScn = resetScn;
            return this;
        }
        public String getResetScn() {
            return this.resetScn;
        }

    }

}
