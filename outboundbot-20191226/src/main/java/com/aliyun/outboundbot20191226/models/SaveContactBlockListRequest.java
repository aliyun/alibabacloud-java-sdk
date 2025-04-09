// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveContactBlockListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("ContactBlockListList")
    public java.util.List<String> contactBlockListList;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ContactBlockListsJson")
    public String contactBlockListsJson;

    /**
     * <strong>example:</strong>
     * <p>c3c92de8-e4bd-4db4-a962-50f8acce40bc</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static SaveContactBlockListRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveContactBlockListRequest self = new SaveContactBlockListRequest();
        return TeaModel.build(map, self);
    }

    public SaveContactBlockListRequest setContactBlockListList(java.util.List<String> contactBlockListList) {
        this.contactBlockListList = contactBlockListList;
        return this;
    }
    public java.util.List<String> getContactBlockListList() {
        return this.contactBlockListList;
    }

    public SaveContactBlockListRequest setContactBlockListsJson(String contactBlockListsJson) {
        this.contactBlockListsJson = contactBlockListsJson;
        return this;
    }
    public String getContactBlockListsJson() {
        return this.contactBlockListsJson;
    }

    public SaveContactBlockListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
