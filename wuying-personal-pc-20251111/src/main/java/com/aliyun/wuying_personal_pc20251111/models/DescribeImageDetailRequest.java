// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class DescribeImageDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("ShareCode")
    public String shareCode;

    public static DescribeImageDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageDetailRequest self = new DescribeImageDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageDetailRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public DescribeImageDetailRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeImageDetailRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DescribeImageDetailRequest setShareCode(String shareCode) {
        this.shareCode = shareCode;
        return this;
    }
    public String getShareCode() {
        return this.shareCode;
    }

}
