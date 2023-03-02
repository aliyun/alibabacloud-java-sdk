// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the snapshot template.</p>
     */
    @NameInMap("VodTemplateId")
    public String vodTemplateId;

    public static DeleteVodTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodTemplateRequest self = new DeleteVodTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVodTemplateRequest setVodTemplateId(String vodTemplateId) {
        this.vodTemplateId = vodTemplateId;
        return this;
    }
    public String getVodTemplateId() {
        return this.vodTemplateId;
    }

}
