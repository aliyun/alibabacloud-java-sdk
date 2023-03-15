// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateParameterConstraintsResponseBody extends TeaModel {
    /**
     * <p>The constraints of the parameters.</p>
     */
    @NameInMap("ParameterConstraints")
    public java.util.List<GetTemplateParameterConstraintsResponseBodyParameterConstraints> parameterConstraints;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTemplateParameterConstraintsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateParameterConstraintsResponseBody self = new GetTemplateParameterConstraintsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateParameterConstraintsResponseBody setParameterConstraints(java.util.List<GetTemplateParameterConstraintsResponseBodyParameterConstraints> parameterConstraints) {
        this.parameterConstraints = parameterConstraints;
        return this;
    }
    public java.util.List<GetTemplateParameterConstraintsResponseBodyParameterConstraints> getParameterConstraints() {
        return this.parameterConstraints;
    }

    public GetTemplateParameterConstraintsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTemplateParameterConstraintsResponseBodyParameterConstraintsNotSupportResources extends TeaModel {
        @NameInMap("PropertyName")
        public String propertyName;

        @NameInMap("ResourceType")
        public String resourceType;

        public static GetTemplateParameterConstraintsResponseBodyParameterConstraintsNotSupportResources build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateParameterConstraintsResponseBodyParameterConstraintsNotSupportResources self = new GetTemplateParameterConstraintsResponseBodyParameterConstraintsNotSupportResources();
            return TeaModel.build(map, self);
        }

        public GetTemplateParameterConstraintsResponseBodyParameterConstraintsNotSupportResources setPropertyName(String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public String getPropertyName() {
            return this.propertyName;
        }

        public GetTemplateParameterConstraintsResponseBodyParameterConstraintsNotSupportResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetTemplateParameterConstraintsResponseBodyParameterConstraintsQueryErrors extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("ResourceType")
        public String resourceType;

        public static GetTemplateParameterConstraintsResponseBodyParameterConstraintsQueryErrors build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateParameterConstraintsResponseBodyParameterConstraintsQueryErrors self = new GetTemplateParameterConstraintsResponseBodyParameterConstraintsQueryErrors();
            return TeaModel.build(map, self);
        }

        public GetTemplateParameterConstraintsResponseBodyParameterConstraintsQueryErrors setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetTemplateParameterConstraintsResponseBodyParameterConstraintsQueryErrors setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetTemplateParameterConstraintsResponseBodyParameterConstraintsQueryErrors setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetTemplateParameterConstraintsResponseBodyParameterConstraints extends TeaModel {
        /**
         * <p>The values of the parameter.</p>
         */
        @NameInMap("AllowedValues")
        public java.util.List<String> allowedValues;

        /**
         * <p>The names of the associated parameters.</p>
         */
        @NameInMap("AssociationParameterNames")
        public java.util.List<String> associationParameterNames;

        /**
         * <p>The behavior of the parameter. Valid values:</p>
         * <br>
         * <p>*   NoLimit: No limit is imposed on the value of this parameter.</p>
         * <p>*   NotSupport: The value of this parameter cannot be queried.</p>
         * <p>*   QueryError: This parameter failed to be queried.</p>
         * <br>
         * <p>>  If the AllowedValues parameter is not returned, the Behavior and BehaviorReason parameters are returned.</p>
         */
        @NameInMap("Behavior")
        public String behavior;

        /**
         * <p>The reason why the behavior of the parameter is returned.</p>
         */
        @NameInMap("BehaviorReason")
        public String behaviorReason;

        /**
         * <p>The values that do not conform to the parameter constraints.</p>
         * <br>
         * <p>>  If the `AllowedValues` parameter is returned, the `IllegalValueByParameterConstraints` and `IllegalValueByRules` parameters are returned at the same time.</p>
         */
        @NameInMap("IllegalValueByParameterConstraints")
        public java.util.List<?> illegalValueByParameterConstraints;

        /**
         * <p>The values that do not match the rules in the template.</p>
         * <br>
         * <p>>  If the `AllowedValues` parameter is returned, the `IllegalValueByParameterConstraints` and `IllegalValueByRules` parameters are returned at the same time.</p>
         */
        @NameInMap("IllegalValueByRules")
        public java.util.List<?> illegalValueByRules;

        @NameInMap("NotSupportResources")
        public java.util.List<GetTemplateParameterConstraintsResponseBodyParameterConstraintsNotSupportResources> notSupportResources;

        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("QueryErrors")
        public java.util.List<GetTemplateParameterConstraintsResponseBodyParameterConstraintsQueryErrors> queryErrors;

        /**
         * <p>The type of the parameter.</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetTemplateParameterConstraintsResponseBodyParameterConstraints build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateParameterConstraintsResponseBodyParameterConstraints self = new GetTemplateParameterConstraintsResponseBodyParameterConstraints();
            return TeaModel.build(map, self);
        }

        public GetTemplateParameterConstraintsResponseBodyParameterConstraints setAllowedValues(java.util.List<String> allowedValues) {
            this.allowedValues = allowedValues;
            return this;
        }
        public java.util.List<String> getAllowedValues() {
            return this.allowedValues;
        }

        public GetTemplateParameterConstraintsResponseBodyParameterConstraints setAssociationParameterNames(java.util.List<String> associationParameterNames) {
            this.associationParameterNames = associationParameterNames;
            return this;
        }
        public java.util.List<String> getAssociationParameterNames() {
            return this.associationParameterNames;
        }

        public GetTemplateParameterConstraintsResponseBodyParameterConstraints setBehavior(String behavior) {
            this.behavior = behavior;
            return this;
        }
        public String getBehavior() {
            return this.behavior;
        }

        public GetTemplateParameterConstraintsResponseBodyParameterConstraints setBehaviorReason(String behaviorReason) {
            this.behaviorReason = behaviorReason;
            return this;
        }
        public String getBehaviorReason() {
            return this.behaviorReason;
        }

        public GetTemplateParameterConstraintsResponseBodyParameterConstraints setIllegalValueByParameterConstraints(java.util.List<?> illegalValueByParameterConstraints) {
            this.illegalValueByParameterConstraints = illegalValueByParameterConstraints;
            return this;
        }
        public java.util.List<?> getIllegalValueByParameterConstraints() {
            return this.illegalValueByParameterConstraints;
        }

        public GetTemplateParameterConstraintsResponseBodyParameterConstraints setIllegalValueByRules(java.util.List<?> illegalValueByRules) {
            this.illegalValueByRules = illegalValueByRules;
            return this;
        }
        public java.util.List<?> getIllegalValueByRules() {
            return this.illegalValueByRules;
        }

        public GetTemplateParameterConstraintsResponseBodyParameterConstraints setNotSupportResources(java.util.List<GetTemplateParameterConstraintsResponseBodyParameterConstraintsNotSupportResources> notSupportResources) {
            this.notSupportResources = notSupportResources;
            return this;
        }
        public java.util.List<GetTemplateParameterConstraintsResponseBodyParameterConstraintsNotSupportResources> getNotSupportResources() {
            return this.notSupportResources;
        }

        public GetTemplateParameterConstraintsResponseBodyParameterConstraints setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetTemplateParameterConstraintsResponseBodyParameterConstraints setQueryErrors(java.util.List<GetTemplateParameterConstraintsResponseBodyParameterConstraintsQueryErrors> queryErrors) {
            this.queryErrors = queryErrors;
            return this;
        }
        public java.util.List<GetTemplateParameterConstraintsResponseBodyParameterConstraintsQueryErrors> getQueryErrors() {
            return this.queryErrors;
        }

        public GetTemplateParameterConstraintsResponseBodyParameterConstraints setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
