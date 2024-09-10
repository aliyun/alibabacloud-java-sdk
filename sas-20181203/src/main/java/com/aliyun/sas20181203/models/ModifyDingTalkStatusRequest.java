// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyDingTalkStatusRequest extends TeaModel {
    /**
     * <p>The notification IDs of DingTalk chatbots. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeDingTalk~~">DescribeDingTalk</a> operation to query the notification IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2259</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>The notification status of a DingTalk chatbot. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled</li>
     * <li><strong>1</strong>: enabled</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static ModifyDingTalkStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDingTalkStatusRequest self = new ModifyDingTalkStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDingTalkStatusRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ModifyDingTalkStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
