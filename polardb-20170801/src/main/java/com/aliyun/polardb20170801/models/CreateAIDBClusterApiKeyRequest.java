// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAIDBClusterApiKeyRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The model space ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pms-xxx</p>
     */
    @NameInMap("ModelSpaceName")
    public String modelSpaceName;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query the region information of all clusters under the specified account.</li>
     * <li>If this parameter is left empty, scheduled tasks in all regions under the current account are queried by default.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateAIDBClusterApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAIDBClusterApiKeyRequest self = new CreateAIDBClusterApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateAIDBClusterApiKeyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAIDBClusterApiKeyRequest setModelSpaceName(String modelSpaceName) {
        this.modelSpaceName = modelSpaceName;
        return this;
    }
    public String getModelSpaceName() {
        return this.modelSpaceName;
    }

    public CreateAIDBClusterApiKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
