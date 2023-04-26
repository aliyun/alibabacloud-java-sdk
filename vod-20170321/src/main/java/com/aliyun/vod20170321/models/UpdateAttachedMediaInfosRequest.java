// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAttachedMediaInfosRequest extends TeaModel {
    /**
     * <p>Modifies the information about multiple auxiliary media assets at a time.</p>
     */
    @NameInMap("UpdateContent")
    public String updateContent;

    public static UpdateAttachedMediaInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAttachedMediaInfosRequest self = new UpdateAttachedMediaInfosRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAttachedMediaInfosRequest setUpdateContent(String updateContent) {
        this.updateContent = updateContent;
        return this;
    }
    public String getUpdateContent() {
        return this.updateContent;
    }

}
