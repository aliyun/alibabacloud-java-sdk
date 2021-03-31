// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSubscriptionByRobotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    // 订阅的行业包
    @NameInMap("Data")
    public java.util.List<ListSubscriptionByRobotResponseBodyData> data;

    public static ListSubscriptionByRobotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionByRobotResponseBody self = new ListSubscriptionByRobotResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionByRobotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubscriptionByRobotResponseBody setData(java.util.List<ListSubscriptionByRobotResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSubscriptionByRobotResponseBodyData> getData() {
        return this.data;
    }

    public static class ListSubscriptionByRobotResponseBodyData extends TeaModel {
        // 机器人code
        @NameInMap("RobotCode")
        public String robotCode;

        // 行业包code
        @NameInMap("PackageCode")
        public String packageCode;

        // 行业包版本
        @NameInMap("PackageVersion")
        public String packageVersion;

        public static ListSubscriptionByRobotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionByRobotResponseBodyData self = new ListSubscriptionByRobotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionByRobotResponseBodyData setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
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

    }

}
