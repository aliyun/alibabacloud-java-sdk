// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulTargetConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the configurations.</p>
     */
    @NameInMap("TargetConfigs")
    public java.util.List<DescribeVulTargetConfigResponseBodyTargetConfigs> targetConfigs;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeVulTargetConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulTargetConfigResponseBody self = new DescribeVulTargetConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulTargetConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulTargetConfigResponseBody setTargetConfigs(java.util.List<DescribeVulTargetConfigResponseBodyTargetConfigs> targetConfigs) {
        this.targetConfigs = targetConfigs;
        return this;
    }
    public java.util.List<DescribeVulTargetConfigResponseBodyTargetConfigs> getTargetConfigs() {
        return this.targetConfigs;
    }

    public DescribeVulTargetConfigResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVulTargetConfigResponseBodyTargetConfigs extends TeaModel {
        /**
         * <p>Indicates whether the vulnerability scan feature is enabled for the server.</p>
         * <br>
         * <p>*   **off**: disabled</p>
         * <p>*   **on**: enabled</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>Indicates whether the vulnerability scan feature is enabled for all servers. Valid values:</p>
         * <br>
         * <p>*   **off**: disabled</p>
         * <p>*   **on**: enabled</p>
         */
        @NameInMap("OverAllConfig")
        public String overAllConfig;

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **cve**: Linux software vulnerability</p>
         * <p>*   **sys**: Windows system vulnerability</p>
         * <p>*   **cms**: Web-CMS vulnerability</p>
         * <p>*   **emg**: urgent vulnerability</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeVulTargetConfigResponseBodyTargetConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulTargetConfigResponseBodyTargetConfigs self = new DescribeVulTargetConfigResponseBodyTargetConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeVulTargetConfigResponseBodyTargetConfigs setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeVulTargetConfigResponseBodyTargetConfigs setOverAllConfig(String overAllConfig) {
            this.overAllConfig = overAllConfig;
            return this;
        }
        public String getOverAllConfig() {
            return this.overAllConfig;
        }

        public DescribeVulTargetConfigResponseBodyTargetConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
