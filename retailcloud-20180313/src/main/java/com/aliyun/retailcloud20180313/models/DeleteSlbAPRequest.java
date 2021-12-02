// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteSlbAPRequest extends TeaModel {
    @NameInMap("SlbAPId")
    public Long slbAPId;

    public static DeleteSlbAPRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSlbAPRequest self = new DeleteSlbAPRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSlbAPRequest setSlbAPId(Long slbAPId) {
        this.slbAPId = slbAPId;
        return this;
    }
    public Long getSlbAPId() {
        return this.slbAPId;
    }

}
