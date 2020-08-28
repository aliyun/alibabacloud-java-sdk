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

    }

}
