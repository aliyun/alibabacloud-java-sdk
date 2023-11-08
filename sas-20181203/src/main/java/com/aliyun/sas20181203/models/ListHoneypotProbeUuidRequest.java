// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotProbeUuidRequest extends TeaModel {
    /**
     * <p>The ID of the management node.</p>
     * <br>
     * <p>>  You can call the [ListHoneypotNode](~~ListHoneypotNode~~) operation to obtain the ID.</p>
     */
    @NameInMap("ControlNodeId")
    public String controlNodeId;

    /**
     * <p>The language of the content within the request and the response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of the probe. Valid values:</p>
     * <br>
     * <p>*   **host_probe**: host probe</p>
     * <p>*   **vpc_black_hole_probe**: virtual private cloud (VPC) probe</p>
     */
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
