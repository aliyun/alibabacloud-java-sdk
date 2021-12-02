// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class BindGroupRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("BizCode")
    public String bizCode;

    @NameInMap("Name")
    public String name;

    public static BindGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        BindGroupRequest self = new BindGroupRequest();
        return TeaModel.build(map, self);
    }

    public BindGroupRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public BindGroupRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public BindGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
