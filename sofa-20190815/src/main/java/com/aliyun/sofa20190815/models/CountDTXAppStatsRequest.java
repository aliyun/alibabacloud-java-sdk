// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountDTXAppStatsRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("InstanceId")
    public String instanceId;

    public static CountDTXAppStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        CountDTXAppStatsRequest self = new CountDTXAppStatsRequest();
        return TeaModel.build(map, self);
    }

    public CountDTXAppStatsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CountDTXAppStatsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CountDTXAppStatsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
