// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationImageQuery extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("ImageUrl")
    @Validation(required = true)
    public String imageUrl;

    public static DescribeApplicationImageQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationImageQuery self = new DescribeApplicationImageQuery();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationImageQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeApplicationImageQuery setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
