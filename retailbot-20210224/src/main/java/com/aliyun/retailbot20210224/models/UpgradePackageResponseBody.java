// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpgradePackageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpgradePackageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpgradePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradePackageResponseBody self = new UpgradePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradePackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpgradePackageResponseBody setData(UpgradePackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpgradePackageResponseBodyData getData() {
        return this.data;
    }

    public UpgradePackageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpgradePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradePackageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpgradePackageResponseBodyData extends TeaModel {
        @NameInMap("FailedRobotCodes")
        public java.util.List<String> failedRobotCodes;

        @NameInMap("SuccessRobotCodes")
        public java.util.List<String> successRobotCodes;

        public static UpgradePackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpgradePackageResponseBodyData self = new UpgradePackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpgradePackageResponseBodyData setFailedRobotCodes(java.util.List<String> failedRobotCodes) {
            this.failedRobotCodes = failedRobotCodes;
            return this;
        }
        public java.util.List<String> getFailedRobotCodes() {
            return this.failedRobotCodes;
        }

        public UpgradePackageResponseBodyData setSuccessRobotCodes(java.util.List<String> successRobotCodes) {
            this.successRobotCodes = successRobotCodes;
            return this;
        }
        public java.util.List<String> getSuccessRobotCodes() {
            return this.successRobotCodes;
        }

    }

}
