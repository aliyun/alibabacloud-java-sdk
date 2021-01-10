// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktAdmincustomfieldRequest extends TeaModel {
    @NameInMap("CustomFieldId")
    public String customFieldId;

    public static DeleteLinkeLinktAdmincustomfieldRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktAdmincustomfieldRequest self = new DeleteLinkeLinktAdmincustomfieldRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktAdmincustomfieldRequest setCustomFieldId(String customFieldId) {
        this.customFieldId = customFieldId;
        return this;
    }
    public String getCustomFieldId() {
        return this.customFieldId;
    }

}
