// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteTagWithUuidRequest extends TeaModel {
    /**
     * <p>The label name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("TagName")
    public String tagName;

    /**
     * <p>The list of server UUIDs.</p>
     * <blockquote>
     * <p>If UuidList is specified, Security Center deletes the label only from the servers included in UuidList. If UuidList is empty, Security Center deletes the label from all servers.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>111-xx,aa-bb</p>
     */
    @NameInMap("UuidList")
    public String uuidList;

    public static DeleteTagWithUuidRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagWithUuidRequest self = new DeleteTagWithUuidRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTagWithUuidRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public DeleteTagWithUuidRequest setUuidList(String uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public String getUuidList() {
        return this.uuidList;
    }

}
