// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpgradePackageResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 成功和失败的机器人code
    @NameInMap("Data")
    public UpgradePackageResponseBodyData data;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    // 错误码
    @NameInMap("Code")
    public String code;

    // 错误信息
    @NameInMap("Message")
    public String message;

    public static UpgradePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradePackageResponseBody self = new UpgradePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradePackageResponseBody setData(UpgradePackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpgradePackageResponseBodyData getData() {
        return this.data;
    }

    public UpgradePackageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpgradePackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpgradePackageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class UpgradePackageResponseBodyData extends TeaModel {
        // 成功的机器人code
        @NameInMap("SuccessRobotCodes")
        public java.util.List<String> successRobotCodes;

        // 失败的机器人code
        @NameInMap("FailedRobotCodes")
        public java.util.List<String> failedRobotCodes;

        public static UpgradePackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpgradePackageResponseBodyData self = new UpgradePackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpgradePackageResponseBodyData setSuccessRobotCodes(java.util.List<String> successRobotCodes) {
            this.successRobotCodes = successRobotCodes;
            return this;
        }
        public java.util.List<String> getSuccessRobotCodes() {
            return this.successRobotCodes;
        }

        public UpgradePackageResponseBodyData setFailedRobotCodes(java.util.List<String> failedRobotCodes) {
            this.failedRobotCodes = failedRobotCodes;
            return this;
        }
        public java.util.List<String> getFailedRobotCodes() {
            return this.failedRobotCodes;
        }

    }

}
