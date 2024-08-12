// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AttachLabelRequest extends TeaModel {
    @NameInMap("LabelContent")
    public String labelContent;

    @NameInMap("LabelId")
    public String labelId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SerialNo")
    public String serialNo;

    public static AttachLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachLabelRequest self = new AttachLabelRequest();
        return TeaModel.build(map, self);
    }

    public AttachLabelRequest setLabelContent(String labelContent) {
        this.labelContent = labelContent;
        return this;
    }
    public String getLabelContent() {
        return this.labelContent;
    }

    public AttachLabelRequest setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

    public AttachLabelRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

}
