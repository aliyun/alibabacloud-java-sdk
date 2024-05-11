// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class CheckLayerResponseBody extends TeaModel {
    @NameInMap("CheckResults")
    public java.util.List<CheckLayerResponseBodyCheckResults> checkResults;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckLayerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLayerResponseBody self = new CheckLayerResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLayerResponseBody setCheckResults(java.util.List<CheckLayerResponseBodyCheckResults> checkResults) {
        this.checkResults = checkResults;
        return this;
    }
    public java.util.List<CheckLayerResponseBodyCheckResults> getCheckResults() {
        return this.checkResults;
    }

    public CheckLayerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckLayerResponseBodyCheckResults extends TeaModel {
        @NameInMap("ExperimentId")
        public String experimentId;

        @NameInMap("ExperimentName")
        public String experimentName;

        @NameInMap("ParamName")
        public String paramName;

        public static CheckLayerResponseBodyCheckResults build(java.util.Map<String, ?> map) throws Exception {
            CheckLayerResponseBodyCheckResults self = new CheckLayerResponseBodyCheckResults();
            return TeaModel.build(map, self);
        }

        public CheckLayerResponseBodyCheckResults setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public CheckLayerResponseBodyCheckResults setExperimentName(String experimentName) {
            this.experimentName = experimentName;
            return this;
        }
        public String getExperimentName() {
            return this.experimentName;
        }

        public CheckLayerResponseBodyCheckResults setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

    }

}
