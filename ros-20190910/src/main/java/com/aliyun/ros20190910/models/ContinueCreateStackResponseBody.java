// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ContinueCreateStackResponseBody extends TeaModel {
    /**
     * <p>The validation result.</p>
     */
    @NameInMap("DryRunResult")
    public ContinueCreateStackResponseBodyDryRunResult dryRunResult;

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

    public static ContinueCreateStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ContinueCreateStackResponseBody self = new ContinueCreateStackResponseBody();
        return TeaModel.build(map, self);
    }

    public ContinueCreateStackResponseBody setDryRunResult(ContinueCreateStackResponseBodyDryRunResult dryRunResult) {
        this.dryRunResult = dryRunResult;
        return this;
    }
    public ContinueCreateStackResponseBodyDryRunResult getDryRunResult() {
        return this.dryRunResult;
    }

    public ContinueCreateStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ContinueCreateStackResponseBody setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public static class ContinueCreateStackResponseBodyDryRunResult extends TeaModel {
        /**
         * <p>The parameters that can be modified. The operation that is performed to modify the parameters does not cause a validation error.</p>
         * <br>
         * <p>>  This parameter is returned only if the DryRun parameter is set to `true`. The value of the ParametersAllowedToBeModified parameter varies based on the values of the Mode, Template\*, RecreatingResources.N, and RecreatingOptions.N parameters.</p>
         */
        @NameInMap("ParametersAllowedToBeModified")
        public java.util.List<String> parametersAllowedToBeModified;

        /**
         * <p>The parameters that can be modified under specific conditions.</p>
         * <br>
         * <p>The new values of the parameters determine whether the operation that is performed to modify the parameters causes a validation error.</p>
         * <br>
         * <p>>  This parameter is returned only if the DryRun parameter is set to `true`. The value of the ParametersConditionallyAllowedToBeModified parameter varies based on the values of the Mode, Template\*, RecreatingResources.N, and RecreatingOptions.N parameters.</p>
         */
        @NameInMap("ParametersConditionallyAllowedToBeModified")
        public java.util.List<String> parametersConditionallyAllowedToBeModified;

        /**
         * <p>The parameters that cannot be modified. The operation that is performed to modify the parameters causes a validation error.</p>
         * <br>
         * <p>>  This parameter is returned only if the DryRun parameter is set to `true`. The value of the ParametersNotAllowedToBeModified parameter varies based on the values of the Mode, Template\*, RecreatingResources.N, and RecreatingOptions.N parameters.</p>
         */
        @NameInMap("ParametersNotAllowedToBeModified")
        public java.util.List<String> parametersNotAllowedToBeModified;

        public static ContinueCreateStackResponseBodyDryRunResult build(java.util.Map<String, ?> map) throws Exception {
            ContinueCreateStackResponseBodyDryRunResult self = new ContinueCreateStackResponseBodyDryRunResult();
            return TeaModel.build(map, self);
        }

        public ContinueCreateStackResponseBodyDryRunResult setParametersAllowedToBeModified(java.util.List<String> parametersAllowedToBeModified) {
            this.parametersAllowedToBeModified = parametersAllowedToBeModified;
            return this;
        }
        public java.util.List<String> getParametersAllowedToBeModified() {
            return this.parametersAllowedToBeModified;
        }

        public ContinueCreateStackResponseBodyDryRunResult setParametersConditionallyAllowedToBeModified(java.util.List<String> parametersConditionallyAllowedToBeModified) {
            this.parametersConditionallyAllowedToBeModified = parametersConditionallyAllowedToBeModified;
            return this;
        }
        public java.util.List<String> getParametersConditionallyAllowedToBeModified() {
            return this.parametersConditionallyAllowedToBeModified;
        }

        public ContinueCreateStackResponseBodyDryRunResult setParametersNotAllowedToBeModified(java.util.List<String> parametersNotAllowedToBeModified) {
            this.parametersNotAllowedToBeModified = parametersNotAllowedToBeModified;
            return this;
        }
        public java.util.List<String> getParametersNotAllowedToBeModified() {
            return this.parametersNotAllowedToBeModified;
        }

    }

}
