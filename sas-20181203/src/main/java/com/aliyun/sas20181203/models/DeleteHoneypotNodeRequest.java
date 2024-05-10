// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHoneypotNodeRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the management node.</p>
     * <br>
     * <p>> You can call the [ListHoneypotNode](~~ListHoneypotNode~~) operation to query the IDs of management nodes.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    public static DeleteHoneypotNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHoneypotNodeRequest self = new DeleteHoneypotNodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHoneypotNodeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteHoneypotNodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
