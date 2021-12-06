// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListIndustryPackagesResponseBody extends TeaModel {
    // 返回code
    @NameInMap("Code")
    public String code;

    // 返回信息
    @NameInMap("Message")
    public String message;

    @NameInMap("PackagePage")
    public ListIndustryPackagesResponseBodyPackagePage packagePage;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功标示
    @NameInMap("Success")
    public Boolean success;

    public static ListIndustryPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIndustryPackagesResponseBody self = new ListIndustryPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIndustryPackagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIndustryPackagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIndustryPackagesResponseBody setPackagePage(ListIndustryPackagesResponseBodyPackagePage packagePage) {
        this.packagePage = packagePage;
        return this;
    }
    public ListIndustryPackagesResponseBodyPackagePage getPackagePage() {
        return this.packagePage;
    }

    public ListIndustryPackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIndustryPackagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListIndustryPackagesResponseBodyPackagePagePackages extends TeaModel {
        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 创建人id
        @NameInMap("CreateUserId")
        public String createUserId;

        // 修改时间
        @NameInMap("ModifyTime")
        public String modifyTime;

        // 修改人id
        @NameInMap("ModifyUserId")
        public String modifyUserId;

        // 包code
        @NameInMap("PackageCode")
        public String packageCode;

        // 包描述
        @NameInMap("PackageDescription")
        public String packageDescription;

        // 包名
        @NameInMap("PackageName")
        public String packageName;

        // 包类型
        @NameInMap("PackageType")
        public String packageType;

        public static ListIndustryPackagesResponseBodyPackagePagePackages build(java.util.Map<String, ?> map) throws Exception {
            ListIndustryPackagesResponseBodyPackagePagePackages self = new ListIndustryPackagesResponseBodyPackagePagePackages();
            return TeaModel.build(map, self);
        }

        public ListIndustryPackagesResponseBodyPackagePagePackages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIndustryPackagesResponseBodyPackagePagePackages setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListIndustryPackagesResponseBodyPackagePagePackages setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListIndustryPackagesResponseBodyPackagePagePackages setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public ListIndustryPackagesResponseBodyPackagePagePackages setPackageCode(String packageCode) {
            this.packageCode = packageCode;
            return this;
        }
        public String getPackageCode() {
            return this.packageCode;
        }

        public ListIndustryPackagesResponseBodyPackagePagePackages setPackageDescription(String packageDescription) {
            this.packageDescription = packageDescription;
            return this;
        }
        public String getPackageDescription() {
            return this.packageDescription;
        }

        public ListIndustryPackagesResponseBodyPackagePagePackages setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public ListIndustryPackagesResponseBodyPackagePagePackages setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

    }

    public static class ListIndustryPackagesResponseBodyPackagePage extends TeaModel {
        // 每页条数
        @NameInMap("MaxResults")
        public Integer maxResults;

        // 页码
        @NameInMap("NextToken")
        public Integer nextToken;

        // 包集合
        @NameInMap("Packages")
        public java.util.List<ListIndustryPackagesResponseBodyPackagePagePackages> packages;

        // 总条数
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListIndustryPackagesResponseBodyPackagePage build(java.util.Map<String, ?> map) throws Exception {
            ListIndustryPackagesResponseBodyPackagePage self = new ListIndustryPackagesResponseBodyPackagePage();
            return TeaModel.build(map, self);
        }

        public ListIndustryPackagesResponseBodyPackagePage setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListIndustryPackagesResponseBodyPackagePage setNextToken(Integer nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public Integer getNextToken() {
            return this.nextToken;
        }

        public ListIndustryPackagesResponseBodyPackagePage setPackages(java.util.List<ListIndustryPackagesResponseBodyPackagePagePackages> packages) {
            this.packages = packages;
            return this;
        }
        public java.util.List<ListIndustryPackagesResponseBodyPackagePagePackages> getPackages() {
            return this.packages;
        }

        public ListIndustryPackagesResponseBodyPackagePage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
