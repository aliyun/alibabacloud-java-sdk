// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHoneypotProbeBindRequest extends TeaModel {
    @NameInMap("BindId")
    public String bindId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ProbeId")
    public String probeId;

    public static DeleteHoneypotProbeBindRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHoneypotProbeBindRequest self = new DeleteHoneypotProbeBindRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHoneypotProbeBindRequest setBindId(String bindId) {
        this.bindId = bindId;
        return this;
    }
    public String getBindId() {
        return this.bindId;
    }

    public DeleteHoneypotProbeBindRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteHoneypotProbeBindRequest setProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }
    public String getProbeId() {
        return this.probeId;
    }

}
