// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DisassociateMembersRequest extends TeaModel {
    /**
     * <p>The ID of the contact.</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>The IDs of objects from which you want to unbind the contact.</p>
     */
    @NameInMap("Members")
    public java.util.List<String> members;

    public static DisassociateMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DisassociateMembersRequest self = new DisassociateMembersRequest();
        return TeaModel.build(map, self);
    }

    public DisassociateMembersRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public DisassociateMembersRequest setMembers(java.util.List<String> members) {
        this.members = members;
        return this;
    }
    public java.util.List<String> getMembers() {
        return this.members;
    }

}
