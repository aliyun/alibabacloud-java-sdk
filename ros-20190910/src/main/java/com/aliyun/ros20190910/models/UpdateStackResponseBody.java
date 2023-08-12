// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackResponseBody extends TeaModel {
    /**
     * <p>The dry run result. This parameter is returned only if DryRun is set to true.</p>
     */
    @NameInMap("DryRunResult")
    public UpdateStackResponseBodyDryRunResult dryRunResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the stack.</p>
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
         * <p>The parameters that can be modified. If you change only values of the parameters in a stack template and use the template to update the stack, no validation errors are caused.</p>
         */
        @NameInMap("ParametersAllowedToBeModified")
        public java.util.List<String> parametersAllowedToBeModified;

        /**
         * <p>The parameters whose changes cause service interruptions.</p>
         * <p>> - This parameter is supported only for a small number of resource types.</p>
         * <p>> - This parameter is valid only for updates on ROS stacks.</p>
         */
        @NameInMap("ParametersCauseInterruptionIfModified")
        public java.util.List<String> parametersCauseInterruptionIfModified;

        /**
         * <p>The parameters whose changes trigger replacement updates for resources.</p>
         * <br>
         * <p>> -  This parameter can be returned only if ReplacementOption is set to Enabled.</p>
         * <p>> -  This parameter is valid only for updates on ROS stacks.</p>
         */
        @NameInMap("ParametersCauseReplacementIfModified")
        public java.util.List<String> parametersCauseReplacementIfModified;

        /**
         * <p>The parameters that can be modified under specific conditions. If you change only values of the parameters in a stack template and use the template to update the stack, the new values of the parameters determine whether validation errors are caused.</p>
         */
        @NameInMap("ParametersConditionallyAllowedToBeModified")
        public java.util.List<String> parametersConditionallyAllowedToBeModified;

        /**
         * <p>The parameters whose changes cause service interruptions under specific conditions.</p>
         * <br>
         * <p>> - This parameter is supported only for a small number of resource types.</p>
         * <p>> -  This parameter is valid only for updates on ROS stacks.</p>
         */
        @NameInMap("ParametersConditionallyCauseInterruptionIfModified")
        public java.util.List<String> parametersConditionallyCauseInterruptionIfModified;

        /**
         * <p>The parameters whose changes trigger replacement updates for resources under specific conditions.</p>
         * <br>
         * <p>> - This parameter can be returned only if ReplacementOption is set to Enabled.</p>
         * <p>> - This parameter is valid only for updates on ROS stacks.</p>
         */
        @NameInMap("ParametersConditionallyCauseReplacementIfModified")
        public java.util.List<String> parametersConditionallyCauseReplacementIfModified;

        /**
         * <p>The parameters that cannot be modified. If you change only values of the parameters in a stack template and use the template to update the stack, validation errors are caused.</p>
         */
        @NameInMap("ParametersNotAllowedToBeModified")
        public java.util.List<String> parametersNotAllowedToBeModified;

        /**
         * <p>The parameters that can be modified under uncertain conditions. If you change only values of the parameters in a stack template and use the template to update the stack, the actual running environment determines whether validation errors are caused.</p>
         */
        @NameInMap("ParametersUncertainlyAllowedToBeModified")
        public java.util.List<String> parametersUncertainlyAllowedToBeModified;

        /**
         * <p>The parameters whose changes cause service interruptions under uncertain conditions.</p>
         * <br>
         * <p>> - This parameter is supported only for a small number of resource types.</p>
         * <p>> - This parameter is valid only for updates on ROS stacks.</p>
         */
        @NameInMap("ParametersUncertainlyCauseInterruptionIfModified")
        public java.util.List<String> parametersUncertainlyCauseInterruptionIfModified;

        /**
         * <p>The parameters whose changes trigger replacement updates for resources under uncertain conditions.</p>
         * <br>
         * <p>> - This parameter can be returned only if ReplacementOption is set to Enabled.</p>
         * <p>> - This parameter is valid only for updates on ROS stacks.</p>
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
