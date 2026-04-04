// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppAssistantAgentsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>ChannelOps</p>
     */
    @NameInMap("PlatformType")
    public String platformType;

    public static ListAppAssistantAgentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppAssistantAgentsRequest self = new ListAppAssistantAgentsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppAssistantAgentsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListAppAssistantAgentsRequest setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

}
