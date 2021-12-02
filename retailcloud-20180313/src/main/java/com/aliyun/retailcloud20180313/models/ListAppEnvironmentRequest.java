// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListAppEnvironmentRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("EnvName")
    public String envName;

    @NameInMap("EnvType")
    public Integer envType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListAppEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppEnvironmentRequest self = new ListAppEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public ListAppEnvironmentRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public ListAppEnvironmentRequest setEnvName(String envName) {
        this.envName = envName;
        return this;
    }
    public String getEnvName() {
        return this.envName;
    }

    public ListAppEnvironmentRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public ListAppEnvironmentRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppEnvironmentRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
