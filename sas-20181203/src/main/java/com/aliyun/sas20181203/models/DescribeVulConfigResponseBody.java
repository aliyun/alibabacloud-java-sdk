// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the configurations of vulnerability management.</p>
     */
    @NameInMap("TargetConfigs")
    public java.util.List<DescribeVulConfigResponseBodyTargetConfigs> targetConfigs;

    /**
     * <p>The total number of configurations.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeVulConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulConfigResponseBody self = new DescribeVulConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulConfigResponseBody setTargetConfigs(java.util.List<DescribeVulConfigResponseBodyTargetConfigs> targetConfigs) {
        this.targetConfigs = targetConfigs;
        return this;
    }
    public java.util.List<DescribeVulConfigResponseBodyTargetConfigs> getTargetConfigs() {
        return this.targetConfigs;
    }

    public DescribeVulConfigResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVulConfigResponseBodyTargetConfigs extends TeaModel {
        /**
         * <p>The configuration of vulnerability scan.</p>
         * <br>
         * <p>> Valid values when you set the Type parameter to **cve**, **sys**, **cms**, **app**, **emg**, or **yum**:</p>
         * <br>
         * <p>*   **on**: enabled</p>
         * <br>
         * <p>*   **off**: disabled</p>
         * <br>
         * <p>Valid values when you set the Type parameter to **scanMode**:</p>
         * <br>
         * <p>*   **real**: displays easily exploitable vulnerability.</p>
         * <br>
         * <p>*   **all**: displays all vulnerabilities.</p>
         * <br>
         * <p>When you set the Type parameter to **imageVulClean**, the value of this parameter indicates the vulnerability retention period in days.</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>Indicates whether the vulnerability management feature is enabled for all servers. Valid values:</p>
         * <br>
         * <p>*   **off**: disabled</p>
         * <p>*   **on**: enabled</p>
         */
        @NameInMap("OverAllConfig")
        public String overAllConfig;

        /**
         * <p>The type of configuration. Valid values:</p>
         * <br>
         * <p>*   **cve**: Linux software vulnerability.</p>
         * <p>*   **sys**: Windows system vulnerability.</p>
         * <p>*   **cms**: Web-CMS vulnerability.</p>
         * <p>*   **app**: application vulnerability that is detected by using web scanner.</p>
         * <p>*   **emg**: urgent vulnerability.</p>
         * <p>*   **scanMode**: displays easily exploitable vulnerability.</p>
         * <p>*   **imageVulClean**: vulnerability retention duration.</p>
         * <p>*   **yum**: preferentially uses YUM or APT sources of Alibaba Cloud to fix vulnerabilities.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeVulConfigResponseBodyTargetConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulConfigResponseBodyTargetConfigs self = new DescribeVulConfigResponseBodyTargetConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeVulConfigResponseBodyTargetConfigs setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeVulConfigResponseBodyTargetConfigs setOverAllConfig(String overAllConfig) {
            this.overAllConfig = overAllConfig;
            return this;
        }
        public String getOverAllConfig() {
            return this.overAllConfig;
        }

        public DescribeVulConfigResponseBodyTargetConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
