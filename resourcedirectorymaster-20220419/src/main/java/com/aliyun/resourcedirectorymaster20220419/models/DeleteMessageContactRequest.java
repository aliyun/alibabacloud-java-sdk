// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DeleteMessageContactRequest extends TeaModel {
    @NameInMap("ContactId")
    public String contactId;

    @NameInMap("RetainContactInMembers")
    public Boolean retainContactInMembers;

    public static DeleteMessageContactRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessageContactRequest self = new DeleteMessageContactRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMessageContactRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public DeleteMessageContactRequest setRetainContactInMembers(Boolean retainContactInMembers) {
        this.retainContactInMembers = retainContactInMembers;
        return this;
    }
    public Boolean getRetainContactInMembers() {
        return this.retainContactInMembers;
    }

}
