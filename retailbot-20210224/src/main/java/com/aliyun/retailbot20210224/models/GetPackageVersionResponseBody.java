// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetPackageVersionResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 包名称
    @NameInMap("PackageName")
    public String packageName;

    // 包code
    @NameInMap("PackageCode")
    public String packageCode;

    // 包的详细信息
    @NameInMap("PackageDetails")
    public java.util.List<GetPackageVersionResponseBodyPackageDetails> packageDetails;

    public static GetPackageVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPackageVersionResponseBody self = new GetPackageVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPackageVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPackageVersionResponseBody setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public GetPackageVersionResponseBody setPackageCode(String packageCode) {
        this.packageCode = packageCode;
        return this;
    }
    public String getPackageCode() {
        return this.packageCode;
    }

    public GetPackageVersionResponseBody setPackageDetails(java.util.List<GetPackageVersionResponseBodyPackageDetails> packageDetails) {
        this.packageDetails = packageDetails;
        return this;
    }
    public java.util.List<GetPackageVersionResponseBodyPackageDetails> getPackageDetails() {
        return this.packageDetails;
    }

    public static class GetPackageVersionResponseBodyPackageDetails extends TeaModel {
        // 包版本
        @NameInMap("PackageVersion")
        public String packageVersion;

        // 包详细描述
        @NameInMap("PackageDetailDescription")
        public String packageDetailDescription;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 修改时间
        @NameInMap("ModifyTime")
        public String modifyTime;

        // 创建人id
        @NameInMap("CreateUserId")
        public String createUserId;

        // 修改人id
        @NameInMap("ModifyUserId")
        public String modifyUserId;

        // 发布时间
        @NameInMap("PublishTime")
        public String publishTime;

        public static GetPackageVersionResponseBodyPackageDetails build(java.util.Map<String, ?> map) throws Exception {
            GetPackageVersionResponseBodyPackageDetails self = new GetPackageVersionResponseBodyPackageDetails();
            return TeaModel.build(map, self);
        }

        public GetPackageVersionResponseBodyPackageDetails setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

        public GetPackageVersionResponseBodyPackageDetails setPackageDetailDescription(String packageDetailDescription) {
            this.packageDetailDescription = packageDetailDescription;
            return this;
        }
        public String getPackageDetailDescription() {
            return this.packageDetailDescription;
        }

        public GetPackageVersionResponseBodyPackageDetails setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPackageVersionResponseBodyPackageDetails setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetPackageVersionResponseBodyPackageDetails setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public GetPackageVersionResponseBodyPackageDetails setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public GetPackageVersionResponseBodyPackageDetails setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

    }

}
