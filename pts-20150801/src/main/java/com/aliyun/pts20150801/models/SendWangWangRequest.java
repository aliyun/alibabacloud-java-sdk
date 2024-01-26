// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class SendWangWangRequest extends TeaModel {
    @NameInMap("Msg")
    public String msg;

    @NameInMap("Title")
    public String title;

    @NameInMap("To")
    public java.util.Map<String, ?> to;

    public static SendWangWangRequest build(java.util.Map<String, ?> map) throws Exception {
        SendWangWangRequest self = new SendWangWangRequest();
        return TeaModel.build(map, self);
    }

    public SendWangWangRequest setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SendWangWangRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SendWangWangRequest setTo(java.util.Map<String, ?> to) {
        this.to = to;
        return this;
    }
    public java.util.Map<String, ?> getTo() {
        return this.to;
    }

}
