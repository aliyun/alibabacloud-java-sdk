// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class UpdateProjectConfigShrinkRequest extends TeaModel {
    @NameInMap("CommonTransferConfig")
    public String commonTransferConfigShrink;

    @NameInMap("FullTransferConfig")
    public String fullTransferConfigShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>np_fe****</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("IncrTransferConfig")
    public String incrTransferConfigShrink;

    @NameInMap("ReverseIncrTransferConfig")
    public String reverseIncrTransferConfigShrink;

    public static UpdateProjectConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectConfigShrinkRequest self = new UpdateProjectConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectConfigShrinkRequest setCommonTransferConfigShrink(String commonTransferConfigShrink) {
        this.commonTransferConfigShrink = commonTransferConfigShrink;
        return this;
    }
    public String getCommonTransferConfigShrink() {
        return this.commonTransferConfigShrink;
    }

    public UpdateProjectConfigShrinkRequest setFullTransferConfigShrink(String fullTransferConfigShrink) {
        this.fullTransferConfigShrink = fullTransferConfigShrink;
        return this;
    }
    public String getFullTransferConfigShrink() {
        return this.fullTransferConfigShrink;
    }

    public UpdateProjectConfigShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateProjectConfigShrinkRequest setIncrTransferConfigShrink(String incrTransferConfigShrink) {
        this.incrTransferConfigShrink = incrTransferConfigShrink;
        return this;
    }
    public String getIncrTransferConfigShrink() {
        return this.incrTransferConfigShrink;
    }

    public UpdateProjectConfigShrinkRequest setReverseIncrTransferConfigShrink(String reverseIncrTransferConfigShrink) {
        this.reverseIncrTransferConfigShrink = reverseIncrTransferConfigShrink;
        return this;
    }
    public String getReverseIncrTransferConfigShrink() {
        return this.reverseIncrTransferConfigShrink;
    }

}
