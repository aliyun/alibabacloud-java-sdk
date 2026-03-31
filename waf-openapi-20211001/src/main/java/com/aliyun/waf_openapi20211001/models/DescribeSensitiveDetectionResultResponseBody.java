// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSensitiveDetectionResultResponseBody extends TeaModel {
    /**
     * <p>The compliance check results.</p>
     */
    @NameInMap("Data")
    public DescribeSensitiveDetectionResultResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSensitiveDetectionResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveDetectionResultResponseBody self = new DescribeSensitiveDetectionResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveDetectionResultResponseBody setData(DescribeSensitiveDetectionResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSensitiveDetectionResultResponseBodyData getData() {
        return this.data;
    }

    public DescribeSensitiveDetectionResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSensitiveDetectionResultResponseBodyDataResultList extends TeaModel {
        /**
         * <p>The number of personal information records.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("InfoCount")
        public Long infoCount;

        /**
         * <p>The number of sensitive personal information records that are involved in cross-border data transfer.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("OutboundCount")
        public Long outboundCount;

        /**
         * <p>The sensitive data type.</p>
         * 
         * <strong>example:</strong>
         * <p>1002</p>
         */
        @NameInMap("SensitiveCode")
        public Long sensitiveCode;

        public static DescribeSensitiveDetectionResultResponseBodyDataResultList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSensitiveDetectionResultResponseBodyDataResultList self = new DescribeSensitiveDetectionResultResponseBodyDataResultList();
            return TeaModel.build(map, self);
        }

        public DescribeSensitiveDetectionResultResponseBodyDataResultList setInfoCount(Long infoCount) {
            this.infoCount = infoCount;
            return this;
        }
        public Long getInfoCount() {
            return this.infoCount;
        }

        public DescribeSensitiveDetectionResultResponseBodyDataResultList setOutboundCount(Long outboundCount) {
            this.outboundCount = outboundCount;
            return this;
        }
        public Long getOutboundCount() {
            return this.outboundCount;
        }

        public DescribeSensitiveDetectionResultResponseBodyDataResultList setSensitiveCode(Long sensitiveCode) {
            this.sensitiveCode = sensitiveCode;
            return this;
        }
        public Long getSensitiveCode() {
            return this.sensitiveCode;
        }

    }

    public static class DescribeSensitiveDetectionResultResponseBodyDataResultMax extends TeaModel {
        /**
         * <p>The number of sensitive personal information records that are of the most frequent sensitive data type.</p>
         * 
         * <strong>example:</strong>
         * <p>187</p>
         */
        @NameInMap("InfoCount")
        public Long infoCount;

        /**
         * <p>The number of sensitive personal information records that are of the most frequent sensitive data type and are involved in cross-border data transfer.</p>
         * 
         * <strong>example:</strong>
         * <p>54</p>
         */
        @NameInMap("OutboundCount")
        public Long outboundCount;

        /**
         * <p>The most frequent sensitive data type.</p>
         * 
         * <strong>example:</strong>
         * <p>1003</p>
         */
        @NameInMap("SensitiveCode")
        public Long sensitiveCode;

        public static DescribeSensitiveDetectionResultResponseBodyDataResultMax build(java.util.Map<String, ?> map) throws Exception {
            DescribeSensitiveDetectionResultResponseBodyDataResultMax self = new DescribeSensitiveDetectionResultResponseBodyDataResultMax();
            return TeaModel.build(map, self);
        }

        public DescribeSensitiveDetectionResultResponseBodyDataResultMax setInfoCount(Long infoCount) {
            this.infoCount = infoCount;
            return this;
        }
        public Long getInfoCount() {
            return this.infoCount;
        }

        public DescribeSensitiveDetectionResultResponseBodyDataResultMax setOutboundCount(Long outboundCount) {
            this.outboundCount = outboundCount;
            return this;
        }
        public Long getOutboundCount() {
            return this.outboundCount;
        }

        public DescribeSensitiveDetectionResultResponseBodyDataResultMax setSensitiveCode(Long sensitiveCode) {
            this.sensitiveCode = sensitiveCode;
            return this;
        }
        public Long getSensitiveCode() {
            return this.sensitiveCode;
        }

    }

    public static class DescribeSensitiveDetectionResultResponseBodyDataResult extends TeaModel {
        /**
         * <p>The compliance check results. Valid values:</p>
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
         * <p>The sensitive information check results by sensitive data type.</p>
         */
        @NameInMap("List")
        public java.util.List<DescribeSensitiveDetectionResultResponseBodyDataResultList> list;

        /**
         * <p>The maximum values in the statistics of sensitive data types.</p>
         */
        @NameInMap("Max")
        public DescribeSensitiveDetectionResultResponseBodyDataResultMax max;

        public static DescribeSensitiveDetectionResultResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeSensitiveDetectionResultResponseBodyDataResult self = new DescribeSensitiveDetectionResultResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public DescribeSensitiveDetectionResultResponseBodyDataResult setDetectionResult(String detectionResult) {
            this.detectionResult = detectionResult;
            return this;
        }
        public String getDetectionResult() {
            return this.detectionResult;
        }

        public DescribeSensitiveDetectionResultResponseBodyDataResult setList(java.util.List<DescribeSensitiveDetectionResultResponseBodyDataResultList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DescribeSensitiveDetectionResultResponseBodyDataResultList> getList() {
            return this.list;
        }

        public DescribeSensitiveDetectionResultResponseBodyDataResult setMax(DescribeSensitiveDetectionResultResponseBodyDataResultMax max) {
            this.max = max;
            return this;
        }
        public DescribeSensitiveDetectionResultResponseBodyDataResultMax getMax() {
            return this.max;
        }

    }

    public static class DescribeSensitiveDetectionResultResponseBodyData extends TeaModel {
        /**
         * <p>The compliance checks.</p>
         */
        @NameInMap("Result")
        public java.util.List<DescribeSensitiveDetectionResultResponseBodyDataResult> result;

        public static DescribeSensitiveDetectionResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSensitiveDetectionResultResponseBodyData self = new DescribeSensitiveDetectionResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSensitiveDetectionResultResponseBodyData setResult(java.util.List<DescribeSensitiveDetectionResultResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<DescribeSensitiveDetectionResultResponseBodyDataResult> getResult() {
            return this.result;
        }

    }

}
