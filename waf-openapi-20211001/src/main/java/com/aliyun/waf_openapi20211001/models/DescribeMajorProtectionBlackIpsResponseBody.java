// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeMajorProtectionBlackIpsResponseBody extends TeaModel {
    /**
     * <p>The list of IP addresses in the blacklist.</p>
     */
    @NameInMap("IpList")
    public java.util.List<DescribeMajorProtectionBlackIpsResponseBodyIpList> ipList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>41631674-EEB0-5B02-BEB4-40A758E9B841</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of IP addresses in the blacklist.</p>
     * 
     * <strong>example:</strong>
     * <p>63</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeMajorProtectionBlackIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMajorProtectionBlackIpsResponseBody self = new DescribeMajorProtectionBlackIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMajorProtectionBlackIpsResponseBody setIpList(java.util.List<DescribeMajorProtectionBlackIpsResponseBodyIpList> ipList) {
        this.ipList = ipList;
        return this;
    }
    public java.util.List<DescribeMajorProtectionBlackIpsResponseBodyIpList> getIpList() {
        return this.ipList;
    }

    public DescribeMajorProtectionBlackIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMajorProtectionBlackIpsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeMajorProtectionBlackIpsResponseBodyIpList extends TeaModel {
        /**
         * <p>The description of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>test0003asdffas</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The timestamp after which the IP address blacklist becomes invalid. Unit: seconds.</p>
         * <blockquote>
         * <p>If the value is <strong>0</strong>, the IP address blacklist is permanently valid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1662603328</p>
         */
        @NameInMap("ExpiredTime")
        public Long expiredTime;

        /**
         * <p>The time when the IP address in the blacklist was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1665456202000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The ID of the IP address blacklist rule for critical event protection.</p>
         * 
         * <strong>example:</strong>
         * <p>8508970</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The ID of the critical event protection template.</p>
         * 
         * <strong>example:</strong>
         * <p>9684</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        public static DescribeMajorProtectionBlackIpsResponseBodyIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMajorProtectionBlackIpsResponseBodyIpList self = new DescribeMajorProtectionBlackIpsResponseBodyIpList();
            return TeaModel.build(map, self);
        }

        public DescribeMajorProtectionBlackIpsResponseBodyIpList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeMajorProtectionBlackIpsResponseBodyIpList setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeMajorProtectionBlackIpsResponseBodyIpList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeMajorProtectionBlackIpsResponseBodyIpList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeMajorProtectionBlackIpsResponseBodyIpList setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeMajorProtectionBlackIpsResponseBodyIpList setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
