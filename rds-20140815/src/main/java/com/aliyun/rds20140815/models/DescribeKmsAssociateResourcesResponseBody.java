// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeKmsAssociateResourcesResponseBody extends TeaModel {
    @NameInMap("AssociateStatus")
    public Boolean associateStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeKmsAssociateResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKmsAssociateResourcesResponseBody self = new DescribeKmsAssociateResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKmsAssociateResourcesResponseBody setAssociateStatus(Boolean associateStatus) {
        this.associateStatus = associateStatus;
        return this;
    }
    public Boolean getAssociateStatus() {
        return this.associateStatus;
    }

    public DescribeKmsAssociateResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
