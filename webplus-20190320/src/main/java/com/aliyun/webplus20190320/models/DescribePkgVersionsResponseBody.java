// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribePkgVersionsResponseBody extends TeaModel {
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

    @NameInMap("PkgVersions")
    public DescribePkgVersionsResponseBodyPkgVersions pkgVersions;

    @NameInMap("Code")
    public String code;

    public static DescribePkgVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePkgVersionsResponseBody self = new DescribePkgVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePkgVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribePkgVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePkgVersionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePkgVersionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePkgVersionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePkgVersionsResponseBody setPkgVersions(DescribePkgVersionsResponseBodyPkgVersions pkgVersions) {
        this.pkgVersions = pkgVersions;
        return this;
    }
    public DescribePkgVersionsResponseBodyPkgVersions getPkgVersions() {
        return this.pkgVersions;
    }

    public DescribePkgVersionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribePkgVersionsResponseBodyPkgVersionsPkgVersion extends TeaModel {
        @NameInMap("CreateUsername")
        public String createUsername;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("PkgVersionLabel")
        public String pkgVersionLabel;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("PackageSource")
        public String packageSource;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("PackageETag")
        public String packageETag;

        @NameInMap("PkgVersionId")
        public String pkgVersionId;

        @NameInMap("PkgVersionDescription")
        public String pkgVersionDescription;

        public static DescribePkgVersionsResponseBodyPkgVersionsPkgVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribePkgVersionsResponseBodyPkgVersionsPkgVersion self = new DescribePkgVersionsResponseBodyPkgVersionsPkgVersion();
            return TeaModel.build(map, self);
        }

        public DescribePkgVersionsResponseBodyPkgVersionsPkgVersion setCreateUsername(String createUsername) {
            this.createUsername = createUsername;
            return this;
        }
        public String getCreateUsername() {
            return this.createUsername;
        }

        public DescribePkgVersionsResponseBodyPkgVersionsPkgVersion setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribePkgVersionsResponseBodyPkgVersionsPkgVersion setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribePkgVersionsResponseBodyPkgVersionsPkgVersion setPkgVersionLabel(String pkgVersionLabel) {
            this.pkgVersionLabel = pkgVersionLabel;
            return this;
        }
        public String getPkgVersionLabel() {
            return this.pkgVersionLabel;
        }

        public DescribePkgVersionsResponseBodyPkgVersionsPkgVersion setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribePkgVersionsResponseBodyPkgVersionsPkgVersion setPackageSource(String packageSource) {
            this.packageSource = packageSource;
            return this;
        }
        public String getPackageSource() {
            return this.packageSource;
        }

        public DescribePkgVersionsResponseBodyPkgVersionsPkgVersion setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribePkgVersionsResponseBodyPkgVersionsPkgVersion setPackageETag(String packageETag) {
            this.packageETag = packageETag;
            return this;
        }
        public String getPackageETag() {
            return this.packageETag;
        }

        public DescribePkgVersionsResponseBodyPkgVersionsPkgVersion setPkgVersionId(String pkgVersionId) {
            this.pkgVersionId = pkgVersionId;
            return this;
        }
        public String getPkgVersionId() {
            return this.pkgVersionId;
        }

        public DescribePkgVersionsResponseBodyPkgVersionsPkgVersion setPkgVersionDescription(String pkgVersionDescription) {
            this.pkgVersionDescription = pkgVersionDescription;
            return this;
        }
        public String getPkgVersionDescription() {
            return this.pkgVersionDescription;
        }

    }

    public static class DescribePkgVersionsResponseBodyPkgVersions extends TeaModel {
        @NameInMap("PkgVersion")
        public java.util.List<DescribePkgVersionsResponseBodyPkgVersionsPkgVersion> pkgVersion;

        public static DescribePkgVersionsResponseBodyPkgVersions build(java.util.Map<String, ?> map) throws Exception {
            DescribePkgVersionsResponseBodyPkgVersions self = new DescribePkgVersionsResponseBodyPkgVersions();
            return TeaModel.build(map, self);
        }

        public DescribePkgVersionsResponseBodyPkgVersions setPkgVersion(java.util.List<DescribePkgVersionsResponseBodyPkgVersionsPkgVersion> pkgVersion) {
            this.pkgVersion = pkgVersion;
            return this;
        }
        public java.util.List<DescribePkgVersionsResponseBodyPkgVersionsPkgVersion> getPkgVersion() {
            return this.pkgVersion;
        }

    }

}
