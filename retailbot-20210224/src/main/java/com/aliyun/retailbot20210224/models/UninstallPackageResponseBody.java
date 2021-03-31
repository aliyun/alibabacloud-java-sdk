// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UninstallPackageResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 成功和失败的行业包code
    @NameInMap("Data")
    public UninstallPackageResponseBodyData data;

    public static UninstallPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallPackageResponseBody self = new UninstallPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UninstallPackageResponseBody setData(UninstallPackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UninstallPackageResponseBodyData getData() {
        return this.data;
    }

    public static class UninstallPackageResponseBodyData extends TeaModel {
        // 成功的行业包code
        @NameInMap("SuccessPackageCodes")
        public java.util.List<String> successPackageCodes;

        // 失败的行业包code
        @NameInMap("FailedPackageCodes")
        public java.util.List<String> failedPackageCodes;

        public static UninstallPackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UninstallPackageResponseBodyData self = new UninstallPackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UninstallPackageResponseBodyData setSuccessPackageCodes(java.util.List<String> successPackageCodes) {
            this.successPackageCodes = successPackageCodes;
            return this;
        }
        public java.util.List<String> getSuccessPackageCodes() {
            return this.successPackageCodes;
        }

        public UninstallPackageResponseBodyData setFailedPackageCodes(java.util.List<String> failedPackageCodes) {
            this.failedPackageCodes = failedPackageCodes;
            return this;
        }
        public java.util.List<String> getFailedPackageCodes() {
            return this.failedPackageCodes;
        }

    }

}
