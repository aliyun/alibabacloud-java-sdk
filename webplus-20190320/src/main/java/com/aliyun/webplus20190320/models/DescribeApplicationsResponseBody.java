// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeApplicationsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Applications")
    public DescribeApplicationsResponseBodyApplications applications;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Code")
    public String code;

    public static DescribeApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationsResponseBody self = new DescribeApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApplicationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApplicationsResponseBody setApplications(DescribeApplicationsResponseBodyApplications applications) {
        this.applications = applications;
        return this;
    }
    public DescribeApplicationsResponseBodyApplications getApplications() {
        return this.applications;
    }

    public DescribeApplicationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApplicationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeApplicationsResponseBodyApplicationsApplication extends TeaModel {
        @NameInMap("TotalEnvs")
        public Integer totalEnvs;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("UpdateUsername")
        public String updateUsername;

        @NameInMap("RunningEnvs")
        public Integer runningEnvs;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("UsingSharedStorage")
        public String usingSharedStorage;

        @NameInMap("CreateUsername")
        public String createUsername;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("TerminatedEnvs")
        public Integer terminatedEnvs;

        @NameInMap("AppDescription")
        public String appDescription;

        public static DescribeApplicationsResponseBodyApplicationsApplication build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationsResponseBodyApplicationsApplication self = new DescribeApplicationsResponseBodyApplicationsApplication();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationsResponseBodyApplicationsApplication setTotalEnvs(Integer totalEnvs) {
            this.totalEnvs = totalEnvs;
            return this;
        }
        public Integer getTotalEnvs() {
            return this.totalEnvs;
        }

        public DescribeApplicationsResponseBodyApplicationsApplication setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeApplicationsResponseBodyApplicationsApplication setUpdateUsername(String updateUsername) {
            this.updateUsername = updateUsername;
            return this;
        }
        public String getUpdateUsername() {
            return this.updateUsername;
        }

        public DescribeApplicationsResponseBodyApplicationsApplication setRunningEnvs(Integer runningEnvs) {
            this.runningEnvs = runningEnvs;
            return this;
        }
        public Integer getRunningEnvs() {
            return this.runningEnvs;
        }

        public DescribeApplicationsResponseBodyApplicationsApplication setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeApplicationsResponseBodyApplicationsApplication setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeApplicationsResponseBodyApplicationsApplication setUsingSharedStorage(String usingSharedStorage) {
            this.usingSharedStorage = usingSharedStorage;
            return this;
        }
        public String getUsingSharedStorage() {
            return this.usingSharedStorage;
        }

        public DescribeApplicationsResponseBodyApplicationsApplication setCreateUsername(String createUsername) {
            this.createUsername = createUsername;
            return this;
        }
        public String getCreateUsername() {
            return this.createUsername;
        }

        public DescribeApplicationsResponseBodyApplicationsApplication setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeApplicationsResponseBodyApplicationsApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeApplicationsResponseBodyApplicationsApplication setTerminatedEnvs(Integer terminatedEnvs) {
            this.terminatedEnvs = terminatedEnvs;
            return this;
        }
        public Integer getTerminatedEnvs() {
            return this.terminatedEnvs;
        }

        public DescribeApplicationsResponseBodyApplicationsApplication setAppDescription(String appDescription) {
            this.appDescription = appDescription;
            return this;
        }
        public String getAppDescription() {
            return this.appDescription;
        }

    }

    public static class DescribeApplicationsResponseBodyApplications extends TeaModel {
        @NameInMap("Application")
        public java.util.List<DescribeApplicationsResponseBodyApplicationsApplication> application;

        public static DescribeApplicationsResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationsResponseBodyApplications self = new DescribeApplicationsResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationsResponseBodyApplications setApplication(java.util.List<DescribeApplicationsResponseBodyApplicationsApplication> application) {
            this.application = application;
            return this;
        }
        public java.util.List<DescribeApplicationsResponseBodyApplicationsApplication> getApplication() {
            return this.application;
        }

    }

}
