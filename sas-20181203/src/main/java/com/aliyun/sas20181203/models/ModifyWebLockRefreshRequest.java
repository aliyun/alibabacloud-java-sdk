// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockRefreshRequest extends TeaModel {
    /**
     * <p>The UUID of the server for which you want to refresh the status of the web tamper proofing feature.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeWebLockBindList~~">DescribeWebLockBindList</a> operation to query the servers for which the web tamper proofing feature is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>55c0f41b-3093-47a7-8eae-02d3a584****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ModifyWebLockRefreshRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockRefreshRequest self = new ModifyWebLockRefreshRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockRefreshRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
