// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAssetInfoPublishRequest extends TeaModel {
    /**
     * <p>An extended parameter. This parameter is temporarily unavailable.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The UUIDs of the servers that you want to query.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static ListAssetInfoPublishRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAssetInfoPublishRequest self = new ListAssetInfoPublishRequest();
        return TeaModel.build(map, self);
    }

    public ListAssetInfoPublishRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAssetInfoPublishRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
