// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotRequest extends TeaModel {
    /**
     * <p>The ID of the honeypot image.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListAvailableHoneypot~~">ListAvailableHoneypot</a> operation to query the IDs of images from the <strong>HoneypotImageId</strong> response parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sha256:ebc4c102ac407d53733c2373e8888a733ddce86f163ccbe7492ae1cbf26****</p>
     */
    @NameInMap("HoneypotImageId")
    public String honeypotImageId;

    /**
     * <p>The name of the honeypot image.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListAvailableHoneypot~~">ListAvailableHoneypot</a> operation to query the names of images from the <strong>HoneypotImageName</strong> response parameter.</p>
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
     * <p>The custom configuration of the honeypot in the JSON format. The value contains the following fields:</p>
     * <ul>
     * <li><p><strong>trojan_git</strong>: Git-specific Defense. Valid values:</p>
     * <ul>
     * <li><strong>zip</strong>: Git Source Code Package</li>
     * <li><strong>web</strong>: Git Directory Leak</li>
     * <li><strong>close</strong>: Disabled</li>
     * </ul>
     * </li>
     * <li><p><strong>trojan_git_addr</strong>: Git Trojan Address.</p>
     * </li>
     * <li><p><strong>trojan_git.zip</strong>: Git Trojan.</p>
     * </li>
     * <li><p><strong>burp</strong>: Burp-specific Defense. Valid values:</p>
     * <ul>
     * <li><strong>open</strong>: Enable</li>
     * <li><strong>close</strong>: Disable</li>
     * </ul>
     * </li>
     * <li><p><strong>portrait_option</strong>: Source Tracing Configuration. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: Disable</li>
     * <li><strong>true</strong>: Enable</li>
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
     * <p>The ID of the management node.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListHoneypotNode~~">ListHoneypotNode</a> operation to query the IDs of management nodes.</p>
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
