// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class AddRamMemberRequest extends TeaModel {
    @NameInMap("CorpIdentifier")
    public String corpIdentifier;

    @NameInMap("StaffIdentifier")
    public String staffIdentifier;

    public static AddRamMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRamMemberRequest self = new AddRamMemberRequest();
        return TeaModel.build(map, self);
    }

    public AddRamMemberRequest setCorpIdentifier(String corpIdentifier) {
        this.corpIdentifier = corpIdentifier;
        return this;
    }
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

    public AddRamMemberRequest setStaffIdentifier(String staffIdentifier) {
        this.staffIdentifier = staffIdentifier;
        return this;
    }
    public String getStaffIdentifier() {
        return this.staffIdentifier;
    }

}
