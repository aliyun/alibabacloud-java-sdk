// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationStatusRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0099b7be-5f5b-4512-a7fc-56049ef1****</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DescribeApplicationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationStatusRequest self = new DescribeApplicationStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
