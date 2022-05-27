// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DownloadLabelFileRequest extends TeaModel {
    @NameInMap("LabelId")
    public Long labelId;

    public static DownloadLabelFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadLabelFileRequest self = new DownloadLabelFileRequest();
        return TeaModel.build(map, self);
    }

    public DownloadLabelFileRequest setLabelId(Long labelId) {
        this.labelId = labelId;
        return this;
    }
    public Long getLabelId() {
        return this.labelId;
    }

}
