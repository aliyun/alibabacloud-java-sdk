// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AddLabelsRequest extends TeaModel {
    @NameInMap("LabelContents")
    public String labelContents;

    public static AddLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLabelsRequest self = new AddLabelsRequest();
        return TeaModel.build(map, self);
    }

    public AddLabelsRequest setLabelContents(String labelContents) {
        this.labelContents = labelContents;
        return this;
    }
    public String getLabelContents() {
        return this.labelContents;
    }

}
