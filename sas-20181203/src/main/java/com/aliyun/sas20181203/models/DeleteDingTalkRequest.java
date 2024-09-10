// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteDingTalkRequest extends TeaModel {
    /**
     * <p>The ID of the notification from the DingTalk chatbot. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeDingTalk~~">DescribeDingTalk</a> operation to query the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2170,256</p>
     */
    @NameInMap("Ids")
    public String ids;

    public static DeleteDingTalkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDingTalkRequest self = new DeleteDingTalkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDingTalkRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

}
