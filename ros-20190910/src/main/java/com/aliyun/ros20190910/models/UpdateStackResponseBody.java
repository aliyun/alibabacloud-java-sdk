// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackResponseBody extends TeaModel {
    /**
     * <p>The validation result. This parameter is returned only when DryRun is set to true.</p>
     */
    @NameInMap("DryRunResult")
    public UpdateStackResponseBodyDryRunResult dryRunResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The stack ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
     */
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
        /**
         * <p>The parameters that are allowed to be modified.</p>
         */
        @NameInMap("ParametersAllowedToBeModified")
        public java.util.List<String> parametersAllowedToBeModified;

        /**
         * <p>The list of parameters that will definitely cause resource interruption.</p>
         * <blockquote>
         * <ul>
         * <li>Only a small number of resource types are supported.</li>
         * <li>This applies only to updating ROS stacks.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("ParametersCauseInterruptionIfModified")
        public java.util.List<String> parametersCauseInterruptionIfModified;

        /**
         * <p>The list of parameters that will definitely cause resource replacement update.</p>
         * <blockquote>
         * <ul>
         * <li>This is returned only when ReplacementOption is set to Enabled.</li>
         * <li>This applies only to updating ROS stacks.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("ParametersCauseReplacementIfModified")
        public java.util.List<String> parametersCauseReplacementIfModified;

        /**
         * <p>The parameters that may be allowed to be modified.</p>
         */
        @NameInMap("ParametersConditionallyAllowedToBeModified")
        public java.util.List<String> parametersConditionallyAllowedToBeModified;

        /**
         * <p>The list of parameters that may cause resource interruption.</p>
         * <blockquote>
         * <ul>
         * <li>Only a small number of resource types are supported.</li>
         * <li>This applies only to updating ROS stacks.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("ParametersConditionallyCauseInterruptionIfModified")
        public java.util.List<String> parametersConditionallyCauseInterruptionIfModified;

        /**
         * <p>The list of parameters that may cause resource replacement update.</p>
         * <blockquote>
         * <ul>
         * <li>This is returned only when ReplacementOption is set to Enabled.</li>
         * <li>This applies only to updating ROS stacks.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("ParametersConditionallyCauseReplacementIfModified")
        public java.util.List<String> parametersConditionallyCauseReplacementIfModified;

        /**
         * <p>The parameters that are not allowed to be modified.</p>
         */
        @NameInMap("ParametersNotAllowedToBeModified")
        public java.util.List<String> parametersNotAllowedToBeModified;

        /**
         * <p>The parameters that are uncertain to be allowed to be modified.</p>
         */
        @NameInMap("ParametersUncertainlyAllowedToBeModified")
        public java.util.List<String> parametersUncertainlyAllowedToBeModified;

        /**
         * <p>The list of parameters that are uncertain to cause resource interruption.</p>
         * <blockquote>
         * <ul>
         * <li>Only a small number of resource types are supported.</li>
         * <li>This applies only to updating ROS stacks.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("ParametersUncertainlyCauseInterruptionIfModified")
        public java.util.List<String> parametersUncertainlyCauseInterruptionIfModified;

        /**
         * <p>The list of parameters that are uncertain to cause resource replacement update.</p>
         * <blockquote>
         * <ul>
         * <li>This is returned only when ReplacementOption is set to Enabled.</li>
         * <li>This applies only to updating ROS stacks.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("ParametersUncertainlyCauseReplacementIfModified")
        public java.util.List<String> parametersUncertainlyCauseReplacementIfModified;

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

        public UpdateStackResponseBodyDryRunResult setParametersCauseReplacementIfModified(java.util.List<String> parametersCauseReplacementIfModified) {
            this.parametersCauseReplacementIfModified = parametersCauseReplacementIfModified;
            return this;
        }
        public java.util.List<String> getParametersCauseReplacementIfModified() {
            return this.parametersCauseReplacementIfModified;
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

        public UpdateStackResponseBodyDryRunResult setParametersConditionallyCauseReplacementIfModified(java.util.List<String> parametersConditionallyCauseReplacementIfModified) {
            this.parametersConditionallyCauseReplacementIfModified = parametersConditionallyCauseReplacementIfModified;
            return this;
        }
        public java.util.List<String> getParametersConditionallyCauseReplacementIfModified() {
            return this.parametersConditionallyCauseReplacementIfModified;
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

        public UpdateStackResponseBodyDryRunResult setParametersUncertainlyCauseReplacementIfModified(java.util.List<String> parametersUncertainlyCauseReplacementIfModified) {
            this.parametersUncertainlyCauseReplacementIfModified = parametersUncertainlyCauseReplacementIfModified;
            return this;
        }
        public java.util.List<String> getParametersUncertainlyCauseReplacementIfModified() {
            return this.parametersUncertainlyCauseReplacementIfModified;
        }

    }

}
