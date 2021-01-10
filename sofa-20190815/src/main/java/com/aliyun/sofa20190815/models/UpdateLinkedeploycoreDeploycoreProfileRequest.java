// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkedeploycoreDeploycoreProfileRequest extends TeaModel {
    @NameInMap("Detail")
    public String detail;

    @NameInMap("ProfileId")
    public Long profileId;

    @NameInMap("Scene")
    public String scene;

    public static UpdateLinkedeploycoreDeploycoreProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkedeploycoreDeploycoreProfileRequest self = new UpdateLinkedeploycoreDeploycoreProfileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkedeploycoreDeploycoreProfileRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public UpdateLinkedeploycoreDeploycoreProfileRequest setProfileId(Long profileId) {
        this.profileId = profileId;
        return this;
    }
    public Long getProfileId() {
        return this.profileId;
    }

    public UpdateLinkedeploycoreDeploycoreProfileRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
