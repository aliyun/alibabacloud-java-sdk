// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class WriteProjectFeatureEntityHotIdsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("HotIds")
    public String hotIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20221213</p>
     */
    @NameInMap("Version")
    public String version;

    public static WriteProjectFeatureEntityHotIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        WriteProjectFeatureEntityHotIdsRequest self = new WriteProjectFeatureEntityHotIdsRequest();
        return TeaModel.build(map, self);
    }

    public WriteProjectFeatureEntityHotIdsRequest setHotIds(String hotIds) {
        this.hotIds = hotIds;
        return this;
    }
    public String getHotIds() {
        return this.hotIds;
    }

    public WriteProjectFeatureEntityHotIdsRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
