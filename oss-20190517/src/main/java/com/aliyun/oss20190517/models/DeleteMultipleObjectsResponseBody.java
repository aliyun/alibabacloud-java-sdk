// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class DeleteMultipleObjectsResponseBody extends TeaModel {
    @NameInMap("Deleted")
    public java.util.List<DeletedObject> deleted;

    public static DeleteMultipleObjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultipleObjectsResponseBody self = new DeleteMultipleObjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMultipleObjectsResponseBody setDeleted(java.util.List<DeletedObject> deleted) {
        this.deleted = deleted;
        return this;
    }
    public java.util.List<DeletedObject> getDeleted() {
        return this.deleted;
    }

}
