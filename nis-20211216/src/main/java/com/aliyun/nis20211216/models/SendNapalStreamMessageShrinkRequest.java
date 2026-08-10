// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class SendNapalStreamMessageShrinkRequest extends TeaModel {
    /**
     * <p>The request configuration object.</p>
     */
    @NameInMap("Configuration")
    public String configurationShrink;

    /**
     * <p>The message object that contains user input and session context information.</p>
     */
    @NameInMap("Message")
    public String messageShrink;

    /**
     * <p>The additional request information.</p>
     */
    @NameInMap("Metadata")
    public String metadataShrink;

    public static SendNapalStreamMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendNapalStreamMessageShrinkRequest self = new SendNapalStreamMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendNapalStreamMessageShrinkRequest setConfigurationShrink(String configurationShrink) {
        this.configurationShrink = configurationShrink;
        return this;
    }
    public String getConfigurationShrink() {
        return this.configurationShrink;
    }

    public SendNapalStreamMessageShrinkRequest setMessageShrink(String messageShrink) {
        this.messageShrink = messageShrink;
        return this;
    }
    public String getMessageShrink() {
        return this.messageShrink;
    }

    public SendNapalStreamMessageShrinkRequest setMetadataShrink(String metadataShrink) {
        this.metadataShrink = metadataShrink;
        return this;
    }
    public String getMetadataShrink() {
        return this.metadataShrink;
    }

}
