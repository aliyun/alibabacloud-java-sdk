// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryGroupIdByGroupNameResponseBody extends TeaModel {
    /**
     * <p>The ID of the asset group.</p>
     * 
     * <strong>example:</strong>
     * <p>9935302</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryGroupIdByGroupNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupIdByGroupNameResponseBody self = new QueryGroupIdByGroupNameResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGroupIdByGroupNameResponseBody setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public QueryGroupIdByGroupNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
