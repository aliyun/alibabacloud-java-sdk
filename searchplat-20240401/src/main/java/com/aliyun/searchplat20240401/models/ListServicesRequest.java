// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListServicesRequest extends TeaModel {
    /**
     * <p>The model type. Valid values:</p>
     * <ul>
     * <li>system: built-in model</li>
     * <li>deployment: custom deployment model.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>The service name.</p>
     * 
     * <strong>example:</strong>
     * <p>文本向量化</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ops-text-embedding-001</p>
     */
    @NameInMap("serviceId")
    public String serviceId;

    /**
     * <p>The service type.</p>
     * 
     * <strong>example:</strong>
     * <p>text-embedding</p>
     */
    @NameInMap("serviceType")
    public String serviceType;

    public static ListServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServicesRequest self = new ListServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListServicesRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ListServicesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListServicesRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ListServicesRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
