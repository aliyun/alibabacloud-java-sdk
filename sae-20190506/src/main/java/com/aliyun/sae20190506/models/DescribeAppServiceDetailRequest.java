// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeAppServiceDetailRequest extends TeaModel {
    // mse 的 appId
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ServiceGroup")
    public String serviceGroup;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    public static DescribeAppServiceDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppServiceDetailRequest self = new DescribeAppServiceDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppServiceDetailRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeAppServiceDetailRequest setServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup;
        return this;
    }
    public String getServiceGroup() {
        return this.serviceGroup;
    }

    public DescribeAppServiceDetailRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public DescribeAppServiceDetailRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public DescribeAppServiceDetailRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
