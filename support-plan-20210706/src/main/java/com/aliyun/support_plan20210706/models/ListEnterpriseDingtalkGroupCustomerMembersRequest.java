// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ListEnterpriseDingtalkGroupCustomerMembersRequest extends TeaModel {
    // 企业服务群ID
    @NameInMap("OpenGroupId")
    public String openGroupId;

    public static ListEnterpriseDingtalkGroupCustomerMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseDingtalkGroupCustomerMembersRequest self = new ListEnterpriseDingtalkGroupCustomerMembersRequest();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseDingtalkGroupCustomerMembersRequest setOpenGroupId(String openGroupId) {
        this.openGroupId = openGroupId;
        return this;
    }
    public String getOpenGroupId() {
        return this.openGroupId;
    }

}
