// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppServicesRequest extends TeaModel {
    /**
     * <p>The ID of the application. You must specify only one of the following parameters: vpcId, namespace ID, and application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>017f39b8-dfa4-4e16-a84b-1dcee4b1****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the MSE Nacos instance. This parameter is required when the registry type is set to MSE Nacos.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-cn-sco3r0u****</p>
     */
    @NameInMap("NacosInstanceId")
    public String nacosInstanceId;

    /**
     * <p>The ID of the MSE Nacos namespace. This parameter is required when the registry type is set to MSE Nacos.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-test</p>
     */
    @NameInMap("NacosNamespaceId")
    public String nacosNamespaceId;

    /**
     * <p>The ID of the namespace. You must specify only one of the following parameters: VPC ID, namespace ID, and application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The registry type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: SAE Nacos</li>
     * <li><strong>1</strong>: SAE built-in Nacos</li>
     * <li><strong>2</strong> :MSE Nacos</li>
     * <li><strong>9</strong>: SAE Kubernetes service</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RegistryType")
    public String registryType;

    /**
     * <p>The service type. Valid values:</p>
     * <ul>
     * <li><strong>dubbo</strong></li>
     * <li><strong>springCloud</strong></li>
     * <li><strong>hsf</strong></li>
     * <li><strong>k8sService</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>springCloud</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The unique identifier of the VPC. You must specify only one of the following parameters: VPC ID, namespace ID, and application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2ze0i263cnn311nvj****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ListAppServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppServicesRequest self = new ListAppServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListAppServicesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAppServicesRequest setNacosInstanceId(String nacosInstanceId) {
        this.nacosInstanceId = nacosInstanceId;
        return this;
    }
    public String getNacosInstanceId() {
        return this.nacosInstanceId;
    }

    public ListAppServicesRequest setNacosNamespaceId(String nacosNamespaceId) {
        this.nacosNamespaceId = nacosNamespaceId;
        return this;
    }
    public String getNacosNamespaceId() {
        return this.nacosNamespaceId;
    }

    public ListAppServicesRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListAppServicesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppServicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppServicesRequest setRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }
    public String getRegistryType() {
        return this.registryType;
    }

    public ListAppServicesRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public ListAppServicesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
