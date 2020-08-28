// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackOperationRisksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RiskResources")
    @Validation(required = true)
    public java.util.List<ListStackOperationRisksResponseRiskResources> riskResources;

    public static ListStackOperationRisksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackOperationRisksResponse self = new ListStackOperationRisksResponse();
        return TeaModel.build(map, self);
    }

    public static class ListStackOperationRisksResponseRiskResources extends TeaModel {
        @NameInMap("LogicalResourceId")
        @Validation(required = true)
        public String logicalResourceId;

        @NameInMap("PhysicalResourceId")
        @Validation(required = true)
        public String physicalResourceId;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("Reason")
        @Validation(required = true)
        public String reason;

        @NameInMap("RiskType")
        @Validation(required = true)
        public String riskType;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("RequestId")
        @Validation(required = true)
        public String requestId;

        public static ListStackOperationRisksResponseRiskResources build(java.util.Map<String, ?> map) throws Exception {
            ListStackOperationRisksResponseRiskResources self = new ListStackOperationRisksResponseRiskResources();
            return TeaModel.build(map, self);
        }

    }

}
