// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkedeploycoreDeploycoreProfiledeleteprofileidRequest extends TeaModel {
    @NameInMap("ProfileId")
    public String profileId;

    public static DeleteLinkedeploycoreDeploycoreProfiledeleteprofileidRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkedeploycoreDeploycoreProfiledeleteprofileidRequest self = new DeleteLinkedeploycoreDeploycoreProfiledeleteprofileidRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkedeploycoreDeploycoreProfiledeleteprofileidRequest setProfileId(String profileId) {
        this.profileId = profileId;
        return this;
    }
    public String getProfileId() {
        return this.profileId;
    }

}
