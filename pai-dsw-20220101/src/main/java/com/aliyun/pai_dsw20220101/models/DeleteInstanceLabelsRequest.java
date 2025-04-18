// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class DeleteInstanceLabelsRequest extends TeaModel {
    /**
     * <p>The keys of the tags that you want to delete. Separate multiple tags with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>labelKey1,labelKey2,labelKey3</p>
     */
    @NameInMap("LabelKeys")
    public String labelKeys;

    public static DeleteInstanceLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceLabelsRequest self = new DeleteInstanceLabelsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceLabelsRequest setLabelKeys(String labelKeys) {
        this.labelKeys = labelKeys;
        return this;
    }
    public String getLabelKeys() {
        return this.labelKeys;
    }

}
