// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class SendWangWangShrinkRequest extends TeaModel {
    @NameInMap("Msg")
    public String msg;

    @NameInMap("Title")
    public String title;

    @NameInMap("To")
    public String toShrink;

    public static SendWangWangShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendWangWangShrinkRequest self = new SendWangWangShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendWangWangShrinkRequest setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SendWangWangShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SendWangWangShrinkRequest setToShrink(String toShrink) {
        this.toShrink = toShrink;
        return this;
    }
    public String getToShrink() {
        return this.toShrink;
    }

}
