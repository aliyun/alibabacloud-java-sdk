// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotRequest extends TeaModel {
    /**
     * <p>The ID of the image that is used for the honeypot.</p>
     * <br>
     * <p>>  You can call the [ListAvailableHoneypot](~~ListAvailableHoneypot~~) operation to obtain the IDs of images from the **HoneypotImageId** response parameter.</p>
     */
    @NameInMap("HoneypotImageId")
    public String honeypotImageId;

    /**
     * <p>The name of the image that is used for the honeypot.</p>
     * <br>
     * <p>>  You can call the [ListAvailableHoneypot](~~ListAvailableHoneypot~~) operation to obtain the names of images from the **HoneypotImageName** response parameter.</p>
     */
    @NameInMap("HoneypotImageName")
    public String honeypotImageName;

    /**
     * <p>The custom name of the honeypot.</p>
     */
    @NameInMap("HoneypotName")
    public String honeypotName;

    /**
     * <p>The custom configuration of the honeypot in the JSON format. The value contains the following fields:</p>
     * <br>
     * <p>*   **trojan_git**: Git-specific Defense. Valid values:</p>
     * <br>
     * <p>    *   **zip**: Git Source Code Package</p>
     * <p>    *   **web**: Git Directory Leak</p>
     * <p>    *   **close**: Disabled</p>
     * <br>
     * <p>*   **trojan\_git_addr**: Git Trojan Address.</p>
     * <br>
     * <p>*   **trojan_git.zip**: Git Trojan.</p>
     * <br>
     * <p>*   **burp**: Burp-specific Defense. Valid values:</p>
     * <br>
     * <p>    *   **open**: Enabled</p>
     * <p>    *   **close**: Disabled</p>
     * <br>
     * <p>*   **portrait_option**: Source Tracing Configuration. Valid values:</p>
     * <br>
     * <p>    *   **false**: Disable</p>
     * <p>    *   **true**: Enable</p>
     */
    @NameInMap("Meta")
    public String meta;

    /**
     * <p>The ID of the management node to which you want to deploy the honeypot.</p>
     * <br>
     * <p>>  You can call the [ListHoneypotNode](~~ListHoneypotNode~~) operation to obtain the IDs of management nodes.</p>
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
