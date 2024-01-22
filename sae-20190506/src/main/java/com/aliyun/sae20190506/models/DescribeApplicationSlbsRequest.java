// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationSlbsRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DescribeApplicationSlbsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationSlbsRequest self = new DescribeApplicationSlbsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationSlbsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
