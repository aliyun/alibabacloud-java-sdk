// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UnbindGroupRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("BizCode")
    public String bizCode;

    @NameInMap("Name")
    public String name;

    public static UnbindGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindGroupRequest self = new UnbindGroupRequest();
        return TeaModel.build(map, self);
    }

    public UnbindGroupRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public UnbindGroupRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public UnbindGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
