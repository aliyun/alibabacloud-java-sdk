// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteChatConfigurationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TestChatConfig-9be97b40</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteChatConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChatConfigurationRequest self = new DeleteChatConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChatConfigurationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteChatConfigurationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
