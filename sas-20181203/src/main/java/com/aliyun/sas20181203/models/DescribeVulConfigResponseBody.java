// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
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
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
         * <blockquote>
         * <p>Valid values when you set the Type parameter to <strong>cve</strong>, <strong>sys</strong>, <strong>cms</strong>, <strong>app</strong>, <strong>emg</strong>, or <strong>yum</strong>:</p>
         * </blockquote>
         * <ul>
         * <li><p><strong>on</strong>: enabled</p>
         * </li>
         * <li><p><strong>off</strong>: disabled</p>
         * </li>
         * </ul>
         * <p>Valid values when you set the Type parameter to <strong>scanMode</strong>:</p>
         * <ul>
         * <li><p><strong>real</strong>: displays easily exploitable vulnerability.</p>
         * </li>
         * <li><p><strong>all</strong>: displays all vulnerabilities.</p>
         * </li>
         * </ul>
         * <p>When you set the Type parameter to <strong>imageVulClean</strong>, the value of this parameter indicates the vulnerability retention period in days.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>Indicates whether the vulnerability management feature is enabled for all servers. Valid values:</p>
         * <ul>
         * <li><strong>off</strong>: disabled</li>
         * <li><strong>on</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("OverAllConfig")
        public String overAllConfig;

        /**
         * <p>The type of configuration. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability.</li>
         * <li><strong>sys</strong>: Windows system vulnerability.</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
         * <li><strong>app</strong>: application vulnerability that is detected by using web scanner.</li>
         * <li><strong>emg</strong>: urgent vulnerability.</li>
         * <li><strong>scanMode</strong>: displays easily exploitable vulnerability.</li>
         * <li><strong>imageVulClean</strong>: vulnerability retention duration.</li>
         * <li><strong>yum</strong>: preferentially uses YUM or APT sources of Alibaba Cloud to fix vulnerabilities.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
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
