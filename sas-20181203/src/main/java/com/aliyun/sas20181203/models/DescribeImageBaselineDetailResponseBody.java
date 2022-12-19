// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineDetailResponseBody extends TeaModel {
    @NameInMap("BaselineDetail")
    public DescribeImageBaselineDetailResponseBodyBaselineDetail baselineDetail;

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
        @NameInMap("Advice")
        public String advice;

        @NameInMap("BaselineClassAlias")
        public String baselineClassAlias;

        @NameInMap("BaselineItemAlias")
        public String baselineItemAlias;

        @NameInMap("BaselineItemKey")
        public String baselineItemKey;

        @NameInMap("BaselineNameAlias")
        public String baselineNameAlias;

        @NameInMap("Description")
        public String description;

        @NameInMap("Level")
        public String level;

        @NameInMap("Prompt")
        public String prompt;

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
