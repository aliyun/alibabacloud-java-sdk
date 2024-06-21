// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateSummaryResponseBody extends TeaModel {
    /**
     * <p>The description of the stack template.</p>
     * 
     * <strong>example:</strong>
     * <p>No description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The metadata that is defined in the template.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;: &quot;value&quot;}</p>
     */
    @NameInMap("Metadata")
    public java.util.Map<String, ?> metadata;

    /**
     * <p>The declarations of the parameters in the template.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<java.util.Map<String, ?>> parameters;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource identifier summaries.\
     * A summary describes the resource that you want to import and the properties that are used to identify the resource during the import. For example, VpcId is an identifier property of ALIYUN::ECS::VPC.</p>
     */
    @NameInMap("ResourceIdentifierSummaries")
    public java.util.List<GetTemplateSummaryResponseBodyResourceIdentifierSummaries> resourceIdentifierSummaries;

    /**
     * <p>All resource types that are used in the template.</p>
     */
    @NameInMap("ResourceTypes")
    public java.util.List<String> resourceTypes;

    /**
     * <p>The version of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-09-01</p>
     */
    @NameInMap("Version")
    public String version;

    public static GetTemplateSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateSummaryResponseBody self = new GetTemplateSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateSummaryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetTemplateSummaryResponseBody setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
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

    public GetTemplateSummaryResponseBody setResourceIdentifierSummaries(java.util.List<GetTemplateSummaryResponseBodyResourceIdentifierSummaries> resourceIdentifierSummaries) {
        this.resourceIdentifierSummaries = resourceIdentifierSummaries;
        return this;
    }
    public java.util.List<GetTemplateSummaryResponseBodyResourceIdentifierSummaries> getResourceIdentifierSummaries() {
        return this.resourceIdentifierSummaries;
    }

    public GetTemplateSummaryResponseBody setResourceTypes(java.util.List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    public GetTemplateSummaryResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class GetTemplateSummaryResponseBodyResourceIdentifierSummaries extends TeaModel {
        /**
         * <p>The logical IDs of all resources of the type that is specified by ResouceType in the template.</p>
         */
        @NameInMap("LogicalResourceIds")
        public java.util.List<String> logicalResourceIds;

        /**
         * <p>The resource properties. You can use a resource property to identify the resource that you want to manage. For example, VpcId is an identifier property of ALIYUN::ECS::VPC.</p>
         */
        @NameInMap("ResourceIdentifiers")
        public java.util.List<String> resourceIdentifiers;

        /**
         * <p>The resource type.</p>
         * <blockquote>
         * <p>The resource import feature is supported for the resource type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::ECS::VPC</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static GetTemplateSummaryResponseBodyResourceIdentifierSummaries build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateSummaryResponseBodyResourceIdentifierSummaries self = new GetTemplateSummaryResponseBodyResourceIdentifierSummaries();
            return TeaModel.build(map, self);
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

        public GetTemplateSummaryResponseBodyResourceIdentifierSummaries setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
