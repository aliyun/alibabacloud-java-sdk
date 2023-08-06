// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class AssociateMembersRequest extends TeaModel {
    /**
     * <p>The ID of the contact.</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>The IDs of objects to which you want to bind the contact.</p>
     */
    @NameInMap("Members")
    public java.util.List<String> members;

    public static AssociateMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateMembersRequest self = new AssociateMembersRequest();
        return TeaModel.build(map, self);
    }

    public AssociateMembersRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public AssociateMembersRequest setMembers(java.util.List<String> members) {
        this.members = members;
        return this;
    }
    public java.util.List<String> getMembers() {
        return this.members;
    }

}
