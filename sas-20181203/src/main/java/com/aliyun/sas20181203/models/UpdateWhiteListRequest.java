// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateWhiteListRequest extends TeaModel {
    /**
     * <p>Image repository ID.</p>
     * <blockquote>
     * <p>You can obtain this parameter by calling the <a href="~~PageImageRegistry~~">PageImageRegistry</a> interface.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>19882</p>
     */
    @NameInMap("RegistryId")
    public Long registryId;

    /**
     * <p>Whitelist list. If there are multiple whitelisted addresses, separate them with a comma (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XXX.XXX,192.180.XXX.XXX</p>
     */
    @NameInMap("WhiteList")
    public String whiteList;

    public static UpdateWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWhiteListRequest self = new UpdateWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWhiteListRequest setRegistryId(Long registryId) {
        this.registryId = registryId;
        return this;
    }
    public Long getRegistryId() {
        return this.registryId;
    }

    public UpdateWhiteListRequest setWhiteList(String whiteList) {
        this.whiteList = whiteList;
        return this;
    }
    public String getWhiteList() {
        return this.whiteList;
    }

}
