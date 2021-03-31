// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class InstallPackageResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 成功和失败的行业包code
    @NameInMap("Data")
    public InstallPackageResponseBodyData data;

    public static InstallPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallPackageResponseBody self = new InstallPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallPackageResponseBody setData(InstallPackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InstallPackageResponseBodyData getData() {
        return this.data;
    }

    public static class InstallPackageResponseBodyData extends TeaModel {
        // 成功的行业包code
        @NameInMap("SuccessPackageCodes")
        public java.util.List<String> successPackageCodes;

        // 失败的行业包code
        @NameInMap("FailedPackageCodes")
        public java.util.List<String> failedPackageCodes;

        public static InstallPackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InstallPackageResponseBodyData self = new InstallPackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InstallPackageResponseBodyData setSuccessPackageCodes(java.util.List<String> successPackageCodes) {
            this.successPackageCodes = successPackageCodes;
            return this;
        }
        public java.util.List<String> getSuccessPackageCodes() {
            return this.successPackageCodes;
        }

        public InstallPackageResponseBodyData setFailedPackageCodes(java.util.List<String> failedPackageCodes) {
            this.failedPackageCodes = failedPackageCodes;
            return this;
        }
        public java.util.List<String> getFailedPackageCodes() {
            return this.failedPackageCodes;
        }

    }

}
