// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListPermissionVersionsRequest extends TeaModel {
    /**
     * <p>The information about the permission.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the permission.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("PermissionName")
    public String permissionName;

    public static ListPermissionVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionVersionsRequest self = new ListPermissionVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListPermissionVersionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPermissionVersionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPermissionVersionsRequest setPermissionName(String permissionName) {
        this.permissionName = permissionName;
        return this;
    }
    public String getPermissionName() {
        return this.permissionName;
    }

}
