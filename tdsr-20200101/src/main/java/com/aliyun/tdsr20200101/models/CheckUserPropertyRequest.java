// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CheckUserPropertyRequest extends TeaModel {
    // 用户uid
    @NameInMap("Uid")
    public String uid;

    public static CheckUserPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUserPropertyRequest self = new CheckUserPropertyRequest();
        return TeaModel.build(map, self);
    }

    public CheckUserPropertyRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
