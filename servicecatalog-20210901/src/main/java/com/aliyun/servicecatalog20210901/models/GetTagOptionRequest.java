// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetTagOptionRequest extends TeaModel {
    /**
     * <p>The ID of the tag option.</p>
     */
    @NameInMap("TagOptionId")
    public String tagOptionId;

    public static GetTagOptionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTagOptionRequest self = new GetTagOptionRequest();
        return TeaModel.build(map, self);
    }

    public GetTagOptionRequest setTagOptionId(String tagOptionId) {
        this.tagOptionId = tagOptionId;
        return this;
    }
    public String getTagOptionId() {
        return this.tagOptionId;
    }

}
