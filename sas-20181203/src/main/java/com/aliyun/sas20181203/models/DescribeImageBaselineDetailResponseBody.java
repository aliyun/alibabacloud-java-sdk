// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineDetailResponseBody extends TeaModel {
    /**
     * <p>The image baseline details.</p>
     */
    @NameInMap("BaselineDetail")
    public DescribeImageBaselineDetailResponseBodyBaselineDetail baselineDetail;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0B48AB3C-84FC-424D-A01D-B9270EF4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageBaselineDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBaselineDetailResponseBody self = new DescribeImageBaselineDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageBaselineDetailResponseBody setBaselineDetail(DescribeImageBaselineDetailResponseBodyBaselineDetail baselineDetail) {
        this.baselineDetail = baselineDetail;
        return this;
    }
    public DescribeImageBaselineDetailResponseBodyBaselineDetail getBaselineDetail() {
        return this.baselineDetail;
    }

    public DescribeImageBaselineDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageBaselineDetailResponseBodyBaselineDetail extends TeaModel {
        /**
         * <p>The remediation suggestion for the baseline check risk item.</p>
         * 
         * <strong>example:</strong>
         * <p>删除泄漏的AK信息。</p>
         */
        @NameInMap("Advice")
        public String advice;

        /**
         * <p>The alias of the baseline classification.</p>
         * 
         * <strong>example:</strong>
         * <p>ak_leak</p>
         */
        @NameInMap("BaselineClassAlias")
        public String baselineClassAlias;

        /**
         * <p>The alias of the baseline sub-item.</p>
         * 
         * <strong>example:</strong>
         * <p>Access Key泄露</p>
         */
        @NameInMap("BaselineItemAlias")
        public String baselineItemAlias;

        /**
         * <p>The key of the baseline sub-item.</p>
         * 
         * <strong>example:</strong>
         * <p>ak_leak</p>
         */
        @NameInMap("BaselineItemKey")
        public String baselineItemKey;

        /**
         * <p>The alias of the baseline name.</p>
         * 
         * <strong>example:</strong>
         * <p>Access Key泄露</p>
         */
        @NameInMap("BaselineNameAlias")
        public String baselineNameAlias;

        /**
         * <p>The description of the baseline risk item.</p>
         * 
         * <strong>example:</strong>
         * <p>Access Key泄露，会导致Access Key被冒用的风险。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The risk level of the check item. Valid values:</p>
         * <ul>
         * <li><p><strong>high</strong>: High risk level.</p>
         * </li>
         * <li><p><strong>medium</strong>: Medium risk level.</p>
         * </li>
         * <li><p><strong>low</strong>: Low risk level.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The baseline issue prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/aksk.txt:yourAccessKeyID</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <p>The asynchronous request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>async__c6f3b0b54613383b40bdce593ffe****</p>
         */
        @NameInMap("ResultId")
        public String resultId;

        public static DescribeImageBaselineDetailResponseBodyBaselineDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageBaselineDetailResponseBodyBaselineDetail self = new DescribeImageBaselineDetailResponseBodyBaselineDetail();
            return TeaModel.build(map, self);
        }

        public DescribeImageBaselineDetailResponseBodyBaselineDetail setAdvice(String advice) {
            this.advice = advice;
            return this;
        }
        public String getAdvice() {
            return this.advice;
        }

        public DescribeImageBaselineDetailResponseBodyBaselineDetail setBaselineClassAlias(String baselineClassAlias) {
            this.baselineClassAlias = baselineClassAlias;
            return this;
        }
        public String getBaselineClassAlias() {
            return this.baselineClassAlias;
        }

        public DescribeImageBaselineDetailResponseBodyBaselineDetail setBaselineItemAlias(String baselineItemAlias) {
            this.baselineItemAlias = baselineItemAlias;
            return this;
        }
        public String getBaselineItemAlias() {
            return this.baselineItemAlias;
        }

        public DescribeImageBaselineDetailResponseBodyBaselineDetail setBaselineItemKey(String baselineItemKey) {
            this.baselineItemKey = baselineItemKey;
            return this;
        }
        public String getBaselineItemKey() {
            return this.baselineItemKey;
        }

        public DescribeImageBaselineDetailResponseBodyBaselineDetail setBaselineNameAlias(String baselineNameAlias) {
            this.baselineNameAlias = baselineNameAlias;
            return this;
        }
        public String getBaselineNameAlias() {
            return this.baselineNameAlias;
        }

        public DescribeImageBaselineDetailResponseBodyBaselineDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImageBaselineDetailResponseBodyBaselineDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeImageBaselineDetailResponseBodyBaselineDetail setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public DescribeImageBaselineDetailResponseBodyBaselineDetail setResultId(String resultId) {
            this.resultId = resultId;
            return this;
        }
        public String getResultId() {
            return this.resultId;
        }

    }

}
