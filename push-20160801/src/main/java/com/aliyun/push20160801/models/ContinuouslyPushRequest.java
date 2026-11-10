// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class ContinuouslyPushRequest extends TeaModel {
    /**
     * <p>The AppKey information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>The message ID.</p>
     * <p>The MessageId obtained after calling the Push operation and setting Target to TBD. It represents a message that has been saved to the push system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>500131</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The push target:</p>
     * <ul>
     * <li><strong>DEVICE</strong>: Push based on devices.</li>
     * <li><strong>ACCOUNT</strong>: Push based on accounts.</li>
     * <li><strong>ALIAS</strong>: Push based on aliases.</li>
     * </ul>
     * <p>Continuous push supports only these three target types.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEVICE</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>Set this parameter based on Target. Separate multiple values with commas. If the limit is exceeded, push the message in multiple batches.</p>
     * <ul>
     * <li>If Target is set to DEVICE, the value is in the format of <code>deviceid1,deviceid2</code>. A maximum of 1,000 devices are supported.</li>
     * <li>If Target is set to ACCOUNT, the value is in the format of <code>account1,account2</code>. A maximum of 1,000 accounts are supported.</li>
     * <li>If Target is set to ALIAS, the value is in the format of <code>alias1,alias2</code>. A maximum of 1,000 aliases are supported.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a692961a92534047ad3625****</p>
     */
    @NameInMap("TargetValue")
    public String targetValue;

    public static ContinuouslyPushRequest build(java.util.Map<String, ?> map) throws Exception {
        ContinuouslyPushRequest self = new ContinuouslyPushRequest();
        return TeaModel.build(map, self);
    }

    public ContinuouslyPushRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public ContinuouslyPushRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public ContinuouslyPushRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public ContinuouslyPushRequest setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

}
