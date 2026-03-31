// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetChatConfigurationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>chatOps-qiwei</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetChatConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChatConfigurationRequest self = new GetChatConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public GetChatConfigurationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetChatConfigurationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
