// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeMajorProtectionBlackIpsResponseBody extends TeaModel {
    @NameInMap("IpList")
    public java.util.List<DescribeMajorProtectionBlackIpsResponseBodyIpList> ipList;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("RuleId")
        public Long ruleId;

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
