// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAIDBClusterApiKeyRequest extends TeaModel {
    /**
     * <p>The API key of the model service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <strong>example:</strong>
     * <p>pms-xxx</p>
     */
    @NameInMap("ModelSpaceName")
    public String modelSpaceName;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query region IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteAIDBClusterApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIDBClusterApiKeyRequest self = new DeleteAIDBClusterApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAIDBClusterApiKeyRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public DeleteAIDBClusterApiKeyRequest setModelSpaceName(String modelSpaceName) {
        this.modelSpaceName = modelSpaceName;
        return this;
    }
    public String getModelSpaceName() {
        return this.modelSpaceName;
    }

    public DeleteAIDBClusterApiKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
