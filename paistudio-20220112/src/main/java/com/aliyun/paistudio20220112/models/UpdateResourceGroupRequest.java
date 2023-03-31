// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UpdateResourceGroupRequest extends TeaModel {
    @NameInMap("Unbind")
    public Boolean unbind;

    @NameInMap("UserVpc")
    public UserVpc userVpc;

    public static UpdateResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceGroupRequest self = new UpdateResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceGroupRequest setUnbind(Boolean unbind) {
        this.unbind = unbind;
        return this;
    }
    public Boolean getUnbind() {
        return this.unbind;
    }

    public UpdateResourceGroupRequest setUserVpc(UserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

}
