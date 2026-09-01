// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeSpaceAttributeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pks-xxxx</p>
     */
    @NameInMap("KnowledgeSpaceId")
    public String knowledgeSpaceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeKnowledgeSpaceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeSpaceAttributeRequest self = new DescribeKnowledgeSpaceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeSpaceAttributeRequest setKnowledgeSpaceId(String knowledgeSpaceId) {
        this.knowledgeSpaceId = knowledgeSpaceId;
        return this;
    }
    public String getKnowledgeSpaceId() {
        return this.knowledgeSpaceId;
    }

    public DescribeKnowledgeSpaceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
