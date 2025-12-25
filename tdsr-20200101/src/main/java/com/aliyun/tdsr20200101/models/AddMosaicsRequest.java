// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddMosaicsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;x&quot;: 504,&quot;y&quot;: 450,&quot;w&quot;: 256,&quot;h&quot;: 153}]</p>
     */
    @NameInMap("MarkPosition")
    public String markPosition;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>skjjskjk****</p>
     */
    @NameInMap("SubSceneId")
    public String subSceneId;

    public static AddMosaicsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMosaicsRequest self = new AddMosaicsRequest();
        return TeaModel.build(map, self);
    }

    public AddMosaicsRequest setMarkPosition(String markPosition) {
        this.markPosition = markPosition;
        return this;
    }
    public String getMarkPosition() {
        return this.markPosition;
    }

    public AddMosaicsRequest setSubSceneId(String subSceneId) {
        this.subSceneId = subSceneId;
        return this;
    }
    public String getSubSceneId() {
        return this.subSceneId;
    }

}
