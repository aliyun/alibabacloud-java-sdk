// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class UpdateLabelRequest extends TeaModel {
    @NameInMap("LabelContent")
    public String labelContent;

    @NameInMap("LabelId")
    public String labelId;

    public static UpdateLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLabelRequest self = new UpdateLabelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLabelRequest setLabelContent(String labelContent) {
        this.labelContent = labelContent;
        return this;
    }
    public String getLabelContent() {
        return this.labelContent;
    }

    public UpdateLabelRequest setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

}
