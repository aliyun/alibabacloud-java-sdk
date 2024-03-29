// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListImageLabelsRequest extends TeaModel {
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("LabelFilter")
    public String labelFilter;

    @NameInMap("LabelKeys")
    public String labelKeys;

    public static ListImageLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImageLabelsRequest self = new ListImageLabelsRequest();
        return TeaModel.build(map, self);
    }

    public ListImageLabelsRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ListImageLabelsRequest setLabelFilter(String labelFilter) {
        this.labelFilter = labelFilter;
        return this;
    }
    public String getLabelFilter() {
        return this.labelFilter;
    }

    public ListImageLabelsRequest setLabelKeys(String labelKeys) {
        this.labelKeys = labelKeys;
        return this;
    }
    public String getLabelKeys() {
        return this.labelKeys;
    }

}
