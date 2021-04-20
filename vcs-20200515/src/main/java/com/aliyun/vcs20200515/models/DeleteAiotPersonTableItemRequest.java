// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteAiotPersonTableItemRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("PersonTableId")
    public String personTableId;

    @NameInMap("PersonTableItemId")
    public String personTableItemId;

    public static DeleteAiotPersonTableItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAiotPersonTableItemRequest self = new DeleteAiotPersonTableItemRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAiotPersonTableItemRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteAiotPersonTableItemRequest setPersonTableId(String personTableId) {
        this.personTableId = personTableId;
        return this;
    }
    public String getPersonTableId() {
        return this.personTableId;
    }

    public DeleteAiotPersonTableItemRequest setPersonTableItemId(String personTableItemId) {
        this.personTableItemId = personTableItemId;
        return this;
    }
    public String getPersonTableItemId() {
        return this.personTableItemId;
    }

}
