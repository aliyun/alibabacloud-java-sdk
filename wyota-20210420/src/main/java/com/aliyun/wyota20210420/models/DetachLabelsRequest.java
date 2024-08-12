// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DetachLabelsRequest extends TeaModel {
    @NameInMap("LabelIds")
    public String labelIds;

    @NameInMap("SerialNo")
    public String serialNo;

    @NameInMap("SerialNoList")
    public String serialNoList;

    public static DetachLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachLabelsRequest self = new DetachLabelsRequest();
        return TeaModel.build(map, self);
    }

    public DetachLabelsRequest setLabelIds(String labelIds) {
        this.labelIds = labelIds;
        return this;
    }
    public String getLabelIds() {
        return this.labelIds;
    }

    public DetachLabelsRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public DetachLabelsRequest setSerialNoList(String serialNoList) {
        this.serialNoList = serialNoList;
        return this;
    }
    public String getSerialNoList() {
        return this.serialNoList;
    }

}
