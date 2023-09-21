// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotProbeUuidRequest extends TeaModel {
    @NameInMap("ControlNodeId")
    public String controlNodeId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ProbeType")
    public String probeType;

    public static ListHoneypotProbeUuidRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotProbeUuidRequest self = new ListHoneypotProbeUuidRequest();
        return TeaModel.build(map, self);
    }

    public ListHoneypotProbeUuidRequest setControlNodeId(String controlNodeId) {
        this.controlNodeId = controlNodeId;
        return this;
    }
    public String getControlNodeId() {
        return this.controlNodeId;
    }

    public ListHoneypotProbeUuidRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListHoneypotProbeUuidRequest setProbeType(String probeType) {
        this.probeType = probeType;
        return this;
    }
    public String getProbeType() {
        return this.probeType;
    }

}
