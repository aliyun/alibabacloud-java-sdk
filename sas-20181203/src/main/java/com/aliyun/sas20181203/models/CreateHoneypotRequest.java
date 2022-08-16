// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotRequest extends TeaModel {
    @NameInMap("HoneypotImageId")
    public String honeypotImageId;

    @NameInMap("HoneypotImageName")
    public String honeypotImageName;

    @NameInMap("HoneypotName")
    public String honeypotName;

    @NameInMap("Meta")
    public String meta;

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
