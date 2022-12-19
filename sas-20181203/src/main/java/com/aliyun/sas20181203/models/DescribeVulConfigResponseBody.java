// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulConfigResponseBody extends TeaModel {
    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // An array that consists of the configurations of vulnerability management.
    @NameInMap("TargetConfigs")
    public java.util.List<DescribeVulConfigResponseBodyTargetConfigs> targetConfigs;

    // The total number of configurations.
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
        // The configuartion of vulnerability scan.
        // 
        // > 
        // 
        // Valid values of this parameter if **cve**, **sys**, **cms**, **app**, **emg**, or **yum** is returned for the Type parameter:
        // 
        // *   **on**: enabled
        // *   **off**: disabled
        // 
        // > 
        // 
        // Valid values of this parameter if **scanMode** is returned for the Type parameter:
        // 
        // *   **real**: displays easily exploitable vulnerability
        // *   **all**: displays all vulnerabilities
        // 
        // > 
        // 
        // If **imageVulClean** is returned for the Type parameter, the value of this parameter indicates the vulnerability retention duration.
        @NameInMap("Config")
        public String config;

        // The status of vulnerability management. Valid values:
        // 
        // *   **off**: disabled
        // *   **on**: enabled
        @NameInMap("OverAllConfig")
        public String overAllConfig;

        // The type of configuration. Valid values:
        // 
        // *   **cve**: Linux software vulnerability
        // *   **sys**: Windows system vulnerability
        // *   **cms**: Web-CMS vulnerability
        // *   **app**: application vulnerability that is detected by using web scanner
        // *   **emg**: urgent vulnerability
        // *   **scanMode**: displays easily exploitable vulnerability
        // *   **imageVulClean**: vulnerability retention duration
        // *   **yum**: preferentially uses YUM or APT sources of Alibaba Cloud to fix vulnerabilities
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
