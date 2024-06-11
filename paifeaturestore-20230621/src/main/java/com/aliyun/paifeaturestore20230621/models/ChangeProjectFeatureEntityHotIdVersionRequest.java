// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ChangeProjectFeatureEntityHotIdVersionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Version")
    public String version;

    public static ChangeProjectFeatureEntityHotIdVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeProjectFeatureEntityHotIdVersionRequest self = new ChangeProjectFeatureEntityHotIdVersionRequest();
        return TeaModel.build(map, self);
    }

    public ChangeProjectFeatureEntityHotIdVersionRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
