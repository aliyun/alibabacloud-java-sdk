// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the snapshot template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f5b228fe6930e*****d6bf55bd87789</p>
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
