// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpLog extends TeaModel {
    @NameInMap("content")
    public String content;

    @NameInMap("ip")
    public String ip;

    public static PdpLog build(java.util.Map<String, ?> map) throws Exception {
        PdpLog self = new PdpLog();
        return TeaModel.build(map, self);
    }

    public PdpLog setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public PdpLog setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
