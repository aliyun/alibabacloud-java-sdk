// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackResponseBody extends TeaModel {
    @NameInMap("DryRunResult")
    public UpdateStackResponseBodyDryRunResult dryRunResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StackId")
    public String stackId;

    public static UpdateStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackResponseBody self = new UpdateStackResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateStackResponseBody setDryRunResult(UpdateStackResponseBodyDryRunResult dryRunResult) {
        this.dryRunResult = dryRunResult;
        return this;
    }
    public UpdateStackResponseBodyDryRunResult getDryRunResult() {
        return this.dryRunResult;
    }

    public UpdateStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateStackResponseBody setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public static class UpdateStackResponseBodyDryRunResult extends TeaModel {
        @NameInMap("ParametersAllowedToBeModified")
        public java.util.List<String> parametersAllowedToBeModified;

        @NameInMap("ParametersCauseInterruptionIfModified")
        public java.util.List<String> parametersCauseInterruptionIfModified;

        @NameInMap("ParametersConditionallyAllowedToBeModified")
        public java.util.List<String> parametersConditionallyAllowedToBeModified;

        @NameInMap("ParametersConditionallyCauseInterruptionIfModified")
        public java.util.List<String> parametersConditionallyCauseInterruptionIfModified;

        @NameInMap("ParametersNotAllowedToBeModified")
        public java.util.List<String> parametersNotAllowedToBeModified;

        @NameInMap("ParametersUncertainlyAllowedToBeModified")
        public java.util.List<String> parametersUncertainlyAllowedToBeModified;

        @NameInMap("ParametersUncertainlyCauseInterruptionIfModified")
        public java.util.List<String> parametersUncertainlyCauseInterruptionIfModified;

        public static UpdateStackResponseBodyDryRunResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateStackResponseBodyDryRunResult self = new UpdateStackResponseBodyDryRunResult();
            return TeaModel.build(map, self);
        }

        public UpdateStackResponseBodyDryRunResult setParametersAllowedToBeModified(java.util.List<String> parametersAllowedToBeModified) {
            this.parametersAllowedToBeModified = parametersAllowedToBeModified;
            return this;
        }
        public java.util.List<String> getParametersAllowedToBeModified() {
            return this.parametersAllowedToBeModified;
        }

        public UpdateStackResponseBodyDryRunResult setParametersCauseInterruptionIfModified(java.util.List<String> parametersCauseInterruptionIfModified) {
            this.parametersCauseInterruptionIfModified = parametersCauseInterruptionIfModified;
            return this;
        }
        public java.util.List<String> getParametersCauseInterruptionIfModified() {
            return this.parametersCauseInterruptionIfModified;
        }

        public UpdateStackResponseBodyDryRunResult setParametersConditionallyAllowedToBeModified(java.util.List<String> parametersConditionallyAllowedToBeModified) {
            this.parametersConditionallyAllowedToBeModified = parametersConditionallyAllowedToBeModified;
            return this;
        }
        public java.util.List<String> getParametersConditionallyAllowedToBeModified() {
            return this.parametersConditionallyAllowedToBeModified;
        }

        public UpdateStackResponseBodyDryRunResult setParametersConditionallyCauseInterruptionIfModified(java.util.List<String> parametersConditionallyCauseInterruptionIfModified) {
            this.parametersConditionallyCauseInterruptionIfModified = parametersConditionallyCauseInterruptionIfModified;
            return this;
        }
        public java.util.List<String> getParametersConditionallyCauseInterruptionIfModified() {
            return this.parametersConditionallyCauseInterruptionIfModified;
        }

        public UpdateStackResponseBodyDryRunResult setParametersNotAllowedToBeModified(java.util.List<String> parametersNotAllowedToBeModified) {
            this.parametersNotAllowedToBeModified = parametersNotAllowedToBeModified;
            return this;
        }
        public java.util.List<String> getParametersNotAllowedToBeModified() {
            return this.parametersNotAllowedToBeModified;
        }

        public UpdateStackResponseBodyDryRunResult setParametersUncertainlyAllowedToBeModified(java.util.List<String> parametersUncertainlyAllowedToBeModified) {
            this.parametersUncertainlyAllowedToBeModified = parametersUncertainlyAllowedToBeModified;
            return this;
        }
        public java.util.List<String> getParametersUncertainlyAllowedToBeModified() {
            return this.parametersUncertainlyAllowedToBeModified;
        }

        public UpdateStackResponseBodyDryRunResult setParametersUncertainlyCauseInterruptionIfModified(java.util.List<String> parametersUncertainlyCauseInterruptionIfModified) {
            this.parametersUncertainlyCauseInterruptionIfModified = parametersUncertainlyCauseInterruptionIfModified;
            return this;
        }
        public java.util.List<String> getParametersUncertainlyCauseInterruptionIfModified() {
            return this.parametersUncertainlyCauseInterruptionIfModified;
        }

    }

}
