// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class CreatePkgVersionResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PkgVersion")
    public CreatePkgVersionResponseBodyPkgVersion pkgVersion;

    @NameInMap("Code")
    public String code;

    public static CreatePkgVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePkgVersionResponseBody self = new CreatePkgVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePkgVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePkgVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePkgVersionResponseBody setPkgVersion(CreatePkgVersionResponseBodyPkgVersion pkgVersion) {
        this.pkgVersion = pkgVersion;
        return this;
    }
    public CreatePkgVersionResponseBodyPkgVersion getPkgVersion() {
        return this.pkgVersion;
    }

    public CreatePkgVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class CreatePkgVersionResponseBodyPkgVersion extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("PkgVersionLabel")
        public String pkgVersionLabel;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("PackageSource")
        public String packageSource;

        @NameInMap("PkgVersionId")
        public String pkgVersionId;

        @NameInMap("PkgVersionDescription")
        public String pkgVersionDescription;

        public static CreatePkgVersionResponseBodyPkgVersion build(java.util.Map<String, ?> map) throws Exception {
            CreatePkgVersionResponseBodyPkgVersion self = new CreatePkgVersionResponseBodyPkgVersion();
            return TeaModel.build(map, self);
        }

        public CreatePkgVersionResponseBodyPkgVersion setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreatePkgVersionResponseBodyPkgVersion setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public CreatePkgVersionResponseBodyPkgVersion setPkgVersionLabel(String pkgVersionLabel) {
            this.pkgVersionLabel = pkgVersionLabel;
            return this;
        }
        public String getPkgVersionLabel() {
            return this.pkgVersionLabel;
        }

        public CreatePkgVersionResponseBodyPkgVersion setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreatePkgVersionResponseBodyPkgVersion setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreatePkgVersionResponseBodyPkgVersion setPackageSource(String packageSource) {
            this.packageSource = packageSource;
            return this;
        }
        public String getPackageSource() {
            return this.packageSource;
        }

        public CreatePkgVersionResponseBodyPkgVersion setPkgVersionId(String pkgVersionId) {
            this.pkgVersionId = pkgVersionId;
            return this;
        }
        public String getPkgVersionId() {
            return this.pkgVersionId;
        }

        public CreatePkgVersionResponseBodyPkgVersion setPkgVersionDescription(String pkgVersionDescription) {
            this.pkgVersionDescription = pkgVersionDescription;
            return this;
        }
        public String getPkgVersionDescription() {
            return this.pkgVersionDescription;
        }

    }

}
