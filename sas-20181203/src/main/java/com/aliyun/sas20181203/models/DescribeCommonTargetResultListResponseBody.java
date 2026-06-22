// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonTargetResultListResponseBody extends TeaModel {
    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for each request. You can use the request ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6673D49C-A9AB-40DD-B4A2-B92306701AE7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The configuration information.</p>
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
         * <p>The asset configuration flag. Valid values:</p>
         * <ul>
         * <li><strong>add</strong>: The configuration takes effect on the asset.</li>
         * <li><strong>del</strong>: The configuration does not take effect on the asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>del</p>
         */
        @NameInMap("Flag")
        public String flag;

        /**
         * <p>The default flag for asset configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("TargetDefault")
        public String targetDefault;

        /**
         * <p>The group ID or asset UUID on which the configuration takes effect.</p>
         * <blockquote>
         * <p>If <strong>TargetType</strong> returns <strong>uuid</strong>, this field indicates the <strong>UUID</strong> of the asset. If <strong>TargetType</strong> returns <strong>groupId</strong>, this field indicates the group ID.</p>
         * </blockquote>
         */
        @NameInMap("TargetList")
        public java.util.List<String> targetList;

        /**
         * <p>The selection mode for the assets on which the configuration takes effect. Valid values:</p>
         * <ul>
         * <li><strong>uuid</strong>: Added by individual asset.</li>
         * <li><strong>groupId</strong>: Added by server group.</li>
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
         * <p>The configuration type. Valid values:</p>
         * <ul>
         * <li><strong>webshell_timescan</strong>: web shell scan.</li>
         * <li><strong>aliscriptengine</strong>: deep detection engine.</li>
         * <li><strong>alidetect</strong>: installation scope of the local file detection engine.</li>
         * <li><strong>alidetect-scan-enable</strong>: detection scope of the local file detection engine.</li>
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
