// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteAiotPersonTableRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("PersonTableId")
    public String personTableId;

    public static DeleteAiotPersonTableRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAiotPersonTableRequest self = new DeleteAiotPersonTableRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAiotPersonTableRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteAiotPersonTableRequest setPersonTableId(String personTableId) {
        this.personTableId = personTableId;
        return this;
    }
    public String getPersonTableId() {
        return this.personTableId;
    }

}
