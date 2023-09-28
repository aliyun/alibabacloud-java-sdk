// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DeleteTagOptionRequest extends TeaModel {
    /**
     * <p>The ID of the tag option.</p>
     */
    @NameInMap("TagOptionId")
    public String tagOptionId;

    public static DeleteTagOptionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagOptionRequest self = new DeleteTagOptionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTagOptionRequest setTagOptionId(String tagOptionId) {
        this.tagOptionId = tagOptionId;
        return this;
    }
    public String getTagOptionId() {
        return this.tagOptionId;
    }

}
