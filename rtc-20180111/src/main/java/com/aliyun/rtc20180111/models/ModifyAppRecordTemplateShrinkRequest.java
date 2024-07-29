// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppRecordTemplateShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>53200b81-b761-4c10-842a-a0726d97xxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordTemplate")
    public String recordTemplateShrink;

    public static ModifyAppRecordTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppRecordTemplateShrinkRequest self = new ModifyAppRecordTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppRecordTemplateShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyAppRecordTemplateShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyAppRecordTemplateShrinkRequest setRecordTemplateShrink(String recordTemplateShrink) {
        this.recordTemplateShrink = recordTemplateShrink;
        return this;
    }
    public String getRecordTemplateShrink() {
        return this.recordTemplateShrink;
    }

}
