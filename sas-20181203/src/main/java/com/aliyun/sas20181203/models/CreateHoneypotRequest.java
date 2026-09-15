// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotRequest extends TeaModel {
    /**
     * <p>The honeypot image ID.</p>
     * <blockquote>
     * <p>You can obtain this value from the <strong>HoneypotImageId</strong> field returned by the <a href="~~ListAvailableHoneypot~~">ListAvailableHoneypot</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sha256:ebc4c102ac407d53733c2373e8888a733ddce86f163ccbe7492ae1cbf26****</p>
     */
    @NameInMap("HoneypotImageId")
    public String honeypotImageId;

    /**
     * <p>The honeypot image name.</p>
     * <blockquote>
     * <p>You can obtain this value from the <strong>HoneypotImageName</strong> field returned by the <a href="~~ListAvailableHoneypot~~">ListAvailableHoneypot</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HoneyPotImageName</p>
     */
    @NameInMap("HoneypotImageName")
    public String honeypotImageName;

    /**
     * <p>The custom name of the honeypot.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ruoyi</p>
     */
    @NameInMap("HoneypotName")
    public String honeypotName;

    /**
     * <p>The custom configuration of the honeypot in JSON format. The following fields are included:</p>
     * <ul>
     * <li><strong>trojan_git</strong>: The Git counter-intelligence method. Valid values:<ul>
     * <li><strong>zip</strong>: Git source code package.</li>
     * <li><strong>web</strong>: .git folder leak.</li>
     * <li><strong>close</strong>: Shutdown.</li>
     * </ul>
     * </li>
     * <li><strong>trojan_git_addr</strong>: The Git counter-intelligence endpoint.</li>
     * <li><strong>trojan_git.zip</strong>: The Git counter-intelligence trojan package.</li>
     * <li><strong>burp</strong>: The Burp counter-intelligence method. Valid values:<ul>
     * <li><strong>open</strong>: Enabled.</li>
     * <li><strong>close</strong>: Shutdown.</li>
     * </ul>
     * </li>
     * <li><strong>portrait_option</strong>: The tracing configuration. Valid values:<ul>
     * <li><strong>false</strong>: Shutdown.</li>
     * <li><strong>true</strong>: Enabled.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;trojan_git\&quot;:\&quot;close\&quot;,\&quot;burp\&quot;:\&quot;close\&quot;,\&quot;portrait_option\&quot;:\&quot;false\&quot;}</p>
     */
    @NameInMap("Meta")
    public String meta;

    /**
     * <p>The ID of the honeypot management node.</p>
     * <blockquote>
     * <p>Call the <a href="~~ListHoneypotNode~~">ListHoneypotNode</a> operation to obtain this value.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a882e590-b87b-45a6-87b9-d0a3e5a0****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    public static CreateHoneypotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHoneypotRequest self = new CreateHoneypotRequest();
        return TeaModel.build(map, self);
    }

    public CreateHoneypotRequest setHoneypotImageId(String honeypotImageId) {
        this.honeypotImageId = honeypotImageId;
        return this;
    }
    public String getHoneypotImageId() {
        return this.honeypotImageId;
    }

    public CreateHoneypotRequest setHoneypotImageName(String honeypotImageName) {
        this.honeypotImageName = honeypotImageName;
        return this;
    }
    public String getHoneypotImageName() {
        return this.honeypotImageName;
    }

    public CreateHoneypotRequest setHoneypotName(String honeypotName) {
        this.honeypotName = honeypotName;
        return this;
    }
    public String getHoneypotName() {
        return this.honeypotName;
    }

    public CreateHoneypotRequest setMeta(String meta) {
        this.meta = meta;
        return this;
    }
    public String getMeta() {
        return this.meta;
    }

    public CreateHoneypotRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
