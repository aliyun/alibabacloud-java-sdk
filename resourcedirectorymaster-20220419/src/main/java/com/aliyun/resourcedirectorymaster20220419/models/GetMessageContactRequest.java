// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetMessageContactRequest extends TeaModel {
    /**
     * <p>The ID of the contact.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-qL4HqKONzOM7****</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    public static GetMessageContactRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMessageContactRequest self = new GetMessageContactRequest();
        return TeaModel.build(map, self);
    }

    public GetMessageContactRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

}
