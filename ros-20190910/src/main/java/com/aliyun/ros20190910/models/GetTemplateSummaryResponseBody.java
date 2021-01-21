// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateSummaryResponseBody extends TeaModel {
    @NameInMap("ResourceTypes")
    public java.util.List<String> resourceTypes;

    @NameInMap("Description")
    public String description;

    @NameInMap("Parameters")
    public java.util.List<java.util.Map<String, ?>> parameters;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Version")
    public String version;

    @NameInMap("Metadata")
    public java.util.Map<String, ?> metadata;

    @NameInMap("ResourceIdentifierSummaries")
    public java.util.List<GetTemplateSummaryResponseBodyResourceIdentifierSummaries> resourceIdentifierSummaries;

    public static GetTemplateSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateSummaryResponseBody self = new GetTemplateSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateSummaryResponseBody setResourceTypes(java.util.List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    public GetTemplateSummaryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetTemplateSummaryResponseBody setParameters(java.util.List<java.util.Map<String, ?>> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getParameters() {
        return this.parameters;
    }

    public GetTemplateSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateSummaryResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetTemplateSummaryResponseBody setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public GetTemplateSummaryResponseBody setResourceIdentifierSummaries(java.util.List<GetTemplateSummaryResponseBodyResourceIdentifierSummaries> resourceIdentifierSummaries) {
        this.resourceIdentifierSummaries = resourceIdentifierSummaries;
        return this;
    }
    public java.util.List<GetTemplateSummaryResponseBodyResourceIdentifierSummaries> getResourceIdentifierSummaries() {
        return this.resourceIdentifierSummaries;
    }

    public static class GetTemplateSummaryResponseBodyResourceIdentifierSummaries extends TeaModel {
        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("LogicalResourceIds")
        public java.util.List<String> logicalResourceIds;

        @NameInMap("ResourceIdentifiers")
        public java.util.List<String> resourceIdentifiers;

        public static GetTemplateSummaryResponseBodyResourceIdentifierSummaries build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateSummaryResponseBodyResourceIdentifierSummaries self = new GetTemplateSummaryResponseBodyResourceIdentifierSummaries();
            return TeaModel.build(map, self);
        }

        public GetTemplateSummaryResponseBodyResourceIdentifierSummaries setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetTemplateSummaryResponseBodyResourceIdentifierSummaries setLogicalResourceIds(java.util.List<String> logicalResourceIds) {
            this.logicalResourceIds = logicalResourceIds;
            return this;
        }
        public java.util.List<String> getLogicalResourceIds() {
            return this.logicalResourceIds;
        }

        public GetTemplateSummaryResponseBodyResourceIdentifierSummaries setResourceIdentifiers(java.util.List<String> resourceIdentifiers) {
            this.resourceIdentifiers = resourceIdentifiers;
            return this;
        }
        public java.util.List<String> getResourceIdentifiers() {
            return this.resourceIdentifiers;
        }

    }

}
