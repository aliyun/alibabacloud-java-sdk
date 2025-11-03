// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateWhiteListRequest extends TeaModel {
    /**
     * <p>The ID of the image repository.</p>
     * <blockquote>
     * <p> You can call the <a href="~~PageImageRegistry~~">PageImageRegistry</a> operation to obtain the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>19882</p>
     */
    @NameInMap("RegistryId")
    public Long registryId;

    /**
     * <p>The IP address whitelist. Separate multiple IP addresses with commas (,).</p>
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
