// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListPackageVersionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Packages")
    public java.util.List<ListPackageVersionsResponseBodyPackages> packages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListPackageVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPackageVersionsResponseBody self = new ListPackageVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPackageVersionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPackageVersionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPackageVersionsResponseBody setPackages(java.util.List<ListPackageVersionsResponseBodyPackages> packages) {
        this.packages = packages;
        return this;
    }
    public java.util.List<ListPackageVersionsResponseBodyPackages> getPackages() {
        return this.packages;
    }

    public ListPackageVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPackageVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPackageVersionsResponseBodyPackagesPackageDetails extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateUserId")
        public String createUserId;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("ModifyUserId")
        public String modifyUserId;

        @NameInMap("PackageDetailDescription")
        public String packageDetailDescription;

        @NameInMap("PackageVersion")
        public String packageVersion;

        @NameInMap("PublishTime")
        public String publishTime;

        public static ListPackageVersionsResponseBodyPackagesPackageDetails build(java.util.Map<String, ?> map) throws Exception {
            ListPackageVersionsResponseBodyPackagesPackageDetails self = new ListPackageVersionsResponseBodyPackagesPackageDetails();
            return TeaModel.build(map, self);
        }

        public ListPackageVersionsResponseBodyPackagesPackageDetails setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPackageVersionsResponseBodyPackagesPackageDetails setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListPackageVersionsResponseBodyPackagesPackageDetails setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListPackageVersionsResponseBodyPackagesPackageDetails setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public ListPackageVersionsResponseBodyPackagesPackageDetails setPackageDetailDescription(String packageDetailDescription) {
            this.packageDetailDescription = packageDetailDescription;
            return this;
        }
        public String getPackageDetailDescription() {
            return this.packageDetailDescription;
        }

        public ListPackageVersionsResponseBodyPackagesPackageDetails setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

        public ListPackageVersionsResponseBodyPackagesPackageDetails setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

    }

    public static class ListPackageVersionsResponseBodyPackages extends TeaModel {
        @NameInMap("PackageCode")
        public String packageCode;

        @NameInMap("PackageDetails")
        public java.util.List<ListPackageVersionsResponseBodyPackagesPackageDetails> packageDetails;

        @NameInMap("PackageName")
        public String packageName;

        public static ListPackageVersionsResponseBodyPackages build(java.util.Map<String, ?> map) throws Exception {
            ListPackageVersionsResponseBodyPackages self = new ListPackageVersionsResponseBodyPackages();
            return TeaModel.build(map, self);
        }

        public ListPackageVersionsResponseBodyPackages setPackageCode(String packageCode) {
            this.packageCode = packageCode;
            return this;
        }
        public String getPackageCode() {
            return this.packageCode;
        }

        public ListPackageVersionsResponseBodyPackages setPackageDetails(java.util.List<ListPackageVersionsResponseBodyPackagesPackageDetails> packageDetails) {
            this.packageDetails = packageDetails;
            return this;
        }
        public java.util.List<ListPackageVersionsResponseBodyPackagesPackageDetails> getPackageDetails() {
            return this.packageDetails;
        }

        public ListPackageVersionsResponseBodyPackages setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

    }

}
