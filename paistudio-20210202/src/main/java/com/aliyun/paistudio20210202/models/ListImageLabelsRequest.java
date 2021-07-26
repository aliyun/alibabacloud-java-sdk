// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListImageLabelsRequest extends TeaModel {
    // 标签列表，以逗号分隔
    @NameInMap("LabelKeys")
    public String labelKeys;

    // image过滤条件，获取满足条件的image的所有label
    @NameInMap("LabelFilter")
    public String labelFilter;

    // 镜像id
    @NameInMap("ImageId")
    public String imageId;

    public static ListImageLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImageLabelsRequest self = new ListImageLabelsRequest();
        return TeaModel.build(map, self);
    }

    public ListImageLabelsRequest setLabelKeys(String labelKeys) {
        this.labelKeys = labelKeys;
        return this;
    }
    public String getLabelKeys() {
        return this.labelKeys;
    }

    public ListImageLabelsRequest setLabelFilter(String labelFilter) {
        this.labelFilter = labelFilter;
        return this;
    }
    public String getLabelFilter() {
        return this.labelFilter;
    }

    public ListImageLabelsRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

}
