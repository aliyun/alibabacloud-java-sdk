// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GenerateOpsItemRequest extends TeaModel {
    /**
     * <p>The token that is used to ensure the idempotency.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The configuration ID of the O\&amp;M item.</p>
     * 
     * <strong>example:</strong>
     * <p>oic-ae4f******2c682e3</p>
     */
    @NameInMap("ConfigurationId")
    public String configurationId;

    /**
     * <p>The source system data.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/aliyun/ecs</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The data source system.</p>
     * 
     * <strong>example:</strong>
     * <p>/aliyun/eventbridge/event</p>
     */
    @NameInMap("DataSource")
    public String dataSource;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GenerateOpsItemRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateOpsItemRequest self = new GenerateOpsItemRequest();
        return TeaModel.build(map, self);
    }

    public GenerateOpsItemRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GenerateOpsItemRequest setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }
    public String getConfigurationId() {
        return this.configurationId;
    }

    public GenerateOpsItemRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GenerateOpsItemRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public GenerateOpsItemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
