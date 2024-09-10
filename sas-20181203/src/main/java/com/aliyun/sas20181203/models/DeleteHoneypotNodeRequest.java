// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHoneypotNodeRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The ID of the management node.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListHoneypotNode~~">ListHoneypotNode</a> operation to query the IDs of management nodes.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>670baeee-86c4-46b9-8200-a2c38141a453</p>
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
