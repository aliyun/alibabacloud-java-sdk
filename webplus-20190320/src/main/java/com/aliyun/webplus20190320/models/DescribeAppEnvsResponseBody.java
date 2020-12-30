// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeAppEnvsResponseBody extends TeaModel {
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

    @NameInMap("AppEnvs")
    public DescribeAppEnvsResponseBodyAppEnvs appEnvs;

    @NameInMap("Code")
    public String code;

    public static DescribeAppEnvsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppEnvsResponseBody self = new DescribeAppEnvsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppEnvsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAppEnvsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppEnvsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAppEnvsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAppEnvsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAppEnvsResponseBody setAppEnvs(DescribeAppEnvsResponseBodyAppEnvs appEnvs) {
        this.appEnvs = appEnvs;
        return this;
    }
    public DescribeAppEnvsResponseBodyAppEnvs getAppEnvs() {
        return this.appEnvs;
    }

    public DescribeAppEnvsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeAppEnvsResponseBodyAppEnvsAppEnv extends TeaModel {
        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("TotalInstances")
        public Long totalInstances;

        @NameInMap("PkgVersionStorageKey")
        public String pkgVersionStorageKey;

        @NameInMap("LatestChangeId")
        public String latestChangeId;

        @NameInMap("EnvStatus")
        public String envStatus;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("LastEnvStatus")
        public String lastEnvStatus;

        @NameInMap("PkgVersionId")
        public String pkgVersionId;

        @NameInMap("EnvDescription")
        public String envDescription;

        @NameInMap("ApplyingChange")
        public Boolean applyingChange;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CreateUsername")
        public String createUsername;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("DataRoot")
        public String dataRoot;

        @NameInMap("StorageBase")
        public String storageBase;

        @NameInMap("UpdateUsername")
        public String updateUsername;

        @NameInMap("EnvName")
        public String envName;

        @NameInMap("LogBase")
        public String logBase;

        @NameInMap("StackName")
        public String stackName;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("UsingSharedStorage")
        public Boolean usingSharedStorage;

        @NameInMap("ChangeBanner")
        public String changeBanner;

        @NameInMap("StackId")
        public String stackId;

        @NameInMap("PkgVersionLabel")
        public String pkgVersionLabel;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("AbortingChange")
        public Boolean abortingChange;

        public static DescribeAppEnvsResponseBodyAppEnvsAppEnv build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppEnvsResponseBodyAppEnvsAppEnv self = new DescribeAppEnvsResponseBodyAppEnvsAppEnv();
            return TeaModel.build(map, self);
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setTotalInstances(Long totalInstances) {
            this.totalInstances = totalInstances;
            return this;
        }
        public Long getTotalInstances() {
            return this.totalInstances;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setPkgVersionStorageKey(String pkgVersionStorageKey) {
            this.pkgVersionStorageKey = pkgVersionStorageKey;
            return this;
        }
        public String getPkgVersionStorageKey() {
            return this.pkgVersionStorageKey;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setLatestChangeId(String latestChangeId) {
            this.latestChangeId = latestChangeId;
            return this;
        }
        public String getLatestChangeId() {
            return this.latestChangeId;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setEnvStatus(String envStatus) {
            this.envStatus = envStatus;
            return this;
        }
        public String getEnvStatus() {
            return this.envStatus;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setLastEnvStatus(String lastEnvStatus) {
            this.lastEnvStatus = lastEnvStatus;
            return this;
        }
        public String getLastEnvStatus() {
            return this.lastEnvStatus;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setPkgVersionId(String pkgVersionId) {
            this.pkgVersionId = pkgVersionId;
            return this;
        }
        public String getPkgVersionId() {
            return this.pkgVersionId;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setEnvDescription(String envDescription) {
            this.envDescription = envDescription;
            return this;
        }
        public String getEnvDescription() {
            return this.envDescription;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setApplyingChange(Boolean applyingChange) {
            this.applyingChange = applyingChange;
            return this;
        }
        public Boolean getApplyingChange() {
            return this.applyingChange;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setCreateUsername(String createUsername) {
            this.createUsername = createUsername;
            return this;
        }
        public String getCreateUsername() {
            return this.createUsername;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setDataRoot(String dataRoot) {
            this.dataRoot = dataRoot;
            return this;
        }
        public String getDataRoot() {
            return this.dataRoot;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setStorageBase(String storageBase) {
            this.storageBase = storageBase;
            return this;
        }
        public String getStorageBase() {
            return this.storageBase;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setUpdateUsername(String updateUsername) {
            this.updateUsername = updateUsername;
            return this;
        }
        public String getUpdateUsername() {
            return this.updateUsername;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setLogBase(String logBase) {
            this.logBase = logBase;
            return this;
        }
        public String getLogBase() {
            return this.logBase;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setUsingSharedStorage(Boolean usingSharedStorage) {
            this.usingSharedStorage = usingSharedStorage;
            return this;
        }
        public Boolean getUsingSharedStorage() {
            return this.usingSharedStorage;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setChangeBanner(String changeBanner) {
            this.changeBanner = changeBanner;
            return this;
        }
        public String getChangeBanner() {
            return this.changeBanner;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setPkgVersionLabel(String pkgVersionLabel) {
            this.pkgVersionLabel = pkgVersionLabel;
            return this;
        }
        public String getPkgVersionLabel() {
            return this.pkgVersionLabel;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public DescribeAppEnvsResponseBodyAppEnvsAppEnv setAbortingChange(Boolean abortingChange) {
            this.abortingChange = abortingChange;
            return this;
        }
        public Boolean getAbortingChange() {
            return this.abortingChange;
        }

    }

    public static class DescribeAppEnvsResponseBodyAppEnvs extends TeaModel {
        @NameInMap("AppEnv")
        public java.util.List<DescribeAppEnvsResponseBodyAppEnvsAppEnv> appEnv;

        public static DescribeAppEnvsResponseBodyAppEnvs build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppEnvsResponseBodyAppEnvs self = new DescribeAppEnvsResponseBodyAppEnvs();
            return TeaModel.build(map, self);
        }

        public DescribeAppEnvsResponseBodyAppEnvs setAppEnv(java.util.List<DescribeAppEnvsResponseBodyAppEnvsAppEnv> appEnv) {
            this.appEnv = appEnv;
            return this;
        }
        public java.util.List<DescribeAppEnvsResponseBodyAppEnvsAppEnv> getAppEnv() {
            return this.appEnv;
        }

    }

}
