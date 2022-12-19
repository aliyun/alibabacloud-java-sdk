// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotRequest extends TeaModel {
    // The ID of the image that is used for the honeypot.
    // 
    // >  You can call the [ListAvailableHoneypot](~~ListAvailableHoneypot~~) operation to obtain the IDs of images from the **HoneypotImageId** response parameter.
    @NameInMap("HoneypotImageId")
    public String honeypotImageId;

    // The name of the image that is used for the honeypot.
    // 
    // >  You can call the [ListAvailableHoneypot](~~ListAvailableHoneypot~~) operation to obtain the names of images from the **HoneypotImageName** response parameter.
    @NameInMap("HoneypotImageName")
    public String honeypotImageName;

    // The custom name of the honeypot.
    @NameInMap("HoneypotName")
    public String honeypotName;

    // The custom configuration of the honeypot in the JSON format. The value contains the following fields:
    // 
    // *   **trojan_git**: Git-specific Defense. Valid values:
    // 
    //     *   **zip**: Git Source Code Package
    //     *   **web**: Git Directory Leak
    //     *   **close**: Disabled
    // 
    // *   **trojan\_git_addr**: Git Trojan Address.
    // 
    // *   **trojan_git.zip**: Git Trojan.
    // 
    // *   **burp**: Burp-specific Defense. Valid values:
    // 
    //     *   **open**: Enabled
    //     *   **close**: Disabled
    // 
    // *   **portrait_option**: Source Tracing Configuration. Valid values:
    // 
    //     *   **false**: Disable
    //     *   **true**: Enable
    @NameInMap("Meta")
    public String meta;

    // The ID of the management node to which you want to deploy the honeypot.
    // 
    // >  You can call the [ListHoneypotNode](~~ListHoneypotNode~~) operation to obtain the IDs of management nodes.
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
