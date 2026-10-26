// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListTotalSensitiveInfoResponseBody extends TeaModel {
    /**
     * <p>The list of statistics categorized by region, template, data type, or date.</p>
     */
    @NameInMap("DataCountDOList")
    public java.util.List<ListTotalSensitiveInfoResponseBodyDataCountDOList> dataCountDOList;

    /**
     * <p>The total number of databases.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("DbCount")
    public Long dbCount;

    /**
     * <p>The total number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("InstanceCount")
    public Long instanceCount;

    /**
     * <p>The request identity, which is active for locating the current API call when you invoke the API.</p>
     * 
     * <strong>example:</strong>
     * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of quantities aggregated by detection rule.</p>
     */
    @NameInMap("RuleInfoList")
    public java.util.List<ListTotalSensitiveInfoResponseBodyRuleInfoList> ruleInfoList;

    /**
     * <p>The number of data objects at the S0 sensitivity level.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("S0Count")
    public Long s0Count;

    /**
     * <p>The number of data objects at the S10 sensitivity level.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("S10Count")
    public Long s10Count;

    /**
     * <p>The number of data objects at the S1 sensitivity level.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("S1Count")
    public Long s1Count;

    /**
     * <p>The number of data objects at the S2 sensitivity level.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("S2Count")
    public Long s2Count;

    /**
     * <p>The number of data objects at the S3 sensitivity level.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("S3Count")
    public Long s3Count;

    /**
     * <p>The number of data objects at the S4 sensitivity level.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("S4Count")
    public Long s4Count;

    /**
     * <p>The number of data objects at the S5 sensitivity level.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("S5Count")
    public Long s5Count;

    /**
     * <p>The number of data objects at the S6 sensitivity level.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("S6Count")
    public Long s6Count;

    /**
     * <p>The number of data objects at the S7 sensitivity level.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("S7Count")
    public Long s7Count;

    /**
     * <p>The number of data objects at the S8 sensitivity level.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("S8Count")
    public Long s8Count;

    /**
     * <p>The number of data objects at the S9 sensitivity level.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("S9Count")
    public Long s9Count;

    /**
     * <p>The number of sensitive data objects within the current statistics scope.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("SensitiveCount")
    public Long sensitiveCount;

    /**
     * <p>The number of databases that contain sensitive data.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SensitiveDbCount")
    public Long sensitiveDbCount;

    /**
     * <p>The number of instances that contain sensitive data.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SensitiveInstanceCount")
    public Long sensitiveInstanceCount;

    /**
     * <p>The size of sensitive unstructured data.</p>
     * 
     * <strong>example:</strong>
     * <p>512</p>
     */
    @NameInMap("SensitiveUnStructSize")
    public Long sensitiveUnStructSize;

    /**
     * <p>The number of child sensitive data objects, which is used for sensitive column statistics in structured data scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("SubSensitiveCount")
    public Long subSensitiveCount;

    /**
     * <p>The total number of child data objects, which is used for column-level statistics in structured data scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SubTotalCount")
    public Long subTotalCount;

    /**
     * <p>The total number of data objects that meet the current statistics or query scope.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The total size of unstructured data.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("UnStructSize")
    public Long unStructSize;

    public static ListTotalSensitiveInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTotalSensitiveInfoResponseBody self = new ListTotalSensitiveInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTotalSensitiveInfoResponseBody setDataCountDOList(java.util.List<ListTotalSensitiveInfoResponseBodyDataCountDOList> dataCountDOList) {
        this.dataCountDOList = dataCountDOList;
        return this;
    }
    public java.util.List<ListTotalSensitiveInfoResponseBodyDataCountDOList> getDataCountDOList() {
        return this.dataCountDOList;
    }

    public ListTotalSensitiveInfoResponseBody setDbCount(Long dbCount) {
        this.dbCount = dbCount;
        return this;
    }
    public Long getDbCount() {
        return this.dbCount;
    }

    public ListTotalSensitiveInfoResponseBody setInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    public ListTotalSensitiveInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTotalSensitiveInfoResponseBody setRuleInfoList(java.util.List<ListTotalSensitiveInfoResponseBodyRuleInfoList> ruleInfoList) {
        this.ruleInfoList = ruleInfoList;
        return this;
    }
    public java.util.List<ListTotalSensitiveInfoResponseBodyRuleInfoList> getRuleInfoList() {
        return this.ruleInfoList;
    }

    public ListTotalSensitiveInfoResponseBody setS0Count(Long s0Count) {
        this.s0Count = s0Count;
        return this;
    }
    public Long getS0Count() {
        return this.s0Count;
    }

    public ListTotalSensitiveInfoResponseBody setS10Count(Long s10Count) {
        this.s10Count = s10Count;
        return this;
    }
    public Long getS10Count() {
        return this.s10Count;
    }

    public ListTotalSensitiveInfoResponseBody setS1Count(Long s1Count) {
        this.s1Count = s1Count;
        return this;
    }
    public Long getS1Count() {
        return this.s1Count;
    }

    public ListTotalSensitiveInfoResponseBody setS2Count(Long s2Count) {
        this.s2Count = s2Count;
        return this;
    }
    public Long getS2Count() {
        return this.s2Count;
    }

    public ListTotalSensitiveInfoResponseBody setS3Count(Long s3Count) {
        this.s3Count = s3Count;
        return this;
    }
    public Long getS3Count() {
        return this.s3Count;
    }

    public ListTotalSensitiveInfoResponseBody setS4Count(Long s4Count) {
        this.s4Count = s4Count;
        return this;
    }
    public Long getS4Count() {
        return this.s4Count;
    }

    public ListTotalSensitiveInfoResponseBody setS5Count(Long s5Count) {
        this.s5Count = s5Count;
        return this;
    }
    public Long getS5Count() {
        return this.s5Count;
    }

    public ListTotalSensitiveInfoResponseBody setS6Count(Long s6Count) {
        this.s6Count = s6Count;
        return this;
    }
    public Long getS6Count() {
        return this.s6Count;
    }

    public ListTotalSensitiveInfoResponseBody setS7Count(Long s7Count) {
        this.s7Count = s7Count;
        return this;
    }
    public Long getS7Count() {
        return this.s7Count;
    }

    public ListTotalSensitiveInfoResponseBody setS8Count(Long s8Count) {
        this.s8Count = s8Count;
        return this;
    }
    public Long getS8Count() {
        return this.s8Count;
    }

    public ListTotalSensitiveInfoResponseBody setS9Count(Long s9Count) {
        this.s9Count = s9Count;
        return this;
    }
    public Long getS9Count() {
        return this.s9Count;
    }

    public ListTotalSensitiveInfoResponseBody setSensitiveCount(Long sensitiveCount) {
        this.sensitiveCount = sensitiveCount;
        return this;
    }
    public Long getSensitiveCount() {
        return this.sensitiveCount;
    }

    public ListTotalSensitiveInfoResponseBody setSensitiveDbCount(Long sensitiveDbCount) {
        this.sensitiveDbCount = sensitiveDbCount;
        return this;
    }
    public Long getSensitiveDbCount() {
        return this.sensitiveDbCount;
    }

    public ListTotalSensitiveInfoResponseBody setSensitiveInstanceCount(Long sensitiveInstanceCount) {
        this.sensitiveInstanceCount = sensitiveInstanceCount;
        return this;
    }
    public Long getSensitiveInstanceCount() {
        return this.sensitiveInstanceCount;
    }

    public ListTotalSensitiveInfoResponseBody setSensitiveUnStructSize(Long sensitiveUnStructSize) {
        this.sensitiveUnStructSize = sensitiveUnStructSize;
        return this;
    }
    public Long getSensitiveUnStructSize() {
        return this.sensitiveUnStructSize;
    }

    public ListTotalSensitiveInfoResponseBody setSubSensitiveCount(Long subSensitiveCount) {
        this.subSensitiveCount = subSensitiveCount;
        return this;
    }
    public Long getSubSensitiveCount() {
        return this.subSensitiveCount;
    }

    public ListTotalSensitiveInfoResponseBody setSubTotalCount(Long subTotalCount) {
        this.subTotalCount = subTotalCount;
        return this;
    }
    public Long getSubTotalCount() {
        return this.subTotalCount;
    }

    public ListTotalSensitiveInfoResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListTotalSensitiveInfoResponseBody setUnStructSize(Long unStructSize) {
        this.unStructSize = unStructSize;
        return this;
    }
    public Long getUnStructSize() {
        return this.unStructSize;
    }

    public static class ListTotalSensitiveInfoResponseBodyDataCountDOListDataCountDOList extends TeaModel {
        /**
         * <p>The statistics date, represented by a UNIX timestamp in nanoseconds. The time corresponds to 00:00:00 of the day in the server time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>1788537600000000000</p>
         */
        @NameInMap("Date")
        public Long date;

        /**
         * <p>The number of sensitive data objects within the current statistics scope.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("SensitiveCount")
        public Long sensitiveCount;

        /**
         * <p>The total number of data objects that meet the current statistics or query scope.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListTotalSensitiveInfoResponseBodyDataCountDOListDataCountDOList build(java.util.Map<String, ?> map) throws Exception {
            ListTotalSensitiveInfoResponseBodyDataCountDOListDataCountDOList self = new ListTotalSensitiveInfoResponseBodyDataCountDOListDataCountDOList();
            return TeaModel.build(map, self);
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOListDataCountDOList setDate(Long date) {
            this.date = date;
            return this;
        }
        public Long getDate() {
            return this.date;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOListDataCountDOList setSensitiveCount(Long sensitiveCount) {
            this.sensitiveCount = sensitiveCount;
            return this;
        }
        public Long getSensitiveCount() {
            return this.sensitiveCount;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOListDataCountDOList setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListTotalSensitiveInfoResponseBodyDataCountDOListRuleInfoList extends TeaModel {
        /**
         * <p>The number of data objects that hit the detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RuleCount")
        public Long ruleCount;

        /**
         * <p>The ID of the hit detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the hit detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Phone number</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static ListTotalSensitiveInfoResponseBodyDataCountDOListRuleInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListTotalSensitiveInfoResponseBodyDataCountDOListRuleInfoList self = new ListTotalSensitiveInfoResponseBodyDataCountDOListRuleInfoList();
            return TeaModel.build(map, self);
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOListRuleInfoList setRuleCount(Long ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Long getRuleCount() {
            return this.ruleCount;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOListRuleInfoList setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOListRuleInfoList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class ListTotalSensitiveInfoResponseBodyDataCountDOList extends TeaModel {
        /**
         * <p>The list of statistics categorized by region, template, data type, or date.</p>
         */
        @NameInMap("DataCountDOList")
        public java.util.List<ListTotalSensitiveInfoResponseBodyDataCountDOListDataCountDOList> dataCountDOList;

        /**
         * <p>The statistics date, represented by a UNIX timestamp in nanoseconds. The time corresponds to 00:00:00 of the day in the server time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>1788537600000000000</p>
         */
        @NameInMap("Date")
        public Long date;

        /**
         * <p>The ID of the region where the asset resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The list of quantities aggregated by detection rule.</p>
         */
        @NameInMap("RuleInfoList")
        public java.util.List<ListTotalSensitiveInfoResponseBodyDataCountDOListRuleInfoList> ruleInfoList;

        /**
         * <p>The number of data objects at the S0 sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("S0Count")
        public Long s0Count;

        /**
         * <p>The number of data objects at the S10 sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("S10Count")
        public Long s10Count;

        /**
         * <p>The number of data objects at the S1 sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("S1Count")
        public Long s1Count;

        /**
         * <p>The number of data objects at the S2 sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("S2Count")
        public Long s2Count;

        /**
         * <p>The number of data objects at the S3 sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("S3Count")
        public Long s3Count;

        /**
         * <p>The number of data objects at the S4 sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("S4Count")
        public Long s4Count;

        /**
         * <p>The number of data objects at the S5 sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("S5Count")
        public Long s5Count;

        /**
         * <p>The number of data objects at the S6 sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("S6Count")
        public Long s6Count;

        /**
         * <p>The number of data objects at the S7 sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("S7Count")
        public Long s7Count;

        /**
         * <p>The number of data objects at the S8 sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("S8Count")
        public Long s8Count;

        /**
         * <p>The number of data objects at the S9 sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("S9Count")
        public Long s9Count;

        /**
         * <p>The number of sensitive data objects within the current statistics scope.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("SensitiveCount")
        public Long sensitiveCount;

        /**
         * <p>The type of the statistics data. Valid values:</p>
         * <ul>
         * <li>1: Structured data.</li>
         * <li>0: Unstructured data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StructFlag")
        public Integer structFlag;

        /**
         * <p>The ID of the data classification template.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>The name of the data classification template.</p>
         * 
         * <strong>example:</strong>
         * <p>General data classification template</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The total number of data objects that meet the current statistics or query scope.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListTotalSensitiveInfoResponseBodyDataCountDOList build(java.util.Map<String, ?> map) throws Exception {
            ListTotalSensitiveInfoResponseBodyDataCountDOList self = new ListTotalSensitiveInfoResponseBodyDataCountDOList();
            return TeaModel.build(map, self);
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOList setDataCountDOList(java.util.List<ListTotalSensitiveInfoResponseBodyDataCountDOListDataCountDOList> dataCountDOList) {
            this.dataCountDOList = dataCountDOList;
            return this;
        }
        public java.util.List<ListTotalSensitiveInfoResponseBodyDataCountDOListDataCountDOList> getDataCountDOList() {
            return this.dataCountDOList;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOList setDate(Long date) {
            this.date = date;
            return this;
        }
        public Long getDate() {
            return this.date;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOList setRuleInfoList(java.util.List<ListTotalSensitiveInfoResponseBodyDataCountDOListRuleInfoList> ruleInfoList) {
            this.ruleInfoList = ruleInfoList;
            return this;
        }
        public java.util.List<ListTotalSensitiveInfoResponseBodyDataCountDOListRuleInfoList> getRuleInfoList() {
            return this.ruleInfoList;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOList setS0Count(Long s0Count) {
            this.s0Count = s0Count;
            return this;
        }
        public Long getS0Count() {
            return this.s0Count;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOList setS10Count(Long s10Count) {
            this.s10Count = s10Count;
            return this;
        }
        public Long getS10Count() {
            return this.s10Count;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOList setS1Count(Long s1Count) {
            this.s1Count = s1Count;
            return this;
        }
        public Long getS1Count() {
            return this.s1Count;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOList setS2Count(Long s2Count) {
            this.s2Count = s2Count;
            return this;
        }
        public Long getS2Count() {
            return this.s2Count;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOList setS3Count(Long s3Count) {
            this.s3Count = s3Count;
            return this;
        }
        public Long getS3Count() {
            return this.s3Count;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOList setS4Count(Long s4Count) {
            this.s4Count = s4Count;
            return this;
        }
        public Long getS4Count() {
            return this.s4Count;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOList setS5Count(Long s5Count) {
            this.s5Count = s5Count;
            return this;
        }
        public Long getS5Count() {
            return this.s5Count;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOList setS6Count(Long s6Count) {
            this.s6Count = s6Count;
            return this;
        }
        public Long getS6Count() {
            return this.s6Count;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOList setS7Count(Long s7Count) {
            this.s7Count = s7Count;
            return this;
        }
        public Long getS7Count() {
            return this.s7Count;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOList setS8Count(Long s8Count) {
            this.s8Count = s8Count;
            return this;
        }
        public Long getS8Count() {
            return this.s8Count;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOList setS9Count(Long s9Count) {
            this.s9Count = s9Count;
            return this;
        }
        public Long getS9Count() {
            return this.s9Count;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOList setSensitiveCount(Long sensitiveCount) {
            this.sensitiveCount = sensitiveCount;
            return this;
        }
        public Long getSensitiveCount() {
            return this.sensitiveCount;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOList setStructFlag(Integer structFlag) {
            this.structFlag = structFlag;
            return this;
        }
        public Integer getStructFlag() {
            return this.structFlag;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOList setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListTotalSensitiveInfoResponseBodyDataCountDOList setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListTotalSensitiveInfoResponseBodyRuleInfoList extends TeaModel {
        /**
         * <p>The number of data objects that hit the detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RuleCount")
        public Long ruleCount;

        /**
         * <p>The ID of the hit detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("RuleId")
        public Integer ruleId;

        /**
         * <p>The name of the hit detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Phone number</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static ListTotalSensitiveInfoResponseBodyRuleInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListTotalSensitiveInfoResponseBodyRuleInfoList self = new ListTotalSensitiveInfoResponseBodyRuleInfoList();
            return TeaModel.build(map, self);
        }

        public ListTotalSensitiveInfoResponseBodyRuleInfoList setRuleCount(Long ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Long getRuleCount() {
            return this.ruleCount;
        }

        public ListTotalSensitiveInfoResponseBodyRuleInfoList setRuleId(Integer ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Integer getRuleId() {
            return this.ruleId;
        }

        public ListTotalSensitiveInfoResponseBodyRuleInfoList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
