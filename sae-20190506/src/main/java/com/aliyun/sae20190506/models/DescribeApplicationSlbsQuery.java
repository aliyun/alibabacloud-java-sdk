// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationSlbsQuery extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    public static DescribeApplicationSlbsQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationSlbsQuery self = new DescribeApplicationSlbsQuery();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationSlbsQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
