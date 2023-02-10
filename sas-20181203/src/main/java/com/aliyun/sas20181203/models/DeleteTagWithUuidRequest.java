// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteTagWithUuidRequest extends TeaModel {
    @NameInMap("TagName")
    public String tagName;

    @NameInMap("UuidList")
    public String uuidList;

    public static DeleteTagWithUuidRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagWithUuidRequest self = new DeleteTagWithUuidRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTagWithUuidRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public DeleteTagWithUuidRequest setUuidList(String uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public String getUuidList() {
        return this.uuidList;
    }

}
