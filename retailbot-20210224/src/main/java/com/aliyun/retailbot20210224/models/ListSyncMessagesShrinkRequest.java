// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSyncMessagesShrinkRequest extends TeaModel {
    // 人人数据DTO
    @NameInMap("MessageDTOList")
    public String messageDTOListShrink;

    public static ListSyncMessagesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSyncMessagesShrinkRequest self = new ListSyncMessagesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSyncMessagesShrinkRequest setMessageDTOListShrink(String messageDTOListShrink) {
        this.messageDTOListShrink = messageDTOListShrink;
        return this;
    }
    public String getMessageDTOListShrink() {
        return this.messageDTOListShrink;
    }

}
