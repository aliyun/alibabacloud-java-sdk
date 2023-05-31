// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHoneypotProbeRequest extends TeaModel {
    /**
     * <p>设置请求和接收消息的语言类型，默认为**zh**。取值：</p>
     * <br>
     * <p>- **zh**：中文</p>
     * <p>- **en**：英文</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the probe.</p>
     * <br>
     * <p>> You can call the [ListHoneypotProbe](~~ListHoneypotProbe~~) operation to query the IDs of probes.</p>
     */
    @NameInMap("ProbeId")
    public String probeId;

    public static DeleteHoneypotProbeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHoneypotProbeRequest self = new DeleteHoneypotProbeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHoneypotProbeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteHoneypotProbeRequest setProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }
    public String getProbeId() {
        return this.probeId;
    }

}
