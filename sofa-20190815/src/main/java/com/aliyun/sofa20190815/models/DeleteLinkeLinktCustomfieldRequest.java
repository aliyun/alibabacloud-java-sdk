// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktCustomfieldRequest extends TeaModel {
    @NameInMap("CustomFieldId")
    public String customFieldId;

    public static DeleteLinkeLinktCustomfieldRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktCustomfieldRequest self = new DeleteLinkeLinktCustomfieldRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktCustomfieldRequest setCustomFieldId(String customFieldId) {
        this.customFieldId = customFieldId;
        return this;
    }
    public String getCustomFieldId() {
        return this.customFieldId;
    }

}
