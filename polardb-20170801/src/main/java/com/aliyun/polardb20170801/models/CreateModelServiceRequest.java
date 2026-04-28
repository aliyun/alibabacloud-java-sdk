// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateModelServiceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("BaseUrl")
    public String baseUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxxxxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InputCostPointsPerMillion")
    public String inputCostPointsPerMillion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ModelCategory")
    public String modelCategory;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("OutputCostPointsPerMillion")
    public String outputCostPointsPerMillion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>openai</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RequestCostPoints")
    public String requestCostPoints;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static CreateModelServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelServiceRequest self = new CreateModelServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelServiceRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateModelServiceRequest setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
    public String getBaseUrl() {
        return this.baseUrl;
    }

    public CreateModelServiceRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public CreateModelServiceRequest setInputCostPointsPerMillion(String inputCostPointsPerMillion) {
        this.inputCostPointsPerMillion = inputCostPointsPerMillion;
        return this;
    }
    public String getInputCostPointsPerMillion() {
        return this.inputCostPointsPerMillion;
    }

    public CreateModelServiceRequest setModelCategory(String modelCategory) {
        this.modelCategory = modelCategory;
        return this;
    }
    public String getModelCategory() {
        return this.modelCategory;
    }

    public CreateModelServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateModelServiceRequest setOutputCostPointsPerMillion(String outputCostPointsPerMillion) {
        this.outputCostPointsPerMillion = outputCostPointsPerMillion;
        return this;
    }
    public String getOutputCostPointsPerMillion() {
        return this.outputCostPointsPerMillion;
    }

    public CreateModelServiceRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateModelServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateModelServiceRequest setRequestCostPoints(String requestCostPoints) {
        this.requestCostPoints = requestCostPoints;
        return this;
    }
    public String getRequestCostPoints() {
        return this.requestCostPoints;
    }

    public CreateModelServiceRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
