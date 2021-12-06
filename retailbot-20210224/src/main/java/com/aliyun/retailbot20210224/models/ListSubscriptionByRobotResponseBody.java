// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSubscriptionByRobotResponseBody extends TeaModel {
    // 错误码
    @NameInMap("Code")
    public String code;

    // 订阅的行业包
    @NameInMap("Data")
    public java.util.List<ListSubscriptionByRobotResponseBodyData> data;

    // 错误信息
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    public static ListSubscriptionByRobotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionByRobotResponseBody self = new ListSubscriptionByRobotResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionByRobotResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSubscriptionByRobotResponseBody setData(java.util.List<ListSubscriptionByRobotResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSubscriptionByRobotResponseBodyData> getData() {
        return this.data;
    }

    public ListSubscriptionByRobotResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubscriptionByRobotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubscriptionByRobotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSubscriptionByRobotResponseBodyData extends TeaModel {
        // 行业包code
        @NameInMap("PackageCode")
        public String packageCode;

        // 行业包版本
        @NameInMap("PackageVersion")
        public String packageVersion;

        // 机器人code
        @NameInMap("RobotCode")
        public String robotCode;

        public static ListSubscriptionByRobotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionByRobotResponseBodyData self = new ListSubscriptionByRobotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionByRobotResponseBodyData setPackageCode(String packageCode) {
            this.packageCode = packageCode;
            return this;
        }
        public String getPackageCode() {
            return this.packageCode;
        }

        public ListSubscriptionByRobotResponseBodyData setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

        public ListSubscriptionByRobotResponseBodyData setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

    }

}
