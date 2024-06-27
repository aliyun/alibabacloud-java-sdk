// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateSampleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public CreateSampleResponseBodyResultObject resultObject;

    public static CreateSampleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSampleResponseBody self = new CreateSampleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSampleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSampleResponseBody setResultObject(CreateSampleResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public CreateSampleResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class CreateSampleResponseBodyResultObject extends TeaModel {
        @NameInMap("communityCount")
        public Integer communityCount;

        @NameInMap("failCount")
        public Integer failCount;

        @NameInMap("recallProbability")
        public String recallProbability;

        @NameInMap("riskDensity")
        public String riskDensity;

        @NameInMap("sampleCount")
        public Integer sampleCount;

        @NameInMap("successCount")
        public Integer successCount;

        public static CreateSampleResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            CreateSampleResponseBodyResultObject self = new CreateSampleResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public CreateSampleResponseBodyResultObject setCommunityCount(Integer communityCount) {
            this.communityCount = communityCount;
            return this;
        }
        public Integer getCommunityCount() {
            return this.communityCount;
        }

        public CreateSampleResponseBodyResultObject setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public CreateSampleResponseBodyResultObject setRecallProbability(String recallProbability) {
            this.recallProbability = recallProbability;
            return this;
        }
        public String getRecallProbability() {
            return this.recallProbability;
        }

        public CreateSampleResponseBodyResultObject setRiskDensity(String riskDensity) {
            this.riskDensity = riskDensity;
            return this;
        }
        public String getRiskDensity() {
            return this.riskDensity;
        }

        public CreateSampleResponseBodyResultObject setSampleCount(Integer sampleCount) {
            this.sampleCount = sampleCount;
            return this;
        }
        public Integer getSampleCount() {
            return this.sampleCount;
        }

        public CreateSampleResponseBodyResultObject setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

    }

}
