// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class ListTaskTemplatesRequest extends TeaModel {
    @NameInMap("labelSelector")
    public java.util.List<String> labelSelector;

    public static ListTaskTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskTemplatesRequest self = new ListTaskTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskTemplatesRequest setLabelSelector(java.util.List<String> labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }
    public java.util.List<String> getLabelSelector() {
        return this.labelSelector;
    }

}
