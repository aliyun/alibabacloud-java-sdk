// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateParameterConstraintsResponseBody extends TeaModel {
    @NameInMap("ParameterConstraints")
    public java.util.List<GetTemplateParameterConstraintsResponseBodyParameterConstraints> parameterConstraints;

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

    public static class GetTemplateParameterConstraintsResponseBodyParameterConstraints extends TeaModel {
        @NameInMap("AllowedValues")
        public java.util.List<String> allowedValues;

        @NameInMap("AssociationParameterNames")
        public java.util.List<String> associationParameterNames;

        @NameInMap("Behavior")
        public String behavior;

        @NameInMap("BehaviorReason")
        public String behaviorReason;

        @NameInMap("ParameterKey")
        public String parameterKey;

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

        public GetTemplateParameterConstraintsResponseBodyParameterConstraints setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
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
