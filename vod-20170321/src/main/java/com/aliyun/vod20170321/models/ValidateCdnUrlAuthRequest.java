// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ValidateCdnUrlAuthRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputUrl")
    public String inputUrl;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static ValidateCdnUrlAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateCdnUrlAuthRequest self = new ValidateCdnUrlAuthRequest();
        return TeaModel.build(map, self);
    }

    public ValidateCdnUrlAuthRequest setInputUrl(String inputUrl) {
        this.inputUrl = inputUrl;
        return this;
    }
    public String getInputUrl() {
        return this.inputUrl;
    }

    public ValidateCdnUrlAuthRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ValidateCdnUrlAuthRequest setResourceRealOwnerId(Long resourceRealOwnerId) {
        this.resourceRealOwnerId = resourceRealOwnerId;
        return this;
    }
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    public ValidateCdnUrlAuthRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
