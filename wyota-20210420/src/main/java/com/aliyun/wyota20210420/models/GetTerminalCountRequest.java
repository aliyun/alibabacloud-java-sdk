// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetTerminalCountRequest extends TeaModel {
    /**
     * <p>The terminal type. Valid values:</p>
     * <ul>
     * <li>1: hardware terminal.</li>
     * <li>2: software terminal.</li>
     * <li>3: secure browser plug-in.</li>
     * <li>4: GuestOS application.</li>
     * <li>5: DingTalk Wuying plug-in.</li>
     * <li>6: cloud application component.</li>
     * <li>7: Cloud Hub.</li>
     * <li>8: H5.</li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClientType")
    public Integer clientType;

    public static GetTerminalCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTerminalCountRequest self = new GetTerminalCountRequest();
        return TeaModel.build(map, self);
    }

    public GetTerminalCountRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

}
