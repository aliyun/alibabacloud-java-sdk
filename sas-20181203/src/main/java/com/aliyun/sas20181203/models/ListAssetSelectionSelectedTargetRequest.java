// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAssetSelectionSelectedTargetRequest extends TeaModel {
    @NameInMap("SelectionKey")
    public String selectionKey;

    @NameInMap("TargetList")
    public java.util.List<String> targetList;

    public static ListAssetSelectionSelectedTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAssetSelectionSelectedTargetRequest self = new ListAssetSelectionSelectedTargetRequest();
        return TeaModel.build(map, self);
    }

    public ListAssetSelectionSelectedTargetRequest setSelectionKey(String selectionKey) {
        this.selectionKey = selectionKey;
        return this;
    }
    public String getSelectionKey() {
        return this.selectionKey;
    }

    public ListAssetSelectionSelectedTargetRequest setTargetList(java.util.List<String> targetList) {
        this.targetList = targetList;
        return this;
    }
    public java.util.List<String> getTargetList() {
        return this.targetList;
    }

}
