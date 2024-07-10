// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeAppServiceDetailRequest extends TeaModel {
    /**
     * <p>6dcc8c9e-d3da-478a-a066-86dcf820\<em>\</em>\<em>\</em></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6dcc8c9e-d3da-478a-a066-86dcf820****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("NacosInstanceId")
    public String nacosInstanceId;

    @NameInMap("NacosNamespaceId")
    public String nacosNamespaceId;

    /**
     * <p>springCloud</p>
     * 
     * <strong>example:</strong>
     * <p>springCloud</p>
     */
    @NameInMap("ServiceGroup")
    public String serviceGroup;

    /**
     * <p>edas.service.provider</p>
     * 
     * <strong>example:</strong>
     * <p>edas.service.provider</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>springCloud</p>
     * 
     * <strong>example:</strong>
     * <p>springCloud</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>1.0.0</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
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

    public DescribeAppServiceDetailRequest setNacosInstanceId(String nacosInstanceId) {
        this.nacosInstanceId = nacosInstanceId;
        return this;
    }
    public String getNacosInstanceId() {
        return this.nacosInstanceId;
    }

    public DescribeAppServiceDetailRequest setNacosNamespaceId(String nacosNamespaceId) {
        this.nacosNamespaceId = nacosNamespaceId;
        return this;
    }
    public String getNacosNamespaceId() {
        return this.nacosNamespaceId;
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
