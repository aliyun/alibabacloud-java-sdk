// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AttachLabelsRequest extends TeaModel {
    @NameInMap("LabelIds")
    public String labelIds;

    @NameInMap("SerialNo")
    public String serialNo;

    @NameInMap("SerialNoList")
    public String serialNoList;

    public static AttachLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachLabelsRequest self = new AttachLabelsRequest();
        return TeaModel.build(map, self);
    }

    public AttachLabelsRequest setLabelIds(String labelIds) {
        this.labelIds = labelIds;
        return this;
    }
    public String getLabelIds() {
        return this.labelIds;
    }

    public AttachLabelsRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public AttachLabelsRequest setSerialNoList(String serialNoList) {
        this.serialNoList = serialNoList;
        return this;
    }
    public String getSerialNoList() {
        return this.serialNoList;
    }

}
