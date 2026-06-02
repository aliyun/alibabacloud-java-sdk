// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DeleteClientsRequest extends TeaModel {
    /**
     * <p>aliuid</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("CallerAliUid")
    public String callerAliUid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("InManage")
    public Boolean inManage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Uuids")
    public java.util.List<String> uuids;

    public static DeleteClientsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientsRequest self = new DeleteClientsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClientsRequest setCallerAliUid(String callerAliUid) {
        this.callerAliUid = callerAliUid;
        return this;
    }
    public String getCallerAliUid() {
        return this.callerAliUid;
    }

    public DeleteClientsRequest setInManage(Boolean inManage) {
        this.inManage = inManage;
        return this;
    }
    public Boolean getInManage() {
        return this.inManage;
    }

    public DeleteClientsRequest setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

}
