// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetLinkInfoRequest extends TeaModel {
    @NameInMap("extra")
    public String extra;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("identity")
    public String identity;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    public static GetLinkInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkInfoRequest self = new GetLinkInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkInfoRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public GetLinkInfoRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public GetLinkInfoRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
