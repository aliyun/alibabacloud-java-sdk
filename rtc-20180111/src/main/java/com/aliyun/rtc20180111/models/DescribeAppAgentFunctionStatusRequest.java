// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppAgentFunctionStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DescribeAppAgentFunctionStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppAgentFunctionStatusRequest self = new DescribeAppAgentFunctionStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppAgentFunctionStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
