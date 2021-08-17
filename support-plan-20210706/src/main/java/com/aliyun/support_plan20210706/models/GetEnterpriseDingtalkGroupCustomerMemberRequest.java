// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class GetEnterpriseDingtalkGroupCustomerMemberRequest extends TeaModel {
    @NameInMap("OpenGroupId")
    public String openGroupId;

    @NameInMap("Mobile")
    public String mobile;

    public static GetEnterpriseDingtalkGroupCustomerMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseDingtalkGroupCustomerMemberRequest self = new GetEnterpriseDingtalkGroupCustomerMemberRequest();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseDingtalkGroupCustomerMemberRequest setOpenGroupId(String openGroupId) {
        this.openGroupId = openGroupId;
        return this;
    }
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    public GetEnterpriseDingtalkGroupCustomerMemberRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

}
