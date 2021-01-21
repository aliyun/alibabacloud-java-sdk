// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateSummaryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("Metadata")
    @Validation(required = true)
    public java.util.Map<String, ?> metadata;

    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("ResourceIdentifierSummaries")
    @Validation(required = true)
    public java.util.List<GetTemplateSummaryResponseResourceIdentifierSummaries> resourceIdentifierSummaries;

    @NameInMap("Parameters")
    @Validation(required = true)
    public java.util.List<java.util.Map<String, ?>> parameters;

    @NameInMap("ResourceTypes")
    @Validation(required = true)
    public java.util.List<String> resourceTypes;

    public static GetTemplateSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateSummaryResponse self = new GetTemplateSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetTemplateSummaryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateSummaryResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetTemplateSummaryResponse setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public GetTemplateSummaryResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetTemplateSummaryResponse setResourceIdentifierSummaries(java.util.List<GetTemplateSummaryResponseResourceIdentifierSummaries> resourceIdentifierSummaries) {
        this.resourceIdentifierSummaries = resourceIdentifierSummaries;
        return this;
    }
    public java.util.List<GetTemplateSummaryResponseResourceIdentifierSummaries> getResourceIdentifierSummaries() {
        return this.resourceIdentifierSummaries;
    }

    public GetTemplateSummaryResponse setParameters(java.util.List<java.util.Map<String, ?>> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getParameters() {
        return this.parameters;
    }

    public GetTemplateSummaryResponse setResourceTypes(java.util.List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    public static class GetTemplateSummaryResponseResourceIdentifierSummaries extends TeaModel {
        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("LogicalResourceIds")
        @Validation(required = true)
        public java.util.List<String> logicalResourceIds;

        @NameInMap("ResourceIdentifiers")
        @Validation(required = true)
        public java.util.List<String> resourceIdentifiers;

        public static GetTemplateSummaryResponseResourceIdentifierSummaries build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateSummaryResponseResourceIdentifierSummaries self = new GetTemplateSummaryResponseResourceIdentifierSummaries();
            return TeaModel.build(map, self);
        }

        public GetTemplateSummaryResponseResourceIdentifierSummaries setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetTemplateSummaryResponseResourceIdentifierSummaries setLogicalResourceIds(java.util.List<String> logicalResourceIds) {
            this.logicalResourceIds = logicalResourceIds;
            return this;
        }
        public java.util.List<String> getLogicalResourceIds() {
            return this.logicalResourceIds;
        }

        public GetTemplateSummaryResponseResourceIdentifierSummaries setResourceIdentifiers(java.util.List<String> resourceIdentifiers) {
            this.resourceIdentifiers = resourceIdentifiers;
            return this;
        }
        public java.util.List<String> getResourceIdentifiers() {
            return this.resourceIdentifiers;
        }

    }

}
