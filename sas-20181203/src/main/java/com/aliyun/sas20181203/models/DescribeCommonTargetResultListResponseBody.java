// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonTargetResultListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the configuration item.</p>
     */
    @NameInMap("TargetConfig")
    public DescribeCommonTargetResultListResponseBodyTargetConfig targetConfig;

    public static DescribeCommonTargetResultListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonTargetResultListResponseBody self = new DescribeCommonTargetResultListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommonTargetResultListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCommonTargetResultListResponseBody setTargetConfig(DescribeCommonTargetResultListResponseBodyTargetConfig targetConfig) {
        this.targetConfig = targetConfig;
        return this;
    }
    public DescribeCommonTargetResultListResponseBodyTargetConfig getTargetConfig() {
        return this.targetConfig;
    }

    public static class DescribeCommonTargetResultListResponseBodyTargetConfig extends TeaModel {
        /**
         * <p>The identifier that indicates whether the configuration item is applied to the server. Valid values:</p>
         * <br>
         * <p>*   **add**: applied</p>
         * <p>*   **del**: not applied</p>
         */
        @NameInMap("Flag")
        public String flag;

        /**
         * <p>The default identifier.</p>
         */
        @NameInMap("TargetDefault")
        public String targetDefault;

        /**
         * <p>An array that consists of the IDs of the server groups or the UUIDs of the servers.</p>
         * <br>
         * <p>>  If **uuid** is returned for the **TargetType** parameter, **UUIDs** of the servers are returned. If **groupId** is returned for the **TargetType** parameter, IDs of the server groups are returned.</p>
         */
        @NameInMap("TargetList")
        public java.util.List<String> targetList;

        /**
         * <p>The type of the server to which the configuration item is applied. Valid values:</p>
         * <br>
         * <p>*   **uuid**: a server</p>
         * <p>*   **groupId**: a server group</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public String totalCount;

        /**
         * <p>The type of the configuration item. Valid values:</p>
         * <br>
         * <p>*   **webshell_timescan**: webshell detection and removal</p>
         * <p>*   **aliscriptengine**: in-depth detection engine</p>
         * <p>*   **alidetect**: installation scope of local file detection</p>
         * <p>*   **alidetect-scan-enable**: detection scope of local file detection</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeCommonTargetResultListResponseBodyTargetConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonTargetResultListResponseBodyTargetConfig self = new DescribeCommonTargetResultListResponseBodyTargetConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCommonTargetResultListResponseBodyTargetConfig setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public DescribeCommonTargetResultListResponseBodyTargetConfig setTargetDefault(String targetDefault) {
            this.targetDefault = targetDefault;
            return this;
        }
        public String getTargetDefault() {
            return this.targetDefault;
        }

        public DescribeCommonTargetResultListResponseBodyTargetConfig setTargetList(java.util.List<String> targetList) {
            this.targetList = targetList;
            return this;
        }
        public java.util.List<String> getTargetList() {
            return this.targetList;
        }

        public DescribeCommonTargetResultListResponseBodyTargetConfig setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public DescribeCommonTargetResultListResponseBodyTargetConfig setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

        public DescribeCommonTargetResultListResponseBodyTargetConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
