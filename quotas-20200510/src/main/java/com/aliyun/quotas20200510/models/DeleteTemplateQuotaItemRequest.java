// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class DeleteTemplateQuotaItemRequest extends TeaModel {
    /**
     * <p>The ID of the quota template.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/450403.html">ListQuotaApplicationTemplates</a> operation to obtain the ID of a quota template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1****</p>
     */
    @NameInMap("Id")
    public String id;

    public static DeleteTemplateQuotaItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateQuotaItemRequest self = new DeleteTemplateQuotaItemRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTemplateQuotaItemRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
