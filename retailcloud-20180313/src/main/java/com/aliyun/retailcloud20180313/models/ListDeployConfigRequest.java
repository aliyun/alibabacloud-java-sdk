// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListDeployConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("EnvType")
    public String envType;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    public static ListDeployConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeployConfigRequest self = new ListDeployConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListDeployConfigRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public ListDeployConfigRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ListDeployConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListDeployConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
