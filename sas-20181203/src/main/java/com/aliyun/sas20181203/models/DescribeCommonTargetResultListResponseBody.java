// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonTargetResultListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6673D49C-A9AB-40DD-B4A2-B92306701AE7</p>
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
         * <ul>
         * <li><strong>add</strong>: applied</li>
         * <li><strong>del</strong>: not applied</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>del</p>
         */
        @NameInMap("Flag")
        public String flag;

        /**
         * <p>The default identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("TargetDefault")
        public String targetDefault;

        /**
         * <p>An array that consists of the IDs of the server groups or the UUIDs of the servers.</p>
         * <blockquote>
         * <p> If <strong>uuid</strong> is returned for the <strong>TargetType</strong> parameter, <strong>UUIDs</strong> of the servers are returned. If <strong>groupId</strong> is returned for the <strong>TargetType</strong> parameter, IDs of the server groups are returned.</p>
         * </blockquote>
         */
        @NameInMap("TargetList")
        public java.util.List<String> targetList;

        /**
         * <p>The type of the server to which the configuration item is applied. Valid values:</p>
         * <ul>
         * <li><strong>uuid</strong>: a server</li>
         * <li><strong>groupId</strong>: a server group</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>uuid</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("TotalCount")
        public String totalCount;

        /**
         * <p>The type of the configuration item. Valid values:</p>
         * <ul>
         * <li><strong>webshell_timescan</strong>: webshell detection and removal</li>
         * <li><strong>aliscriptengine</strong>: in-depth detection engine</li>
         * <li><strong>alidetect</strong>: installation scope of local file detection</li>
         * <li><strong>alidetect-scan-enable</strong>: detection scope of local file detection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>webshell_timescan</p>
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
