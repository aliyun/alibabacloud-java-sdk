// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DeleteLabelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Force")
    public String force;

    @NameInMap("LabelContent")
    public String labelContent;

    @NameInMap("LabelId")
    public String labelId;

    public static DeleteLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLabelRequest self = new DeleteLabelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLabelRequest setForce(String force) {
        this.force = force;
        return this;
    }
    public String getForce() {
        return this.force;
    }

    public DeleteLabelRequest setLabelContent(String labelContent) {
        this.labelContent = labelContent;
        return this;
    }
    public String getLabelContent() {
        return this.labelContent;
    }

    public DeleteLabelRequest setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

}
