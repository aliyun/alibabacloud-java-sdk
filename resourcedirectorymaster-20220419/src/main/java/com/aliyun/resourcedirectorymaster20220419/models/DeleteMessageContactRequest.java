// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DeleteMessageContactRequest extends TeaModel {
    /**
     * <p>The ID of the contact.</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>Specifies whether to retain the contact for members. Valid values:</p>
     * <br>
     * <p>*   true (default): retains the contact for members. In this case, the contact can still receive messages for the members.</p>
     * <p>*   false: does not retain the contact for members. In this case, the contact can no longer receive messages for the members. If you set this parameter to false, the response is asynchronously returned. You can call [GetMessageContactDeletionStatus](~~GetMessageContactDeletionStatus~~) to obtain the deletion result.</p>
     */
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
