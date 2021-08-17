// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseDingtalkGroupCustomerMemberRequest extends TeaModel {
    @NameInMap("OpenGroupId")
    public String openGroupId;

    @NameInMap("Mobiles")
    public java.util.List<String> mobiles;

    public static DeleteEnterpriseDingtalkGroupCustomerMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseDingtalkGroupCustomerMemberRequest self = new DeleteEnterpriseDingtalkGroupCustomerMemberRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEnterpriseDingtalkGroupCustomerMemberRequest setOpenGroupId(String openGroupId) {
        this.openGroupId = openGroupId;
        return this;
    }
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    public DeleteEnterpriseDingtalkGroupCustomerMemberRequest setMobiles(java.util.List<String> mobiles) {
        this.mobiles = mobiles;
        return this;
    }
    public java.util.List<String> getMobiles() {
        return this.mobiles;
    }

}
