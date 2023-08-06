// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetMessageContactDeletionStatusRequest extends TeaModel {
    /**
     * <p>The ID of the contact.</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    public static GetMessageContactDeletionStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMessageContactDeletionStatusRequest self = new GetMessageContactDeletionStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetMessageContactDeletionStatusRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

}
