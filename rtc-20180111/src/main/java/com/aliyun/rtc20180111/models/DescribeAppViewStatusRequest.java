// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppViewStatusRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can create and find the application ID in the console. Only one ID can be specified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DescribeAppViewStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppViewStatusRequest self = new DescribeAppViewStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppViewStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
