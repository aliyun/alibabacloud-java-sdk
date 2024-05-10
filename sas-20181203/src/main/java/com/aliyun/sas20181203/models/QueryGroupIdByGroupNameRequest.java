// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryGroupIdByGroupNameRequest extends TeaModel {
    /**
     * <p>The name of the asset group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static QueryGroupIdByGroupNameRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupIdByGroupNameRequest self = new QueryGroupIdByGroupNameRequest();
        return TeaModel.build(map, self);
    }

    public QueryGroupIdByGroupNameRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public QueryGroupIdByGroupNameRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
