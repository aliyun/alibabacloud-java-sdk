// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateCloudNotePhrasesShrinkRequest extends TeaModel {
    /**
     * <p>The application ID. You can create and query application IDs in the console. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The hotword parameter.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Phrase")
    public String phraseShrink;

    public static CreateCloudNotePhrasesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudNotePhrasesShrinkRequest self = new CreateCloudNotePhrasesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudNotePhrasesShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateCloudNotePhrasesShrinkRequest setPhraseShrink(String phraseShrink) {
        this.phraseShrink = phraseShrink;
        return this;
    }
    public String getPhraseShrink() {
        return this.phraseShrink;
    }

}
