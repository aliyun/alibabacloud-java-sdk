// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListApplicationCenterServiceInstancesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListApplicationCenterServiceInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationCenterServiceInstancesRequest self = new ListApplicationCenterServiceInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationCenterServiceInstancesRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListApplicationCenterServiceInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
