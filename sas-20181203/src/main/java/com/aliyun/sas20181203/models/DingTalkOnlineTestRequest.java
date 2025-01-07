// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DingTalkOnlineTestRequest extends TeaModel {
    /**
     * <p>The ID of the DingTalk notification configuration.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeDingTalk~~">DescribeDingTalk</a> operation to obtain the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2373</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DingTalkOnlineTestRequest build(java.util.Map<String, ?> map) throws Exception {
        DingTalkOnlineTestRequest self = new DingTalkOnlineTestRequest();
        return TeaModel.build(map, self);
    }

    public DingTalkOnlineTestRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
