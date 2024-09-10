// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotProbeUuidRequest extends TeaModel {
    /**
     * <p>The ID of the management node.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListHoneypotNode~~">ListHoneypotNode</a> operation to obtain the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a882e590-b87b-45a6-87b9-d0a3e5a0****</p>
     */
    @NameInMap("ControlNodeId")
    public String controlNodeId;

    /**
     * <p>The language of the content within the request and the response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of the probe. Valid values:</p>
     * <ul>
     * <li><strong>host_probe</strong>: host probe</li>
     * <li><strong>vpc_black_hole_probe</strong>: virtual private cloud (VPC) probe</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>host_probe</p>
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
