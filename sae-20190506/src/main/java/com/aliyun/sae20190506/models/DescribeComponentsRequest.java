// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeComponentsRequest extends TeaModel {
    /**
     * <p>d700e680-aa4d-4ec1-afc2-6566b5ff\*\*\*\*</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>TOMCAT</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeComponentsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentsRequest self = new DescribeComponentsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComponentsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeComponentsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
