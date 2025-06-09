// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationNlbsRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DescribeApplicationNlbsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationNlbsRequest self = new DescribeApplicationNlbsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationNlbsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
