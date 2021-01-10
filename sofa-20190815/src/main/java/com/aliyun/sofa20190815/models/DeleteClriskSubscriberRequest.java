// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteClriskSubscriberRequest extends TeaModel {
    @NameInMap("EntranceCodesRepeatList")
    public java.util.List<String> entranceCodesRepeatList;

    public static DeleteClriskSubscriberRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClriskSubscriberRequest self = new DeleteClriskSubscriberRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClriskSubscriberRequest setEntranceCodesRepeatList(java.util.List<String> entranceCodesRepeatList) {
        this.entranceCodesRepeatList = entranceCodesRepeatList;
        return this;
    }
    public java.util.List<String> getEntranceCodesRepeatList() {
        return this.entranceCodesRepeatList;
    }

}
