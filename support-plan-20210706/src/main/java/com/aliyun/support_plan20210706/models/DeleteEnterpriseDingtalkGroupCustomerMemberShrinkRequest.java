// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseDingtalkGroupCustomerMemberShrinkRequest extends TeaModel {
    @NameInMap("Mobiles")
    public String mobilesShrink;

    @NameInMap("OpenGroupId")
    public String openGroupId;

    public static DeleteEnterpriseDingtalkGroupCustomerMemberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseDingtalkGroupCustomerMemberShrinkRequest self = new DeleteEnterpriseDingtalkGroupCustomerMemberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEnterpriseDingtalkGroupCustomerMemberShrinkRequest setMobilesShrink(String mobilesShrink) {
        this.mobilesShrink = mobilesShrink;
        return this;
    }
    public String getMobilesShrink() {
        return this.mobilesShrink;
    }

    public DeleteEnterpriseDingtalkGroupCustomerMemberShrinkRequest setOpenGroupId(String openGroupId) {
        this.openGroupId = openGroupId;
        return this;
    }
    public String getOpenGroupId() {
        return this.openGroupId;
    }

}
