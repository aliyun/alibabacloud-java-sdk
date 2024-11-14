// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSensitiveOutboundStatisticResponseBody extends TeaModel {
    /**
     * <p>The data types of personal information involved in cross-border data transfer.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeSensitiveOutboundStatisticResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2EFCFE18-78F8-5079-B312-07***48B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeSensitiveOutboundStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveOutboundStatisticResponseBody self = new DescribeSensitiveOutboundStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveOutboundStatisticResponseBody setData(java.util.List<DescribeSensitiveOutboundStatisticResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeSensitiveOutboundStatisticResponseBodyData> getData() {
        return this.data;
    }

    public DescribeSensitiveOutboundStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSensitiveOutboundStatisticResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSensitiveOutboundStatisticResponseBodyData extends TeaModel {
        /**
         * <p>The evaluation result. Valid values:</p>
         * <ul>
         * <li><strong>report</strong>: Risks exist in cross-border data transfer.</li>
         * <li><strong>none</strong>: No risks exist in cross-border data transfer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>report</p>
         */
        @NameInMap("DetectionResult")
        public String detectionResult;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>546</p>
         */
        @NameInMap("InfoCount")
        public Long infoCount;

        /**
         * <p>The number of data entries that are transferred across borders.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("OutboundCount")
        public Long outboundCount;

        /**
         * <p>The type of the sensitive data.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeApisecRules~~">DescribeApisecRules</a> operation to query the supported types of sensitive data.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("SensitiveCode")
        public Long sensitiveCode;

        /**
         * <p>The sensitivity level. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("SensitiveLevel")
        public String sensitiveLevel;

        /**
         * <p>The type of the information. Valid values:</p>
         * <ul>
         * <li><strong>info</strong>: full personal information</li>
         * <li><strong>sensitive</strong>: sensitive personal information</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>info</p>
         */
        @NameInMap("SensitiveType")
        public String sensitiveType;

        public static DescribeSensitiveOutboundStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSensitiveOutboundStatisticResponseBodyData self = new DescribeSensitiveOutboundStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSensitiveOutboundStatisticResponseBodyData setDetectionResult(String detectionResult) {
            this.detectionResult = detectionResult;
            return this;
        }
        public String getDetectionResult() {
            return this.detectionResult;
        }

        public DescribeSensitiveOutboundStatisticResponseBodyData setInfoCount(Long infoCount) {
            this.infoCount = infoCount;
            return this;
        }
        public Long getInfoCount() {
            return this.infoCount;
        }

        public DescribeSensitiveOutboundStatisticResponseBodyData setOutboundCount(Long outboundCount) {
            this.outboundCount = outboundCount;
            return this;
        }
        public Long getOutboundCount() {
            return this.outboundCount;
        }

        public DescribeSensitiveOutboundStatisticResponseBodyData setSensitiveCode(Long sensitiveCode) {
            this.sensitiveCode = sensitiveCode;
            return this;
        }
        public Long getSensitiveCode() {
            return this.sensitiveCode;
        }

        public DescribeSensitiveOutboundStatisticResponseBodyData setSensitiveLevel(String sensitiveLevel) {
            this.sensitiveLevel = sensitiveLevel;
            return this;
        }
        public String getSensitiveLevel() {
            return this.sensitiveLevel;
        }

        public DescribeSensitiveOutboundStatisticResponseBodyData setSensitiveType(String sensitiveType) {
            this.sensitiveType = sensitiveType;
            return this;
        }
        public String getSensitiveType() {
            return this.sensitiveType;
        }

    }

}
