// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListProjectFeatureViewOwnersResponseBody extends TeaModel {
    @NameInMap("Owners")
    public java.util.List<String> owners;

    @NameInMap("RequestId")
    public String requestId;

    public static ListProjectFeatureViewOwnersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectFeatureViewOwnersResponseBody self = new ListProjectFeatureViewOwnersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectFeatureViewOwnersResponseBody setOwners(java.util.List<String> owners) {
        this.owners = owners;
        return this;
    }
    public java.util.List<String> getOwners() {
        return this.owners;
    }

    public ListProjectFeatureViewOwnersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
