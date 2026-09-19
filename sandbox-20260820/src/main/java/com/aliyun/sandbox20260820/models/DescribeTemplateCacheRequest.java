// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class DescribeTemplateCacheRequest extends TeaModel {
    @NameInMap("teamID")
    public String teamID;

    public static DescribeTemplateCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateCacheRequest self = new DescribeTemplateCacheRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateCacheRequest setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

}
