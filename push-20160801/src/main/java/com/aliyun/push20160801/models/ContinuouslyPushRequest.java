// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class ContinuouslyPushRequest extends TeaModel {
    /**
     * <p>AppKey information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>Message ID.</p>
     * <p>Obtain this MessageId by calling the Push API with Target set to TBD. It represents a message already saved in the push system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>500131</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>Push target:</p>
     * <ul>
     * <li><p><strong>DEVICE</strong>: Push by device</p>
     * </li>
     * <li><p><strong>ACCOUNT</strong>: Push by account</p>
     * </li>
     * <li><p><strong>ALIAS</strong>: Push by alias</p>
     * </li>
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
     * <p>Specify values based on Target. Separate multiple values with commas. If you exceed the limit, split the push into multiple calls.</p>
     * <ul>
     * <li><p>Target=DEVICE: values such as <code>deviceid1,deviceid2</code> (up to 1,000 supported).</p>
     * </li>
     * <li><p>Target=ACCOUNT: values such as <code>account1,account2</code> (up to 1,000 supported).</p>
     * </li>
     * <li><p>Target=ALIAS: values such as <code>alias1,alias2</code> (up to 1,000 supported).</p>
     * </li>
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
